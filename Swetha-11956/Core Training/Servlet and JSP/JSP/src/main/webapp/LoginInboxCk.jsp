<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-- Using cookie --%>

<%

 String userName =request.getParameter("uname");

 Cookie ck=new Cookie("userName",userName);
 response.addCookie(ck);
 
 out.println("<font color='red'><b>Welcome"+userName+"</b></font>");
 out.println("<br><b> "+userName+" Inbox page<b/>");
 
 out.println("<br><b> <a href='LoginSentCk.jsp'>Click here to go to sent item page</a><b/>");

 	
 	
%>


</body>
</html>