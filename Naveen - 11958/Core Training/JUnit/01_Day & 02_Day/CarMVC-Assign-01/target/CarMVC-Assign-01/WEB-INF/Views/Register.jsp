<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
<style>
h1 {
	color: green;
	text-align: center;
}
</style>
</head>
<body>
	<h1>Carz.com</h1>
	<br>
	<form action="PerformRegister" method="post">
		<table width="60%" align="center" class="table table-borderless w-50">
			<tr>
				<td><b>Car No</b></td>
				<td><input type="number" placeholder="Car No"
					class="form-control me-2" name="carNo" required /></td>
			</tr>
			<tr>
				<td><b>Manufacture</b></td>
				<td><input type="text" placeholder="Manufacture"
					name="manufacture" class="form-control me-2" required /></td>
			</tr>
			<tr>
				<td><b>Model</b></td>
				<td><input type="text" placeholder="Model" name="model"
					class="form-control me-2" required /></td>
			</tr>
			<tr>
				<td><b>Kms Ran</b></td>
				<td><input type="text" placeholder="Kilometers" name="kmsRan"
					class="form-control me-2" required /></td>
			</tr>
			<tr>
				<td><b>Price Expected</b></td>
				<td><input type="text" placeholder="Price" name="priceExpected"
					class="form-control me-2" required /></td>
			</tr>
			<tr>
				<td><b>No of Owners</b></td>
				<td><input type="text" placeholder="Owners count"
					name="noOfOwners" class="form-control me-2" required /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					class="btn btn-outline-success" value="Register" /></td>
			</tr>

		</table>
	</form>
</body>
</html>