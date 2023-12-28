<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">

<title>Insert title here</title>
<style>
  form {
    margin: 10%;
    position: absolute;
    margin-left: 10%;
    margin-top: 1%;
    

    
  }
</style>
</head>
<body>
	<form action="EMScontroller" method="post" >

		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Employee
				ID</label> <input type="text" class="form-control" name="eid"
				id="exampleInputEmail1" >

		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Employee
				Name </label><input type="text" class="form-control" name="ename"
				id="exampleInputPassword1">
			
		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Employee
				Salary </label><input type="text" class="form-control" name="esalary"
				id="exampleInputPassword1">
			
		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Employee
				DNo </label><input type="text" class="form-control" name="edno"
				id="exampleInputPassword1">
			
		</div>

		<input type="submit" class="btn btn-primary" value="Insert Employee"
			name="ems_button">




		<%-- --<table width="60%" align="center" >
	
	<tr><td>Employee Id</td><td><input type="text" name="eid"/></td></tr>
	<tr><td>Employee Name</td><td><input type="text" name="ename"/></td></tr>
	<tr><td>Employee Salary</td><td><input type="text" name="esalary"/></td></tr>
	<tr><td>Employee Dno</td><td><input type="text" name="edno"/></td></tr>
	<tr><td  colspan="2" align="center"><input type="submit" value="Insert Employee" name="ems_button"/></td></tr>
	
	</table></form>--%>
</body>
</html>