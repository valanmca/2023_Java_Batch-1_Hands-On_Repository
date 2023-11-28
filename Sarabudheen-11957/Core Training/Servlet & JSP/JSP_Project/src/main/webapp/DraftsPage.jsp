<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Drafts Page</title>
</head>
<body>
	<%
	// Reading userName from the session
	//String userName = session.getAttribute("userName").toString();

	//Reading userName from the cookie
	Cookie cookie[] = request.getCookies();
	String userName = cookie[0].getValue().toString();
	
	out.println("<font color='red'><b>Welcome " + userName + "</b></font>");
	out.println("<br><b> " + userName + " </b>Drafts Item Page");
	%>

</body>
</html>