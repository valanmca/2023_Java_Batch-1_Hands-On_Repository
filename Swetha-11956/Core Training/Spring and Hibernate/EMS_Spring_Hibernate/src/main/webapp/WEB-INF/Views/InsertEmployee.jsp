<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Employee</title>
<link rel="stylesheet" href="css/bootstrap.css">
</head> 
<body>
	<form action="PerformInsert" method="post">

		<table width="60%" align="center">
			<tr>
				<td>Employee Id</td>
				<td><input type="text" name="id" /></td>
			</tr>
			<tr>
				<td>Employee Name</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>Employee Salary</td>
				<td><input type="number" name="salary" /></td>
			</tr>
			<tr>
				<td>Employee DepartNo</td>
				<td><input type="text" name="dno" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Insert Employee"
					name="ems_button"  /></td>
			</tr>
		</table>

	</form>
</body>
</html>