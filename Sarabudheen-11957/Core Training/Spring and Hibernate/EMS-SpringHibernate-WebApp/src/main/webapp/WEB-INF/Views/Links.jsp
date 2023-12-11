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
<title>Links</title>
<style>
th {
	background-color: blue;
	color: white;
	padding: 15px;
	text-align: center;
	border: 3px solid black;
}

table {
	border-spacing: 10px;
}

a {
	text-decoration: none;
	color: white;
}
</style>
</head>
<body>
	<table align="center" style="width: 80%">
		<tr>
			<th><a href="InsertEmployee" target="content">Insert</a></th>
			<th><a href="DeleteEmployee" target="content">Delete</a></th>
			<th><a href="UpdateEmployee" target="content">Update</a></th>
			<th><a href="FindEmployee" target="content">Find</a></th>
			<th><a href="FindAllEmployee" target="content">FindAll</a></th>
		</tr>
	</table>

</body>
</html>