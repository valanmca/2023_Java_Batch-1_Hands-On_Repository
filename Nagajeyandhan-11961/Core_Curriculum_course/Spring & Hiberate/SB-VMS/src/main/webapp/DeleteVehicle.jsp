<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Page</title>
</head>
<body>
	<form action="performDelete" method="post">

		<table width="60%" align="center">
			<tr>
				<td>Vehichle Id</td>
				<td><input type="number" name="id" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="DeleteVehicle" /></td>
			</tr>
		</table>

	</form>
</body>
</html>