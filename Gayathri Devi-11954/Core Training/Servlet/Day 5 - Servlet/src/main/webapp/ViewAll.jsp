<%@page import="java.util.List"%>
<%@page import="com.ems.bean.EmployeeBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p align='center'><b>View All</b></p>
<%-- JSTL Iterate code to iterate collection --%>
         <table width='60%' align='center'>
         <tr><th>Employee Id</th><th>Employee Name</th><th>Employee Salary</th><th>Employee Department</th></tr>  
         <c:forEach items="${list}" var="a">
         <tr><td>${a.geteId()}</td><td>${a.geteName()}</td><td>${a.geteDept()}</td><td>${a.geteSalary()}</td></tr>
         </c:forEach>
         </table>
         

<%-- <% --%>
<!-- // List <EmployeeBean> list = (List<EmployeeBean>) request.getAttribute("list"); -->
<!-- // 	out.println("<table align='center'>"); -->
<!-- // 	out.println("<tr><th>Employee ID</th><th>Employee Name</th><th>Employee Department</th><th>Employee Salary</th></tr>"); -->
	
<!-- // 	for (EmployeeBean bean: list) { -->
<!-- // 	out.println("<tr><td>"+bean.geteId()+"</td><td>"+bean.geteName()+"</td><td>"+bean.geteDept()+"</td><td>"+bean.geteSalary()+"</td></tr>"); -->
<!-- // 	} -->
	
<%-- %> --%>

</body>
</html>

<%-- 

@ include - include a file/resources
@page - import page
@tag -  add tag - to create a own tag in jsp
<% %> - Script tag - write any business logic
<%= %> = Expression tag --%>