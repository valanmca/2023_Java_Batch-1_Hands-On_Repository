<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inbox Page</title>
</head>
<body>

	<%
	String userName = request.getParameter("uname");
	out.println("<font color='red'><b>Welcome " + userName + "</b></font>");
	out.println("<br><b> " + userName + " </b>Inbox Page ");

	out.println("<br><b> <a href='SentItemPage.jsp'>Click here to go to Sent Items Page</a></b>");

	//Writing user data into the session
	//session.setAttribute("userName", userName);
	
	//Writing user data into the cookie
	Cookie cookie = new Cookie("UserName",userName);
	response.addCookie(cookie);
	%>
</body>
</html>