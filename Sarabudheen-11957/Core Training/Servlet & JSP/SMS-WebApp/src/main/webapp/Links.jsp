<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="css/bootstrap.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
th {
	text-align: center;
	background-color: black;
	color: white;
}


a {
	text-decoration: none;
	color: white;
}

a:hover {
	color: white;
}
</style>
</head>
<body>
	<table class="table table-dark">
		<tr>
			<th><a href="InsertStudent.jsp" target="content">Insert</a></th>
		</tr>
		<tr>
			<th><a href="DeleteStudent.jsp" target="content">Delete</a></th>
		</tr>
		<tr>
			<th><a href="UpdateStudent.jsp" target="content">Update</a></th>
		</tr>
		<tr>
			<th><a href="FindStudent.jsp" target="content">Find</a></th>
		</tr>
		<tr>
			<th><a href="SMSController" target="content">FindAll</a></th>
		</tr>
	</table>

</body>
</html>