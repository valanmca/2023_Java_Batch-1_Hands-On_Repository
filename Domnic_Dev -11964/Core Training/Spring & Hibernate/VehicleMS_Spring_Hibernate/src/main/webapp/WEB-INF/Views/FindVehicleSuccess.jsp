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
</head>
<body>
	<br>
	<div class="div">
	<table class="table table-bordered">
		<thead>
			<tr>
				<th>Vehicle Id</th>
				<th>Vehicle Name</th>
				<th>Vehicle Manufacturer</th>
				
			</tr>
		</thead>
		<tbody>
		<tr>
				<td>${bean.getvId()}</td>
				<td>${bean.getvName()}</td>
				<td>${bean.getvManufacturer()}</td>
				
				
			</tr>
		
		</tbody>
	</table>
	</div>
</body>
</html>