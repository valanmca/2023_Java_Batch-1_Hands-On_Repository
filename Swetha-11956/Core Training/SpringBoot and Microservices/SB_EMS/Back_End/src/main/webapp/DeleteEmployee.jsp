<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">


<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<style>
td {
	padding: 10px;
	font-weight:bold;
}
</style>
<meta charset="ISO-8859-1">
<title>Delete Employee</title>

<link rel="stylesheet" href="css/bootstrap.css">

</head>
<body>
	<form action="PerformDelete" method="post">
		<br> <br>

		<div class="card" style="width: 60%; height: 70%; margin-left: 20%">
			<div class="card-body" style="background-color:#FFDAB9">
			<h4>Delete an Employee Detail</h4>
				<table width="60%" align="center">
					<br>
					<br>
					
					<tr>
						<td>Employee Id</td>
						<td><input type="text" name="id"></td>
					</tr>
					<tr>

						<td align="center"><input type="submit"
							class="btn btn-danger" value="Delete Employee"></td>
					</tr>
					</div>
			</div>
			</table>
	</form>
</body>
</html>