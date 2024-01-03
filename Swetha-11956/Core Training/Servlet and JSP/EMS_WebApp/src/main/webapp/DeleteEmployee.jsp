<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Employee</title>

<link rel="stylesheet" href="css/bootstrap.css">

</head>
<body>
<form action="EMSController" method="post">
<table width="60%" align="center">
    <tr><td>Employee Id</td><td><input type="text" class="form-control mb-2 mr-sm-2" name="eid"/></td></tr>
    
    <tr><td><input type="submit" value="Delete Employee" class="btn btn-primary" name="ems_button"/></td></tr>
</table>
</form>
</body>
</html>