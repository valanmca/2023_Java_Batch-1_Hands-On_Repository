<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%--Page Directive - import attribute --%>
	<%@ page import="java.util.Date"%>
	
	<%-- Include Directive --%>
	<%@ include file="JSPExample01.jsp" %>
	
	<%-- Taglib Directive --%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	Today is: <%=new Date()%>

</body>
</html>