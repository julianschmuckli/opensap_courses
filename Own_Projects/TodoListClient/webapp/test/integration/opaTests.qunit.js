/* global QUnit */
QUnit.config.autostart = false;

sap.ui.getCore().attachInit(function () {
	"use strict";

	sap.ui.require([
		"ch/avectris/todo/TodoListClient/test/integration/AllJourneys"
	], function () {
		QUnit.start();
	});
});