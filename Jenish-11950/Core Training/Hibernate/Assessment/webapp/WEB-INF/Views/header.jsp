<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
<style>
.navbar {
	background-color: DarkOrange;
	height: 60px;
}

.navbar-brand {
	color: black;
	font-weight: bold;
}

.nav-item {
	font-weight: bold;
}
</style>
</head>
<body>
	<nav class="navbar navbar-expand-sm navbar">
		<div class="container-fluid">

			<a class="navbar-brand" href="javascript:void(0)">Customer
				Management System</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#mynavbar">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="mynavbar">
				<ul class="navbar-nav me-auto">
					<li class="nav-item"><a class="nav-link" href="right"
						target="content">HOME</a></li>
					<li class="nav-item"><a class="nav-link" href="InsertCustomer"
						target="content">ADD DETAILS</a></li>
					<li class="nav-item"><a class="nav-link"
						href="FindAllCustomer" target="content">VIEW ALL</a></li>

				</ul>
				<form class="d-flex" role="search">
					<input class="form-control me-2" type="search" placeholder="Search"
						aria-label="Search">
					<button class="btn btn-success" type="submit">Search</button>
				</form>
				&nbsp;&nbsp;&nbsp;
				<form class="d-flex">

					<a href="#" class="btn btn-dark"> <span
						class="glyphicon glyphicon-user"></span> Logout
					</a>

				</form>
			</div>
		</div>
	</nav>
</body>
</html>