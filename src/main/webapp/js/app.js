var app = angular.module("geektic", ['ngRoute']);



app.controller('HelloCtrl', function($scope, $http) {
	$scope.geeks = []; 
	$scope.interets = []; 
    $http.get('/api/geek').success(function(geeks) {
        $scope.geeks = geeks;
    });
    
    $http.get('/api/interet').success(function(interets) {
            $scope.interets = interets;
        });
    
    $scope.showGeekSexe = function(sexe) {
        $http.get('/api/geek/'+sexe).success(function(geeks) {
            $scope.geeks = geeks;
        });
        
    	console.log($scope.geeks);
    };
    

  
    
 
    
});