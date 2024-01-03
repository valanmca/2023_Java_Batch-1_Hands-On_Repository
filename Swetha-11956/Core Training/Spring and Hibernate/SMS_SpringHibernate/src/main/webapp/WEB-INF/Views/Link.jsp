<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<meta name="viewport" content="width=device-width, initial-scale=1">
<link
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
    rel="stylesheet"
    integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
    crossorigin="anonymous">
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Link</title>

<style>
button {
	background-color: green;
	padding: 7px;
	border:1px solid white;
}

a {
	text-decoration: none;
	color: white;
}
div{
margin-left:10%;}
</style>
</head>
<body>

<br><br>	
	<div class="btn-group-vertical">
		<button class="btn btn-primary" type="submit"><a href="InsertStudent" target="content">INSERT</a></button>
			<br><button class="btn btn-primary"><a href="DeleteStudent" target="content">DELETE</a></button>
			<br><button class="btn btn-primary"><a href="UpdateStudent" target="content">UPDATE</a></button>
			<br><button class="btn btn-primary"><a href="FindStudent" target="content">FIND</a></button>
			<br><button class="btn btn-primary"><a href="FindAllStudent" target="content">FIND ALL</a></button>
		
	</div>
	
	</body>