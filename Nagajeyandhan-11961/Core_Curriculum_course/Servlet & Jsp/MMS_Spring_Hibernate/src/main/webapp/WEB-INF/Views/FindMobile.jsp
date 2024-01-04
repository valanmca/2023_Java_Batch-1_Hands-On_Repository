<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

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

body {
	background: linear-gradient(90deg, rgba(2, 0, 36, 1) 0%,
		rgba(75, 14, 154, 1) 35%, rgba(0, 212, 255, 1) 100%);
	font-family: 'poppins', sans-serif;
}

form {
	width: 24%;
	background-color: white;
	padding: 50px;
	border-radius: 20px;
	margin-top: 100px;
}

.btn-primary {
	width: 100%;
	border: none;
	border-radius: 50px;
	background: linear-gradient(90deg, rgba(2, 0, 36, 1) 0%,
		rgba(75, 14, 154, 1) 35%, rgba(0, 212, 255, 1) 100%);
}



.form-label {
	font-family: 800 !important;
}

h4 {
	font-size: 2rem !important;
	font-weight: 700;
}

@media only screen and (max-width:500px) {
	form {
		width: 100%;
	}
}
</style>
</head>
<body>
	<div class="container-fluid responsive">
		<form class="mx-auto" action="performFind" method="post">
			<h4 class="text-center">Find</h4>
			<div class="form-floating mb-3 mt-5">
				Enter Mobile Id<select class="form-select form-select-sm" name="mobileID">
				
					<c:forEach items="${idList}" var="mobileID">
						<option>${mobileID}</option>
					</c:forEach>
				</select>
			</div>
				<button type="submit" class="btn btn-primary mt-4" >Find Mobile</button>
			</form>
		</div>
</body>
</html>