//# xsc 19.6.0-a27f20-20190621

package com.sap.canteen.proxy;

public abstract class CanteenServiceMetadata
{
    public static final com.sap.cloud.server.odata.csdl.CsdlDocument document = com.sap.canteen.proxy.CanteenServiceMetadata.resolve();

    private static com.sap.cloud.server.odata.csdl.CsdlDocument resolve()
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:584:12
        com.sap.canteen.proxy.internal.CanteenServiceFactory.registerAll();
        com.sap.canteen.proxy.internal.CanteenServiceMetadataParser.parsed.setGeneratedProxies(true);
        return com.sap.canteen.proxy.internal.CanteenServiceMetadataParser.parsed;
    }

    public abstract static class EntityTypes
    {
        public static final com.sap.cloud.server.odata.EntityType booking = com.sap.canteen.proxy.internal.CanteenServiceMetadataParser.parsed.getEntityType("com.sap.canteen.Booking");

        public static final com.sap.cloud.server.odata.EntityType canteen = com.sap.canteen.proxy.internal.CanteenServiceMetadataParser.parsed.getEntityType("com.sap.canteen.Canteen");

        public static final com.sap.cloud.server.odata.EntityType dishMenu = com.sap.canteen.proxy.internal.CanteenServiceMetadataParser.parsed.getEntityType("com.sap.canteen.DishMenu");
    }

    public abstract static class EntitySets
    {
        public static final com.sap.cloud.server.odata.EntitySet bookingSet = com.sap.canteen.proxy.internal.CanteenServiceMetadataParser.parsed.getEntitySet("BookingSet");

        public static final com.sap.cloud.server.odata.EntitySet canteenSet = com.sap.canteen.proxy.internal.CanteenServiceMetadataParser.parsed.getEntitySet("CanteenSet");

        public static final com.sap.cloud.server.odata.EntitySet dishMenuSet = com.sap.canteen.proxy.internal.CanteenServiceMetadataParser.parsed.getEntitySet("DishMenuSet");
    }

    public abstract static class Functions
    {
        public static final com.sap.cloud.server.odata.DataMethod bookLunch = com.sap.canteen.proxy.internal.CanteenServiceMetadataParser.parsed.getDataMethod("com.sap.canteen.BookLunch");
    }

    public abstract static class FunctionImports
    {
        public static final com.sap.cloud.server.odata.DataMethod bookLunch = com.sap.canteen.proxy.internal.CanteenServiceMetadataParser.parsed.getDataMethod("BookLunch");
    }
}
