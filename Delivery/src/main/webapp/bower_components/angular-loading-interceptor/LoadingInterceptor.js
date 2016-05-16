/**============================
* Service: LoadingInterceptor.js
*/

var App = angular.module("loading-interceptor", []);
	App.factory("LoadingInterceptor", function ($q, $rootScope) {

		var httpCreations = 0;
		var httpResolutions = 0;

		function isLoading () {
			return httpResolutions < httpCreations;
		}

		function updateStatus () {
			$rootScope.loading = isLoading();
		}

		return {
			request: function (config) {
				httpCreations ++;
				updateStatus();
				return config;
			},
			response: function (response) {
				httpResolutions ++;
				updateStatus();
				return response;
			},
			responseError: function (response) {
				return response;
			}
		};
	});
