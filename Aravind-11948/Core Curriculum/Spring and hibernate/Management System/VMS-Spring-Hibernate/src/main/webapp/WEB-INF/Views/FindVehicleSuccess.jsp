<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ include file="FindVehicle.jsp"%>
<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.container-fluid {
	position: absolute;
	
	top: 60%;
}
</style>

</head>
<body>
	
	<div class=container-fluid>
	<table class="table table-striped">
	<tr>
	<th>Vehicle Id</th>
	<th>Vehicle Type</th>
	<th>Vehicle name</th>
	<th>Vehicle Number</th>
	<th>Vehicle owner</th>
   </tr>
   
   <tr>
   <td>${list.getId() }</td>
   <td>${list.getType() }</td>
   <td>${list.getName() }</td>
   <td>${list.getNumber() }</td>
   <td>${list.getOwner() }</td>
   </tr>
	
	
	
	
	
	</table>
	</div>
	
	

	
		
</body>
</html>