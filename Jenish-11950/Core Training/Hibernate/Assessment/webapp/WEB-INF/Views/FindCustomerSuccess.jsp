<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ include file="FindCustomer.jsp"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- JSTL Iterate code to iterate collection --%>
	<table align='center'
		class='table table-stripped w-75 border border-dark'>
		<thead class='table-info'>
			<tr>
				<th>Customer Id</th>
				<th>Name</th>
				<th>Email</th>
				<th>Contactnumber</th>
				<th>Location</th>
		</thead>
		</tr>
		<tr>
			<td>${cus.getId()}</td>
			<td>${cus.getName()}</td>
			<td>${cus.getEmail()}</td>
			<td>${cus.getNumber()}</td>
			<td>${cus.getLocation()}</td>
		</tr>
	</table>
</body>
</html>