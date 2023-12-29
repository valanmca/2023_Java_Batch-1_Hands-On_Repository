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
	String userName = request.getParameter("uname");
	out.println("<font color ='red'><b>Welcome"+userName+"</b></font>");
	out.println("<br><b>Sent Inbox.jsp page</b>");
	out.println("<br><b><a href ='SentItem.jsp'>Click Here to go to Sent Item Page</a></b>");

	session.setAttribute("userName", userName);
	Cookie cookie = new Cookie("userName", userName);
	response.addCookie(cookie);
	
%>
</body>
</html>