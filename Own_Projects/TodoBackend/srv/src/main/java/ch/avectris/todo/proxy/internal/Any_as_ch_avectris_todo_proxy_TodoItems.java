//# xsc 19.6.0-a27f20-20190621

package ch.avectris.todo.proxy.internal;

public abstract class Any_as_ch_avectris_todo_proxy_TodoItems
{
    public static ch.avectris.todo.proxy.TodoItems cast(final Object value)
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:357:37 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:88:16 => /usr/sap/ljs/xs-temp/xs-home/templates/Any.as.xs:7:12
        if (value instanceof ch.avectris.todo.proxy.TodoItems)
        {
            final ch.avectris.todo.proxy.TodoItems var_value = ((ch.avectris.todo.proxy.TodoItems)value);
            return var_value;
        }
        else
        {
            throw com.sap.cloud.server.odata.core.CastException.cannotCast(value, "ch.avectris.todo.proxy.TodoItems");
        }
    }
}
