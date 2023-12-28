<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
			<h2>Update Student</h2>
		</center>
		<div class="card">
			<div class="card-body">
				<form action="SMScontroller" method="post">
					<div class="form-group row">
						<label for="studentRno" class="col-sm-2 col-form-label">Student Roll No
							 :</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="srno"
								placeholder="Enter student rollno">
						</div>
					</div>
					<br>
					<div class="form-group row">
						<label for="studentName" class="col-sm-2 col-form-label">Student
							Name :</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="sname"
								placeholder="Enter student name">
						</div>
					</div>
					<br>
					<div class="form-group row">
						<label for="studentemail" class="col-sm-2 col-form-label">Student
							Email:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="semail"
								placeholder="Enter student @email">
						</div>
					</div>
					<br>
					<div class="form-group row">
						<label for="studentemsection" class="col-sm-2 col-form-label">Student
							Section:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="ssec"
								placeholder="Enter student section">
						</div>
					</div>
					<br>
					<div class="form-group row">
						<label for="studentLocation" class="col-sm-2 col-form-label">Student
							Location:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="sloc"
								placeholder="Enter student location">
						</div>
					</div>
					<br> <br><center>
						<input type="submit" class="btn btn-dark" value="Update Student"
							name="sms_button" />
					</center>
					
				</form>

</body>
</html>