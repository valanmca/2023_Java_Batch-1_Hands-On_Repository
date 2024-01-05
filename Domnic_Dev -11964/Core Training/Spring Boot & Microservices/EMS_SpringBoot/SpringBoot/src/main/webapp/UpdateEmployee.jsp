<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table, th {
  border: 1px solid;
}

</style>
</head>
<body>
		<form action="PerformUpdate" method="post">
		<table align="center" class="table">
			<tbody>
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
					<td colspan="2" align="center"><input type="submit"
						value="Update Employee" name="sms_button" class="btn btn-primary"></td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>