<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="css/bootstrap.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Insert Student Page</title>
<style>
td {
	padding: 15px;
}
</style>
</head>
<body>
	<form action="SMSController" method="post">
		<table style="margin-left: 35%; margin-top: 20%;">

			<tr>
				<td><b>Student ID</b></td>
				<td>:</td>
				<td><input type="text" class="form-control" name="sid" required></td>
			</tr>

			<tr>
				<td colspan="3" align="center"><input type="submit"
					value="Delete Student" class="btn btn-outline-danger"
					name="sms_button"></td>
			</tr>
		</table>
	</form>
</body>
</html>