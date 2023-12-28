<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">

<style>
body {
	background-image:
		url("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSHpwvAYrLMPS_JUZfpRZ5nnY929pyJFO9o1A&usqp=CAU");
	color: white;
	position-absolute;
}

table {position-absolute;
	margin-top: 2%;
	margin-left:27%
}
</style>
</head>
<body>
	<table align="center" width=50%>
		<th><a href="InsertTeacher" target="content"><button
					type="button" class="btn btn-outline-light btn-lg">Insert</button></a></th>
		<th></th>
		<th><a href="UpdateTeacher" target="content"><button
					type="button" class="btn btn-outline-light btn-lg">Update</button></a></th>
		<th></th>
		<th><a href="DeleteTeacher" target="content"><button
					type="button" class="btn btn-outline-light btn-lg" >Delete</button></a></th>
		<th></th>
		<th><a href="FindTeacher" target="content"><button
					type="button" class="btn btn-outline-light btn-lg">Find</button></a></th>
		<th></th>
		<th><a href="FindAllTeacher" target="content"><button
					type="button" class="btn btn-outline-light btn-lg">Find All</button></a></th>
		<th></th>

	</table>


</body>
</html>