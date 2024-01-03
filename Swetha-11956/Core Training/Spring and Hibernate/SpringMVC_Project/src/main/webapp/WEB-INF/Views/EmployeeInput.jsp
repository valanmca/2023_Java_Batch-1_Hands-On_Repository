<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="AddEmployee">  <!-- redirect to AddEmployee requestMapping in MyController -->
<br>Enter Employee ID : <input type="text" name="id"/>
<br>Enter Employee Name : <input type="text" name="name"/>
<br>Enter Employee Salary : <input type="text" name="salary"/>
<br><input type="submit" value="Add Employee"/>
</form>

</body>
</html>