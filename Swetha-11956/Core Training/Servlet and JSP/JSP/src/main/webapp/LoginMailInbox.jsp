<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-- //using session  --%>
<%
 String userName =request.getParameter("uname");
 out.println("<font color='red'><b>Welcome"+userName+"</b></font>");
 out.println("<br><b> "+userName+" Inbox page<b/>");
 
 out.println("<br><b> <a href='LoginMailSent.jsp'>Click here to go to sent item page</a><b/>");

 	// Iniatializing hte session in jsp
 	
 	session.setAttribute("userName",userName);
 	
%>
</body>
</html>