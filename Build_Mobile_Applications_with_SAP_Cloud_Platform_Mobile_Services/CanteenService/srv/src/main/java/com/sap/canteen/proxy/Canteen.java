//# xsc 19.6.0-a27f20-20190621

package com.sap.canteen.proxy;

public class Canteen
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property canteenID = com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.canteen.getProperty("CanteenID");

    public static final com.sap.cloud.server.odata.Property location = com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.canteen.getProperty("Location");

    public static final com.sap.cloud.server.odata.Property menuID = com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.canteen.getProperty("MenuID");

    public static final com.sap.cloud.server.odata.Property name = com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.canteen.getProperty("Name");

    public Canteen()
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:171:5
        this(true);
    }

    public Canteen(final boolean withDefaults)
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:171:5
        super(withDefaults, com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.canteen);
    }

    public com.sap.canteen.proxy.Canteen copy()
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:156:5
        return com.sap.canteen.proxy.internal.Any_as_com_sap_canteen_proxy_Canteen.cast(this.copyEntity());
    }

    public long getCanteenID()
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:192:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.sap.canteen.proxy.Canteen.canteenID));
    }

    public String getLocation()
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:205:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.canteen.proxy.Canteen.location));
    }

    public long getMenuID()
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:218:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.sap.canteen.proxy.Canteen.menuID));
    }

    public String getName()
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:231:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.canteen.proxy.Canteen.name));
    }

    public com.sap.canteen.proxy.Canteen getOld()
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:151:5
        return com.sap.canteen.proxy.internal.Any_as_com_sap_canteen_proxy_Canteen.cast(this.getOldEntity());
    }

    @java.lang.Override public boolean isProxy()
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:144:5
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final long canteenID)
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:161:12
        return new com.sap.cloud.server.odata.EntityKey().with("CanteenID", com.sap.cloud.server.odata.LongValue.of(canteenID));
    }

    public static com.sap.canteen.proxy.CanteenList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:166:12
        return com.sap.canteen.proxy.CanteenList.share(from);
    }

    public void setCanteenID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:197:5
        this.setDataValue(com.sap.canteen.proxy.Canteen.canteenID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setLocation(final String value)
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:210:5
        this.setDataValue(com.sap.canteen.proxy.Canteen.location, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setMenuID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:223:5
        this.setDataValue(com.sap.canteen.proxy.Canteen.menuID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setName(final String value)
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:236:5
        this.setDataValue(com.sap.canteen.proxy.Canteen.name, com.sap.cloud.server.odata.StringValue.of(value));
    }
}
