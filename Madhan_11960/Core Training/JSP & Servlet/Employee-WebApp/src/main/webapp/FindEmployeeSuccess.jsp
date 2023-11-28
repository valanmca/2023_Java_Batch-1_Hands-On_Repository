<%@page import="com.bean.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
  
<%@include file="FindEmployee.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
<%
out.print("<div class='show'>");
Employee bean=(Employee) request.getAttribute("bean");
out.println("<table width = '80%' align ='center' class='table table-striped'>");
out.println("<tr class='table-success'><th>Employee Id</th><th>Employee Name</th><th>Employee Salary</th></tr>");
if(bean!=null){
	out.println("<tr><th>"+bean.getId()+"</th><th>"+bean.getName()+"</th><th>"+bean.getSalary()+"<th><tr>");
}
out.println("</table>");
out.println("</div>");
%>
</body>
</html>
</head>
<body>


