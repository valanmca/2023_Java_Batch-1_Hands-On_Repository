<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Management System</title>
<style>
select {
	width: 180px;
	height: 40px;;
	border-radius: 20px;
}

h4 {
	font-family: "Times New Roman", Times, serif;
}

.container {
	position: absolute;
	top: 25%;
	left: 20%;
}


.card-body{
background-color: #427D9D;

}
label{
color:white;
font-family:"Times New Roman", Times, serif;
font-weight: bold;
font-size:large;
}
</style>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>

	<br>
	<br>
	<br>
	<h4 align="center">Delete Vehicle</h4>

	<div class="container">

		<div class="card" style="width: 35rem;">

			<div class="card-body">

				<form action="PerformDelete" method="post">


					<div class="form-group row">
						<label for=" id" class="col-sm-4 col-form-label">Vehicle
							Id </label>

						<div class="col-sm-8">
							<select name="id">
								<c:forEach items="${msg1}" var="a">

									<option><c:out value="${a}" /></option>

								</c:forEach>
							</select> <input type="submit" class="btn btn-primary" value="delete"
								name="button" />

						</div>
					</div>


				</form>
			</div>
		</div>
	</div>

</body>
</html>