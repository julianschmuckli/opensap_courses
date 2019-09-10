//# xsc 19.6.0-a27f20-20190621

package ch.avectris.todo.proxy.internal;

public abstract class TodoServiceFactory
{
    public static void registerAll()
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:173:12
        ch.avectris.todo.proxy.TodoServiceMetadata.EntityTypes.todoItems.registerFactory(new ch.avectris.todo.proxy.internal.TodoServiceFactory.CreateTodoItems());
    }

    public static class CreateTodoItems
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @java.lang.Override public Object create()
        {
            //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:187:9
            return new ch.avectris.todo.proxy.TodoItems(false);
        }
    }
}
