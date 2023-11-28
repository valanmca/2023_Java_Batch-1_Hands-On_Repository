<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
th {
	background-color: navy;
	color: white;
}
a{
text-decoration : none;
color:white;
}
</style>
</head>
<body>
	<table align="center" width="80%">
			<tr><th><a href="InsertEmployee.jsp" target="content">Insert</a></th></tr>
			<tr><th><a href="UpdateEmployee.jsp" target="content">Update</a></th></tr>
			<tr><th><a href="DeleteEmployee.jsp" target="content">Delete</a></th></tr>
			<tr><th><a href="SearchEmployee.jsp" target="content">Find / Search</a></th></tr>
			<tr><th><a href="EmsControllerServlet" target="content">View All</a></th></tr>
	</table>
</body>
</html>