//# xsc 19.6.0-a27f20-20190621

package com.sap.canteen.proxy;

public class CanteenService
    extends com.sap.cloud.server.odata.DataService
{
    public CanteenService()
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:349:5
        this(null);
    }

    public CanteenService(final com.sap.cloud.server.odata.DataServiceProvider provider)
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:349:5
        super(com.sap.cloud.server.odata.MetadataOnlyProvider.newIfNull(provider, "CanteenService"));
        this.getProvider().setMetadata(com.sap.canteen.proxy.CanteenServiceMetadata.document);
    }

    public com.sap.canteen.proxy.Booking getBooking(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:361:5
        return this.getBooking(query, null, null);
    }

    public com.sap.canteen.proxy.Booking getBooking(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:361:5
        return this.getBooking(query, headers, null);
    }

    public com.sap.canteen.proxy.Booking getBooking(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:361:5
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.sap.canteen.proxy.internal.Any_as_com_sap_canteen_proxy_Booking.cast(this.executeQuery(query.fromDefault(com.sap.canteen.proxy.CanteenServiceMetadata.EntitySets.bookingSet), var_headers, var_options).getRequiredEntity());
    }

    public com.sap.canteen.proxy.BookingList getBookingSet()
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:376:5
        return this.getBookingSet(null, null, null);
    }

    public com.sap.canteen.proxy.BookingList getBookingSet(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:376:5
        return this.getBookingSet(query, null, null);
    }

    public com.sap.canteen.proxy.BookingList getBookingSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:376:5
        return this.getBookingSet(query, headers, null);
    }

    public com.sap.canteen.proxy.BookingList getBookingSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:376:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.sap.canteen.proxy.Booking.list(this.executeQuery(var_query.fromDefault(com.sap.canteen.proxy.CanteenServiceMetadata.EntitySets.bookingSet), var_headers, var_options).getEntityList());
    }

    public com.sap.canteen.proxy.Booking getBookingWithKey(final long bookingID)
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:369:5
        return this.getBookingWithKey(bookingID, null, null, null);
    }

    public com.sap.canteen.proxy.Booking getBookingWithKey(final long bookingID, final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:369:5
        return this.getBookingWithKey(bookingID, query, null, null);
    }

    public com.sap.canteen.proxy.Booking getBookingWithKey(final long bookingID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:369:5
        return this.getBookingWithKey(bookingID, query, headers, null);
    }

    public com.sap.canteen.proxy.Booking getBookingWithKey(final long bookingID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:369:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getBooking(var_query.withKey(com.sap.canteen.proxy.Booking.key(bookingID)), headers, options);
    }

    public com.sap.canteen.proxy.Canteen getCanteen(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:496:5
        return this.getCanteen(query, null, null);
    }

    public com.sap.canteen.proxy.Canteen getCanteen(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:496:5
        return this.getCanteen(query, headers, null);
    }

    public com.sap.canteen.proxy.Canteen getCanteen(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:496:5
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.sap.canteen.proxy.internal.Any_as_com_sap_canteen_proxy_Canteen.cast(this.executeQuery(query.fromDefault(com.sap.canteen.proxy.CanteenServiceMetadata.EntitySets.canteenSet), var_headers, var_options).getRequiredEntity());
    }

    public com.sap.canteen.proxy.CanteenList getCanteenSet()
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:511:5
        return this.getCanteenSet(null, null, null);
    }

    public com.sap.canteen.proxy.CanteenList getCanteenSet(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:511:5
        return this.getCanteenSet(query, null, null);
    }

    public com.sap.canteen.proxy.CanteenList getCanteenSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:511:5
        return this.getCanteenSet(query, headers, null);
    }

    public com.sap.canteen.proxy.CanteenList getCanteenSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:511:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.sap.canteen.proxy.Canteen.list(this.executeQuery(var_query.fromDefault(com.sap.canteen.proxy.CanteenServiceMetadata.EntitySets.canteenSet), var_headers, var_options).getEntityList());
    }

    public com.sap.canteen.proxy.Canteen getCanteenWithKey(final long canteenID)
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:504:5
        return this.getCanteenWithKey(canteenID, null, null, null);
    }

    public com.sap.canteen.proxy.Canteen getCanteenWithKey(final long canteenID, final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:504:5
        return this.getCanteenWithKey(canteenID, query, null, null);
    }

    public com.sap.canteen.proxy.Canteen getCanteenWithKey(final long canteenID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:504:5
        return this.getCanteenWithKey(canteenID, query, headers, null);
    }

    public com.sap.canteen.proxy.Canteen getCanteenWithKey(final long canteenID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:504:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getCanteen(var_query.withKey(com.sap.canteen.proxy.Canteen.key(canteenID)), headers, options);
    }

    @java.lang.Override public void refreshMetadata()
    {
        synchronized (this)
        {
            //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:355:19
            com.sap.cloud.server.odata.ProxyInternal.noRefreshMetadata();
        }
    }
}
