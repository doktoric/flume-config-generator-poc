'use strict';

/* Controllers */

var flumeControllers = angular.module('flumeControllers', []);

flumeControllers.controller('FlumeController', ['$scope', '$http',
    function ($scope, $http) {
        $scope.saveConfig = function (instanceId) {
            $http({
                url: 'config',
                method: "POST",
                data: {
                    company: company.value,
                    source: source.value,
                    sink: sink.value,
                    morphline: morphline.value
                },
                headers: {
                    'Content-Type': 'application/json'
                }
            }).success(function (data, status, headers, config) {
                console.log("success");
            }).error(function (data, status, headers, config) {
                console.log("unsuccess");
            });
        }
    }
]);

