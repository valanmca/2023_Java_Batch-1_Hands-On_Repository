<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<style>
a {
	text-decoration: none;
	color: black;
}

a:hover {
	text-decoration: none;
	color: white;
}
.col{
    width:100px;
    height:60px;
    margin-top: 20px;
    }
button{
   width:100px;
   height:60px;
 }
body{
 background-color:;
 }

</style>

</head>

<body>
<br><br>
	<div class="container" align="center">
		<p class="text-center">
			<b>CRUD Operations</b>
		</p>
		<div class="row">
			<div class="col">
				<button type="button" class="btn btn-outline-dark btn-lg">
					<a href="InsertStudent.jsp" target="content">Insert</a>
				</button>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<button type="button" class="btn btn-outline-dark btn-lg">
					<a href="SMSController?id=a" target="content">Delete</a>
				</button>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<button type="button" class="btn btn-outline-dark btn-lg">
					<a href="UpdateStudent.jsp" target="content">Update</a>
				</button>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<button type="button" class="btn btn-outline-dark btn-lg">
					<a href="SMSController?id=b" target="content">Find</a>
				</button>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<button type="button" class="btn btn-outline-dark btn-lg">
					<a href="SMSController?id=c" target="content">Find All</a>
				</button>
			</div>
		</div>


	</div>

</body>
</html>





