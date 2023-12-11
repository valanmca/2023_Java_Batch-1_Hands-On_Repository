<%@page import="java.util.ArrayList"%>
<%@page import="com.sms.bean.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.show {
	padding-left: 10%;
	padding-right: 10%;
	width: 100%;
}

th {
	background-color: #4bc970;
}

input {
	font-weight: bold;
}
</style>
</head>
<body>
	<table width='60%' align="center" class='table table-striped'>
		<tr class='table-success'>
			<th>Student Id</th>
			<th>Student Name</th>
			<th>Student Marks</th>

		</tr>
		<c:forEach items="${idList}" var="s">
			<tr>
				<td>${ s.getId() }</td>
				<td>${ s.getName() }</td>
				<td>${ s.getMarks() }</td>


			</tr>
		</c:forEach>
	</table>
</body>
</html>