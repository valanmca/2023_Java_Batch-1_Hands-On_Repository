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
	String userName=request.getParameter("uname"); //act as a local variable inside service
	out.println("<font color='red'><b>Welcome "+ userName +"</b></font>");
	out.println("<br><b>"+userName+"Inbox Page  </b>");
	
	out.println("<br><b> <a href='SentItem.jsp'>Click here to go to Sent Item page </a></b>");
	
	session.setAttribute("userName",userName);
%>
</body>
</html>