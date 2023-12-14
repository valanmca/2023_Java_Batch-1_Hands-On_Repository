<%@page import="java.util.List"%>
<%@page import="com.msms.bean.Mobile"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>



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
<style>
h2 {
	text-align: center;
}

.img {
	background-image:
		url("https://media.istockphoto.com/id/614623414/tr/foto%C4%9Fraf/abstract-orange-watercolor-background.jpg?s=170667a&w=0&k=20&c=LArjaHKL70p3K7_4heAmgTKf_7iPqn2aWOmphkZAU-A=");
	background-color: #cccccc;
	height: 570px;
	width: 1200px;
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
	position: relative;
	
}
</style>
</head>
<body>
<div class="img"><br><br><br><br><br>
	<h2>Find All Mobiles</h2>
	<br>
	<%-- JSTL Iterate code to iterate collection --%>
	<table width='60%' align='center'
		class='table table-stripped w-75 border border-dark'>
		<thead class='table-info'>
			<tr>
				<th>Mobile Id</th>
				<th>Mobile Brand</th>
				<th>Mobile Name</th>
				<th>Mobile Price</th>
		</thead>
		</tr>
		<c:forEach items="${idList}" var="a">
			<tr>
				<td>${a.getId()}</td>
				<td>${a.getBrandname()}</td>
				<td>${a.getMobilename()}</td>
				<td>${a.getPrice()}</td>
			</tr>
		</c:forEach>
	</table>
</div>
</body>
</html>