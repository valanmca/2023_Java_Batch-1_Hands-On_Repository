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
	String userName="";
	Cookie[] cookies = request.getCookies();

	for(Cookie cookie : cookies){
		userName = cookie.getValue();
	}
	out.println("<font color ='red'><b>Welcome"+userName+"</b></font>");
	out.println("<br><b>Sent Item page !!!!!!!!!!!!</b>");	
%>

</body>
</html>