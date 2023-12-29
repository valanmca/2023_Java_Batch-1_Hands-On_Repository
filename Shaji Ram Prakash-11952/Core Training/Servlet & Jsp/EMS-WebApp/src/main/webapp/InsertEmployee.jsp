<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>

<br><br>
 <div class="container">
 <center><h1>Insert Employee:</h1></center>
  <div class="card">
   <div class="card-body">
	<form action="EMSController" method="post">
	<div class="form-group row">
	<label for="employeeId" class="col-sm-2 col-form-label">Employee Id :</label>
	<div class="col-sm-7">
       <input type="text" class="form-control" name="Id"
        placeholder="Enter Employee ID" required>
       </div>
     </div>
     <br>
     <div class="form-group row">
	<label for="employeeName" class="col-sm-2 col-form-label">Employee Name :</label>
	<div class="col-sm-7">
       <input type="text" class="form-control" name="ename"
        placeholder="Enter Employee Name" required>
      </div>
     </div>
     <br>
     <div class="form-group row">
	<label for="employeeSalary" class="col-sm-2 col-form-label">Employee Salary :</label>
	<div class="col-sm-7">
       <input type="text" class="form-control" name="eSalary"
        placeholder="Enter Employee Salary" required>
      </div>
     </div>
     <br>
     <div class="form-group row">
	<label for="employeeId" class="col-sm-2 col-form-label">Employee DeptNo :</label>
	<div class="col-sm-7">
       <input type="text" class="form-control" name="deptNo"
        placeholder="Enter Employee Department Number" required>
      </div>
     </div>
     <br>
		<input type="submit" class="btn btn-primary" value="InsertEmployee" name="ems_button"/>
	</form>
	
</body>
</html>