//# xsc 19.6.0-a27f20-20190621

package ch.avectris.todo.proxy;

public class TodoService
    extends com.sap.cloud.server.odata.DataService
{
    public TodoService()
    {
        //# /usr/sap/ljs/xs-temp/2dbdce2d-5f98-42ec-82c4-eeb49ec3e5c6/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:194:5
        this(null);
    }

    public TodoService(final com.sap.cloud.server.odata.DataServiceProvider provider)
    {
        //# /usr/sap/ljs/xs-temp/2dbdce2d-5f98-42ec-82c4-eeb49ec3e5c6/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:194:5
        super(com.sap.cloud.server.odata.MetadataOnlyProvider.newIfNull(provider, "TodoService"));
        this.getProvider().setMetadata(ch.avectris.todo.proxy.TodoServiceMetadata.document);
    }

    public ch.avectris.todo.proxy.TodoItems getTodoItems(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/2dbdce2d-5f98-42ec-82c4-eeb49ec3e5c6/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:206:5
        return this.getTodoItems(query, null, null);
    }

    public ch.avectris.todo.proxy.TodoItems getTodoItems(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/2dbdce2d-5f98-42ec-82c4-eeb49ec3e5c6/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:206:5
        return this.getTodoItems(query, headers, null);
    }

    public ch.avectris.todo.proxy.TodoItems getTodoItems(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/2dbdce2d-5f98-42ec-82c4-eeb49ec3e5c6/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:206:5
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return ch.avectris.todo.proxy.internal.Any_as_ch_avectris_todo_proxy_TodoItems.cast(this.executeQuery(query.fromDefault(ch.avectris.todo.proxy.TodoServiceMetadata.EntitySets.todoItemsSet), var_headers, var_options).getRequiredEntity());
    }

    public ch.avectris.todo.proxy.TodoItemsList getTodoItemsSet()
    {
        //# /usr/sap/ljs/xs-temp/2dbdce2d-5f98-42ec-82c4-eeb49ec3e5c6/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:221:5
        return this.getTodoItemsSet(null, null, null);
    }

    public ch.avectris.todo.proxy.TodoItemsList getTodoItemsSet(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/2dbdce2d-5f98-42ec-82c4-eeb49ec3e5c6/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:221:5
        return this.getTodoItemsSet(query, null, null);
    }

    public ch.avectris.todo.proxy.TodoItemsList getTodoItemsSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/2dbdce2d-5f98-42ec-82c4-eeb49ec3e5c6/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:221:5
        return this.getTodoItemsSet(query, headers, null);
    }

    public ch.avectris.todo.proxy.TodoItemsList getTodoItemsSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/2dbdce2d-5f98-42ec-82c4-eeb49ec3e5c6/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:221:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return ch.avectris.todo.proxy.TodoItems.list(this.executeQuery(var_query.fromDefault(ch.avectris.todo.proxy.TodoServiceMetadata.EntitySets.todoItemsSet), var_headers, var_options).getEntityList());
    }

    public ch.avectris.todo.proxy.TodoItems getTodoItemsWithKey(final long todoItemsID)
    {
        //# /usr/sap/ljs/xs-temp/2dbdce2d-5f98-42ec-82c4-eeb49ec3e5c6/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:214:5
        return this.getTodoItemsWithKey(todoItemsID, null, null, null);
    }

    public ch.avectris.todo.proxy.TodoItems getTodoItemsWithKey(final long todoItemsID, final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/2dbdce2d-5f98-42ec-82c4-eeb49ec3e5c6/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:214:5
        return this.getTodoItemsWithKey(todoItemsID, query, null, null);
    }

    public ch.avectris.todo.proxy.TodoItems getTodoItemsWithKey(final long todoItemsID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/2dbdce2d-5f98-42ec-82c4-eeb49ec3e5c6/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:214:5
        return this.getTodoItemsWithKey(todoItemsID, query, headers, null);
    }

    public ch.avectris.todo.proxy.TodoItems getTodoItemsWithKey(final long todoItemsID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/2dbdce2d-5f98-42ec-82c4-eeb49ec3e5c6/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:214:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getTodoItems(var_query.withKey(ch.avectris.todo.proxy.TodoItems.key(todoItemsID)), headers, options);
    }

    @java.lang.Override public void refreshMetadata()
    {
        synchronized (this)
        {
            //# /usr/sap/ljs/xs-temp/2dbdce2d-5f98-42ec-82c4-eeb49ec3e5c6/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:200:19
            com.sap.cloud.server.odata.ProxyInternal.noRefreshMetadata();
        }
    }
}
