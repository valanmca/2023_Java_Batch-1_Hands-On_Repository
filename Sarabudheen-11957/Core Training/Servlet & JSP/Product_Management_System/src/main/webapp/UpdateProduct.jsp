<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="css/bootstrap.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Update Product Page</title>
<style>
td {
	padding: 15px;
}
table {
  border: 2px solid yellow;
}
</style>
</head>
<body>
	<form action="PMSController" method="post">
		<table style="margin-left:35%;margin-top:5%;">

			<tr>
				<td><b>product ID</b></td>
				<td>:</td>
				<td><input type="text" class="form-control" name="pid" required></td>
			</tr>

			<tr>
				<td><b>Product Name</b></td>
				<td>:</td>
				<td><input type="text" class="form-control" name="pname"
					required></td>
			</tr>

			<tr>
				<td><b>Product Quantity</b></td>
				<td>:</td>
				<td><input type="text" class="form-control" name="pquantity"
					required></td>
			</tr>

			<tr>
				<td><b>Product Price</b></td>
				<td>:</td>
				<td><input type="text" class="form-control" name="pprice"
					required></td>
			</tr>

			<tr>
				<td colspan="3" align="center"><input type="submit"
					value="Update Product" class="btn btn-outline-warning"
					name="pms_button"></td>
			</tr>
		</table>
	</form>
</body>
</html>