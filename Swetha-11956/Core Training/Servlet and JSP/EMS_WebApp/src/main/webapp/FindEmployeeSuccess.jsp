<%@page import="com.ems.bean.Employee"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ include file="FindEmployee.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Employee Success</title>
</head>
<body>
	<%
	Employee bean = (Employee) request.getAttribute("bean");
	out.println("<table width='60%' align='center'>");
	out.println("<tr> <th>Employee Id </th> <th>Employee Name</th> <th>Employee salary</th> <th>Employee dno</th> </tr>");
	if (bean != null) {
		out.println("<tr> <th>" + bean.getId() + "</th> <th>" + bean.getName() + "</th> <th>" + bean.getSalary()
		+ "</th> <th>" + bean.getDno() + "</th> </tr>");
	}
	out.println("</table>");
	%>
</body>
</html>