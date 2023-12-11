<%@page import="com.ems.bean.Employee" %>
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
	Employee bean = (Employee) request.getAttribute("bean");
	out.println("<table width='60%' align='center'>");
	out.println("<tr><th>Employee Id</th><th>Employee name</th><th>Employee Salary</th><th>Employee Dep no</th></tr>");
	if(bean !=null){
	out.println("<tr><th>"+bean.getId()+"</th><th>"+bean.getEname()+"</th><th>"+bean.getSalary()+"</th><th>"+bean.getDepno()+"</th></tr>");
	}
	out.println("</table>");
%>
</body>
</html>