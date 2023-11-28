
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.LinkedList"%>
<%@page import="com.sms.bean.Students"%>
<%@page import="java.util.List"%>
<link href="css/bootstrap.css" rel="stylesheet">
<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {    
border: 3px solid black;  
margin-left: auto;  
margin-right: 20%;     
width: 500px;  
text-align: center;  
font-size: 15px;  

}  
 
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table width='60%' align='center' class="table table-bordered table-hover">
	<thead class="thead-dark">
		<tr>
			<th>Student Id</th>
			<th>Student Name</th>
		</tr>
		</thead>
		<c:forEach items="${list}" var="a">
			<tr>
				<th>${a.getStudentId()}</th>
				<th>${a.getStudentName()}</th>
			</tr>
		</c:forEach>
	</table>
</body>
</html>