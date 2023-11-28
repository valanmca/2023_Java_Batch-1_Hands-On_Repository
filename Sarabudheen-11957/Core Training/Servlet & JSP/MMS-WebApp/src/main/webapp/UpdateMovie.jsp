<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="MMSController" method ="post">
		<table width="60%" align="center">
			<tr>
				<td>Movie Id</td>
				<td><input type="text" name="mid"></td>
			</tr>
			<tr>
				<td>Movie Name</td>
				<td><input type="text" name="mname"></td>
			</tr>
			<tr>
				<td>Movie Type</td>
				<td><input type="text" name="mtype"></td>
			</tr>
			<tr>
				<td>Movie Language</td>
				<td><input type="text" name="mlang"></td>
			</tr>
			<tr>
				<td>Movie Duration</td>
				<td><input type="text" name="mduration"></td>
			</tr>
			<tr>
			<td><input type="submit" value="Update Movie" name="mms_button"></td>

		</table>
	</form>

</body>
</html>