<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.css" rel="stylesheet">
<style>
h2{
color: blue;
text-align: center;
}
</style>
</head>
<body>
<h2>UPDATE STUDENT DETAILS</h2><br>
	<form action="SMSController" method="post">
		<table width="60%" align="center" class="table table-bordered w-50">
			<tr>
				<td><b>Student Id</b></td>
				<td><input type="number" placeholder="Student Id" name="StuId" class="form-control me-2" required/></td>
			</tr>
			<tr>
				<td><b>Student Name</b></td>
				<td><input type="text" placeholder="Student Name"
					name="StuName" class="form-control me-2" required/></td>
			</tr>
			<tr>
				<td><b>Student Depart</b></td>
				<td><input type="text" placeholder="Student Department"
					name="StuDepart" class="form-control me-2" required/></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					name="sms_button" class="btn btn-outline-primary"
					value="Update Student" /></td>
			</tr>
		</table>
	</form>
</body>
</html>
