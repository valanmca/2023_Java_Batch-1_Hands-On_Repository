<%@page import="com.ems.bean.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="FindEmployee.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
<% 
         Employee bean=(Employee) request.getAttribute("bean");
         if(bean!=null) {
         out.println("<table width='60%' align='center'>");
         out.println("<tr><th>Employee Id</th><th>Employee Name</th><th>Employee Salary</th><th>Employee Department</th></tr>");
         out.println("<tr><th>"+bean.getId()+"</th><th>"+bean.getName()+"</th><th>"+bean.getSalary()+"</th><th>"+bean.getDno()+"</th></tr>");
         out.println("</table>");
         } else {
        	 out.println("<font color='red'><p align='center'>Record not found</p></font>");
         }
        
         
%>
</body>
</html>