// Note: Customizations placed in this file might be lost if the OData service is regenerated!
// Please place any customizations of listener registration in the ProviderSettings class.

package ch.avectris.todo.base;

import com.sap.cloud.server.odata.*;

class RegisterListeners {
    private static EntityListener todoItemsListener;

    public static void withServlet(ch.avectris.todo.MainServlet servlet) {
        ch.avectris.todo.proxy.TodoService service = (ch.avectris.todo.proxy.TodoService)servlet.getDataService();
        todoItemsListener = new ch.avectris.todo.listener.TodoItemsListener(servlet, service);
        servlet.registerEntityListener(ch.avectris.todo.proxy.TodoServiceMetadata.EntityTypes.todoItems, todoItemsListener);
    }
}
