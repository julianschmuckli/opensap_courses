package com.sap.canteen.listener;

import java.math.BigDecimal;

import com.sap.cloud.server.odata.*;

public class DishMenuListener extends com.sap.cloud.server.odata.DefaultEntityListener {
    private com.sap.canteen.MainServlet servlet;
    private com.sap.canteen.proxy.CanteenService service;

    public DishMenuListener(com.sap.canteen.MainServlet servlet, com.sap.canteen.proxy.CanteenService service) {
        super();
        this.servlet = servlet;
        this.service = service;
    }

    @Override public void beforeQuery(DataQuery query) {
    }

    public void beforeSave(EntityValue entityValue) {
        com.sap.canteen.proxy.DishMenu entity = (com.sap.canteen.proxy.DishMenu)entityValue;
        
        // Check if the price of a menu is below 100 to generate a business rule validation
		if (entity.getPrice().compareTo(new BigDecimal(100.0)) == 1) {
			throw DataServiceException.validationError("Menu price needs to be under 100. Value was: " + entity.getPrice());
		} 
    }

    @Override public void beforeCreate(EntityValue entityValue) {
        com.sap.canteen.proxy.DishMenu entity = (com.sap.canteen.proxy.DishMenu)entityValue;
        beforeSave(entity);
    }

    @Override public void beforeUpdate(EntityValue entityValue) {
        com.sap.canteen.proxy.DishMenu entity = (com.sap.canteen.proxy.DishMenu)entityValue;
        beforeSave(entity);
    }

    @Override public void beforeDelete(EntityValue entityValue) {
        com.sap.canteen.proxy.DishMenu entity = (com.sap.canteen.proxy.DishMenu)entityValue;
    }

    public void afterSave(EntityValue entityValue) {
        // Shared code for afterCreate / afterUpdate.
        com.sap.canteen.proxy.DishMenu entity = (com.sap.canteen.proxy.DishMenu)entityValue;
    }

    @Override public void afterCreate(EntityValue entityValue) {
        com.sap.canteen.proxy.DishMenu entity = (com.sap.canteen.proxy.DishMenu)entityValue;
        afterSave(entity);
    }

    @Override public void afterUpdate(EntityValue entityValue) {
        com.sap.canteen.proxy.DishMenu entity = (com.sap.canteen.proxy.DishMenu)entityValue;
        afterSave(entity);
    }

    @Override public void afterDelete(EntityValue entityValue) {
        com.sap.canteen.proxy.DishMenu entity = (com.sap.canteen.proxy.DishMenu)entityValue;
    }
}
