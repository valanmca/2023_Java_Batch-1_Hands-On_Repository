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
Cookie cookie[] = request.getCookies();
 String UserName = cookie[1].getValue().toString();
out.println("<font color='red'><b>Welcome "+ UserName + "</b></font>" );
out.println("<br><b> " + UserName + " Sent Item Page </b>");
%>
</body>
</html>