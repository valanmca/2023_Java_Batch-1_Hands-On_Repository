<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Student</title>

<link rel="stylesheet" href="css/bootstrap.css">

<style>
table {
	margin-left: 30%;
}

td {
	padding: 8px;
}
</style>
</head>

<body align="center">
	<form action="SMSController" method="post">
		<br>
		<br>
		<p ALIGN="CENTER">
			<b>UPDATE STUDENT DETAILS</b>
		</p>
		<br>
		<table>
			<tr>
				<td>Enter Student Rollno</td>
				<td>:</td>
				<td><input type="text" required name="sid" class="form-control" /></td>
			</tr>

			<tr>
				<td>Enter Student Name</td>
				<td>:</td>
				<td><input type="text" required name="sname"
					class="form-control" /></td>
			</tr>


			<tr>
				<td>Enter Student Email</td>
				<td>:</td>
				<td><input type="text" required name="semail"
					class="form-control" /></td>
			</tr>

			<tr>
				<td>Enter Student Std</td>
				<td>:</td>
				<td><input type="text" required name="sstd"
					class="form-control" /></td>
			</tr>

			<tr>
				<td>Enter Student Location</td>
				<td>:</td>
				<td><input type="text" required name="slocation"
					class="form-control" /></td>
			</tr>
			<br>


			<tr>
				<td colspan="3" align="center"><input type="submit"
					class="btn btn-secondary " value="Update Student" name="sms_button" /></td>
			</tr>

		</table>
	</form>



</body>
</html>