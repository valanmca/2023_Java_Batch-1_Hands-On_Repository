<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
.mb-3 {
	width: 50%;
	padding-left: 19%;
	padding-top: 2%;
}

.delete {
	padding-left: 30%;
}

body {
	background-image:
		url("");
	background-repeat:no-repeat;
	background-attachment: fixed;
	background-size:100%,100%;
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

	<div class="container">
		<br> <br>
		<div class="card">
			<div class="card-body">
				<form action="PerformDelete" method="post">
					<div class="form-group row">
						<label for="VehicleId" class="col-sm-4 col-form-label">Enter
							Vehicle Id </label>
						<div class="col-sm-6">

							<select name="vId">
								<c:forEach items="${idList}" var="a">

									<option>${a}</option>
								</c:forEach>
							</select> <br> <br> <input class="btn btn-primary" type="submit"
								value="Delete Vehicle"/>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>


</body>
</html>