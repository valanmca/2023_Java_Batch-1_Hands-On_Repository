<%@page import="java.util.ArrayList"%>
<%@page import="com.mms.bean.Movie"%>
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
			<th>Movie Id</th>
			<th>Movie Name</th>
			<th>Movie Type</th>
			<th>Movie Language</th>
			<th>Movie Duration</th>

		</tr>
		<c:forEach items="${idList}" var="m">
			<tr>
				<td>${ m.getId() }</td>
				<td>${ m.getName() }</td>
				<td>${ m.getType() }</td>
				<td>${ m.getLanguage() }</td>
				<td>${ m.getDuration() }</td>


			</tr>
		</c:forEach>
	</table>
</body>
</html>