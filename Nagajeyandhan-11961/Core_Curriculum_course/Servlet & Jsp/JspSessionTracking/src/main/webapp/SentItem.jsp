<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	Cookie cookies[] = request.getCookies();
	String userName = cookies[0].getValue().toString();
	out.println("<font color='red'><b> Welcome "+userName+"</b></font>");
	out.println("</br><b> "+userName+" Sent item page </b>");
	
%>
</body>
</html>