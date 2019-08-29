// Note: Customizations placed in this file might be lost if the OData service is regenerated!
// Please place your customizations in the MainServlet class in the parent folder.

package com.sap.canteen.base;

import com.sap.cloud.server.odata.*;

public abstract class MainServletBase extends DataServlet {
    private static final long serialVersionUID = 1L;

    public InMemoryDatabase provider;

    public com.sap.canteen.proxy.CanteenService service;

    public org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(com.sap.canteen.LogSettings.LOGGER_NAME);

    public void init(javax.servlet.ServletConfig config) throws javax.servlet.ServletException {
        super.init(config);
        this.setTraceRequests(logger.isDebugEnabled() | com.sap.canteen.LogSettings.LOG_DEBUG | com.sap.canteen.LogSettings.LOG_TRACE);
        this.setTraceWithData(logger.isTraceEnabled() | com.sap.canteen.LogSettings.LOG_TRACE);
        this.setPrettyTracing(com.sap.canteen.LogSettings.PRETTY_TRACING);
        this.setDefaultPageSize(1000);
        this.setMaximumGraphSize(10000);
        this.setAllowNestedPaging(false);
        this.setAllowNonPatchUpdates(false);
        this.setTrackChangesByDefault(false);
        this.setRequiresAuthentication(false);
        this.setSupportsRepeatability(true);
        this.setSupportsTransaction(false);
        provider = new InMemoryDatabase("CanteenService");
        com.sap.canteen.ProviderSettings.init((com.sap.canteen.MainServlet)this);
        com.sap.canteen.ProviderSettings.init(provider);
        service = new com.sap.canteen.proxy.CanteenService(provider);
        RegisterHandlers.withServlet((com.sap.canteen.MainServlet)this);
        RegisterListeners.withServlet((com.sap.canteen.MainServlet)this);
        service.getMetadata().addRepeatability();
        service.getMetadata().inheritAnnotations();
        service.getMetadata().applyAnnotations();
        service.getMetadata().removeServerOnly("SQL");
        service.getMetadata().removeReferences("SQL");
        provider.createSchema();
        this.loadInitialData(com.sap.canteen.TestSettings.TEST_MODE);
        logger.info("Started " + service.getName());
    }

    public void destroy() {
        logger.info("Stopped " + service.getName());
    }

    public DataService getDataService() {
        return service;
    }
}
