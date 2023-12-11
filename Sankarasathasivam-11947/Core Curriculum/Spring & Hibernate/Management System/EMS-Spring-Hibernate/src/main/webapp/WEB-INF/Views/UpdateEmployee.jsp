<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="performUpdate" method="post">

<table width="60%" align="center">
	<tr><td>Employee Id</td><td><input type="number" name="id"/></td></tr>
	<tr><td>Employee Name</td><td><input type="text"/ name="name"></td></tr>
	<tr><td>Employee Salary</td><td><input type="number" name="salary"/></td></tr>
	<tr><td>Employee Dno</td><td><input type="number" name="dno"/></td></tr>
	<tr><td colspan="2" align="center"><input type="submit" value="UpdateEmployee"/></td></tr>
</table>

</form>
</body>
</html>