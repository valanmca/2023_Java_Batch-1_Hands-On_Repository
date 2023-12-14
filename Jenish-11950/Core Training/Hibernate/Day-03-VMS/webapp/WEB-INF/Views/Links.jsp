<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<style>
a {
	text-decoration: none;
	color:white;
	color: black;
}
#grad1 {
  height: 60px;
  background-color: yellowgreen; 
  background-image: linear-gradient(yellowgreen, SkyBlue);
}
</style>


<body>
<div >
	<br>
	<br>
		<table align="center" width="80%" id="grad1">
			<tr>
				<th><a href="InsertVehicle" target="content">Insert</a></th>
				<th><a href="DeleteVehicle" target="content">Delete</a></th>
				<th><a href="UpdateVehicle" target="content">Update</a></th>
				<th><a href="FindVehicle" target="content">Find</a></th>
				<th><a href="FindAllVehicle" target="content">Find All</a></th>
			</tr>

		</table>
	</div>
</body>
</html>