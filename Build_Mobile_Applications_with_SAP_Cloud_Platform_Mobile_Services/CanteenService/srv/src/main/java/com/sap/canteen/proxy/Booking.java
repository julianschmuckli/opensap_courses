//# xsc 19.6.0-a27f20-20190621

package com.sap.canteen.proxy;

public class Booking
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property bookingDate = com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.booking.getProperty("BookingDate");

    public static final com.sap.cloud.server.odata.Property bookingID = com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.booking.getProperty("BookingID");

    public static final com.sap.cloud.server.odata.Property dishMenuID = com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.booking.getProperty("DishMenuID");

    public static final com.sap.cloud.server.odata.Property menuID = com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.booking.getProperty("MenuID");

    public static final com.sap.cloud.server.odata.Property price = com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.booking.getProperty("Price");

    public static final com.sap.cloud.server.odata.Property status = com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.booking.getProperty("Status");

    public static final com.sap.cloud.server.odata.Property user = com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.booking.getProperty("User");

    public static final com.sap.cloud.server.odata.Property bookings = com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.booking.getProperty("Bookings");

    public Booking()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:35:5
        this(true);
    }

    public Booking(final boolean withDefaults)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:35:5
        super(withDefaults, com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.booking);
    }

    public com.sap.canteen.proxy.Booking copy()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:20:5
        return com.sap.canteen.proxy.internal.Any_as_com_sap_canteen_proxy_Booking.cast(this.copyEntity());
    }

    public com.sap.cloud.server.odata.GlobalDateTime getBookingDate()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:64:5
        return com.sap.cloud.server.odata.GlobalDateTime.castRequired(this.getDataValue(com.sap.canteen.proxy.Booking.bookingDate));
    }

    public long getBookingID()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:77:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.sap.canteen.proxy.Booking.bookingID));
    }

    public com.sap.canteen.proxy.DishMenu getBookings()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:155:5
        return com.sap.canteen.proxy.internal.Any_as_com_sap_canteen_proxy_DishMenu.cast(this.getDataValue(com.sap.canteen.proxy.Booking.bookings));
    }

    public long getDishMenuID()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:90:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.sap.canteen.proxy.Booking.dishMenuID));
    }

    public long getMenuID()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:103:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.sap.canteen.proxy.Booking.menuID));
    }

    public com.sap.canteen.proxy.Booking getOld()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:15:5
        return com.sap.canteen.proxy.internal.Any_as_com_sap_canteen_proxy_Booking.cast(this.getOldEntity());
    }

    public java.math.BigDecimal getPrice()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:116:5
        return com.sap.cloud.server.odata.DecimalValue.unwrap(this.getDataValue(com.sap.canteen.proxy.Booking.price));
    }

    public String getStatus()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:129:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.canteen.proxy.Booking.status));
    }

    public String getUser()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:142:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.canteen.proxy.Booking.user));
    }

    @java.lang.Override public boolean isProxy()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:8:5
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final long bookingID)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:25:12
        return new com.sap.cloud.server.odata.EntityKey().with("BookingID", com.sap.cloud.server.odata.LongValue.of(bookingID));
    }

    public static com.sap.canteen.proxy.BookingList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:30:12
        return com.sap.canteen.proxy.BookingList.share(from);
    }

    public void setBookingDate(final com.sap.cloud.server.odata.GlobalDateTime value)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:69:5
        this.setDataValue(com.sap.canteen.proxy.Booking.bookingDate, value);
    }

    public void setBookingID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:82:5
        this.setDataValue(com.sap.canteen.proxy.Booking.bookingID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setBookings(final com.sap.canteen.proxy.DishMenu value)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:160:5
        this.setDataValue(com.sap.canteen.proxy.Booking.bookings, value);
    }

    public void setDishMenuID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:95:5
        this.setDataValue(com.sap.canteen.proxy.Booking.dishMenuID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setMenuID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:108:5
        this.setDataValue(com.sap.canteen.proxy.Booking.menuID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setPrice(final java.math.BigDecimal value)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:121:5
        this.setDataValue(com.sap.canteen.proxy.Booking.price, com.sap.cloud.server.odata.DecimalValue.of(value));
    }

    public void setStatus(final String value)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:134:5
        this.setDataValue(com.sap.canteen.proxy.Booking.status, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setUser(final String value)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:147:5
        this.setDataValue(com.sap.canteen.proxy.Booking.user, com.sap.cloud.server.odata.StringValue.of(value));
    }
}
