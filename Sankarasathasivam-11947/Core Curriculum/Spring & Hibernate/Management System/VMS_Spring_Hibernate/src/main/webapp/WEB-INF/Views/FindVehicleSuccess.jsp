<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ include file="FindVehicle.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Record Found</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet" />

<style>
body {
	
	font-family: Times New Roman;
	color: black;
}
</style>
</head>
<body>
	<div class="container" align="center">
		<br> <br>
		<div class="card" style="width: 50rem;">
			<div class="card-body">
				<div class="table table-bordered">
					<table class="table table-hover">
						<thead>
							<tr>
								<th scope="col">Vehicle Id</th>
								<th scope="col">Vehicle Brand</th>
								<th scope="col">Vehicle Mileage</th>

							</tr>
						</thead>
						<tbody>
							<tr>
								<td>${bean.getNo()}</td>
								<td>${bean.getBrand()}</td>
								<td>${bean.getMileage()}</td>

							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	<div class="col-md-6 offset-md-3 ">
		<br>
		<div class="alert alert-success" role="alert">
			<b><center>Record Found Successfully</center></b> 
		</div>
	</div>

</body>
</html>
