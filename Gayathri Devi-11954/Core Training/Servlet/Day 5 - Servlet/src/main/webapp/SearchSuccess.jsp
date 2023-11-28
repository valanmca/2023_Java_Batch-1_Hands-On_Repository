<%@page import="com.ems.bean.EmployeeBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="SearchEmployee.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	EmployeeBean bean = (EmployeeBean) request.getAttribute("bean");
if(bean != null){
	out.println("<h1 align='center'><font color='green'>Record Searched Successfully !.</font></h1>'");
	out.println("<table width='60%' align='center'>");
	out.println("<tr><th>Employee ID</th><th>Employee Name</th><th>Employee Department</th><th>Employee Salary</th></tr>");
	out.println("<tr><td>"+bean.geteId()+"</td><td>"+bean.geteName()+"</td><td>"+bean.geteDept()+"</td><td>"+bean.geteSalary()+"</td></tr>");
	out.println("</table>");
}
else{
	out.println("<h1 align='center'><font color='green'>Record not available in the database.</font></h1>");
}
	
%>

</body>
</html>

<%-- 

@ include - include a file/resources
@page - import page
@tag -  add tag - to create a own tag in jsp
<% %> - Script tag - write any business logic
<%= %> = Expression tag --%>