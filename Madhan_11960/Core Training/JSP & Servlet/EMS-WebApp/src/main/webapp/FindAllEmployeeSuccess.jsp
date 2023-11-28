<%@page import="java.util.ArrayList"%>
<%@page import="com.ems.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>

<p align="center"><b>View All</b></p>
<table width='60%' align='center'>;
 <tr><th>Student Id</th><th>Student Name</th><th>Student Department</th></tr>
 <c:forEach items="${list}" var="a">
  <tr><td>${a.getStu_id()}</td><td>${a.getStu_name()}</td><td>${a.getStu_dep()}</td></tr>
 </c:forEach>



</body>
</html>