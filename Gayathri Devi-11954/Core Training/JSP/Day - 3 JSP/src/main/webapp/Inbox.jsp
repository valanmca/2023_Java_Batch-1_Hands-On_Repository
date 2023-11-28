<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- Using Session -->
<%-- 
<%
	String userName = request.getParameter("uname");
	out.println("<font color='red'<b>Welcome "+userName+" </b></font>");
	out.println("<br><b> "+userName+" Inbox page </b>");

	out.println("<br><b><a href='SentItem.jsp'>Click here to go to Sent Item Page</a></b>");
	
	session.setAttribute("userName", userName);
	
	
%>
 --%>
<!-- using Cookies -->

<%
	String userName = request.getParameter("uname");
	Cookie cookie =new Cookie("UserName",userName);
	response.addCookie(cookie);
	out.println("<font color='red'<b>Welcome "+userName+" </b></font>");
	out.println("<br><b> "+userName+" Inbox page </b>");

	out.println("<br><b><a href='SentItem.jsp'>Click here to go to Sent Item Page</a></b>");


%>
</body>
</html>