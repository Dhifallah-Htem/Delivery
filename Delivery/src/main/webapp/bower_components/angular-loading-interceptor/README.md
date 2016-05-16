<snippet>
  <content></content>
# Angular Loading Interceptor
 Angular Loading Interceptor is library for loading in your website until all http requests are done
## Installation
 Via bower `bower install angular-loading-interceptor`
## Usage
First of all load this service in your project you can copy it from the file `LoadingInterceptor.js` or if you install via bower

1. ```var app = angular.module("myApp", ["loading-interceptor"])```

2. ```app.config(function ($httpProvider) {
      $httpProvider.interceptors.push("LoadingInterceptor")
    });```

3. ```<div class="loader" ng-if="loading">Loading ...</div>```

## Contributing
1. Fork it!
2. Create your feature branch from remote `dev`
3. Push it
4. Thank's for all your help :)
</content>
</snippet>
