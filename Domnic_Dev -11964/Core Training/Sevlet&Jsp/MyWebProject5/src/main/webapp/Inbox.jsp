<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inbox</title>
</head>
<body>
	<%-- Session	<%
	String userName = request.getParameter("uname");
	out.println("<font color='red'><b>Welcome " + userName + "</b></font>");
	out.println("<br><b>" + userName + "Inbox page </b>");

	out.println("<br><b><a href='SentItem.jsp'>Click here to go to sent items page</a></b>");

	session.setAttribute("userName", userName);
	%>--%>

	<%--Cookie --%>
	<%
	String userName = request.getParameter("uname");
	out.println("<font color='red'><b>Welcome " + userName + "</b></font>");
	out.println("<br><b>" + userName + "Inbox page </b>");
	out.println("<br><b><a href='SentItem.jsp'>Click here to go to sent items page</a></b>");
	Cookie cookie = new Cookie("UserName", userName);
	response.addCookie(cookie);
	%>
</body>
</html>