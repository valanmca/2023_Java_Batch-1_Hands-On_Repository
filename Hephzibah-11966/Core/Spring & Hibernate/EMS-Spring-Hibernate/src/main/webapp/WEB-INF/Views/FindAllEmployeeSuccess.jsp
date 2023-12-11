<%@page import="java.util.ArrayList"%>
<%@page import="com.hephzi.bean.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table width='60%' align="center">
		<tr>
			<th>Employee Id</th>
			<th>Employee Name</th>
			<th>Employee Salary</th>
			<th>Employee Department</th>
		</tr>
		<c:forEach items="${idList}" var="s">
			<tr>
				<td>${ s.getId() }</td>
				<td>${ s.getName() }</td>
				<td>${ s.getSalary() }</td>
				<td>${s.getDno() }</td>

			</tr>
		</c:forEach>
	</table>
</body>
</html>