<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Page</title>
</head>
<body>
	<form action="performUpdate" method="post">

		<table width="60%" align="center">
			<tr>
				<td>Vehicle Id</td>
				<td><input type="number" name="id" /></td>
			</tr>
			<tr>
				<td>Vehicle Type</td>
				<td><input type="text" name="type"></td>
			</tr>
			<tr>
				<td>Vehicle Name</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Vehicle Number</td>
				<td><input type="text" name="number" /></td>
			</tr>
			<tr>
				<td>Vehicle Owner</td>
				<td><input type="text" name="owner" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="UpdateVehicle" /></td>
			</tr>
		</table>

	</form>
</body>
</html>