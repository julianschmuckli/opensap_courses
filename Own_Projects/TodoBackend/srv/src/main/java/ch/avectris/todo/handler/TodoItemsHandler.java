package ch.avectris.todo.handler;

import com.sap.cloud.server.odata.*;

public class TodoItemsHandler extends com.sap.cloud.server.odata.DefaultEntityHandler {
    private ch.avectris.todo.MainServlet servlet;
    private ch.avectris.todo.proxy.TodoService service;

    public TodoItemsHandler(ch.avectris.todo.MainServlet servlet, ch.avectris.todo.proxy.TodoService service) {
        super(servlet, service);
        this.servlet = servlet;
        this.service = service;
    }

    @Override public DataValue executeQuery(DataQuery query) {
        return service.executeQuery(query).getResult();
    }

    @Override public void createEntity(EntityValue entityValue) {
        ch.avectris.todo.proxy.TodoItems entity = (ch.avectris.todo.proxy.TodoItems)entityValue;
        service.createEntity(entity);
    }

    @Override public void updateEntity(EntityValue entityValue) {
        ch.avectris.todo.proxy.TodoItems entity = (ch.avectris.todo.proxy.TodoItems)entityValue;
        service.updateEntity(entity);
    }

    @Override public void deleteEntity(EntityValue entityValue) {
        ch.avectris.todo.proxy.TodoItems entity = (ch.avectris.todo.proxy.TodoItems)entityValue;
        service.deleteEntity(entity);
    }
}
