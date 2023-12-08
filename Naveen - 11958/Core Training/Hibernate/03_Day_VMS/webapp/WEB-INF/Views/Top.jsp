<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Header</title>
<!--  <link href="css/bootstrap.css" rel="stylesheet">-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<script src="https://kit.fontawesome.com/yourcode.js"
	crossorigin="anonymous"></script>
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style>
.navbar-custom {
	background: hsla(136, 82%, 72%, 1);
	background: linear-gradient(90deg, hsla(136, 82%, 72%, 1) 0%,
		hsla(205, 84%, 36%, 1) 100%);
	background: -moz-linear-gradient(90deg, hsla(136, 82%, 72%, 1) 0%,
		hsla(205, 84%, 36%, 1) 100%);
	background: -webkit-linear-gradient(90deg, hsla(136, 82%, 72%, 1) 0%,
		hsla(205, 84%, 36%, 1) 100%);
	filter: progid: DXImageTransform.Microsoft.gradient( startColorstr="#7EF29D",
		endColorstr="#0F68A9", GradientType=1);
}

#nbrand {
	color: white;
}
</style>
</head>
<body>
	<nav class="navbar navbar-custom navbar-inverse bg-primary">
		<div class="container-fluid">
			<div class="navbar-header">

				<a class="navbar-brand" id="nbrand" href="#"> <b>Vehicle
						Management System</b></a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav navbar-custom">
					<li class=""><a href="Home" id="nbrand" target="content">Home</a></li>
					<li class="dropdown"><a class="dropdown-toggle" id="nbrand"
						data-toggle="dropdown" href="#">Select <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="InsertVehicle" target="content">Add Details</a></li>
							<li><a href="FindAllVehicle" target="content">View All</a></li>
						</ul></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a id="nbrand" href="#"><span
							class="glyphicon glyphicon-user"></span> Sign Up</a></li>
					<li><a id="nbrand" href="#"><span
							class="glyphicon glyphicon-log-in"></span> Login</a></li>
				</ul>
			</div>
		</div>
	</nav>
</body>
</html>