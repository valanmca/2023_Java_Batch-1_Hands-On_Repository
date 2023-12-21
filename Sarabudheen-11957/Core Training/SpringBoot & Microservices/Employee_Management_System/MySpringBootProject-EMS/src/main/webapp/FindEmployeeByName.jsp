<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored = "false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Employee</title>
</head>
<body>
	<form action="PerformFindByName" method="post">
		<table width="60%" align="center">
			<tr>
				<td>Employee Name</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Find Employee"></td>
		</table>
	</form>

</body>
</html>