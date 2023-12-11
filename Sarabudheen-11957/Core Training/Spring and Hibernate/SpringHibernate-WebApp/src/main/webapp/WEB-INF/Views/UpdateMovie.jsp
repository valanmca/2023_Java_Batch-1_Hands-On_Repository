<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/bootstrap.css" rel="stylesheet">
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
<title>Update Movie</title>
<style>
body {
	font-family: Fantasy;
	font-variant: small-caps;
	font-size: 15px;
}

table {
	text-align: center;
	color: white;
	height: 70%;
	width: 70%;
	margin-left: 10%;
	margin-top: 20px;
}

input {
	color: black;
	width: 5cm;
	height: 1cm;
	border: 2px solid white;
	border-radius: 20px;
}
</style>
</head>
<body style="background: #0B0c10">
	<form action="PerformUpdate" method="post">
		<table width="60%" align="center">
			<tr>
				<td>Movie Id</td>
				<td><input type="text" name="id" class="form-control" required></td>
			</tr>
			<tr>
				<td>Movie Name</td>
				<td><input type="text" name="name" class="form-control" required></td>
			</tr>
			<tr>
				<td>Movie Type</td>
				<td><input type="text" name="type" class="form-control" required></td>
			</tr>
			<tr>
				<td>Movie Language</td>
				<td><input type="text" name="language" class="form-control" required></td>
			</tr>
			<tr>
				<td>Movie Duration</td>
				<td><input type="text" name="duration" class="form-control" required></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" class="btn btn-warning"
					value="Update Movie"></td>
		</table>
	</form>

</body>
</html>