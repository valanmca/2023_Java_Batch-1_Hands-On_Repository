<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-- //using session  --%>

<%
 String userName =session.getAttribute("userName").toString();
 out.println("<font color='red'><b>Welcome"+userName+"</b></font>");
 out.println("<br><b> "+userName+" Sent Item page</b>");

%>

</body>
</html>