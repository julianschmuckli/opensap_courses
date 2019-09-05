// Note: Customizations placed in this file might be lost if the OData service is regenerated!
// Please place any customizations of handler registration in the ProviderSettings class.

package ch.avectris.todo.base;

import com.sap.cloud.server.odata.*;

class RegisterHandlers {
    private static EntityHandler handler_todo_items;

    public static void withServlet(ch.avectris.todo.MainServlet servlet) {
        ch.avectris.todo.proxy.TodoService service = (ch.avectris.todo.proxy.TodoService)servlet.getDataService();
        handler_todo_items = new ch.avectris.todo.handler.TodoItemsHandler(servlet, service);
        servlet.registerEntityHandler(ch.avectris.todo.proxy.TodoServiceMetadata.EntityTypes.todoItems, handler_todo_items);
    }
}
