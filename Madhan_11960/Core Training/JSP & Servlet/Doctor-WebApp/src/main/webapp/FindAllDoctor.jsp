<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
</style>
</head>
<body>
	<br>
	<br>
	<%-- JSTL Iterate code to iterate collection --%>
	<div class='show'>
		<table table width='80%' align='center' class='table table-striped'>
			<tr class='table-success'>
				<th>Doctor Id</th>
				<th>Doctor Name</th>
				<th>Doctor Age</th>
				<th>Doctor Email</th>
				<th>Doctor Specialization</th>
				<th>Doctor Contact</th>
				<th>Doctor Location</th>
			</tr>
			<c:forEach items="${list}" var="display">
				<tr>
					<td>${display.getDoctorId()}</td>
					<td>${display.getDoctorName()}</td>
					<td>${display.getDoctorAge()}</td>
					<td>${display.getDoctorEmail()}</td>
					<td>${display.getDoctorSpecialization()}</td>
					<td>${display.getDoctorContact()}</td>
					<td>${display.getDoctorLocation()}</td>
					
				</tr>
			</c:forEach>
		</table>
	</div>
</html>


