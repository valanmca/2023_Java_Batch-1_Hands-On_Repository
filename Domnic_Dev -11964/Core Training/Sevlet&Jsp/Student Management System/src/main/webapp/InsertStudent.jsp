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
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<form action="EMS_Servlet" method="post">
		<table align="center" class="table">
			<tbody>
				<tr>

					<td>Student Id</td>
					<td><input type="text" name="sid"></td>
				</tr>
				<tr>
					<td>Student Name</td>
					<td><input type="text" name="sname"></td>
				</tr>
				<tr>
					<td>Student Section</td>
					<td><input type="text" name="ssection"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Insert Student" name="sms_button" class="btn btn-primary"></td>
				</tr>
			</tbody>
		</table>
	</form>

</body>
</html>