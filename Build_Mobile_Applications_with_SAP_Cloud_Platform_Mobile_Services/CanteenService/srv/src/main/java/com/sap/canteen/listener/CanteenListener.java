package com.sap.canteen.listener;

import com.sap.cloud.server.odata.*;

public class CanteenListener extends com.sap.cloud.server.odata.DefaultEntityListener {
    private com.sap.canteen.MainServlet servlet;
    private com.sap.canteen.proxy.CanteenService service;

    public CanteenListener(com.sap.canteen.MainServlet servlet, com.sap.canteen.proxy.CanteenService service) {
        super();
        this.servlet = servlet;
        this.service = service;
    }

    @Override public void beforeQuery(DataQuery query) {
    }

    public void beforeSave(EntityValue entityValue) {
        com.sap.canteen.proxy.Canteen entity = (com.sap.canteen.proxy.Canteen)entityValue;
        // Shared code for beforeCreate / beforeUpdate.
    }

    @Override public void beforeCreate(EntityValue entityValue) {
        com.sap.canteen.proxy.Canteen entity = (com.sap.canteen.proxy.Canteen)entityValue;
        beforeSave(entity);
    }

    @Override public void beforeUpdate(EntityValue entityValue) {
        com.sap.canteen.proxy.Canteen entity = (com.sap.canteen.proxy.Canteen)entityValue;
        beforeSave(entity);
    }

    @Override public void beforeDelete(EntityValue entityValue) {
        com.sap.canteen.proxy.Canteen entity = (com.sap.canteen.proxy.Canteen)entityValue;
    }

    public void afterSave(EntityValue entityValue) {
        // Shared code for afterCreate / afterUpdate.
        com.sap.canteen.proxy.Canteen entity = (com.sap.canteen.proxy.Canteen)entityValue;
    }

    @Override public void afterCreate(EntityValue entityValue) {
        com.sap.canteen.proxy.Canteen entity = (com.sap.canteen.proxy.Canteen)entityValue;
        afterSave(entity);
    }

    @Override public void afterUpdate(EntityValue entityValue) {
        com.sap.canteen.proxy.Canteen entity = (com.sap.canteen.proxy.Canteen)entityValue;
        afterSave(entity);
    }

    @Override public void afterDelete(EntityValue entityValue) {
        com.sap.canteen.proxy.Canteen entity = (com.sap.canteen.proxy.Canteen)entityValue;
    }
}
