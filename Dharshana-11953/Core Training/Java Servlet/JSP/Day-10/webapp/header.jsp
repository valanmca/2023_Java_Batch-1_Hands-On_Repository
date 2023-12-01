<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.css" rel="stylesheet">
</head>
<style>
.nav-link{
color:yellow;}</style>
<body>

<nav class="navbar navbar-expand-sm navbar-dark bg-dark">
  <div class="container-fluid">
  <div class="spinner-grow text-warning"></div>&nbsp;&nbsp;&nbsp;
    <a class="navbar-brand" href="javascript:void(0)">Vehicle Management System</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="mynavbar">
      <ul class="navbar-nav me-auto">
      <li class="nav-item">
          <a class="nav-link" href="home.jsp" target="content">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="InsertVehicle.jsp" target="content">Add Details</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="VMSController" target="content">View All</a>
        </li>
        
      </ul>
    <form class="d-flex" role="search">
      <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success" type="submit">Search</button>
    </form>&nbsp;&nbsp;&nbsp;
      <form class="d-flex">
       
        <a href="#" class="btn btn-info btn-lg">
          <span class="glyphicon glyphicon-user"></span> Logout 
        </a>&nbsp;&nbsp;&nbsp;&nbsp;
        
      </form>
    </div>
  </div>
</nav></body>
</html>