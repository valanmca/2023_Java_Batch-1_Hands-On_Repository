<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sent Item Page</title>
</head>
<body>
	<%
	//Reading userName from the session
	//String userName = session.getAttribute("userName").toString();

	//Reading userName from the cookie
	Cookie cookie[] = request.getCookies();
	String userName = cookie[0].getValue().toString();

	out.println("<font color='red'><b>Welcome " + userName + "</b></font>");
	out.println("<br><b> " + userName + " </b>Sent Item Page");

	out.println("<br><b> <a href='DraftsPage.jsp'>Click here to go to Drafts Items Page</a></b>");
	session.setAttribute("UserName", userName);
	%>

</body>
</html>