<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Teacher</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">

<style>
table {
	margin: 4%;
	position: absolute;
	margin-left: 20%;
	margin-top: 5%;
}

body {
	background-image:
		url("https://i0.wp.com/bbbslubbock.org/wp-content/uploads/2018/10/grey-background-for-site-for-website-1432015867.jpg?fit=1200%2C848&ssl=1&w=640");
	font-weight: bolder;
	color: white;
}

.card {
	background-image:
		url("https://png.pngtree.com/background/20210709/original/pngtree-school-season-welcome-new-students-blackboard-hand-painted-picture-image_923634.jpg");
	font-weight: bolder;
	color: white;
}

form {position-absolute;
	margin-left: 20%
}
</style>
<script>
	function validate() {
		var name = "^[A-Z a-z]+$";

		var pass = "[0-9]+$";

		var tid = document.getElementById("id").value;
		var tname = document.getElementById("name").value;
		var temail = document.getElementById("email").value;
		var ttqualification = document.getElementById("qual").value;
		var tlocation = document.getElementById("location").value;
<%--   Rno validation--%>
	if (tid == null || tid == "") {
			alert("ID cannot be blank");
			return false;

		} else if (!tid.match(pass)) {
			alert("Enter valid ID");
			return false;

		}
<%--   name validation--%>
	if (tname == null || tname == "") {
			alert("Name cannot be blank");
			return false;

		} else if (!tname.match(name)) {
			alert("Enter valid Name");
			return false;

		}
<%--   Qualification validation--%>
	if (tqualification == null || tqualification == "") {
			alert(" Qualification cannot be blank");
			return false;

		} else if (!tqualification.match(name)) {
			alert("Enter valid Qualification");
			return false;

		}
<%--   LOcation validation--%>
	if (tlocation == null || tlocation == "") {
			alert(" Location cannot be blank");
			return false;

		} else if (!tlocation.match(name)) {
			alert("Enter valid location");
			return false;

		}

	}
</script>


</head>
<body>
	<br>
	<br>
	<div class="container">

		<div class="card">
			<br>
			<center>
				<h2>Update Teacher</h2>
			</center>
			<div class="card-body">
				<form action="PerformUpdate" method="post">
					<div class="form-group row">
						<label for="teacherid" class="col-sm-2 col-form-label">Teacher
							ID:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="id" id="id"
								placeholder="Enter teacher ID">
						</div>
					</div>
					<br>
					<div class="form-group row">
						<label for="teacherName" class="col-sm-2 col-form-label">Teacher
							Name :</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="name" id="name"
								placeholder="Enter teacher name">
						</div>
					</div>
					<br>
					<div class="form-group row">
						<label for="teacheremail" class="col-sm-2 col-form-label">Teacher
							Email:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="email" id="email"
								placeholder="Enter teacher @email">
						</div>
					</div>
					<br>
					<div class="form-group row">
						<label for="teacherqualification" class="col-sm-2 col-form-label">Teacher
							Qualification:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="qualification"
								id="qual" placeholder="Enter teacher qualification">
						</div>
					</div>
					<br>
					<div class="form-group row">
						<label for="teacherLocation" class="col-sm-2 col-form-label">Teacher
							Location:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="location"
								id="location" placeholder="Enter teacher location">
						</div>
					</div>
					<br> <br>


				</form>
				<center>
					<input type="submit" class="btn btn-light" value="UpdateTeacher"
						onclick="validate()" />
				</center>
</body>
</html>