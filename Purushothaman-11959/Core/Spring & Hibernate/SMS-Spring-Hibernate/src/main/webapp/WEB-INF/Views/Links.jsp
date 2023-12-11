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
	color: white;
}

a:hover {
	text-decoration: none;
	color: #E9967A;
}
.col{
    width:100px;
    height:60px;
    margin-top: 20px;
    }
button{
   width:150px;
   height:60px;
 }
body{
 background-color:#E9967A;
 }

</style>

</head>

<body>
<br><br>
<br><br>
<br><br><br>

	<div class="container" align="center">
		<div class="row">
			<div class="col">
				<button type="button" class="btn btn-dark btn-lg">
					<a href="InsertStudent" target="content">Insert</a>
				</button>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<button type="button" class="btn btn-dark btn-lg">
					<a href="DeleteStudent" target="content">Delete</a>
				</button>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<button type="button" class="btn btn-dark btn-lg">
					<a href="UpdateStudent" target="content">Update</a>
				</button>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<button type="button" class="btn btn-dark btn-lg">
					<a href="FindStudent" target="content">Find</a>
				</button>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<button type="button" class="btn btn-dark btn-lg">
					<a href="FindAllStudent" target="content">Find All</a>
				</button>
			</div>
		</div>


	</div>
	

</body>
</html>





