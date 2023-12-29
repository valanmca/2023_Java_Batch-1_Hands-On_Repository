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
		border-radius: 15px;
	 
	}
	table{
		border-spacing: 15px;
	}
	p{
		padding : 3px,5px,3px,5px;
	}
	th{
		border-right: 5px;
	}
	
</style>
</head>

<body>
<p>
<h4 align = "center" Width = 80%>Product Management System</h4></p>
<table align ="center" width="80%">
	<tr>
		<th class="my-style"><a href="InsertProduct.jsp" target="content">Insert</a></th>
		<th><a href="UpdateProduct.jsp" target="content">Update</a></th>
		<th><a href="PMSController?id=a" target="content">Delete</a></th>
		<th><a href="FindProduct.jsp" target="content">Find</a></th>
		<th><a href="PMSController?id=b" target="content">FindAll</a></th>	
	</tr>
</table>
</body>
</html>