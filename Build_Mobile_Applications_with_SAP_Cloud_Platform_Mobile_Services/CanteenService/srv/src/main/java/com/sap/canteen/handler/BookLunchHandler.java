package com.sap.canteen.handler;

import com.sap.canteen.proxy.Booking;
import com.sap.canteen.proxy.DishMenu;
import com.sap.cloud.server.odata.*;

public class BookLunchHandler extends com.sap.cloud.server.odata.DefaultMethodHandler {
    private com.sap.canteen.MainServlet servlet;
    private com.sap.canteen.proxy.CanteenService service;

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
		
		//Response handling         
		return true; 
    }
}
