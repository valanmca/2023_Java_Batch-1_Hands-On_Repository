<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<link href="css/bootstrap.css" rel="stylesheet">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee</title>
<style>
body{
font-family:sans-serif;
}
</style>
</head>
<body>
	<form action="PerformUpdate" method ="post">
		<table width="60%" align="center">
			<tr>
				<td>Employee Id</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>Employee Name</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Employee Salary</td>
				<td><input type="text" name="salary"></td>
			</tr>
	
			<tr>
			<td><input type="submit"  class ="btn btn-success" value="Update Employee"></td>

		</table>
	</form>

</body>
</html>