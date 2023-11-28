<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<style>
body {
	font-family: 'Nunito', sans-serif;
	color: #384047;
}

form {
	max-width: 300px;
	margin: 10px auto;
	padding: 10px 20px;
	background: #f4f7f8;
	border-radius: 8px;
}

input[type="text"] {
	background: rgba(255, 255, 255, 0.1);
	border: none;
	font-size: 16px;
	height: auto;
	margin: 0;
	outline: 0;
	padding: 15px;
	width: 100%;
	background-color: #e8eeef;
	color: #8a97a0;
	box-shadow: 0 1px 0 rgba(0, 0, 0, 0.03) inset;
	margin-bottom: 30px;
}

button {
	padding: 19px 39px 18px 39px;
	color: #FFF;
	background-color: #4bc970;
	font-size: 18px;
	text-align: center;
	font-style: normal;
	border-radius: 5px;
	width: 100%;
	border: 1px solid #3ac162;
	border-width: 1px 1px 3px;
	box-shadow: 0 -1px 0 rgba(255, 255, 255, 0.1) inset;
	margin-bottom: 10px;
}

@media screen and (min-width: 640px) {
	form {
		max-width: 550px;
	}
}
</style> 
<script>
	function validateform() {
		var name = "^[A-Z a-z]+$";
		var pass = "^[0-9]+$";
		var eid = document.getElementById("empid").value;
		var ename = document.getElementById("empname").value;
		var esalary = document.getElementById("empsalary").value;

		if (eid == null || eid == "") {
			alert("Employee Id can't be blank");
			return false;
		} else if (!eid.match(pass)) {
			alert("Enter valid Employee Id");
			return false;
		}

		if (ename == null || ename == "") {
			alert("Employee Name can't be blank");
			return false;
		} else if (!ename.match(name)) {
			alert("Enter valid Employee Name");
			return false;
		}

		if (esalary == null || esalary == "") {
			alert("Salary can't be blank");
			return false;
		} else if (!esalary.match(pass)) {
			alert("Enter valid Salary");
			return false;
		}

	}
</script>
</head>
<body> 
	<br>
	<form action="EMSController" method="post" class="p-3 mb-2 bg-info-subtle text-emphasis-info">
		<table width="30%" align="center" class="table table-striped w-80">
			<tr>
			 	
				<td><b>Employee ID</b></td>
				<td><input type="text" class="form-control" placeholder="Employee Id" name="id"
					id="empid" /></td>
			</tr>
			<tr>
				<td><b>Employee Name</b></td>
				<td><input type="text" class="form-control" placeholder="Employee Name" name="name"
					id="empname" /></td>
			</tr>
			<tr>
				<td><b>Employee Salary</b></td>
				<td><input type="text" class="form-control" placeholder="Employee Salary"
					name="salary" id="empsalary" /></td>
			</tr>
			<nav class="navbar bg-body-tertiary">
				<form class="container-fluid justify-content-start">
					<tr>
						<td colspan="2" align="center"><input type="submit"
							class="btn btn-outline-primary me-2" name="ems_button"
							value="InsertEmployee" onclick="validateform()" />
						</td>
					</tr>
				</form>
			</nav>
		</table>

	</form>
</body>
</html>

