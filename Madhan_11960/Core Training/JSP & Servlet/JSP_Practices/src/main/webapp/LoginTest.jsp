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
   String UserName=request.getParameter("uname");
	String Password=request.getParameter("pwd");

if(UserName.equals("Admin")&& Password.equals("123"))
{
%>
<jsp:forward page="LoginSuccess.jsp"></jsp:forward>
<% }else { %>
<jsp:include page="Login.jsp"></jsp:include>
<%
out.println("<br><font color=red><b>Invalid UserName and Password</b></font>");
}
%>


</body>
</html>