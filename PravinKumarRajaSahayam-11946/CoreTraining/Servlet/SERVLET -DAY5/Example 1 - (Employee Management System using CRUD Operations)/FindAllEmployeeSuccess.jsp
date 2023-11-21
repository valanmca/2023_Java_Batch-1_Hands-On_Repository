    <%@ page import ="java.util.List"%>
    <%@ page import ="java.io.File.*"%>;
<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*"%>
<%@ page import ="java.util.ArrayList.*"%>
<%@ page import ="java.io.*"%>;
<%@page import="com.ems.bean.Employee" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="FindAllEmployee.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.u , tr{
  border: 1px solid black;
  border-collapse: collapse;
}
</style>
</head>
<body>
<%
List<Employee> lists=(List<Employee>) request.getAttribute("lists"); 
out.println("<table width='60%' align='center' class='u'>");
out.println("<tr><th>Employee Id</th><th>Employee Name</th><th>Employee Department</th></tr>");
for (Employee e: lists) {
	out.println("<tr><th>" + e.getEmployee_id() + "</th><th>" + e.getEmployee_name() + "</th><th>" + e.getEmployee_department() + "</th></tr>");
}
out.println("</table>");
%>


</body>
</html>