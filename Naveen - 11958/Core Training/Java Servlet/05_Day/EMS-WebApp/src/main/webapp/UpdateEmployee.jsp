<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="EMSController" method="post">
<table width="60%" align="center">
	<tr><td>Employee Id</td><td><input type="text" name="eid"/></td></tr>
	<tr><td>Employee Name</td><td><input type="text" name="ename"/></td></tr>
	<tr><td>Employee Salary</td><td><input type="text" name="esalary"/></td></tr>
	<tr><td></td><td><input type="submit" value="Update Employee"  name="ems_button"/></td></tr>
</table></form>

</body>
</html>