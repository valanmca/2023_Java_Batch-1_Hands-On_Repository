<%@page import="com.ems.bean.Employee" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ include file="FindEmployee.jsp" %> 
    
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href ="css/bootstrap.css">
<style>
	.show{
		padding-left:10%;
		padding-right:10%;
		width: 100%;
	}
	th{
		background-color: #4bc970;
	}
</style>
</head>
<body>

<%
	out.print("<div class='show'>");
	Employee bean = (Employee)request.getAttribute("bean");
	out.println("<table width = '80%' align ='center' class='table table-striped'>");
	out.println("<tr class='table-success'><th>Employee Id</th><th>Employee Name</th><th>Employee Salary</th><th>Employee DNO</th></tr>");
	if(bean !=null){
		out.println("<tr><th>"+bean.getId()+"</th><th>"+bean.getName()+"</th><th>"+bean.getSalary()+"<th>"+bean.getDno()+"</th></th><tr>");
	}
	out.println("</table>");
	out.println("</div>");
%>

</body>
</html>