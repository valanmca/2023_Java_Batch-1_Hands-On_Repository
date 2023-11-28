<%@page import="com.mms.bean.Movies"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="FindMovie.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Movie Success</title>
</head>
<body>

	<br>
	<%
	Movies bean =(Movies)request.getAttribute("bean");
	out.println("<table width='60%' align='center'>");
	if (bean != null) {
		out.println(
		"<tr><th>Movie Id</th> <th> Movie Name</th> <th> Movie Type</th> <th> Movie Language</th> <th> Movie Duration</th>");

		out.println(
		"<tr><th>" + bean.getMovie_Id() + "</th><th>" + bean.getMovie_Name() + "</th><th>" + bean.getMovie_Type()
				+ "</th> <th>" + bean.getMovie_Language() + "</th><th>" + bean.getMovie_Duration() + "</th></tr>");
	}

	else {
		out.println("<center><b><font color='red' >Movie not found!!!</font></b></center>");
	}
	out.println("</table>");
	%>

</body>
</html>