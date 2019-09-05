sap.ui.define([
	], function () {
		"use strict";

		return {
			dateFormat : function (sValue) {
				sValue = sValue.replace("/Date(", "");
				sValue = sValue.replace(")/", "");
				var timestamp = parseInt(sValue);
				var date = new Date(timestamp);
				return date.getDate() + "." + (date.getMonth() + 1) + "." + date.getFullYear();
			}
		};

	}
);