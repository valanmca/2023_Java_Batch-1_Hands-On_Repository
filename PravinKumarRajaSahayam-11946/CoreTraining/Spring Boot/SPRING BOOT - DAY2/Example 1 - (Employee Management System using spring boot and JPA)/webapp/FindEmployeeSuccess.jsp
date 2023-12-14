<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="FindEmployee.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<br>
<center>
<table align="center">
<tr>
<th>
<td><b>Employee Id</b></td>
<td><b>Employee Name</b></td>
<td><b>Employee Department</b></td>
</th>
</tr>
<tr align="center">
<th>
<td>${emp.id}</td>
<td>${emp.name}</td>
<td>${emp.department}</td>
</th>
</tr>
</table>
</body>
</html>