<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
.btn {
	width: 150px;
	height: 50px;
}
</style>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>



	<div class="container" align="center">
	
		<br> <br> 
		<a class="btn btn-outline-secondary btn-lg" href="LandingPage" target="content">  Home </a>
		 <br> <br>
		 
		<a class="btn btn-primary btn-lg" href="InsertVehicle" target="content"> Insert</a>
		<br><br> 
		 
		 <a class="btn btn-danger btn-lg" href="DeleteVehicle" target="content"> Delete</a> 
		 <br><br> 
		 
		 <a class="btn btn-warning btn-lg" href="UpdateVehicle" target="content"> Update</a> 
		 <br><br>
		 
		 <a class="btn btn-success btn-lg" href="FindVehicle" target="content">Find</a>
		 <br> <br>
		  
		 <a class="btn btn-info btn-lg" href="FindAllVehicle" target="content"> Find All</a>

	</div>




</body>
</html>