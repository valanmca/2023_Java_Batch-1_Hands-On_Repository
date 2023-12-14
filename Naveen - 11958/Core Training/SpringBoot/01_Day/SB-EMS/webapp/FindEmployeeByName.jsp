<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Page</title>
</head>
<body>
	<form action="PerformFindByName">
		<table width="60%" align="center">
			<tr>
				<td>Employee Name</td>
				<td><input type="number" name="name"
					class="form-control form-control-lg" required /></td>


			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Find Employee By Name" /></td>
			</tr>
		</table>
	</form>

</body>
</html>