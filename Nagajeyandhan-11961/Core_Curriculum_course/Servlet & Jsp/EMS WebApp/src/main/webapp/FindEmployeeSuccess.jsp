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
	Employee bean =(Employee) request.getAttribute("bean");
	out.println("<table width='60%' align='center'>");
	
	if(bean!=null){
		out.println("<tr><th>Employee Id</th><th>Employee Name</th><th>Employee Salary</th>");
		out.println("<tr><th>"+bean.getEmp_id()+"</th><th>"+bean.getEname()+"</th><th>"+bean.getSalary()+"</th>");
	}else{
		out.println("<center><font color='red'><b>No Records found in that Id</b></font></center>");
	}
	out.println("</table>");
%>
</body>
</html>