<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.css" rel="stylesheet">
<style>
	th{
	background-color:blue; 
 	color:black; 
 	text-align:center;
 	height:100px;

	}
	a{
	text-decoration:none;
 	 color:black;
 	 padding-top:10px;
	}
	
	
	
	
</style>
</head>


<body>
<table align="center" width="80%" class="table table-hover">
<tr><th align="center" class="table-danger"><a href="InsertVehicle.jsp" target="content">Insert</a></th></tr>
<tr><th class="table-danger"><a href="VMSController?delete=a" target="content">Delete</a></th></tr>
<tr><th class="table-danger"><a href="UpdateVehicle.jsp" target="content">Update</a></th></tr>
<tr><th class="table-danger"><a href="FindVehicle.jsp" target="content">Find</a></th></tr>
<tr><th class="table-danger"><a href="VMSController" target="content">Find All</a></th></tr>


</table>

</body>
</html>