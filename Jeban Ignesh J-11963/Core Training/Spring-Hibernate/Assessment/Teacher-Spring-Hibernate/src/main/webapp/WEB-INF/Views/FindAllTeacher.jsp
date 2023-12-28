<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Alll Teachers</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<style>


body {
	background-image:
		url("https://t4.ftcdn.net/jpg/03/04/23/95/360_F_304239563_w8FOe3dMV9wgzxF9kGqGqIYpSfkljovW.jpg");
	font-weight: bolder;
	color: white;
}

.card {
	background-image:
		url("https://png.pngtree.com/background/20210709/original/pngtree-school-season-welcome-new-students-blackboard-hand-painted-picture-image_923634.jpg");
	font-weight: bolder;
	color: white; position-absolute;
	margin-top: 10%
}

form {position-absolute;
	margin-left: 20%
}


</style>
</head>
<body>
	<br>
	<br>
	<div class="container">

		<div class="card">
			<br>
			<center>
				<h2>Teacher's Detail's</h2>
			</center>

			<table class="table table-striped table-hover" align="center" >
				<thead align="center">
					<tr scope="row">
						<th>Teacher Id</th>
						<th>Teacher Name</th>
						<th>Teacher Email</th>
						<th>Teacher Qualification</th>
						<th>Teacher Location</th>
					</tr>
				</thead>
				<c:forEach items="${idList}" var="a">
					<tbody>
						<tr scope="row" align="center">
							<td scope="col">${a.getId()}</td>
							<td scope="col">${a.getName()}</td>
							<td scope="col">${a.getEmail()}</td>
							<td scope="col">${a.getQualification()}</td>
							<td scope="col">${a.getLocation()}</td>

						</tr>
					</tbody>
				</c:forEach>
			</table>
			<div class="card-body">
</body>
</html>