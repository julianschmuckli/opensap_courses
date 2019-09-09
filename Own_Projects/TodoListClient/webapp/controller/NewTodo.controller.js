sap.ui.define([
	"ch/avectris/todo/TodoListClient/controller/BaseController"
], function (BaseController) {
	"use strict";

	return BaseController.extend("ch.avectris.todo.TodoListClient.controller.NewTodo", {

		/**
		 * Called when a controller is instantiated and its View controls (if available) are already created.
		 * Can be used to modify the View before it is displayed, to bind event handlers and do other one-time initialization.
		 * @memberOf ch.avectris.todo.TodoListClient.view.NewTodo
		 */
		onInit: function () {

		},
		
		onAddPress: function () {
			var name = this.getView().byId("new_todo_name").getValue();
			var description = this.getView().byId("new_todo_description").getValue();
			var finishDate = this.getView().byId("new_todo_finishDate").getValue();
			
			var date = this.convertToDate(finishDate);
			
			this.getView().getModel('todo_service').create('/todo_itemsSet', {
				title: name,
				description: description,
				finishDate: date.toISOString()
			}, {
				error: function(){
					this.showMessageErrorDialog("There was an error while adding the data.");
				},
				success: function() {
					this.showSuccessMessage({message: "The item has been added."}, 2000);
					this.resetForm();
					this.onNavBack();
				}.bind(this)
			});
		},
		
		resetForm: function(){
			this.getView().byId("new_todo_name").setValue("");
			this.getView().byId("new_todo_description").setValue("");
			this.getView().byId("new_todo_finishDate").setValue("");
		}

		/**
		 * Similar to onAfterRendering, but this hook is invoked before the controller's View is re-rendered
		 * (NOT before the first rendering! onInit() is used for that one!).
		 * @memberOf ch.avectris.todo.TodoListClient.view.NewTodo
		 */
		//	onBeforeRendering: function() {
		//
		//	},

		/**
		 * Called when the View has been rendered (so its HTML is part of the document). Post-rendering manipulations of the HTML could be done here.
		 * This hook is the same one that SAPUI5 controls get after being rendered.
		 * @memberOf ch.avectris.todo.TodoListClient.view.NewTodo
		 */
		//	onAfterRendering: function() {
		//
		//	},

		/**
		 * Called when the Controller is destroyed. Use this one to free resources and finalize activities.
		 * @memberOf ch.avectris.todo.TodoListClient.view.NewTodo
		 */
		//	onExit: function() {
		//
		//	}

	});

});