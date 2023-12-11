<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<style>
.table-striped {
	height: 80%;
	width: 100%;
}

td {
	text-align: center;
}

.container-fluid {
	position: absolute;
	top: 10%;
	height: 80%;
}

a {
	text-decoration: none;
	font-family:"Times New Roman", Times, serif;
	font-weight: bold;
}

a:hover {
	color: black;
}

.container {
	align-content: center;
}
body{
background-color: #daedeb;
}
</style>

</head>
<body>
	<br>
	
	<h4
		style="text-align: center; font-family: Times New Roman, Times, serif; font-weight: bold;">CRUD
		OPERATION</h4>

<br>
	<br>

	<div class="container" align="center">

		<svg xmlns="http://www.w3.org/2000/svg" width="20" height="20"
			fill="currentColor" class="bi bi-person-plus-fill"
			viewBox="0 0 16 16">
  <path
				d="M1 14s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1zm5-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6" />
  <path fill-rule="evenodd"
				d="M13.5 5a.5.5 0 0 1 .5.5V7h1.5a.5.5 0 0 1 0 1H14v1.5a.5.5 0 0 1-1 0V8h-1.5a.5.5 0 0 1 0-1H13V5.5a.5.5 0 0 1 .5-.5" />
</svg>
		<a href="InsertVehicle" target="content">INSERT</a>


	</div>
	<br>
	
	

	<div class="container" align="center">


		<svg xmlns="http://www.w3.org/2000/svg" width="20" height="20"
			fill="currentColor" class="bi bi-trash3-fill" viewBox="0 0 16 16">
  <path
				d="M11 1.5v1h3.5a.5.5 0 0 1 0 1h-.538l-.853 10.66A2 2 0 0 1 11.115 16h-6.23a2 2 0 0 1-1.994-1.84L2.038 3.5H1.5a.5.5 0 0 1 0-1H5v-1A1.5 1.5 0 0 1 6.5 0h3A1.5 1.5 0 0 1 11 1.5m-5 0v1h4v-1a.5.5 0 0 0-.5-.5h-3a.5.5 0 0 0-.5.5M4.5 5.029l.5 8.5a.5.5 0 1 0 .998-.06l-.5-8.5a.5.5 0 1 0-.998.06Zm6.53-.528a.5.5 0 0 0-.528.47l-.5 8.5a.5.5 0 0 0 .998.058l.5-8.5a.5.5 0 0 0-.47-.528ZM8 4.5a.5.5 0 0 0-.5.5v8.5a.5.5 0 0 0 1 0V5a.5.5 0 0 0-.5-.5" />
</svg>



		<a href="DeleteVehicle" target="content">DELETE</a>
	</div>

	<br>
	
	

	<div class="container" align="center">

		<svg xmlns="http://www.w3.org/2000/svg" width="20" height="20"
			fill="currentColor" class="bi bi-pencil-square" viewBox="0 0 16 16">
  <path
				d="M15.502 1.94a.5.5 0 0 1 0 .706L14.459 3.69l-2-2L13.502.646a.5.5 0 0 1 .707 0l1.293 1.293zm-1.75 2.456-2-2L4.939 9.21a.5.5 0 0 0-.121.196l-.805 2.414a.25.25 0 0 0 .316.316l2.414-.805a.5.5 0 0 0 .196-.12l6.813-6.814z" />
  <path fill-rule="evenodd"
				d="M1 13.5A1.5 1.5 0 0 0 2.5 15h11a1.5 1.5 0 0 0 1.5-1.5v-6a.5.5 0 0 0-1 0v6a.5.5 0 0 1-.5.5h-11a.5.5 0 0 1-.5-.5v-11a.5.5 0 0 1 .5-.5H9a.5.5 0 0 0 0-1H2.5A1.5 1.5 0 0 0 1 2.5z" />
</svg>

		<a href="UpdateVehicle" target="content">UPDATE</a>
	</div>
	<br>




	<div class="container" align="center">

		<svg xmlns="http://www.w3.org/2000/svg" width="20" height="20"
			fill="currentColor" class="bi bi-search-heart" viewBox="0 0 16 16">
  <path
				d="M6.5 4.482c1.664-1.673 5.825 1.254 0 5.018-5.825-3.764-1.664-6.69 0-5.018" />
  <path
				d="M13 6.5a6.471 6.471 0 0 1-1.258 3.844c.04.03.078.062.115.098l3.85 3.85a1 1 0 0 1-1.414 1.415l-3.85-3.85a1.007 1.007 0 0 1-.1-.115h.002A6.5 6.5 0 1 1 13 6.5M6.5 12a5.5 5.5 0 1 0 0-11 5.5 5.5 0 0 0 0 11" />
</svg>

		<a href="FindVehicle" target="content">FIND</a>
	</div>
	<br>



	<div class="container" align="center">

		<svg xmlns="http://www.w3.org/2000/svg" width="20" height="20"
			fill="currentColor" class="bi bi-card-checklist" viewBox="0 0 16 16">
  <path
				d="M14.5 3a.5.5 0 0 1 .5.5v9a.5.5 0 0 1-.5.5h-13a.5.5 0 0 1-.5-.5v-9a.5.5 0 0 1 .5-.5zm-13-1A1.5 1.5 0 0 0 0 3.5v9A1.5 1.5 0 0 0 1.5 14h13a1.5 1.5 0 0 0 1.5-1.5v-9A1.5 1.5 0 0 0 14.5 2z" />
  <path
				d="M7 5.5a.5.5 0 0 1 .5-.5h5a.5.5 0 0 1 0 1h-5a.5.5 0 0 1-.5-.5m-1.496-.854a.5.5 0 0 1 0 .708l-1.5 1.5a.5.5 0 0 1-.708 0l-.5-.5a.5.5 0 1 1 .708-.708l.146.147 1.146-1.147a.5.5 0 0 1 .708 0M7 9.5a.5.5 0 0 1 .5-.5h5a.5.5 0 0 1 0 1h-5a.5.5 0 0 1-.5-.5m-1.496-.854a.5.5 0 0 1 0 .708l-1.5 1.5a.5.5 0 0 1-.708 0l-.5-.5a.5.5 0 0 1 .708-.708l.146.147 1.146-1.147a.5.5 0 0 1 .708 0" />
</svg>
		<a href="FindAllVehicleSuccess" target="content">FIND ALL</a>
	</div>
	<br>


	<!-- 
<table class="table table-bordered">
<thead>
<tr><td>Operations</td></tr>
</thead>
<tbody>  -->

	<!-- <tr><td><a href="Home" target="content">Home</a></td></tr> -->
	<!-- 
<tr>

<td><img  src="https://cdn-icons-png.flaticon.com/512/72/72145.png" height="10%" width="10%"> </td>
<td><a href="InsertProduct" target="content">Insert</a></td>

</tr>

<tr><td><a href="DeleteStudent" target="content">Delete</a></td></tr>

<tr><td><a href="UpdateStudent" target="content">Update</a></td></tr>
<tr><td><a href="FindStudent" target="content">Find</a></td></tr>
<tr><td><a href="FindAllStudentResult" target="content">Find All</a></td></tr>

</tbody>
</table>

 -->


</body>
</html>