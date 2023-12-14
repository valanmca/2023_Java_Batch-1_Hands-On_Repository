<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ include file="FindMobile.jsp"%>
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
				<th>Mobile Id</th>
				<th>Brand</th>
				<th>Name</th>
				<th>Price</th>
		</thead>
		</tr>
		<tr>
			<td>${mob.getId()}</td>
			<td>${mob.getBrandname()}</td>
			<td>${mob.getMobilename()}</td>
			<td>${mob.getPrice()}</td>
		</tr>
	</table>
</body>
</html>