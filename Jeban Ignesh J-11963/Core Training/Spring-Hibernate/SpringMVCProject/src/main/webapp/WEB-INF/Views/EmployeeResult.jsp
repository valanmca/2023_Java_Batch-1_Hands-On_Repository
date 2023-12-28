<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="Input.jsp"></jsp:include>
	<br>Employee Id : ${emp.id}
	<br>Employee Name: ${emp.name}
	<br>Employee Salary: ${emp.salary}
	<br>
	<br>


</body>
</html>