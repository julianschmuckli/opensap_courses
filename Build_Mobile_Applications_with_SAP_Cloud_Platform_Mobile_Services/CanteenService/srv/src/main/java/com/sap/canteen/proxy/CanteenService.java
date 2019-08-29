//# xsc 19.6.0-a27f20-20190621

package com.sap.canteen.proxy;

public class CanteenService
    extends com.sap.cloud.server.odata.DataService
{
    public CanteenService()
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:664:5
        this(null);
    }

    public CanteenService(final com.sap.cloud.server.odata.DataServiceProvider provider)
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:664:5
        super(com.sap.cloud.server.odata.MetadataOnlyProvider.newIfNull(provider, "CanteenService"));
        this.getProvider().setMetadata(com.sap.canteen.proxy.CanteenServiceMetadata.document);
    }

    public boolean bookLunch(final long menuID, final String userID)
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:1080:5
        return this.bookLunch(menuID, userID, null, null, null);
    }

    public boolean bookLunch(final long menuID, final String userID, final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:1080:5
        return this.bookLunch(menuID, userID, query, null, null);
    }

    public boolean bookLunch(final long menuID, final String userID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:1080:5
        return this.bookLunch(menuID, userID, query, headers, null);
    }

    public boolean bookLunch(final long menuID, final String userID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:1080:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.sap.cloud.server.odata.BooleanValue.unwrap(this.executeQuery(var_query.invoke(com.sap.canteen.proxy.CanteenServiceMetadata.FunctionImports.bookLunch, new com.sap.cloud.server.odata.ParameterList(2).with("MenuID", com.sap.cloud.server.odata.LongValue.of(menuID)).with("UserID", com.sap.cloud.server.odata.StringValue.of(userID))), var_headers, var_options).getResult());
    }

    public com.sap.canteen.proxy.Booking getBooking(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:676:5
        return this.getBooking(query, null, null);
    }

    public com.sap.canteen.proxy.Booking getBooking(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:676:5
        return this.getBooking(query, headers, null);
    }

    public com.sap.canteen.proxy.Booking getBooking(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:676:5
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.sap.canteen.proxy.internal.Any_as_com_sap_canteen_proxy_Booking.cast(this.executeQuery(query.fromDefault(com.sap.canteen.proxy.CanteenServiceMetadata.EntitySets.bookingSet), var_headers, var_options).getRequiredEntity());
    }

    public com.sap.canteen.proxy.BookingList getBookingSet()
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:691:5
        return this.getBookingSet(null, null, null);
    }

    public com.sap.canteen.proxy.BookingList getBookingSet(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:691:5
        return this.getBookingSet(query, null, null);
    }

    public com.sap.canteen.proxy.BookingList getBookingSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:691:5
        return this.getBookingSet(query, headers, null);
    }

    public com.sap.canteen.proxy.BookingList getBookingSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:691:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.sap.canteen.proxy.Booking.list(this.executeQuery(var_query.fromDefault(com.sap.canteen.proxy.CanteenServiceMetadata.EntitySets.bookingSet), var_headers, var_options).getEntityList());
    }

    public com.sap.canteen.proxy.Booking getBookingWithKey(final long bookingID)
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:684:5
        return this.getBookingWithKey(bookingID, null, null, null);
    }

    public com.sap.canteen.proxy.Booking getBookingWithKey(final long bookingID, final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:684:5
        return this.getBookingWithKey(bookingID, query, null, null);
    }

    public com.sap.canteen.proxy.Booking getBookingWithKey(final long bookingID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:684:5
        return this.getBookingWithKey(bookingID, query, headers, null);
    }

    public com.sap.canteen.proxy.Booking getBookingWithKey(final long bookingID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:684:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getBooking(var_query.withKey(com.sap.canteen.proxy.Booking.key(bookingID)), headers, options);
    }

    public com.sap.canteen.proxy.Canteen getCanteen(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:811:5
        return this.getCanteen(query, null, null);
    }

    public com.sap.canteen.proxy.Canteen getCanteen(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:811:5
        return this.getCanteen(query, headers, null);
    }

    public com.sap.canteen.proxy.Canteen getCanteen(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:811:5
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.sap.canteen.proxy.internal.Any_as_com_sap_canteen_proxy_Canteen.cast(this.executeQuery(query.fromDefault(com.sap.canteen.proxy.CanteenServiceMetadata.EntitySets.canteenSet), var_headers, var_options).getRequiredEntity());
    }

    public com.sap.canteen.proxy.CanteenList getCanteenSet()
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:826:5
        return this.getCanteenSet(null, null, null);
    }

    public com.sap.canteen.proxy.CanteenList getCanteenSet(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:826:5
        return this.getCanteenSet(query, null, null);
    }

    public com.sap.canteen.proxy.CanteenList getCanteenSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:826:5
        return this.getCanteenSet(query, headers, null);
    }

    public com.sap.canteen.proxy.CanteenList getCanteenSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:826:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.sap.canteen.proxy.Canteen.list(this.executeQuery(var_query.fromDefault(com.sap.canteen.proxy.CanteenServiceMetadata.EntitySets.canteenSet), var_headers, var_options).getEntityList());
    }

    public com.sap.canteen.proxy.Canteen getCanteenWithKey(final long canteenID)
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:819:5
        return this.getCanteenWithKey(canteenID, null, null, null);
    }

    public com.sap.canteen.proxy.Canteen getCanteenWithKey(final long canteenID, final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:819:5
        return this.getCanteenWithKey(canteenID, query, null, null);
    }

    public com.sap.canteen.proxy.Canteen getCanteenWithKey(final long canteenID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:819:5
        return this.getCanteenWithKey(canteenID, query, headers, null);
    }

    public com.sap.canteen.proxy.Canteen getCanteenWithKey(final long canteenID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:819:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getCanteen(var_query.withKey(com.sap.canteen.proxy.Canteen.key(canteenID)), headers, options);
    }

    public com.sap.canteen.proxy.DishMenu getDishMenu(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:946:5
        return this.getDishMenu(query, null, null);
    }

    public com.sap.canteen.proxy.DishMenu getDishMenu(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:946:5
        return this.getDishMenu(query, headers, null);
    }

    public com.sap.canteen.proxy.DishMenu getDishMenu(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:946:5
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.sap.canteen.proxy.internal.Any_as_com_sap_canteen_proxy_DishMenu.cast(this.executeQuery(query.fromDefault(com.sap.canteen.proxy.CanteenServiceMetadata.EntitySets.dishMenuSet), var_headers, var_options).getRequiredEntity());
    }

    public com.sap.canteen.proxy.DishMenuList getDishMenuSet()
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:961:5
        return this.getDishMenuSet(null, null, null);
    }

    public com.sap.canteen.proxy.DishMenuList getDishMenuSet(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:961:5
        return this.getDishMenuSet(query, null, null);
    }

    public com.sap.canteen.proxy.DishMenuList getDishMenuSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:961:5
        return this.getDishMenuSet(query, headers, null);
    }

    public com.sap.canteen.proxy.DishMenuList getDishMenuSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:961:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.sap.canteen.proxy.DishMenu.list(this.executeQuery(var_query.fromDefault(com.sap.canteen.proxy.CanteenServiceMetadata.EntitySets.dishMenuSet), var_headers, var_options).getEntityList());
    }

    public com.sap.canteen.proxy.DishMenu getDishMenuWithKey(final long dishMenuID)
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:954:5
        return this.getDishMenuWithKey(dishMenuID, null, null, null);
    }

    public com.sap.canteen.proxy.DishMenu getDishMenuWithKey(final long dishMenuID, final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:954:5
        return this.getDishMenuWithKey(dishMenuID, query, null, null);
    }

    public com.sap.canteen.proxy.DishMenu getDishMenuWithKey(final long dishMenuID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:954:5
        return this.getDishMenuWithKey(dishMenuID, query, headers, null);
    }

    public com.sap.canteen.proxy.DishMenu getDishMenuWithKey(final long dishMenuID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:954:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getDishMenu(var_query.withKey(com.sap.canteen.proxy.DishMenu.key(dishMenuID)), headers, options);
    }

    @java.lang.Override public void refreshMetadata()
    {
        synchronized (this)
        {
            //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:670:19
            com.sap.cloud.server.odata.ProxyInternal.noRefreshMetadata();
        }
    }
}
