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
table, th, td {
	text-align: center;
	font-family: Fantasy;
	font-variant: small-caps;
	font-size: 20px;
	font-weight: lighter;
	margin-top: 2%;
}
</style>
<meta charset="ISO-8859-1">
<title>Find All Laptops</title>
</head>
<body style="background: #FAF9F6">
	<table width='60%' align='center'
		class="table table-hover table-primary">
		<tr>
			<th>Laptop Id</th>
			<th>Laptop Brand Name</th>
			<th>Laptop Model Name</th>
			<th>Laptop Price</th>
		</tr>
		<c:forEach items="${laptopList}" var="a">
			<tr>
				<td>${a.getId()}</td>
				<td>${a.getBrandName()}</td>
				<td>${a.getModelName()}</td>
				<td>${a.getPrice()}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>