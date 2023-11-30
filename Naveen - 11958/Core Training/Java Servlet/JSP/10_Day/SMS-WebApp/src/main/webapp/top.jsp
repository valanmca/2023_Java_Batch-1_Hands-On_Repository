<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!--  <link href="css/bootstrap.css" rel="stylesheet">-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<script src="https://kit.fontawesome.com/yourcode.js" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style>
  .navbar-custom {
    background-color: #007bff;
}
#nbrand{
color: white;
}

  </style>
</head>
<body>
<nav class="navbar navbar-custom navbar-inverse bg-primary">
  <div class="container-fluid">
    <div class="navbar-header">
		
      <a class="navbar-brand" id="nbrand" href="#">
<b>School Management System</b></a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-custom">
        <li class=""><a href="right.jsp" id="nbrand" target="content">Home</a></li>
        <li class="dropdown">
          <a class="dropdown-toggle" id="nbrand" data-toggle="dropdown" href="#">Select <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="InsertStudent.jsp" target="content">Add Details</a></li>
            <li><a href="SMSController"
						target="content">View All</a></li>
          </ul>
        </li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a id="nbrand" href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
        <li><a id="nbrand" href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul>
    </div>
  </div>
</nav>
</body>
</html>