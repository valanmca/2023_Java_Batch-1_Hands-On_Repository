<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Vehicle</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
<style>
h2 {
	color: blue;
	text-align: center;
}
</style>
</head>
<body>
	<h2>UPDATE VEHICLE DETAILS</h2>
	<br>
	<form action="PerformUpdate" method="post">
		<table width="60%" align="center" class="table table-borderless w-50">
			<tr>
				<td><b>Vehicle Id</b></td>
				<td><input type="number" placeholder="Vehicle Id"
					class="form-control me-2" name="id" required /></td>
			</tr>
			<tr>
				<td><b>Vehicle Brand</b></td>
				<td><input type="text" placeholder="Vehicle Brand" name="brand"
					class="form-control me-2" required /></td>
			</tr>
			<tr>
				<td><b>Vehicle Owner</b></td>
				<td><input type="text" placeholder="Owner name" name="owner"
					class="form-control me-2" required /></td>
			</tr>
			<tr>
				<td><b>Contact Number</b></td>
				<td><input type="text" placeholder="Contact Number"
					name="contact" class="form-control me-2" required /></td>
			</tr>
			<tr>
				<td><b>Vehicle Price</b></td>
				<td><input type="text" placeholder="Vehicle Price" name="price"
					class="form-control me-2" required /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					class="btn btn-outline-primary"
					value="Update Vehicle" /></td>
			</tr>

		</table>
	</form>
</body>
</html>
