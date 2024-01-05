<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Employee</title>
<style>
td {
	padding: 7px;
	font-weight: bold;
}
</style>
<link rel="stylesheet" href="css/bootstrap.css">
</head>
<body>
	<form action="PerformInsert" method="post">
		<br>
		<br>
		<div class="card" style="width: 60%; height: 80%; margin-left: 20%">
			<div class="card-body" style="background-color: #D5FFF1">
				<h4>
					Insert Employee details
					<svg xmlns="http://www.w3.org/2000/svg" width="20" height="20"
						fill="currentColor" class="bi bi-person-plus-fill"
						viewBox="0 0 16 16">
  <path
							d="M1 14s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1zm5-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6" />
  <path fill-rule="evenodd"
							d="M13.5 5a.5.5 0 0 1 .5.5V7h1.5a.5.5 0 0 1 0 1H14v1.5a.5.5 0 0 1-1 0V8h-1.5a.5.5 0 0 1 0-1H13V5.5a.5.5 0 0 1 .5-.5" />
</svg>
				</h4>
				<table width="60%" align="center">
					<br>
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
						<td align="center"><input type="submit"
							value="Insert Employee" class="btn btn-primary" /></td>
					</tr>
					</div>
					</div>
				</table>
	</form>
</body>
</html>