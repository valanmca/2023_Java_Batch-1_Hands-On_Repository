<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page isELIgnored = "false" %>
<%@ include file="FindEmployeeByName.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table align="center">
	<tr>
	<th>Employee ID</th>
	<th>Employee Name</th>
	<th>Employee Salary</th>
	</tr>
	
	<tr>
	<td>${emp.getId()}</td>
	<td>${emp.getName()}</td>
	<td>${emp.getSalary()}</td>
	</table>

</body>
</html>