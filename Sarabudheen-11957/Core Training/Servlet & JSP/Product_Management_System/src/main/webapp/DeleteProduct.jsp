<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="css/bootstrap.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Delete Product Page</title>
<style>
td {
	padding: 15px;
}
table {
  border: 2px solid red;
}
</style>
</head>
<body>
	<form action="PMSController" method="post">
		<table style="margin-left:35%;margin-top:5%;">

			<tr>
				<td><b>Product ID</b></td>
				<td>:</td>
				<td><input type="text" class="form-control" name="pid" required></td>
			</tr>

			<tr>
				<td colspan="3" align="center"><input type="submit"
					value="Delete Product" class="btn btn-outline-danger"
					name="pms_button"></td>
			</tr>
		</table>
	</form>
	
	
</body>
</html>