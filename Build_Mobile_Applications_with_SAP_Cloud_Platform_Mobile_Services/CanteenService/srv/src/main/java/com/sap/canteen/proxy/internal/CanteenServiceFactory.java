//# xsc 19.6.0-a27f20-20190621

package com.sap.canteen.proxy.internal;

public abstract class CanteenServiceFactory
{
    public static void registerAll()
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:296:12
        com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.booking.registerFactory(new com.sap.canteen.proxy.internal.CanteenServiceFactory.CreateBooking());
        com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.canteen.registerFactory(new com.sap.canteen.proxy.internal.CanteenServiceFactory.CreateCanteen());
    }

    public static class CreateBooking
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @java.lang.Override public Object create()
        {
            //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:316:9
            return new com.sap.canteen.proxy.Booking(false);
        }
    }

    public static class CreateCanteen
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @java.lang.Override public Object create()
        {
            //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:326:9
            return new com.sap.canteen.proxy.Canteen(false);
        }
    }
}
