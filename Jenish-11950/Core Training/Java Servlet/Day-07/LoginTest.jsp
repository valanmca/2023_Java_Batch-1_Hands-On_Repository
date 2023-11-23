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
	String userName = request.getParameter("uname");
	String password = request.getParameter("pwd");
	
	if(userName.equals("Admin") && password.equals("123")){ %>
		<jsp:forward page="LoginSuccess.jsp"/>
<%	}else{ %>
<jsp:include page="Login.jsp"></jsp:include>

<%		

out.println("<br><font color=red><b>Invalid Username & Password</b></font");
	}
%>
</body>
</html>