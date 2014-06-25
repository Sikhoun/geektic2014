var app = angular.module("geektic", ['ngRoute']);



app.controller('HelloCtrl', function($scope, $http) {
	$scope.geeks = []; 
	$scope.interets = []; 
    $http.get('/api/geek').success(function(geeks) {
        $scope.geeks = geeks;
    });
    
    $http.get('/api/interet').success(function(interets) {
    	 	$scope.valueInteret = "";
            $scope.interets = interets;
            console.log($scope.valueInteret);
        });
    
    $scope.showGeekSexe = function(sexe) {
        $http.get('/api/geek/'+sexe).success(function(geeks) {
            $scope.geeks = geeks;
        });
        
    	console.log($scope.geeks);
    };
    
    $scope.showGeekInteret = function() {
    	  $http.get('/api/geek/'+$scope.interetSelectionner+'/'+$scope.sexeSelectionner).success(function(geeks) {
              $scope.geeks = geeks;
          });
    	  console.log($scope.interetSelectionner);
    	  console.log($scope.sexeSelectionner);
    	console.log("test toto");
    };
 
    

  
    
 
    
});