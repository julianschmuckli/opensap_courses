//# xsc 19.6.0-a27f20-20190621

package ch.avectris.todo.proxy.internal;

public abstract class TodoServiceMetadataParser
{
    public static final int options = (com.sap.cloud.server.odata.csdl.CsdlOption.ALLOW_CASE_CONFLICTS | com.sap.cloud.server.odata.csdl.CsdlOption.DISABLE_FACET_WARNINGS | com.sap.cloud.server.odata.csdl.CsdlOption.DISABLE_NAME_VALIDATION | com.sap.cloud.server.odata.csdl.CsdlOption.PROCESS_MIXED_VERSIONS | com.sap.cloud.server.odata.csdl.CsdlOption.RETAIN_ORIGINAL_TEXT | com.sap.cloud.server.odata.csdl.CsdlOption.IGNORE_UNDEFINED_TERMS);

    public static final com.sap.cloud.server.odata.csdl.CsdlDocument parsed = ch.avectris.todo.proxy.internal.TodoServiceMetadataParser.parse();

    public static com.sap.cloud.server.odata.csdl.CsdlDocument parse()
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:135:12
        final com.sap.cloud.server.odata.csdl.CsdlParser parser = new com.sap.cloud.server.odata.csdl.CsdlParser();
        parser.setLogWarnings(false);
        parser.setCsdlOptions(ch.avectris.todo.proxy.internal.TodoServiceMetadataParser.options);
        final com.sap.cloud.server.odata.csdl.CsdlDocument metadata = parser.parseInProxy(ch.avectris.todo.proxy.internal.TodoServiceMetadataText.XML, "ch.avectris.todo");
        metadata.setProxyVersion("19.6.0-a27f20-20190621");
        return metadata;
    }
}
