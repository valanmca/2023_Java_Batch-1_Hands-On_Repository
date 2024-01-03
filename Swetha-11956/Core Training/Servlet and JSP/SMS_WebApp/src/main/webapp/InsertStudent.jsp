<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Student</title>

<link rel="stylesheet" href="css/bootstrap.css">

<style>
table {
	margin-left: 25%;
	margin-top: 5%;
}

td {
	padding: 10px;
}
</style>
</head>

<body>
<form action="SMSController" method="post">
	<table>
		<tr>
			<td>Enter Student Rollno </td>
			<td>:</td>
			<td><input type="text" required name="sid" class="form-control" /></td>
		</tr>
		<br>
		<br>
		<tr>
			<td>Enter Student Name</td>
			<td>:</td>
			<td><input type="text" required  name="sname" class="form-control" /></td>
		</tr>
		<br>
		<br>
		<tr>
			<td>Enter Student Department</td>
			<td>:</td>
			<td><input type="text" required  name="sdept" class="form-control" /></td>
		</tr>
		<tr>
			<td colspan="3" align="center"><input type="submit"
				class="btn btn-secondary " value="Insert Student" name="sms_button"/></td>
		</tr>
	</table>
	</form>



</body>
</html>