<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="PerformUpdate" method="post">

<table width="60%" align="center">
	<tr><td>Employee Id</td><td><input type="number" name="id"/></td></tr>
	<tr><td>Employee Name</td><td><input type="text" name="name"></td></tr>
	<tr><td>Employee Company</td><td><input type="text" name="company"/></td></tr>
	<tr><td>Employee Role</td><td><input type="text" name="role"/></td></tr>
	<tr><td colspan="2" align="center"><input type="submit" value="UpdateEmployee"/></td></tr>
</table>

</form>
</body>
</html>