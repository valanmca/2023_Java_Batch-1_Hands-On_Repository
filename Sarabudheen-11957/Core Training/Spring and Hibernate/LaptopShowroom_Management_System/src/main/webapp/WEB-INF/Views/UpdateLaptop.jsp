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
<title>Update Laptop</title>
<style>
body {
	font-family: Fantasy;
	font-variant: small-caps;
	font-size: 15px;
}

table {
	text-align: center;
	color: #0073CF;
	height: 70%;
	width: 70%;
	margin-left: 15%;
	margin-top: 20px;
	border: 2px solid yellow;
	border-radius: 20px;
}

input {
	color: #0073CF;
	width: 5cm;
	height: 1cm;
	border: 2px solid white;
	border-radius: 20px;
}
</style>
</head>
<body style="background: #FAF9F6">
	<form action="PerformUpdate" method="post">
		<table width="60%" align="center">
			<tr>
				<td>Laptop Id</td>
				<td><input type="text" name="id" class="form-control" required></td>
			</tr>
			<tr>
				<td>Laptop Brand Name</td>
				<td><input type="text" name="brandName" class="form-control"
					required></td>
			</tr>
			<tr>
				<td>Laptop Model Name</td>
				<td><input type="text" name="modelName" class="form-control"
					required></td>
			</tr>
			<tr>
				<td>Laptop Price</td>
				<td><input type="text" name="price" class="form-control"
					required></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" class="btn btn-warning"
					value="Update Laptop"></td>
		</table>
	</form>

</body>
</html>