<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator</title>
</head>
<body>
	<form action="Addition">
		<table>
			<tr>
				<td>Number 1 :</td>
				<td><input type="number" name="num1" /></td>
			</tr>
			<tr>
				<td>Number 2 :</td>
				<td><input type="number" name="num2" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Addition" name="button" /></td>
			</tr>

		</table>
	</form>
</body>
</html>