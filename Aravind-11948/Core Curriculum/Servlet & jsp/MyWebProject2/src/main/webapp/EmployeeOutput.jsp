<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj" class="com.bean.Employee"></jsp:useBean>
<jsp:setProperty name="obj"   property="*"/>
<br> Employee Id:<jsp:getProperty property="id" name="obj"/>
<br> Employee Name:<jsp:getProperty property="name" name="obj"/>
<br> Employee Salary:<jsp:getProperty property="salary" name="obj"/>

</body>
</html>