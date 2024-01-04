<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>

<%@ page isELIgnored = "false" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head> 
<body>
	Employee ID <b>${emp.id}</b> <br>
	Employee Name <b> ${emp.name}</b><br>
	Employee Salary <b> ${emp.salary}</b>
</body>
</html>