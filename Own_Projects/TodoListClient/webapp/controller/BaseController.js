sap.ui.define([
	"sap/ui/core/mvc/Controller",
	"sap/ui/core/routing/History",
	"sap/m/Dialog"
], function (Controller, History, Dialog) {
	"use strict";

	return Controller.extend("ch.avectris.todo.TodoListClient.controller.BaseController", {
		getRouter: function(){
			return this.getOwnerComponent().getRouter();
		},
		
		getModel: function (sName) {
			return this.getView().getModel(sName);
		},
		
		onNavBack: function () {
			var sPreviousHash = History.getInstance().getPreviousHash();

			if (sPreviousHash !== undefined) {
				history.go(-1);
			} else {
				this.getRouter().navTo("TargetMaster", {}, true);
			}
		},
		
		refreshMainModel: function() {
			this.getView().getModel('todo_service').refresh();
		},
		
		showMessageErrorDialog: function (message) {
			var dialog = new Dialog({
				title: "Error",
				type: "Message",
				state: "Error",
				content: new sap.m.Text({
					text: message
				}),
				beginButton: new sap.m.Button({
					text: "OK",
					press: function () {
						dialog.close();
					}
				}),
				afterClose: function () {
					dialog.destroy();
				}
			});
			dialog.open();
		},
		
		showConfirmDialog: function (message, callback, type) {
			var state, beginButtonText, beginButtonType;
			
			switch (type) {
				case "delete":
					state = "Error";
					beginButtonText = "Delete";
					beginButtonType = "Reject";
					break;
				default:
					state = "Information";
					beginButtonText = "Confirm";
					beginButtonType = "Default";
					break;
			}
			
			var dialog = new Dialog({
				title: beginButtonText,
				type: "Message",
				state: state,
				content: new sap.m.Text({
					text: message
				}),
				beginButton: new sap.m.Button({
					text: beginButtonText,
					type: beginButtonType,
					press: function(){
						dialog.close();
						callback();
					}
				}),
				endButton: new sap.m.Button({
					text: "Cancel",
					type: "Default",
					press: function() {
						dialog.close();
					}
				}),
				afterClose: function () {
					dialog.destroy();
				}
			});
			
			dialog.open();
		},

		showSuccessMessage: function (hdrMessageObject, iDuration) {
			var duration;
			if (iDuration === undefined) {
				duration = 3000;
			} else {
				duration = iDuration;
			}
			// response header
			sap.m.MessageToast.show(hdrMessageObject.message, {
				duration: duration, // default
				width: "15em", // default
				my: "center bottom", // default
				at: "center bottom", // default
				of: window, // default
				offset: "0 -100", // default
				collision: "fit fit", // default
				onClose: null, // default
				autoClose: true, // default
				animationTimingFunction: "ease", // default
				animationDuration: 1000, // default
				closeOnBrowserNavigation: true // default
			});
		},
		
		/**
		 * Date Format: dd.mm.YYYY
		 *
		*/
		convertToDate: function(date) {
			var date_split = date.split(".");
			
			var o_date = new Date();
			o_date.setDate(parseInt(date_split[0]));
			o_date.setMonth(parseInt(date_split[1]) - 1);
			o_date.setFullYear(parseInt(date_split[2]));
			
			return o_date;
		}
	});
});