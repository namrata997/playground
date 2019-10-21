(function () {
   'use strict';

   angular
      .module('app', [])
      .controller('DemoController', DemoController);

      function DemoController (){
         var vm = this;
         vm.AbsoluteImageUrl = "https://angularjs.org/img/AngularJS-large.png";
         vm.ImageFileName = "AngularJS-large.png";
      }
})();