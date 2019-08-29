//# xsc 19.6.0-a27f20-20190621

package com.sap.canteen.proxy.internal;

public abstract class CanteenServiceFactory
{
    public static void registerAll()
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:594:12
        com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.booking.registerFactory(new com.sap.canteen.proxy.internal.CanteenServiceFactory.CreateBooking());
        com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.canteen.registerFactory(new com.sap.canteen.proxy.internal.CanteenServiceFactory.CreateCanteen());
        com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.dishMenu.registerFactory(new com.sap.canteen.proxy.internal.CanteenServiceFactory.CreateDishMenu());
    }

    public static class CreateBooking
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @java.lang.Override public Object create()
        {
            //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:620:9
            return new com.sap.canteen.proxy.Booking(false);
        }
    }

    public static class CreateCanteen
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @java.lang.Override public Object create()
        {
            //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:630:9
            return new com.sap.canteen.proxy.Canteen(false);
        }
    }

    public static class CreateDishMenu
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @java.lang.Override public Object create()
        {
            //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:640:9
            return new com.sap.canteen.proxy.DishMenu(false);
        }
    }
}
