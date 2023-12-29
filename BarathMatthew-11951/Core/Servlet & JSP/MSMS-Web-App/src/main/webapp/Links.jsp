<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href ="css/bootstrap.css">
<style>
	th,a{
		
		
	
		text-decoration: none;
		color: white;
		padding: 19px 39px 18px 39px;
	  	color: #FFF;
		background-color: #4bc970;
		font-size: 18px;
		text-align: center;
		font-style: normal;
	 
	}
</style>
</head>
<body>
<br>
<br>
<table align ="center" width="80%">
	<tr>
		<th><a href="InsertMobile.jsp" target="content">Insert</a></th>
		<th><a href="UpdateMobile.jsp" target="content">Update</a></th>
		<th><a href="MSMSController?id='a'" target="content">Delete</a></th>
		<th><a href="FindMobile.jsp" target="content">Find</a></th>
		<th><a href="MSMSController?id1='b'" target="content">FindAll</a></th>	
	</tr>
</table>
</body>
</html>