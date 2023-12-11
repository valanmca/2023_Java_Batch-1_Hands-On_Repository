<%@page import="com.ems.bean.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="FindStudent.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	Student bean = (Student) request.getAttribute("bean");
		
		if (bean != null) {
			out.println("<table width='60%' align='center'>");
			out.println("<tr><th>Student Id</th><th>Student Name</th><th>Student Section</th></tr>");
			out.println("<tr><th>" + bean.getStd_id() + "</th><th>" + bean.getStd_name() + "</th><th>" + bean.getStd_sec()
			+ "</th></tr>");
			out.println("</table>");
		}
		else{
			out.println("<font color='red'>Record Not Found</font>");
		}
	%>
</body>
</html>