 
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>	
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
.cardr {
	margin: 10px auto;
}
</style>
</head>
<body class="bg-light">
	<div class="container p-4">
		<div class="row">
			<div class="col-md-6   cardr ">
				<div class="card">
					<div class="card-body card-center ">
						<p class="fs-3 text-center">Update Employee Record</p>
						<form action="PerformUpdate" method="Post">
							<div class="mb-1">
								<label class="form-label">Employee ID</label> <input type="text"
									name="id"  class="form-control" >
							</div>
							<div class="mb-1">
								<label class="form-label">Employee Name</label> <input
									type="text" name="name"   class="form-control" >
							</div>
							<div class="mb-1 ">
								<label class="form-label">Employee Salary</label> <input
									type="text" name="salary"  class="form-control"  >
							</div>	
							<input type="submit" value="UpdateEmployee"
								class="btn btn-primary col-md-12"  name="ems button">
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>