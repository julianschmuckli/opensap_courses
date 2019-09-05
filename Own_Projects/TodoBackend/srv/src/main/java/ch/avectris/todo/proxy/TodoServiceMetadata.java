//# xsc 19.6.0-a27f20-20190621

package ch.avectris.todo.proxy;

public abstract class TodoServiceMetadata
{
    public static final com.sap.cloud.server.odata.csdl.CsdlDocument document = ch.avectris.todo.proxy.TodoServiceMetadata.resolve();

    private static com.sap.cloud.server.odata.csdl.CsdlDocument resolve()
    {
        //# /usr/sap/ljs/xs-temp/2dbdce2d-5f98-42ec-82c4-eeb49ec3e5c6/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:148:12
        ch.avectris.todo.proxy.internal.TodoServiceFactory.registerAll();
        ch.avectris.todo.proxy.internal.TodoServiceMetadataParser.parsed.setGeneratedProxies(true);
        return ch.avectris.todo.proxy.internal.TodoServiceMetadataParser.parsed;
    }

    public abstract static class EntityTypes
    {
        public static final com.sap.cloud.server.odata.EntityType todoItems = ch.avectris.todo.proxy.internal.TodoServiceMetadataParser.parsed.getEntityType("ch.avectris.todo.todo_items");
    }

    public abstract static class EntitySets
    {
        public static final com.sap.cloud.server.odata.EntitySet todoItemsSet = ch.avectris.todo.proxy.internal.TodoServiceMetadataParser.parsed.getEntitySet("todo_itemsSet");
    }
}
