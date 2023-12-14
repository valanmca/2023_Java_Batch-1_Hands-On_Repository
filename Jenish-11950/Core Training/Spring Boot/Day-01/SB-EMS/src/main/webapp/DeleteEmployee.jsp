<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<br>
	<form action="PerformDelete" method="post">

		<table width="60%" align="center">
			<tr>
				<td><b>Employee Id</b></td>
				<td><input type="number" name="id" required /></td>
				</td>
			</tr>

			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Delete Employee" /></td>
			</tr>
		</table>
	</form>
</body>
</html>