<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Movie</title>
</head>
<body>
	<form action="MMSController" method ="post">
		<table width="60%" align="center">
			<tr>
				<td>Movie Id</td>
				<td><input type="text" name="mid"></td>
			</tr>
			<tr>
			<td><input type="submit" value="Find Movie" name="mms_button"></td>

		</table>
	</form>

</body>
</html>