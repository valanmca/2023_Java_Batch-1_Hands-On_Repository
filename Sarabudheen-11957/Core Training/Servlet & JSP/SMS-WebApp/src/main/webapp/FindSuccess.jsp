<%@page import="com.sms.bean.Students"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="FindStudent.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Success Page</title>
</head>
<body>

	<br>
	<%
	Students bean =(Students)request.getAttribute("bean");
	out.println("<table width='60%' align='center'>");
	if (bean != null) {
		out.println(
		"<tr><th>Student Id</th> <th> Student Name</th>");

		out.println(
		"<tr><th>" + bean.getStudentId() + "</th><th>" + bean.getStudentName());
	}

	else {
		out.println("<center><b><font color='red' >Movie not found!!!</font></b></center>");
	}
	out.println("</table>");
	%>
</body>
</html>