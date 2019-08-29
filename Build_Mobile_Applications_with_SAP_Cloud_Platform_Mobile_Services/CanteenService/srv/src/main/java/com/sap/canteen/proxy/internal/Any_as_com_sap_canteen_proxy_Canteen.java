//# xsc 19.6.0-a27f20-20190621

package com.sap.canteen.proxy.internal;

public abstract class Any_as_com_sap_canteen_proxy_Canteen
{
    public static com.sap.canteen.proxy.Canteen cast(final Object value)
    {
        //# /usr/sap/ljs/xs-temp/d3ad2e00-2088-4594-a40d-c7acae86ff33/output/target/tmp/proxy-com.sap.canteen.csdl.xs:646:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:88:16 => /usr/sap/ljs/xs-temp/xs-home/templates/Any.as.xs:7:12
        if (value instanceof com.sap.canteen.proxy.Canteen)
        {
            final com.sap.canteen.proxy.Canteen var_value = ((com.sap.canteen.proxy.Canteen)value);
            return var_value;
        }
        else
        {
            throw com.sap.cloud.server.odata.core.CastException.cannotCast(value, "com.sap.canteen.proxy.Canteen");
        }
    }
}
