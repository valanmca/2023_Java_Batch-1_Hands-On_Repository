<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<style>
.mb-3 {
	width: 50%;
	padding-left: 19%;
	padding-top: 2%;
}

.find {
	padding-left: 30%;
}
</style>
</head>
<body>

	<form action="DmsController" method="post">
		<div class="mb-3">
			<input placeholder="Doctor ID" type="text" class="form-control"
				name="did">
		</div>
     <div class="find">
		<button type="submit" class="btn btn-primary" value="Find Doctor"
			name="dms_button">Find</button>
	</div>
	</form>
	

	</form>
</body>
</html>