<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%-- Page directive  --%>
    <%@page import="java.util.Date" %>
    
    <%-- Include directive --%>
    <%@include file="Directives.jsp" %>
    
    <%-- Taglib directive  --%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Three types of directives</title>
</head>
<body>

My System date: <%= new Date() %>

</body>
</html>