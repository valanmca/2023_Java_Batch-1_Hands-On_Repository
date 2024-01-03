<%@page import="com.sms.bean.Student"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ include file="FindStudent.jsp"%>
<link rel="stylesheet" href="css/bootstrap.css">
<!DOCTYPE html>
<html>
<head>
<style>

</style>
<meta charset="ISO-8859-1">
<title>Find Student Success</title>
</head>
<body>
	<%
	Student bean = (Student) request.getAttribute("bean");
	out.println("<table  width='60%' align='center'>");
	out.println("<tr style='background-color:grey; color:white; text-align:center'> <th>Student rno </th> <th>Student Name</th>  <th>Student dept</th> </tr>");
	if (bean != null) {
		out.println("<tr style='background-color:lightgrey;text-align:center'> <th>" + bean.getRno() + "</th> <th>" + bean.getName() + "</th> <th>" + bean.getDept()
		+ "</th> </tr>");
	}
	out.println("</table>");
	%>
</body>
</html>