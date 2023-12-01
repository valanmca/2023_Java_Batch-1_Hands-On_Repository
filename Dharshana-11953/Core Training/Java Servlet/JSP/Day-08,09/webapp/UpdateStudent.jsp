<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<br><br>
<h1><b>Update Student Details</b></h1>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.css" rel="stylesheet">
<style>
h1{
text-align: center;
color:blue;
}</style>
</head>
<body>
<br><br>
<form action="SMSController" method="post">

<table width="60%" align="center" class="table table-striped w-50" border="5" >
	<tr><td><b>Student Id</b></td><td><input type="number" placeholder="Student Id" name="StuId" required /></td></tr>
	<tr><td><b>Student Name</b></td><td><input type="text" placeholder="Student Name" name="StuName" required /></td></tr>
	<tr><td><b>Student Depart</b></td><td><input type="text" placeholder="Student Department" name="StuDepart" required /></td></tr>
	<tr><td colspan="2" align="center">
<input type="submit" name="sms_button" class="btn btn-outline-success" value="Update Student" /></td></tr>
</table>
</form>
</body>
</html>