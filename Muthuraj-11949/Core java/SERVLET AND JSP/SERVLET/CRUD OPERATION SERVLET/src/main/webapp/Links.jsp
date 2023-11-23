<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
th{
background-color: green;
color:white;
}
a{
color:white;
}

table, th, td {
  border: 1px solid black;
  
}
</style>
</head>
<body>
<table align="center" width="80%">
			<h2 align="center">CUSTOMER MANAGEMENT SYSTEM</h2>

<tr>
<th><a href="InsertCustomer.jsp" target="content">Insert</a></th>
<th><a href="UpdateCustomer.jsp" target="content">Update</a></th>
<th><a href="DeleteCustomer.jsp" target="content">Delete</a></th>
<th><a href="FindCustomer.jsp" target="content">Find</a></th>
<th><a href="CUSController"  target="content">FindAll</a>
</th>
</tr></table>
</body>
</html>