'use strict';

/* App Module */

var flumeApp = angular.module('flumeApp', ['ngRoute', 'flumeControllers', 'flumeServices' ]);

flumeApp.config([ '$routeProvider', function($routeProvider) {
	$routeProvider.when('/test', {
		templateUrl : '/'
    }).otherwise({
		redirectTo : '/'
	});
} ]);
