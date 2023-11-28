<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
th{
text-align : left;}
</style>
</head>
<body>
<form action="EmsControllerServlet" method="post"><!-- url pattern of the servlet -->
<table width="40%" align="center">
<tr><th>Employee ID</th><td><input type="text" name="eid" /></td></tr>
<tr><th>Employee Name</th><td><input type="text" name="ename" /></td></tr>
<tr><th>Employee Department</th><td><input type="text" name="edept" /></td></tr>
<tr><th>Employee Salary</th><td><input type="number" name="esalary" /></td></tr>
<tr><td colspan="2" align="center"><input type="submit" value="Update Employee" name="ems_button" /></td></tr>
</table>
</form>
</body>
</html>