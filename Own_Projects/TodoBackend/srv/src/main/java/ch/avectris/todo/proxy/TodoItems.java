//# xsc 19.6.0-a27f20-20190621

package ch.avectris.todo.proxy;

public class TodoItems
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property description = ch.avectris.todo.proxy.TodoServiceMetadata.EntityTypes.todoItems.getProperty("description");

    public static final com.sap.cloud.server.odata.Property finishDate = ch.avectris.todo.proxy.TodoServiceMetadata.EntityTypes.todoItems.getProperty("finishDate");

    public static final com.sap.cloud.server.odata.Property title = ch.avectris.todo.proxy.TodoServiceMetadata.EntityTypes.todoItems.getProperty("title");

    public static final com.sap.cloud.server.odata.Property todoItemsID = ch.avectris.todo.proxy.TodoServiceMetadata.EntityTypes.todoItems.getProperty("todo_itemsID");

    public TodoItems()
    {
        //# /usr/sap/ljs/xs-temp/2dbdce2d-5f98-42ec-82c4-eeb49ec3e5c6/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:35:5
        this(true);
    }

    public TodoItems(final boolean withDefaults)
    {
        //# /usr/sap/ljs/xs-temp/2dbdce2d-5f98-42ec-82c4-eeb49ec3e5c6/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:35:5
        super(withDefaults, ch.avectris.todo.proxy.TodoServiceMetadata.EntityTypes.todoItems);
    }

    public ch.avectris.todo.proxy.TodoItems copy()
    {
        //# /usr/sap/ljs/xs-temp/2dbdce2d-5f98-42ec-82c4-eeb49ec3e5c6/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:20:5
        return ch.avectris.todo.proxy.internal.Any_as_ch_avectris_todo_proxy_TodoItems.cast(this.copyEntity());
    }

    public String getDescription()
    {
        //# /usr/sap/ljs/xs-temp/2dbdce2d-5f98-42ec-82c4-eeb49ec3e5c6/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:56:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(ch.avectris.todo.proxy.TodoItems.description));
    }

    public com.sap.cloud.server.odata.LocalDateTime getFinishDate()
    {
        //# /usr/sap/ljs/xs-temp/2dbdce2d-5f98-42ec-82c4-eeb49ec3e5c6/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:69:5
        return com.sap.cloud.server.odata.LocalDateTime.castRequired(this.getDataValue(ch.avectris.todo.proxy.TodoItems.finishDate));
    }

    public ch.avectris.todo.proxy.TodoItems getOld()
    {
        //# /usr/sap/ljs/xs-temp/2dbdce2d-5f98-42ec-82c4-eeb49ec3e5c6/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:15:5
        return ch.avectris.todo.proxy.internal.Any_as_ch_avectris_todo_proxy_TodoItems.cast(this.getOldEntity());
    }

    public String getTitle()
    {
        //# /usr/sap/ljs/xs-temp/2dbdce2d-5f98-42ec-82c4-eeb49ec3e5c6/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:82:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(ch.avectris.todo.proxy.TodoItems.title));
    }

    public long getTodoItemsID()
    {
        //# /usr/sap/ljs/xs-temp/2dbdce2d-5f98-42ec-82c4-eeb49ec3e5c6/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:95:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(ch.avectris.todo.proxy.TodoItems.todoItemsID));
    }

    @java.lang.Override public boolean isProxy()
    {
        //# /usr/sap/ljs/xs-temp/2dbdce2d-5f98-42ec-82c4-eeb49ec3e5c6/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:8:5
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final long todoItemsID)
    {
        //# /usr/sap/ljs/xs-temp/2dbdce2d-5f98-42ec-82c4-eeb49ec3e5c6/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:25:12
        return new com.sap.cloud.server.odata.EntityKey().with("todo_itemsID", com.sap.cloud.server.odata.LongValue.of(todoItemsID));
    }

    public static ch.avectris.todo.proxy.TodoItemsList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        //# /usr/sap/ljs/xs-temp/2dbdce2d-5f98-42ec-82c4-eeb49ec3e5c6/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:30:12
        return ch.avectris.todo.proxy.TodoItemsList.share(from);
    }

    public void setDescription(final String value)
    {
        //# /usr/sap/ljs/xs-temp/2dbdce2d-5f98-42ec-82c4-eeb49ec3e5c6/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:61:5
        this.setDataValue(ch.avectris.todo.proxy.TodoItems.description, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setFinishDate(final com.sap.cloud.server.odata.LocalDateTime value)
    {
        //# /usr/sap/ljs/xs-temp/2dbdce2d-5f98-42ec-82c4-eeb49ec3e5c6/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:74:5
        this.setDataValue(ch.avectris.todo.proxy.TodoItems.finishDate, value);
    }

    public void setTitle(final String value)
    {
        //# /usr/sap/ljs/xs-temp/2dbdce2d-5f98-42ec-82c4-eeb49ec3e5c6/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:87:5
        this.setDataValue(ch.avectris.todo.proxy.TodoItems.title, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setTodoItemsID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/2dbdce2d-5f98-42ec-82c4-eeb49ec3e5c6/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:100:5
        this.setDataValue(ch.avectris.todo.proxy.TodoItems.todoItemsID, com.sap.cloud.server.odata.LongValue.of(value));
    }
}
