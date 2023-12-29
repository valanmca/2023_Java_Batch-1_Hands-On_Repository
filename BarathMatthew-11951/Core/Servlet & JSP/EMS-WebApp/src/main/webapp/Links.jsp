<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href ="css/bootstrap.css">
<style>
	th,a{
		
		
	
		text-decoration: none;
		color: white;
		padding: 19px 39px 18px 39px;
	  	color: #FFF;
		background-color: #4bc970;
		font-size: 18px;
		text-align: center;
		font-style: normal;
	 
	}
</style>
</head>
<body>
<br>
<br>
<table align ="center" width="80%">
	<tr>
		<th><a href="InsertEmployee.jsp" target="content">Insert</a></th>
		<th><a href="UpdateEmployee.jsp" target="content">Update</a></th>
		<th><a href="EMSController?id=a" target="content">Delete</a></th>
		<th><a href="FindEmployee.jsp" target="content">Find</a></th>
		<th><a href="EMSController?id=b" target="content">FindAll</a></th>	
	</tr>
</table>
</body>
</html>