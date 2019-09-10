sap.ui.define([
	], function () {
		"use strict";

		return {
			dateFormat : function (sValue) {
				if(sValue === null){
					return "...";
				} else {
					sValue = sValue.replace("/Date(", "");
					sValue = sValue.replace(")/", "");
					var timestamp = parseInt(sValue);
					var date = new Date(timestamp);
					return date.getDate() + "." + (date.getMonth() + 1) + "." + date.getFullYear();
				}
			},
			convertToTimestamp : function (sValue) {
				if(sValue === null){
					return "...";
				} else {
					sValue = sValue.replace("/Date(", "");
					sValue = sValue.replace(")/", "");
					var timestamp = parseInt(sValue);
					return timestamp;
				}
			},
			checkIfDelayedText: function (time) {
				time = time.replace("/Date(", "");
				time = time.replace(")/", "");
				var timestamp = parseInt(time);
				
				var date1 = new Date(timestamp);
				date1.setHours(0, 0, 0, 0);
				
				var date2 = new Date();
				date2.setHours(0, 0, 0, 0);
				
				if (date1.getTime() === date2.getTime()) {
					return "Today";
				} else if (timestamp < (new Date()).getTime()) {
					return "Expired";
				} else {
					return "In time";
				}
			},
			
			checkIfDelayedState: function (time) {
				time = time.replace("/Date(", "");
				time = time.replace(")/", "");
				var timestamp = parseInt(time);
					
				var date1 = new Date(timestamp);
				date1.setHours(0, 0, 0, 0);
				
				var date2 = new Date();
				date2.setHours(0, 0, 0, 0);
				
				if (date1.getTime() === date2.getTime()) {
					return "Information";
				} else if (timestamp < (new Date()).getTime()) {
					return "Error";
				} else {
					return "Success";
				}
			}
		};
	}
);