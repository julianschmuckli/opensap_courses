// Note: Customizations placed in this file might be lost if the OData service is regenerated!
// Please place any customizations of listener registration in the ProviderSettings class.

package com.sap.canteen.base;

import com.sap.cloud.server.odata.*;

class RegisterListeners {
    private static EntityListener bookingListener;
    private static EntityListener canteenListener;
    private static EntityListener dishMenuListener;

    public static void withServlet(com.sap.canteen.MainServlet servlet) {
        com.sap.canteen.proxy.CanteenService service = (com.sap.canteen.proxy.CanteenService)servlet.getDataService();
        bookingListener = new com.sap.canteen.listener.BookingListener(servlet, service);
        canteenListener = new com.sap.canteen.listener.CanteenListener(servlet, service);
        dishMenuListener = new com.sap.canteen.listener.DishMenuListener(servlet, service);
        servlet.registerEntityListener(com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.booking, bookingListener);
        servlet.registerEntityListener(com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.canteen, canteenListener);
        servlet.registerEntityListener(com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.dishMenu, dishMenuListener);
    }
}
