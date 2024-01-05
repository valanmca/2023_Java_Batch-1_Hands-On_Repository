<%@page import="com.domnic.bean.Vehicle"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="FindVehicle.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
 .div{
 padding-left: 5%;
	width: 80%;
}
</style>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<br>
	<div class="div">
	<table class="table table-bordered">
		<thead>
			<tr>
				<th>Vehicle Id</th>
				<th>Vehicle Type</th>
				<th>Vehicle Name</th>
				<th>Vehicle Number</th>
				<th>Owner Name</th>
			</tr>
		</thead>
		<tbody>
		<tr>
				<td>${bean.getvId()}</td>
				<td>${bean.getvType()}</td>
			    <td>${bean.getvName()}</td>
				<td>${bean.getvNumber()}</td>
				<td>${bean.getoName()}</td>
				
				
				
			</tr>
		
		</tbody>
	</table>
	</div>
</body>
</html>