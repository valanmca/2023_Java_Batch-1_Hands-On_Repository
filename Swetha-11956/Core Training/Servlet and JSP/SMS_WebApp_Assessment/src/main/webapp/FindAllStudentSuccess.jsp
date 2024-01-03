
<%@page import="java.util.ArrayList"%>
<%@page import="com.sms.bean.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<style>
table {
	width: 100%;
	align: center;
}

th {
	text-align: center;
}

tr {
	text-align: center;
}
</style>
<meta charset="ISO-8859-1">
<title>Find All Employee Success</title>
<link rel="stylesheet" href="css/bootstrap.css">

</head>


<body>
	<br>
	<br>
	<table>
		<tr>
			<th>ALL STUDENT DETAILS</th>
		</tr>

	</table>
	<br>
	<br>

	<%-- JSTL Iterate code to iterate collection --%>
	<table class="table" align='center'>
		<tr style="background-color: lightgrey">
			<th>Student Rno</th>
			<th>Student Name</th>
			<th>Student Email</th>
			<th>Student Std</th>
			<th>Student Location</th>
		</tr>

		<c:forEach items="${list}" var="a">
			<tr style="width: 10%">
				<td>${a.getRno()}</td>
				<td>${a.getName()}</td>
				<td>${a.getEmail()}</td>
				<td>${a.getStd()}</td>
				<td>${a.getLocation()}</td>

			</tr>
		</c:forEach>

	</table>

</body>

</html>
