//# xsc 19.6.0-a27f20-20190621

package com.sap.canteen.proxy;

public abstract class CanteenServiceMetadata
{
    public static final com.sap.cloud.server.odata.csdl.CsdlDocument document = com.sap.canteen.proxy.CanteenServiceMetadata.resolve();

    private static com.sap.cloud.server.odata.csdl.CsdlDocument resolve()
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:286:12
        com.sap.canteen.proxy.internal.CanteenServiceFactory.registerAll();
        com.sap.canteen.proxy.internal.CanteenServiceMetadataParser.parsed.setGeneratedProxies(true);
        return com.sap.canteen.proxy.internal.CanteenServiceMetadataParser.parsed;
    }

    public abstract static class EntityTypes
    {
        public static final com.sap.cloud.server.odata.EntityType booking = com.sap.canteen.proxy.internal.CanteenServiceMetadataParser.parsed.getEntityType("com.sap.canteen.Booking");

        public static final com.sap.cloud.server.odata.EntityType canteen = com.sap.canteen.proxy.internal.CanteenServiceMetadataParser.parsed.getEntityType("com.sap.canteen.Canteen");
    }

    public abstract static class EntitySets
    {
        public static final com.sap.cloud.server.odata.EntitySet bookingSet = com.sap.canteen.proxy.internal.CanteenServiceMetadataParser.parsed.getEntitySet("BookingSet");

        public static final com.sap.cloud.server.odata.EntitySet canteenSet = com.sap.canteen.proxy.internal.CanteenServiceMetadataParser.parsed.getEntitySet("CanteenSet");
    }
}
