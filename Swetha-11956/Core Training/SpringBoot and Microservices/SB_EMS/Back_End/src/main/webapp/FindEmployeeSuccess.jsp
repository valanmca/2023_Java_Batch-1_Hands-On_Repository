<%@page import="com.ems.bean.Employee"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">

<%@ include file="FindEmployee.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Employee Success</title>
</head>
<body>
	<table align="center">
	<tr>
	<th>Employee ID</th>
	<th>Employee Name</th>
	<th>Employee Salary</th>
	</tr>
	
	<tr>
	<td>${emp.getId() }</td>
	<td>${emp.getName() }</td>
	<td>${emp.getSalary() }</td>
	</tr>
	</table>
</body>
</html>