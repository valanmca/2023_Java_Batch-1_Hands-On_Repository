<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="css/bootstrap.css">
<style>
th {
	
	color: black;
	text-align:center;
	
}

a{
text-decoration:none;
color:black;
}
a:hover{
color:grey;
}
</style>
</head>
<body>
	<table align="center" class="table">
	<tr>
			<th><a href="Home.jsp" target="content">Home</a></th>
		</tr>
		<tr>
			<th><a href="InsertStudent.jsp" target="content"> Insert</a></th>
		</tr>
		<tr>
			<th><a href="SMSController?id=a" target="content" >Delete</a></th>
		</tr>
		<tr>
			<th><a href="UpdateStudent.jsp" target="content">Update</a></th>
		</tr>
		<tr>
			<th><a href="FindStudent.jsp" target="content">Find</a></th>
		</tr>
		<tr>
			<th><a href="SMSController?id1=b" target="content">FindAll</a></th>
		</tr>
	</table>
</body>
</html>















