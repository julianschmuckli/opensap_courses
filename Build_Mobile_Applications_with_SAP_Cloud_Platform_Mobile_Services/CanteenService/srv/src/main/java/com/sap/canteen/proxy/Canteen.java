//# xsc 19.6.0-a27f20-20190621

package com.sap.canteen.proxy;

public class Canteen
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property canteenID = com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.canteen.getProperty("CanteenID");

    public static final com.sap.cloud.server.odata.Property location = com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.canteen.getProperty("Location");

    public static final com.sap.cloud.server.odata.Property menuID = com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.canteen.getProperty("MenuID");

    public static final com.sap.cloud.server.odata.Property name = com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.canteen.getProperty("Name");

    public static final com.sap.cloud.server.odata.Property serveMenues = com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.canteen.getProperty("serveMenues");

    public Canteen()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:201:5
        this(true);
    }

    public Canteen(final boolean withDefaults)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:201:5
        super(withDefaults, com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.canteen);
    }

    public com.sap.canteen.proxy.Canteen copy()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:186:5
        return com.sap.canteen.proxy.internal.Any_as_com_sap_canteen_proxy_Canteen.cast(this.copyEntity());
    }

    public long getCanteenID()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:224:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.sap.canteen.proxy.Canteen.canteenID));
    }

    public String getLocation()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:237:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.canteen.proxy.Canteen.location));
    }

    public long getMenuID()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:250:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.sap.canteen.proxy.Canteen.menuID));
    }

    public String getName()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:263:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.canteen.proxy.Canteen.name));
    }

    public com.sap.canteen.proxy.Canteen getOld()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:181:5
        return com.sap.canteen.proxy.internal.Any_as_com_sap_canteen_proxy_Canteen.cast(this.getOldEntity());
    }

    public com.sap.canteen.proxy.DishMenuList getServeMenues()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:276:5
        return com.sap.canteen.proxy.DishMenuList.share(com.sap.cloud.server.odata.EntityValueList.castRequired(this.getDataValue(com.sap.canteen.proxy.Canteen.serveMenues)));
    }

    @java.lang.Override public boolean isProxy()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:174:5
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final long canteenID)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:191:12
        return new com.sap.cloud.server.odata.EntityKey().with("CanteenID", com.sap.cloud.server.odata.LongValue.of(canteenID));
    }

    public static com.sap.canteen.proxy.CanteenList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:196:12
        return com.sap.canteen.proxy.CanteenList.share(from);
    }

    public void setCanteenID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:229:5
        this.setDataValue(com.sap.canteen.proxy.Canteen.canteenID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setLocation(final String value)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:242:5
        this.setDataValue(com.sap.canteen.proxy.Canteen.location, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setMenuID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:255:5
        this.setDataValue(com.sap.canteen.proxy.Canteen.menuID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setName(final String value)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:268:5
        this.setDataValue(com.sap.canteen.proxy.Canteen.name, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setServeMenues(final com.sap.canteen.proxy.DishMenuList value)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:281:5
        com.sap.canteen.proxy.Canteen.serveMenues.setEntityList(this, com.sap.cloud.server.odata.EntityValueList.share(value));
    }
}
