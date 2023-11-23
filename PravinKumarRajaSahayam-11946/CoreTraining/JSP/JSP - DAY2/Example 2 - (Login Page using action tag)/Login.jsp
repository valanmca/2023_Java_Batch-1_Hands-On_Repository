<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!--- All the action tag can not be use inside the scriptlet tag -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String UserName = request.getParameter("uname");
   String PassWord = request.getParameter("password");
   if(UserName.equals("Admin") && PassWord.equals("123"))
   { %>
	   <jsp:forward page="LoginSuccess.jsp"/>
  <% }
   else
   { %>
	   <jsp:include page="JSP_Example2.jsp" />
  <% 
  out.println("<br><font color='red' align='center'><b>Invalid Username or PassWord</b></font>");
   }
%>
</body>
</html>