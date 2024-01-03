<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee output</title>
</head>
<body>
<%--   id- Creating object of bean class .(obj) is object of employee bean class 
 *-> Initialize all the properties(id,name,salary)
-> useBean -> to locate and create obj for bean

 --%>

<jsp:useBean id="obj" class="com.jsp.action.Employee"></jsp:useBean> 
<jsp:setProperty name="obj" property="*"/>

<br> Employee Id: <jsp:getProperty property="id" name="obj"/>
<br> Employee Name: <jsp:getProperty property="name" name="obj"/>
<br> Employee Salary: <jsp:getProperty property="salary" name="obj"/>

</body>
</html>