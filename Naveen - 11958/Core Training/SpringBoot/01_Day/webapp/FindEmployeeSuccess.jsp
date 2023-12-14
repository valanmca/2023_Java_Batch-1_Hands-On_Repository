<%@page import="com.ems.bean.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	
	<table width='60%' align='center'>
	<tr><th>Employee Id</th><th>Employee Name</th><th>Employee Salary</th></tr>
	
	<td>${bean.id}</td>
	<td>${bean.name}</td>
	<td>${bean.salary}</td></tr>
	
	</table>

</body>
</html>