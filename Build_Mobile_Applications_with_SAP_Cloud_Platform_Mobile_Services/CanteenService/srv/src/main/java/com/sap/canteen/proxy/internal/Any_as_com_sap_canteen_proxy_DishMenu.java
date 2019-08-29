//# xsc 19.6.0-a27f20-20190621

package com.sap.canteen.proxy.internal;

public abstract class Any_as_com_sap_canteen_proxy_DishMenu
{
    public static com.sap.canteen.proxy.DishMenu cast(final Object value)
    {
        //# /usr/sap/ljs/xs-temp/6c8af6ad-68de-45dd-bec6-5ffd60f0fa22/output/target/tmp/proxy-com.sap.canteen.csdl.xs:1147:36 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:88:16 => /usr/sap/ljs/xs-temp/xs-home/templates/Any.as.xs:7:12
        if (value instanceof com.sap.canteen.proxy.DishMenu)
        {
            final com.sap.canteen.proxy.DishMenu var_value = ((com.sap.canteen.proxy.DishMenu)value);
            return var_value;
        }
        else
        {
            throw com.sap.cloud.server.odata.core.CastException.cannotCast(value, "com.sap.canteen.proxy.DishMenu");
        }
    }
}
