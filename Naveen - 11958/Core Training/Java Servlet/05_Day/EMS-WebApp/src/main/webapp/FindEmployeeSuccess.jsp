<%@page import="com.ems.bean.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ include file="FindEmployee.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
	td{
		text-align: center;
	}
</style>
</head>
<body>
<%
	Employee emp = (Employee) request.getAttribute("emp");
	out.println("<table width='60%' align='center'>");
	out.println("<tr><th>Employee Id</th><th>Employee Name</th><th>Employee Salary</th></tr>");
	if(emp != null){
	out.println("<tr><td>"+emp.getId()+"</td><td>"+emp.getName()+"</td><td>"+emp.getSalary()+"</td></tr>");
	}
	out.println("</table>");
%>
</body>
</html>