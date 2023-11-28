
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.LinkedList"%>
<%@page import="com.pms.bean.Products"%>
<%@page import="java.util.List"%>
<link href="css/bootstrap.css" rel="stylesheet">
<!DOCTYPE html>
<html>
<head>
<style>
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table  align='center'
		class="table table-bordered table-hover">
		<thead class="thead-dark">
			<tr>
				<th>Product Id</th>
				<th>Product Name</th>
				<th>Product Quantity</th>
				<th>Product Price</th>
			</tr>
		</thead>
		<c:forEach items="${list}" var="a">
			<tr>
				<th>${a.getProductId()}</th>
				<th>${a.getProductName()}</th>
				<th>${a.getProductQuantity()}</th>
				<th>${a.getProductPrice()}</th>
			</tr>
		</c:forEach>
	</table>
</body>
</html>