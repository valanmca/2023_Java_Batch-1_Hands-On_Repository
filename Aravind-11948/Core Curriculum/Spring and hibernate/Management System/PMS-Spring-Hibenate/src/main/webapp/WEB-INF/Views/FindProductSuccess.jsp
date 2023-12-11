<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ include file="FindProduct.jsp"%>
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
	<th>Teacher Id</th>
	<th>Teacher Name</th>
	<th>Teacher Subject</th>
	<th>Teacher salary</th>
   </tr>
   
   <tr>
   <td>${list.getId() }</td>
   <td>${list.getName() }</td>
   <td>${list.getQuantity() }</td>
   <td>${list.getPrice() }</td>
   </tr>
	
	
	
	
	
	</table>
	</div>
	
	

	
		
</body>
</html>