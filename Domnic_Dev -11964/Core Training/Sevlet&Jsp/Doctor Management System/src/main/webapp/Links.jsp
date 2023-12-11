<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.btn {
	width: 150px;
	height: 50px;
}

body {
	
}
</style>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
<br>
	<div>
		<center>
			<a class="btn btn-primary btn-lg" href="InsertDoctor.jsp" target="content">Insert</a> 
			<br> <br> 
			<a class="btn btn-danger btn-lg" href="DmsController?delete=a" target="content">Delete</a>
		    <br> <br>
			<a class="btn btn-warning btn-lg" href="UpdateDoctor.jsp" target="content">Update</a>
			<br> <br> 
			<a class="btn btn-success btn-lg" href="FindDoctor.jsp" target="content">Find</a> 
			<br> <br> 
			<a class="btn btn-info btn-lg" href="DmsController" target="content">Find All</a>
		</center>
	</div>

</body>
</html>