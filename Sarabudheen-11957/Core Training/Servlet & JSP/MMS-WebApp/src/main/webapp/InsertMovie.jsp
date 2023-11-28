<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<link href="css/bootstrap.css" rel="stylesheet">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Movie</title>
<style>
body{
font-family:sans-serif;
}
</style>
</head>
<body>
	<form action="MMSController" method ="post">
		<table width="60%" align="center">
			<tr>
				<td>Movie Id</td>
				<td><input type="text" name="mid" class="form-control"></td>
			</tr>
			<tr>
				<td>Movie Name</td>
				<td><input type="text" name="mname" class="form-control"></td>
			</tr>
			<tr>
				<td>Movie Type</td>
				<td><input type="text" name="mtype" class="form-control"></td>
			</tr>
			<tr>
				<td>Movie Language</td>
				<td><input type="text" name="mlang" class="form-control"></td>
			</tr>
			<tr>
				<td>Movie Duration</td>
				<td><input type="text" name="mduration" class="form-control"></td>
			</tr>
			<tr>
			<td><input type="submit"  class ="btn btn-success" value="Insert Movie" name="mms_button"></td>

		</table>
	</form>

</body>
</html>