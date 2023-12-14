<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
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
<table width='60%' align='center'>
    <tr><th>Employee Id</th><th>Employee Name</th><th>Employee Salary</th></tr>
    <tr>
    <td>${bean.id}</td>
    <td>${bean.name}</td>
    <td>${bean.salary}</td></tr>
    
    </table>
</center>
</body>
</html>