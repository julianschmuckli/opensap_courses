// Note: Customizations placed in this file might be lost if the OData service is regenerated!
// Please place any customizations of handler registration in the ProviderSettings class.

package com.sap.canteen.base;

import com.sap.cloud.server.odata.*;

class RegisterHandlers {
    private static EntityHandler handler_Booking;
    private static EntityHandler handler_Canteen;
    private static EntityHandler handler_DishMenu;

    public static void withServlet(com.sap.canteen.MainServlet servlet) {
        com.sap.canteen.proxy.CanteenService service = (com.sap.canteen.proxy.CanteenService)servlet.getDataService();
        handler_Booking = new com.sap.canteen.handler.BookingHandler(servlet, service);
        handler_Canteen = new com.sap.canteen.handler.CanteenHandler(servlet, service);
        handler_DishMenu = new com.sap.canteen.handler.DishMenuHandler(servlet, service);
        servlet.registerEntityHandler(com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.booking, handler_Booking);
        servlet.registerEntityHandler(com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.canteen, handler_Canteen);
        servlet.registerEntityHandler(com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.dishMenu, handler_DishMenu);
    }
}
