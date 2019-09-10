sap.ui.define([
	"ch/avectris/todo/TodoListClient/controller/BaseController",
	"ch/avectris/todo/TodoListClient/model/formatter"
], function (BaseController, formatter) {
	"use strict";

	return BaseController.extend("ch.avectris.todo.TodoListClient.controller.Master", {
		formatter: formatter,
		
		onInit: function () {
			
		},
		
		onTodoPress: function (oEvent) {
			var selectedID = oEvent.getSource().getBindingContext("todo_service").getProperty("todo_itemsID");
			this.getRouter().navTo("Detail", {
				todoId: selectedID
			});
		},
		
		onNewPress: function() {
			this.getRouter().navTo("NewTodo");
		},
		
		getGroupHeader: function (oGroup){
			var title;
			if (oGroup.key) {
				title = "Done";
			} else {
				title = "Pending";
			}
			
			return new sap.m.GroupHeaderListItem({
				title : title,
				upperCase : false
			});
		}
	});
});