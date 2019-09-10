//# xsc 19.6.0-a27f20-20190621

package ch.avectris.todo.proxy;

public class TodoItems
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property description = ch.avectris.todo.proxy.TodoServiceMetadata.EntityTypes.todoItems.getProperty("description");

    public static final com.sap.cloud.server.odata.Property done = ch.avectris.todo.proxy.TodoServiceMetadata.EntityTypes.todoItems.getProperty("done");

    public static final com.sap.cloud.server.odata.Property finishDate = ch.avectris.todo.proxy.TodoServiceMetadata.EntityTypes.todoItems.getProperty("finishDate");

    public static final com.sap.cloud.server.odata.Property title = ch.avectris.todo.proxy.TodoServiceMetadata.EntityTypes.todoItems.getProperty("title");

    public static final com.sap.cloud.server.odata.Property todoItemsID = ch.avectris.todo.proxy.TodoServiceMetadata.EntityTypes.todoItems.getProperty("todo_itemsID");

    public TodoItems()
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:35:5
        this(true);
    }

    public TodoItems(final boolean withDefaults)
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:35:5
        super(withDefaults, ch.avectris.todo.proxy.TodoServiceMetadata.EntityTypes.todoItems);
    }

    public ch.avectris.todo.proxy.TodoItems copy()
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:20:5
        return ch.avectris.todo.proxy.internal.Any_as_ch_avectris_todo_proxy_TodoItems.cast(this.copyEntity());
    }

    public String getDescription()
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:58:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(ch.avectris.todo.proxy.TodoItems.description));
    }

    public boolean getDone()
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:71:5
        return com.sap.cloud.server.odata.BooleanValue.unwrap(this.getDataValue(ch.avectris.todo.proxy.TodoItems.done));
    }

    public com.sap.cloud.server.odata.LocalDateTime getFinishDate()
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:84:5
        return com.sap.cloud.server.odata.LocalDateTime.castRequired(this.getDataValue(ch.avectris.todo.proxy.TodoItems.finishDate));
    }

    public ch.avectris.todo.proxy.TodoItems getOld()
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:15:5
        return ch.avectris.todo.proxy.internal.Any_as_ch_avectris_todo_proxy_TodoItems.cast(this.getOldEntity());
    }

    public String getTitle()
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:97:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(ch.avectris.todo.proxy.TodoItems.title));
    }

    public long getTodoItemsID()
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:110:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(ch.avectris.todo.proxy.TodoItems.todoItemsID));
    }

    @java.lang.Override public boolean isProxy()
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:8:5
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final long todoItemsID)
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:25:12
        return new com.sap.cloud.server.odata.EntityKey().with("todo_itemsID", com.sap.cloud.server.odata.LongValue.of(todoItemsID));
    }

    public static ch.avectris.todo.proxy.TodoItemsList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:30:12
        return ch.avectris.todo.proxy.TodoItemsList.share(from);
    }

    public void setDescription(final String value)
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:63:5
        this.setDataValue(ch.avectris.todo.proxy.TodoItems.description, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setDone(final boolean value)
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:76:5
        this.setDataValue(ch.avectris.todo.proxy.TodoItems.done, com.sap.cloud.server.odata.BooleanValue.of(value));
    }

    public void setFinishDate(final com.sap.cloud.server.odata.LocalDateTime value)
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:89:5
        this.setDataValue(ch.avectris.todo.proxy.TodoItems.finishDate, value);
    }

    public void setTitle(final String value)
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:102:5
        this.setDataValue(ch.avectris.todo.proxy.TodoItems.title, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setTodoItemsID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:115:5
        this.setDataValue(ch.avectris.todo.proxy.TodoItems.todoItemsID, com.sap.cloud.server.odata.LongValue.of(value));
    }
}
