//# xsc 19.6.0-a27f20-20190621

package com.sap.canteen.proxy;

public class BookingList
    extends com.sap.cloud.server.odata.ListBase
    implements java.lang.Iterable<com.sap.canteen.proxy.Booking>
{
    public static final com.sap.canteen.proxy.BookingList empty = new com.sap.canteen.proxy.BookingList(java.lang.Integer.MIN_VALUE);

    public BookingList()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:1072:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:13:5
        this(4);
    }

    public BookingList(final int capacity)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:1072:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:13:5
        super(capacity);
    }

    public void add(final com.sap.canteen.proxy.Booking item)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:1072:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:50:5
        this.getUntypedList().add(this.validate(((Object)item)));
    }

    public void addAll(final com.sap.canteen.proxy.BookingList list)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:1072:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:59:5
        this.getUntypedList().addAll(list.getUntypedList());
    }

    public com.sap.canteen.proxy.BookingList addThis(final com.sap.canteen.proxy.Booking item)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:1072:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:70:5
        this.add(item);
        return this;
    }

    public com.sap.canteen.proxy.BookingList copy()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:1072:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:78:5
        return this.slice(0);
    }

    public com.sap.canteen.proxy.Booking first()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:1072:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:86:5
        return com.sap.canteen.proxy.internal.Any_as_com_sap_canteen_proxy_Booking.cast(this.getUntypedList().first());
    }

    public static com.sap.canteen.proxy.BookingList from(final java.util.List<com.sap.canteen.proxy.Booking> list)
    {
        return BookingList.share(new com.sap.cloud.server.odata.core.GenericList<com.sap.canteen.proxy.Booking>(list).toAnyList());
    }

    public com.sap.canteen.proxy.Booking get(final int index)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:1072:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:96:5
        return com.sap.canteen.proxy.internal.Any_as_com_sap_canteen_proxy_Booking.cast(this.getUntypedList().get(index));
    }

    public boolean includes(final com.sap.canteen.proxy.Booking item)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:1072:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:104:5
        return this.indexOf(item) != -1;
    }

    public int indexOf(final com.sap.canteen.proxy.Booking item)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:1072:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:113:5
        return this.indexOf(item, 0);
    }

    public int indexOf(final com.sap.canteen.proxy.Booking item, final int start)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:1072:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:113:5
        return this.getUntypedList().indexOf(((Object)item), start);
    }

    public void insertAll(final int index, final com.sap.canteen.proxy.BookingList list)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:1072:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:135:5
        this.getUntypedList().insertAll(index, list.getUntypedList());
    }

    public void insertAt(final int index, final com.sap.canteen.proxy.Booking item)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:1072:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:124:5
        this.getUntypedList().insertAt(index, ((Object)item));
    }

    public java.util.Iterator<com.sap.canteen.proxy.Booking> iterator()
    {
        return this.toGeneric().iterator();
    }

    public com.sap.canteen.proxy.Booking last()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:1072:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:143:5
        return com.sap.canteen.proxy.internal.Any_as_com_sap_canteen_proxy_Booking.cast(this.getUntypedList().last());
    }

    public int lastIndexOf(final com.sap.canteen.proxy.Booking item)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:1072:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:152:5
        return this.lastIndexOf(item, 2147483647);
    }

    public int lastIndexOf(final com.sap.canteen.proxy.Booking item, final int start)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:1072:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:152:5
        return this.getUntypedList().lastIndexOf(((Object)item), start);
    }

    public void set(final int index, final com.sap.canteen.proxy.Booking item)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:1072:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:162:5
        this.getUntypedList().set(index, ((Object)item));
    }

    public static com.sap.canteen.proxy.BookingList share(final com.sap.cloud.server.odata.ListBase list)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:1072:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:24:12
        final com.sap.cloud.server.odata.core.UntypedList items = list.getUntypedList();
        final int n = items.length();
        final com.sap.canteen.proxy.BookingList result = new com.sap.canteen.proxy.BookingList(n);
        boolean replace = false;
        {
            int i = 0;
            for (; (i < n); i++)
            {
                final Object item = items.get(i);
                if (item instanceof com.sap.canteen.proxy.Booking)
                {
                    final com.sap.canteen.proxy.Booking var_item = ((com.sap.canteen.proxy.Booking)item);
                    result.add(var_item);
                }
                else
                {
                    replace = true;
                }
            }
        }
        result.shareWith(list, replace);
        return result;
    }

    public com.sap.canteen.proxy.Booking single()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:1072:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:171:5
        return com.sap.canteen.proxy.internal.Any_as_com_sap_canteen_proxy_Booking.cast(this.getUntypedList().single());
    }

    public com.sap.canteen.proxy.BookingList slice(final int start)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:1072:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:180:5
        return this.slice(start, 2147483647);
    }

    public com.sap.canteen.proxy.BookingList slice(final int start, final int end)
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:1072:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:180:5
        final com.sap.cloud.server.odata.core.UntypedList list = this.getUntypedList();
        final int var_start = list.startRange(start);
        final int var_end = list.endRange(end);
        final com.sap.canteen.proxy.BookingList result = new com.sap.canteen.proxy.BookingList(var_end - var_start);
        result.getUntypedList().addRange(list, var_start, var_end);
        return result;
    }

    @java.lang.Override public com.sap.cloud.server.odata.ListBase toDynamic()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:1074:5
        return this.toEntityList();
    }

    public com.sap.cloud.server.odata.EntityValueList toEntityList()
    {
        //# /usr/sap/ljs/xs-temp/6e154f94-7f0b-467f-a445-1d4d93dde994/output/target/tmp/proxy-com.sap.canteen.csdl.xs:1079:5
        return com.sap.cloud.server.odata.EntityValueList.share(this).withItemType(com.sap.canteen.proxy.CanteenServiceMetadata.EntityTypes.booking);
    }

    public java.util.List<com.sap.canteen.proxy.Booking> toGeneric()
    {
        return new com.sap.cloud.server.odata.core.GenericList<com.sap.canteen.proxy.Booking>(this);
    }
}
