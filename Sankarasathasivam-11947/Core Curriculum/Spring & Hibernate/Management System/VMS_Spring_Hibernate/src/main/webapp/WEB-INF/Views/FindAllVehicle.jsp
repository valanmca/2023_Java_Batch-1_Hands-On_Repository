<%@ page import="com.vms.bean.Vehicle"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find All</title>
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
		<br>
		<h3 align="center">
			<b>Find All Vehicles</b>
		</h3>
		<br>
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
							<c:forEach var="d" items="${idList}">
								<tr>
									<td>${d.getNo()}</td>
									<td>${d.getBrand()}</td>
									<td>${d.getMileage()}</td>

								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>

</body>
</html>
