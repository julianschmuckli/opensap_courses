sap.ui.define([
	"sap/ui/core/mvc/Controller",
	"ch/avectris/todo/TodoListClient/model/formatter"
], function (Controller, formatter) {
	"use strict";

	return Controller.extend("ch.avectris.todo.TodoListClient.controller.Master", {
		formatter: formatter,
		
		onInit: function () {

		}
	});
});