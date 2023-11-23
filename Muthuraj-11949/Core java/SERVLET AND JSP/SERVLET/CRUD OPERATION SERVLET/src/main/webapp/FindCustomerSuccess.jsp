<%@page import="com.cus.bean.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="FindCustomer.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<br>
	<%
	// scriptlog tag
	Customer bean = (Customer) request.getAttribute("bean");
	if (bean != null) {
	out.println("<table width='60%' align='center'>");
	out.println("<tr><th>Customer Id</th><th>Customer Name</th><th>Customer Email</th><th>Customer Contact</th><th>Customer Location</th></tr>");
	out.println("<tr><th>" + bean.getId() + "</th><th>" + bean.getName() + "</th><th>" + bean.getEmail() + "</th><th>"
		+ bean.getConNmuber() + "</th><th>" + bean.getLocation() + "</th></tr>");
		out.println("</table>");
	}
%>
</body>
</html>