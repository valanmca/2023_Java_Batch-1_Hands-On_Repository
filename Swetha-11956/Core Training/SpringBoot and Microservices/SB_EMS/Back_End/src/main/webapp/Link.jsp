<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Link</title>

<style>
th {
	background-color: green;
	color: white;
	text-align: center;
	padding: 7px;
	border: 1px solid white;
}

a {
	text-decoration: none;
	color: white;
}
</style>
</head>
<body>
<nav class="navbar navbar-light" style="background-color: #e3f2fd;">
	<div class="container-fluid">
  <a class="navbar-brand" href="#" ><b>EMPLOYEE MANAGEMENT SYSTEM</b></a>
  <p style="align:right"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="currentColor" class="bi bi-people-fill" viewBox="0 0 16 16">
  <path d="M7 14s-1 0-1-1 1-4 5-4 5 3 5 4-1 1-1 1zm4-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6m-5.784 6A2.238 2.238 0 0 1 5 13c0-1.355.68-2.75 1.936-3.72A6.325 6.325 0 0 0 5 9c-4 0-5 3-5 4s1 1 1 1zM4.5 8a2.5 2.5 0 1 0 0-5 2.5 2.5 0 0 0 0 5"/>
</svg></p>
  </div>
</nav>

	<br>
	<nav class="navbar navbar-light" >
	<div class="container-fluid">
	<table align="center" width="80%">

		<tr>
			<th><a href="Home" target="content">HOME</a></th>
			<th><a href="InsertEmployee" target="content">INSERT</a></th>
			<th><a href="DeleteEmployee" target="content">DELETE</a></th>
			<th><a href="UpdateEmployee" target="content">UPDATE</a></th>
			<th><a href="FindEmployee" target="content">FIND</a></th>
			<th><a href="FindByName" target="content">FIND BY NAME</a></th>
			<th><a href="FindAllEmployee" target="content">FIND ALL</a></th>
		</tr>
		
	</table>
	</div>
</nav>