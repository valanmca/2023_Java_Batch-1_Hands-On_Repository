<%@page import="com.msms.bean.Mobile"%>
<%@page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
     href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
    rel="stylesheet"
    integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
    crossorigin="anonymous">
<style>
	.show{
		padding-left:10%;
		padding-right:10%;
		width: 100%;
	}
	th{
		background-color: #4bc970;
	}
</style>
</head>

<body>
<br>
<br>
<%-- JSTL Iterate code to iterate collection --%>
		 <div class='show'>
         <table table width = '80%' align ='center' class='table table-striped'>
         <tr class='table-success'><th>Mobile Id</th><th>Mobile Name</th><th>Brand name</th><th>Mobile Price</th></tr>  
         <c:forEach items="${mList}" var="a">
         <tr><td>${a.getMobId()}</td><td>${a.getBrandName()}</td><td>${a.getModelName()}</td><td>${a.getMobPrice()}</td></tr>
         </c:forEach>
         </table>
         </div>
</body>

</html>