<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">

<style>
.show {
	padding-left: 10%;
	padding-right: 10%;
	width: 100%;
}

th, td {
	background-color: #4bc970;
	text-align: center;
}
</style>
</head>
<body>
	<br>

	<div class='show'>
		<table table width='80%' align='center' class='table table-striped'>
			<tr class='table-success'>
				<th>Student Rollno</th>
				<th>Student Name</th>
				<th>Student Email</th>
				<th>Student Standard</th>
				<th>Student Location</th>
			</tr>
			<c:forEach items="${idList}" var="a">
				<tr>
					<td>${a.getRno()}</td>
					<td>${a.getName()}</td>
					<td>${a.getEmail()}</td>
					<td>${a.getStandard()}</td>
					<td>${a.getLocation()}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>