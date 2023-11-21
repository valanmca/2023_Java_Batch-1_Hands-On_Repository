<%@page import="com.ems.bean.Employee" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="FindEmployee.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.p ,th
{
border: 1px solid black;
  border-collapse: collapse;
}
</style>
</head>
<body>

<%
Employee bean = (Employee) request.getAttribute("bean");
out.println("<table width='60%' align='center' class='p'>");
if(bean != null)
{
	out.println("<tr><th>Employee Id</th><th>Employee Name</th><th>Employee Department</th></tr>");
out.println("<tr><th>" + bean.getEmployee_id() + "</th><th>" + bean.getEmployee_name() + "</th><th>" + bean.getEmployee_department() + "</th></tr>");
}
if(bean == null)
{
	out.println("<p align='center' color='red'><b>Employee Id is Not Found</p>");
}
out.println("</table>");
%>
</body>
</html>