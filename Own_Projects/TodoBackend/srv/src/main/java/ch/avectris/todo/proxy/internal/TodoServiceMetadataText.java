//# xsc 19.6.0-a27f20-20190621

package ch.avectris.todo.proxy.internal;

public abstract class TodoServiceMetadataText
{
    public static final String XML = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<edmx:Edmx Version=\"1.0\" xmlns:edmx=\"http://schemas.microsoft.com/ado/2007/06/edmx\" xmlns:edmx4=\"http://docs.oasis-open.org/odata/ns/edmx\" xmlns:m=\"http://schemas.microsoft.com/ado/2007/08/dataservices/metadata\" xmlns:sap=\"http://www.sap.com/Protocols/SAPData\">\n<edmx4:Reference Uri=\"vocabularies/com.sap.cloud.server.odata.sql.v1.xml\">\n<edmx4:Include Namespace=\"com.sap.cloud.server.odata.sql.v1\" Alias=\"SQL\"/>\n</edmx4:Reference>\n<edmx:DataServices m:DataServiceVersion=\"2.0\">\n<Schema Namespace=\"ch.avectris.todo\" xmlns=\"http://schemas.microsoft.com/ado/2008/09/edm\">\n<EntityType Name=\"todo_items\">\n<Key>\n<PropertyRef Name=\"todo_itemsID\"/>\n</Key>\n<Property Name=\"description\" Type=\"Edm.String\" Nullable=\"false\"/>\n<Property Name=\"finishDate\" Type=\"Edm.DateTime\" Nullable=\"false\" sap:display-format=\"Date\"/>\n<Property Name=\"title\" Type=\"Edm.String\" Nullable=\"false\"/>\n<Property Name=\"todo_itemsID\" Type=\"Edm.Int64\" Nullable=\"false\"/>\n</EntityType>\n<EntityContainer Name=\"TodoService\" m:IsDefaultEntityContainer=\"true\">\n<Annotation Term=\"SQL.TrackChanges\" xmlns=\"http://docs.oasis-open.org/odata/ns/edm\"/>\n<EntitySet Name=\"todo_itemsSet\" EntityType=\"ch.avectris.todo.todo_items\"/>\n</EntityContainer>\n</Schema>\n</edmx:DataServices>\n</edmx:Edmx>\n";
}
