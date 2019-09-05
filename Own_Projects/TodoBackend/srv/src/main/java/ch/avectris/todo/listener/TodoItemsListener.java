package ch.avectris.todo.listener;

import com.sap.cloud.server.odata.*;

public class TodoItemsListener extends com.sap.cloud.server.odata.DefaultEntityListener {
    private ch.avectris.todo.MainServlet servlet;
    private ch.avectris.todo.proxy.TodoService service;

    public TodoItemsListener(ch.avectris.todo.MainServlet servlet, ch.avectris.todo.proxy.TodoService service) {
        super();
        this.servlet = servlet;
        this.service = service;
    }

    @Override public void beforeQuery(DataQuery query) {
    }

    public void beforeSave(EntityValue entityValue) {
        ch.avectris.todo.proxy.TodoItems entity = (ch.avectris.todo.proxy.TodoItems)entityValue;
        // Shared code for beforeCreate / beforeUpdate.
    }

    @Override public void beforeCreate(EntityValue entityValue) {
        ch.avectris.todo.proxy.TodoItems entity = (ch.avectris.todo.proxy.TodoItems)entityValue;
        beforeSave(entity);
    }

    @Override public void beforeUpdate(EntityValue entityValue) {
        ch.avectris.todo.proxy.TodoItems entity = (ch.avectris.todo.proxy.TodoItems)entityValue;
        beforeSave(entity);
    }

    @Override public void beforeDelete(EntityValue entityValue) {
        ch.avectris.todo.proxy.TodoItems entity = (ch.avectris.todo.proxy.TodoItems)entityValue;
    }

    public void afterSave(EntityValue entityValue) {
        // Shared code for afterCreate / afterUpdate.
        ch.avectris.todo.proxy.TodoItems entity = (ch.avectris.todo.proxy.TodoItems)entityValue;
    }

    @Override public void afterCreate(EntityValue entityValue) {
        ch.avectris.todo.proxy.TodoItems entity = (ch.avectris.todo.proxy.TodoItems)entityValue;
        afterSave(entity);
    }

    @Override public void afterUpdate(EntityValue entityValue) {
        ch.avectris.todo.proxy.TodoItems entity = (ch.avectris.todo.proxy.TodoItems)entityValue;
        afterSave(entity);
    }

    @Override public void afterDelete(EntityValue entityValue) {
        ch.avectris.todo.proxy.TodoItems entity = (ch.avectris.todo.proxy.TodoItems)entityValue;
    }
}
