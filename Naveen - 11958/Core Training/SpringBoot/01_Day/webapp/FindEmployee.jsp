<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Page</title>
</head>
<body>
	<form action="PerformFind">
		<table width="60%" align="center">
			<tr>
				<td>Employee Id</td>
				<td><input type="number" name="id"
					class="form-control form-control-lg" required /></td>


			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Find Employee" /></td>
			</tr>
		</table>
	</form>

</body>
</html>