<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<font color=red>Welcome <%=request.getAttribute("username") %></font>
<font color=red>Welcome <%=request.getAttribute("pass") %></font>

</body>
</html>