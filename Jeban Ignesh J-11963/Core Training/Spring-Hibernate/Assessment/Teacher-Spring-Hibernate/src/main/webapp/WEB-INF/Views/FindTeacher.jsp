<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Teacher</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<style>


body {
	background-image:
		url("https://png.pngtree.com/background/20210715/original/pngtree-gray-gradient-metal-rust-texture-background-picture-image_1311702.jpg");
	font-weight: bolder;
	color: white;
}

.card {
	background-image:
		url("https://png.pngtree.com/background/20210709/original/pngtree-school-season-welcome-new-students-blackboard-hand-painted-picture-image_923634.jpg");
	font-weight: bolder;
	color: white; 
	position-absolute;
	margin-top: 9%
	
}

select{
position-absolute;
width:20%;
}
</style>
</head>
<body>
	<br>
	<br>
	<div class="container">

		<div class="card"><br>
			<center>
				<h2>Find Teacher</h2>
			</center>
			<div class="card-body">
				<form action="PerformFind" method="post" >
				<label for="studentRno" class="col-sm-2 col-form-label"style="margin-left:45%;">Teacher
							ID</label> 
					<div class="form-group row" style="width:30%;margin-left:35%">
						
							<select name='rno'>

							<c:forEach items="${idList}" var="a">

								<option>${a}</option>
							</c:forEach>


						</select>
					</div><br><br>
					<center>
						<input type="submit" class="btn btn-light" value="FindTeacher" />
					</center>
				</form>
</body>
</html>