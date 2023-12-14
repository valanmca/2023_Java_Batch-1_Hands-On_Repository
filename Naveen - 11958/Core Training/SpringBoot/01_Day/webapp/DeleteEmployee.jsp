<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Page</title>
</head>
<body>
	<form action="PerformDelete" method="post">
		<table width="60%" align="center">
			<tr>
				<td>Employee Id</td>
				<td><input type="number" name="id"
					class="form-control form-control-lg" required /></td>


			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Delete Employee" /></td>
			</tr>
		</table>
	</form>

</body>
</html>