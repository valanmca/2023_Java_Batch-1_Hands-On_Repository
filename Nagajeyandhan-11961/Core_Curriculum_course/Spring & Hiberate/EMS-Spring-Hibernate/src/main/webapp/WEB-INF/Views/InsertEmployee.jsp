<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>Index Page</title>
<style>
* {
	padding: 0;
	margin: 0;
	box-sizing: border-box;
}
body{
	background:linear-gradient(90deg, rgba(2,0,36,1)0%, rgba(75,14,154,1)35%, rgba(0,212,255,1)100%);
	font-family:'poppins',sans-serif;
}
form{
	width:24%;
	background-color:white;
	padding:50px;
	border-radius:20px;
	margin-top:150px;
}
.btn-primary{
	width:100%;
	border:none;
	border-radius:50px;
	background:linear-gradient(90deg, rgba(2,0,36,1)0%, rgba(75,14,154,1)35%, rgba(0,212,255,1)100%);
}
.form-control{
	color:rgba(0,0,0,87);
	border-bottom-color:rgba(0,0,0,.47);
	box-shadow:none !important;
	border:none;
	border-bottom: 1px solid black;
	border-radius: 4px 4px 0 0;
}
.form-label{
	font-family:800 !important;
}
h4{
	font-size:2rem !important;
	font-weight:700;
}

@media only screen and (max-width:500px){
	form{
	width:100%;
	}
}
</style>
</head>
<body>
	<div class="container-fluid responsive">
		<form class="mx-auto"  action="performInsert" method="post">
		<h4 class="text-center">Insert</h4>
      <div class="form-floating mb-3 mt-5">
        <input type="number" class="form-control" name="id" id="eid">
        <label for="eid">Employee ID</label>
      </div>
      <div class="form-floating mb-3 mt-5">
        <input type="text" class="form-control" name="name" id="ename">
        <label for="ename">Employee Name</label>
      </div>
      <div class="form-floating mb-3 mt-5">
        <input type="number" class="form-control" id="esalary">
        <label for="esalary">Employee Salary</label>
      </div>
			<button type="submit" value="InsertEmployee" class="btn btn-primary mt-4" >InsertEmployee</button>
		</form>
	</div>
</body>
</html>