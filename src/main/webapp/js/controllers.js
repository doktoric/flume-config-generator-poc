'use strict';

/* Controllers */

var flumeControllers = angular.module('flumeControllers', []);

flumeControllers.controller('FlumeController', ['$scope', '$http',
    function ($scope, $http) {
        $scope.saveConfig = function () {
            $http({
                url: 'config',
                method: "POST",
                data: {
                    company: company.value,
                    morphline: morphline.value,
                    sink: sink.value,
                    source: source.value
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

