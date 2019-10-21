var testApp = angular  
                .module("testModule", [])  
                .controller("testController", function ($scope) {  
                    var animal = {  
                        name: "CAT",  
                        color: "White",  
                        picture: "H:/carmel/pods project/animal.jpg",  
                    };  
  
                    $scope.animal = animal;  
  
                }); 