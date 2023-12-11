<%@page import="java.util.LinkedList"%>
<%@page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<link href="css/bootstrap.css" rel="stylesheet">
<%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<style>
table{
text-align : "center"
}
</style>
<meta charset="ISO-8859-1">
<title>Find All Movies</title>
</head>
<body>
	<table width='60%' align='center' class="table table-striped">
		<tr class="table-primary" >
		<th>Employee Id</th>
		<th>Employee Name</th>
		<th>Employee Salary</th>
		</tr>
		<c:forEach items="${employeeList}" var="a">
			<tr class="table-primary">
				<td>${a.getId()}</td>
				<td>${a.getName()}</td>
				<td>${a.getSalary()}</td>
				
			</tr>
		</c:forEach>
	</table>
</body>
</html>