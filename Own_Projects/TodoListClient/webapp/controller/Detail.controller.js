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