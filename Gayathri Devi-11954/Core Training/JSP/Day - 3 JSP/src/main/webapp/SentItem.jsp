<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-- 

<%
	String userName = session.getAttribute("userName").toString();
out.println("<font color='blue'><b>Welcome "+userName+"</b></font>");
out.println("<br><font color='blue'><b>"+userName+"Sent Item page </b>");
%>

 --%>
<% 
 Cookie cookie[] = request.getCookies();
 String userName = cookie[0].getValue().toString();
 
  out.println("<font color='blue'><b>Welcome " +userName+ "</b></font>");
  out.println("<br><font color='blue'><b>"+userName+"Sent Item page </b></font>");
%>
 
</body>
</html>