<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!--- Directive Tag Example with types -->
    <%@ page import="java.util.Date" %>
    <%@ include file="JSP_Example1.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
My System Date : <%= new Date() %>
</body>
</html>
