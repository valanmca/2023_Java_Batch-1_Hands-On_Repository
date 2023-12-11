<%@page import="java.util.LinkedList"%>
<%@page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<style>
table,th,td{
	text-align: center;
	font-family: Fantasy;
	font-variant: small-caps;
	font-size: 25px;
	font-weight : lighter;
	margin-top: 2%;}
</style>
<meta charset="ISO-8859-1">
<title>Find All Movies</title>
</head>
<body style="background: #66fcf1">
	<table width='60%' align='center' class="table table-dark table-bordered table-hover">
		<tr>
			<th>Movie Id</th>
			<th>Movie Name</th>
			<th>Movie Type</th>
			<th>Movie Language</th>
			<th>Movie Duration</th>
		</tr>
		<c:forEach items="${idList}" var="a">
			<tr>
				<td>${a.getId()}</td>
				<td>${a.getName()}</td>
				<td>${a.getType()}</td>
				<td>${a.getLanguage()}</td>
				<td>${a.getDuration()}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>