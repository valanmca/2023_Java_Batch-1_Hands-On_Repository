<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Student</title>
<link rel="stylesheet" href="css/bootstrap.css">
<style>
table {
	margin: 4%;
	position: absolute;
	margin-left: 20%;
	margin-top: 5%;
}
</style>
</head>
<body>
	<br>
	<br>
	<div class="container">
		<center>
			<h2>Delete Student</h2>
		</center>
		<div class="card">
			<div class="card-body">
				<form action="SMScontroller" method="post">
					<div class="form-group row">
						<label for="studentRno" class="col-sm-2 col-form-label">Student
							Roll No :</label>
						<div class="col-sm-7">
							<select name="srno">
									<c:forEach items="${list}" var="a">
										<option><c:out value="${a.getRollNo()}" /></option>
									</c:forEach>
							</select>
						</div>
					</div>

					<br> <br>
					<center>
						<input type="submit" class="btn btn-dark" value="Delete Student"
							name="sms_button" />
					</center>

				</form>
</body>
</html>