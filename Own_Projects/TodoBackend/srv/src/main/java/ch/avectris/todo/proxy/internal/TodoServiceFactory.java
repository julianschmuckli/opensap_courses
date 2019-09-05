//# xsc 19.6.0-a27f20-20190621

package ch.avectris.todo.proxy.internal;

public abstract class TodoServiceFactory
{
    public static void registerAll()
    {
        //# /usr/sap/ljs/xs-temp/2dbdce2d-5f98-42ec-82c4-eeb49ec3e5c6/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:158:12
        ch.avectris.todo.proxy.TodoServiceMetadata.EntityTypes.todoItems.registerFactory(new ch.avectris.todo.proxy.internal.TodoServiceFactory.CreateTodoItems());
    }

    public static class CreateTodoItems
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @java.lang.Override public Object create()
        {
            //# /usr/sap/ljs/xs-temp/2dbdce2d-5f98-42ec-82c4-eeb49ec3e5c6/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:172:9
            return new ch.avectris.todo.proxy.TodoItems(false);
        }
    }
}
