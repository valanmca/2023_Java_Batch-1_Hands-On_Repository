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
 String UserName = request.getParameter("uname");
out.println("<font color='red'><b>Welcome "+ UserName + "</b></font>" );
out.println("<br><b> " + UserName + " Inbox Page </b>");
out.println("<br><b> <a href='SentItem.jsp'>Click here to go to Sent Items Page</a></b>");
Cookie cookie = new Cookie("UserName",UserName);
response.addCookie(cookie);
%>
</body>
</html>