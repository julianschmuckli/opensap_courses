sap.ui.define([
	"ch/avectris/todo/TodoListClient/controller/BaseController",
	"ch/avectris/todo/TodoListClient/model/formatter"
], function (BaseController, formatter) {
	"use strict";

	return BaseController.extend("ch.avectris.todo.TodoListClient.controller.Master", {
		formatter: formatter,
		
		onInit: function () {
			
		},
		
		onAfterRendering: function() {
			this.loadMetadata();
		},
		
		onTodoPress: function (oEvent) {
			var selectedID = oEvent.getSource().getBindingContext("todo_service").getProperty("todo_itemsID");
			this.getRouter().navTo("Detail", {
				todoId: selectedID
			});
		},
		
		loadMetadata: function(){
			var oBinding = this.getView().byId("todo_list").getBinding("items");
			oBinding.attachChange(function(){
				this.getView().byId("details_total").setText(oBinding.getLength());

				this.getView().getModel('todo_service').read('/todo_itemsSet', {
					success: function(data){
						var undone_tasks = data.results.filter(function(item){
							return !item.done;
						});
						
						var done_tasks = data.results.filter(function(item){
							return item.done;
						});
						
						this.getView().byId("details_done_tasks").setText(done_tasks.length);
						this.getView().byId("details_undone_tasks").setText(undone_tasks.length);
					}.bind(this),
					error: function(e){
						
					}
				});
			}.bind(this));
		},
		
		markAllAsUndone: function(oEvent){
			this.getView().getModel('todo_service').read('/todo_itemsSet', {
				success: function(data){
					data.results.forEach(function(item){
						this.getView().getModel('todo_service').update('/todo_itemsSet(' + item.todo_itemsID + ')', {
							done: false
						}, {
							success: function() {
								this.showSuccessMessage({message: "All the items has been marked as Undone."});
								this.refreshMainModel();
							}.bind(this)
						});
					}.bind(this));
				}.bind(this),
				error: function(e){
					
				}
			});
		},
		
		onNewPress: function() {
			this.getRouter().navTo("NewTodo");
		},
		
		getGroupHeader: function (oGroup) {
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