sap.ui.define([
	"ch/avectris/todo/TodoListClient/controller/BaseController",
	"ch/avectris/todo/TodoListClient/model/formatter",
], function (BaseController, formatter) {
	"use strict";

	return BaseController.extend("ch.avectris.todo.TodoListClient.controller.Detail", {
		formatter: formatter,
		
		//Variables
		current_todo_id: 0,

		//Functions
		onInit: function () {
			this.getRouter().getRoute("Detail").attachMatched(this._onRouteMatched, this);
		},
		
		_onRouteMatched : function (oEvent) {
		  var oArgs, oView;
		  oArgs = oEvent.getParameter("arguments");
		  oView = this.getView();
		  
		  this.current_todo_id = oArgs.todoId;
		  
		  oView.bindElement({
		    path : "todo_service>/todo_itemsSet(" + oArgs.todoId + ")",
		    events : {
		      dataRequested: function () {
		        oView.setBusy(true);
		      },
		      dataReceived: function () {
		        oView.setBusy(false);
		      }
		    }
		  });
		},
		
		onEditActivatePress: function (){
			this.getView().byId("detail_todo_name").setEditable(true);
			this.getView().byId("detail_todo_description").setEditable(true);
			this.getView().byId("detail_todo_finishDate").setEditable(true);
			this.getView().byId("detail_edit_activate").setVisible(false);
			this.getView().byId("detail_edit_save").setVisible(true);
		},
		
		lockFields: function (){
			this.getView().byId("detail_todo_name").setEditable(false);
			this.getView().byId("detail_todo_description").setEditable(false);
			this.getView().byId("detail_todo_finishDate").setEditable(false);
			this.getView().byId("detail_edit_activate").setVisible(true);
			this.getView().byId("detail_edit_save").setVisible(false);
		},
		
		onEditPress: function() {
			var name = this.getView().byId("detail_todo_name").getValue();
			var description = this.getView().byId("detail_todo_description").getValue();
			var finishDate = this.getView().byId("detail_todo_finishDate").getValue();
			
			var date = this.convertToDate(finishDate);
			
			this.getView().getModel('todo_service').update('/todo_itemsSet(' + this.current_todo_id + ')', {
				title: name,
				description: description,
				finishDate: date.toISOString()
			}, {
				success: function() {
					this.showSuccessMessage({message: "The todo item has been updated."});
					this.lockFields();
				}.bind(this)
			});
		},
		
		onDeletePress: function(){
			this.showConfirmDialog("Do you really want to delete this todo item?", function(){
				//When user has click on confirm.
				this.getView().getModel('todo_service').remove('/todo_itemsSet(' + this.current_todo_id + ')', {
					success: function() {
						this.showSuccessMessage({message: "The todo item has been deleted."});
						this.onNavBack();
					}.bind(this)
				});
			}.bind(this), "delete");
		}
	});

});