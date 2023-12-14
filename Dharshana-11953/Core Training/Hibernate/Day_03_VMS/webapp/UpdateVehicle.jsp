<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<br><br>
<h1><b>Update Vehicle Details</b></h1>

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
<form action="VMSController" method="post">

<table width="60%" align="center" class="table table-striped w-50" border="5" >
	<tr><td><b>Vehicle Id</b></td><td><input type="number" placeholder="Vehicle Id" name="VecId" required /></td></tr>
	<tr><td><b>Vehicle Name</b></td><td><input type="text" placeholder="Vehicle Name" name="VecName" required /></td></tr>
	<tr><td><b>Vehicle No</b></td><td><input type="number" placeholder="Vehicle No" name="VecNo" required /></td></tr>
	<tr><td><b>Vehicle Owner</b></td><td><input type="text" placeholder="Vehicle Owner" name="VecOwner" required /></td></tr>
	<tr><td colspan="2" align="center">
<input type="submit" name="vms_button" class="btn btn-outline-success" value="Update Vehicle" /></td></tr>
</table>
</form>
</body>
</html>