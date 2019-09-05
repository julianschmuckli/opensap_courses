// Note: Customizations placed in this file might be lost if the OData service is regenerated!
// Please place your customizations in the MainServlet class in the parent folder.

package ch.avectris.todo.base;

import com.sap.cloud.server.odata.*;

public abstract class MainServletBase extends DataServlet {
    private static final long serialVersionUID = 1L;

    public InMemoryDatabase provider;

    public ch.avectris.todo.proxy.TodoService service;

    public org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(ch.avectris.todo.LogSettings.LOGGER_NAME);

    public void init(javax.servlet.ServletConfig config) throws javax.servlet.ServletException {
        super.init(config);
        this.setTraceRequests(logger.isDebugEnabled() | ch.avectris.todo.LogSettings.LOG_DEBUG | ch.avectris.todo.LogSettings.LOG_TRACE);
        this.setTraceWithData(logger.isTraceEnabled() | ch.avectris.todo.LogSettings.LOG_TRACE);
        this.setPrettyTracing(ch.avectris.todo.LogSettings.PRETTY_TRACING);
        this.setDefaultPageSize(1000);
        this.setMaximumGraphSize(10000);
        this.setAllowNestedPaging(false);
        this.setAllowNonPatchUpdates(false);
        this.setTrackChangesByDefault(true);
        this.setRequiresAuthentication(false);
        this.setSupportsRepeatability(true);
        this.setSupportsTransaction(false);
        provider = new InMemoryDatabase("TodoService");
        ch.avectris.todo.ProviderSettings.init((ch.avectris.todo.MainServlet)this);
        ch.avectris.todo.ProviderSettings.init(provider);
        service = new ch.avectris.todo.proxy.TodoService(provider);
        RegisterHandlers.withServlet((ch.avectris.todo.MainServlet)this);
        RegisterListeners.withServlet((ch.avectris.todo.MainServlet)this);
        service.getMetadata().addRepeatability();
        service.getMetadata().inheritAnnotations();
        service.getMetadata().applyAnnotations();
        service.getMetadata().removeServerOnly("SQL");
        service.getMetadata().removeReferences("SQL");
        provider.createSchema();
        this.loadInitialData(ch.avectris.todo.TestSettings.TEST_MODE);
        logger.info("Started " + service.getName());
    }

    public void destroy() {
        logger.info("Stopped " + service.getName());
    }

    public DataService getDataService() {
        return service;
    }
}
