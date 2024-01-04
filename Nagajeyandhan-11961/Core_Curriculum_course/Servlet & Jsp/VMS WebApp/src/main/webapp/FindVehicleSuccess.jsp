<%@page import="com.bean.Vehicle"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ include file="FindVehicle.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
	<link href="css/bootstrap.css" rel="stylesheet" >
</head>
<body>
<%
Vehicle bean =(Vehicle) request.getAttribute("bean");

if(bean!=null){
	out.println("Id"+bean.getVechicleId()+"Name"+bean.getVehicleName()+"Price"+bean.getPrice());
}

%>
</body>
</html>