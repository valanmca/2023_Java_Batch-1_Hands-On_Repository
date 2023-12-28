<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Student Details</title>
<link rel="stylesheet" href="css/bootstrap.css">
<style>

.input-group
{
width:60%;
margin-left:20%;
}
</style>
</head>
<body>
	<form action="SMScontroller" method="post" align="center">
		<br>
		<br>

		<div class="input-group flex-nowrap" >
			<span class="input-group-text">Student RollNo</span> <input
				type="text" class="form-control" placeholder="username" name="srno">
		</div>
		<br>
		<br>
		<div class="input-group flex-nowrap">
			<span class="input-group-text">Student Name</span> <input type="text"
				class="form-control" placeholder="name" name="sname">
		</div>
		<br>
		<br>
		<div class="input-group flex-nowrap">
			<span class="input-group-text">Student Email</span> <input
				type="text" class="form-control" placeholder="@email" name="semail">
		</div>
		<br>
		<br>
		<div class="input-group flex-nowrap">
			<span class="input-group-text">Student Section</span> <input
				type="text" class="form-control" placeholder="section" name="ssection">
		</div><br>
		<br>
		<div>
			<input type="submit" value="Insert Student" name="sms-button" >
		</div>

	</form>

</body>
</html>