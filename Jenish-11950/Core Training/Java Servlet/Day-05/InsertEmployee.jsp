<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
<form action="EMSController" method="post">
<table width="60%" align="center">
	<tr><td><b>Employe Id</b></td><td><input type="number" name="empId"/></td></tr>
	<tr><td><b>Employe Name</b></td><td><input type="text" name="empName"/></td></tr>
	<tr><td><b>Employe Salary</b></td><td><input type="number" name="empSalary"/></td></tr>
	<tr><td colspan="2" align ="center"><input type="submit" value="Insert Employee" name="ems_button"/></td></tr>
</table>
</form>
</body>
</html>