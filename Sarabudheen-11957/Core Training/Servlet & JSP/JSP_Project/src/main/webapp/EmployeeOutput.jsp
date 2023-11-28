<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="obj" class="com.jsp.bean.Employee"></jsp:useBean>
	<jsp:setProperty property="*" name="obj" />

	<br>Employee ID :
	<jsp:getProperty property="employeeId" name="obj" />
	<br>Employee Name :
	<jsp:getProperty property="employeeName" name="obj" />
	<br>Employee Department :
	<jsp:getProperty property="employeeDept" name="obj" />
	<br>Employee Salary :
	<jsp:getProperty property="employeeSalary" name="obj" />

</body>
</html>