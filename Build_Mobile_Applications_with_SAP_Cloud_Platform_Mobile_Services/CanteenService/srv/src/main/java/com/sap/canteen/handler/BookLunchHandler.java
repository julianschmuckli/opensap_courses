package com.sap.canteen.handler;

import com.sap.canteen.proxy.Booking;
import com.sap.canteen.proxy.DishMenu;
import com.sap.cloud.server.odata.BooleanValue;
import com.sap.cloud.server.odata.DataMethod;
import com.sap.cloud.server.odata.DataValue;
import com.sap.cloud.server.odata.LongValue;
import com.sap.cloud.server.odata.ParameterList;
import com.sap.cloud.server.odata.StringValue;
import com.sap.cloud.server.odata.http.HttpRequest;
import com.sap.cloud.server.odata.json.JsonObject;
import com.sap.cloud.server.odata.json.JsonValue;

public class BookLunchHandler extends com.sap.cloud.server.odata.DefaultMethodHandler {
    private com.sap.canteen.MainServlet servlet;
    private com.sap.canteen.proxy.CanteenService service;
    
    private static String BASEURL = "https://mobile-service-c2g.cfapps.eu10.hana.ondemand.com/d4a352bb-3fa8-47e0-add8-19a63107275b/v1/register/templated";
    private static String APIKEY = "d87ba57574ea091dcf17d52a1b13d0edc1f3e024a6a92a6543ae7e27e3b5cb13";
    private static String ALIAS = "canteen";

    public BookLunchHandler(com.sap.canteen.MainServlet servlet, com.sap.canteen.proxy.CanteenService service) {
        super(servlet, service);
        this.servlet = servlet;
        this.service = service;
    }

    @Override public DataValue executeMethod(DataMethod method, ParameterList parameters) {
        long MenuID = LongValue.unwrap(parameters.getRequired("MenuID"));
        String UserID = StringValue.unwrap(parameters.getRequired("UserID"));
        boolean result = bookLunch(MenuID, UserID);
        return BooleanValue.of(result);
    }

    public boolean bookLunch(long MenuID, String UserID) {
    	//Load Lunch to retrieve Price
		DishMenu m = service.getDishMenuWithKey(MenuID);
		
		Booking booking = new Booking();
		booking.setMenuID(m.getDishMenuID());
		booking.setPrice(m.getPrice());
		booking.setBookingDate(this.servlet.backendTimeNow());
		booking.bindEntity(m, Booking.bookings);
		booking.setUser(UserID);
		booking.setStatus("booked");
		service.createEntity(booking); //this acutally touches the DB
		
		//Send confirmation card to user
	    /*
	    {
	        "method": "REGISTER",
	        "username": "mobile4opensap@gmail.com",
	        "match" : "BookingSet(1)"
	    }
	    }*/
		
		JsonObject requestBody = new JsonObject();
		requestBody.set("method", JsonValue.fromString("REGISTER"));
		requestBody.set("username", JsonValue.fromString(UserID));
		requestBody.set("match", JsonValue.fromString("BookingSet("+booking.getBookingID()+")"));
		
		HttpRequest request = new HttpRequest();
		request.open("POST", BookLunchHandler.BASEURL);
		
		request.setRequestHeader("Content-Type", "application/json");
		request.setUsername(BookLunchHandler.ALIAS);
		request.setPassword(BookLunchHandler.APIKEY);
		request.setRequestText(requestBody.toString());
		
		request.send();
		
		int status = request.getStatus();
		
	    request.close();
	
	    //Response handling 
	    if ((status > 200) && (status <= 210)) {
	        return true; 
	    }   
	    //Todo: Add proper error handling
		return false;
    }
}
