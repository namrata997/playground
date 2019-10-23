function MyCtrl($scope) {
    
    $scope.myvalue = false;
    
    $scope.showAlert = function(){
      $scope.myvalue = true;  
    };
}