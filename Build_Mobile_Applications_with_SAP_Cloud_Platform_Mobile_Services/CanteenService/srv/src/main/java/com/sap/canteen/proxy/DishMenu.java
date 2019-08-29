//# xsc 19.6.0-a27f20-20190621

package com.sap.canteen.proxy;

public class DishMenu
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property bookingID = com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.dishMenu.getProperty("BookingID");

    public static final com.sap.cloud.server.odata.Property canteenID = com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.dishMenu.getProperty("CanteenID");

    public static final com.sap.cloud.server.odata.Property dessert = com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.dishMenu.getProperty("Dessert");

    public static final com.sap.cloud.server.odata.Property dishMenuID = com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.dishMenu.getProperty("DishMenuID");

    public static final com.sap.cloud.server.odata.Property mainDish = com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.dishMenu.getProperty("MainDish");

    public static final com.sap.cloud.server.odata.Property price = com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.dishMenu.getProperty("Price");

    public static final com.sap.cloud.server.odata.Property sides = com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.dishMenu.getProperty("Sides");

    public static final com.sap.cloud.server.odata.Property soup = com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.dishMenu.getProperty("Soup");

    public static final com.sap.cloud.server.odata.Property dateOfLunch = com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.dishMenu.getProperty("dateOfLunch");

    public static final com.sap.cloud.server.odata.Property kcalForMain = com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.dishMenu.getProperty("kcalForMain");

    public static final com.sap.cloud.server.odata.Property veggie = com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.dishMenu.getProperty("veggie");

    public static final com.sap.cloud.server.odata.Property menuBooked = com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.dishMenu.getProperty("MenuBooked");

    public static final com.sap.cloud.server.odata.Property inCanteen = com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.dishMenu.getProperty("inCanteen");

    public DishMenu()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:322:5
        this(true);
    }

    public DishMenu(final boolean withDefaults)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:322:5
        super(withDefaults, com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.dishMenu);
    }

    public com.sap.canteen.proxy.DishMenu copy()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:307:5
        return com.sap.canteen.proxy.internal.Any_as_com_sap_canteen_proxy_DishMenu.cast(this.copyEntity());
    }

    public long getBookingID()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:361:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.sap.canteen.proxy.DishMenu.bookingID));
    }

    public long getCanteenID()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:374:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.sap.canteen.proxy.DishMenu.canteenID));
    }

    public com.sap.cloud.server.odata.GlobalDateTime getDateOfLunch()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:465:5
        return com.sap.cloud.server.odata.GlobalDateTime.castRequired(this.getDataValue(com.sap.canteen.proxy.DishMenu.dateOfLunch));
    }

    public String getDessert()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:387:5
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.canteen.proxy.DishMenu.dessert));
    }

    public long getDishMenuID()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:400:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.sap.canteen.proxy.DishMenu.dishMenuID));
    }

    public com.sap.canteen.proxy.Canteen getInCanteen()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:517:5
        return com.sap.canteen.proxy.internal.Any_as_com_sap_canteen_proxy_Canteen.cast(this.getDataValue(com.sap.canteen.proxy.DishMenu.inCanteen));
    }

    public int getKcalForMain()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:478:5
        return com.sap.cloud.server.odata.IntValue.unwrap(this.getDataValue(com.sap.canteen.proxy.DishMenu.kcalForMain));
    }

    public String getMainDish()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:413:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.canteen.proxy.DishMenu.mainDish));
    }

    public com.sap.canteen.proxy.BookingList getMenuBooked()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:504:5
        return com.sap.canteen.proxy.BookingList.share(com.sap.cloud.server.odata.EntityValueList.castRequired(this.getDataValue(com.sap.canteen.proxy.DishMenu.menuBooked)));
    }

    public com.sap.canteen.proxy.DishMenu getOld()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:302:5
        return com.sap.canteen.proxy.internal.Any_as_com_sap_canteen_proxy_DishMenu.cast(this.getOldEntity());
    }

    public java.math.BigDecimal getPrice()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:426:5
        return com.sap.cloud.server.odata.DecimalValue.unwrap(this.getDataValue(com.sap.canteen.proxy.DishMenu.price));
    }

    public String getSides()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:439:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.canteen.proxy.DishMenu.sides));
    }

    public String getSoup()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:452:5
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.canteen.proxy.DishMenu.soup));
    }

    public Boolean getVeggie()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:491:5
        return com.sap.cloud.server.odata.BooleanValue.toNullable(this.getDataValue(com.sap.canteen.proxy.DishMenu.veggie));
    }

    @java.lang.Override public boolean isProxy()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:295:5
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final long dishMenuID)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:312:12
        return new com.sap.cloud.server.odata.EntityKey().with("DishMenuID", com.sap.cloud.server.odata.LongValue.of(dishMenuID));
    }

    public static com.sap.canteen.proxy.DishMenuList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:317:12
        return com.sap.canteen.proxy.DishMenuList.share(from);
    }

    public void setBookingID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:366:5
        this.setDataValue(com.sap.canteen.proxy.DishMenu.bookingID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setCanteenID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:379:5
        this.setDataValue(com.sap.canteen.proxy.DishMenu.canteenID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setDateOfLunch(final com.sap.cloud.server.odata.GlobalDateTime value)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:470:5
        this.setDataValue(com.sap.canteen.proxy.DishMenu.dateOfLunch, value);
    }

    public void setDessert(final String value)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:392:5
        this.setDataValue(com.sap.canteen.proxy.DishMenu.dessert, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setDishMenuID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:405:5
        this.setDataValue(com.sap.canteen.proxy.DishMenu.dishMenuID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setInCanteen(final com.sap.canteen.proxy.Canteen value)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:522:5
        this.setDataValue(com.sap.canteen.proxy.DishMenu.inCanteen, value);
    }

    public void setKcalForMain(final int value)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:483:5
        this.setDataValue(com.sap.canteen.proxy.DishMenu.kcalForMain, com.sap.cloud.server.odata.IntValue.of(value));
    }

    public void setMainDish(final String value)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:418:5
        this.setDataValue(com.sap.canteen.proxy.DishMenu.mainDish, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setMenuBooked(final com.sap.canteen.proxy.BookingList value)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:509:5
        com.sap.canteen.proxy.DishMenu.menuBooked.setEntityList(this, com.sap.cloud.server.odata.EntityValueList.share(value));
    }

    public void setPrice(final java.math.BigDecimal value)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:431:5
        this.setDataValue(com.sap.canteen.proxy.DishMenu.price, com.sap.cloud.server.odata.DecimalValue.of(value));
    }

    public void setSides(final String value)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:444:5
        this.setDataValue(com.sap.canteen.proxy.DishMenu.sides, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setSoup(final String value)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:457:5
        this.setDataValue(com.sap.canteen.proxy.DishMenu.soup, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setVeggie(final Boolean value)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:496:5
        this.setDataValue(com.sap.canteen.proxy.DishMenu.veggie, com.sap.cloud.server.odata.BooleanValue.ofNullable(value));
    }
}
