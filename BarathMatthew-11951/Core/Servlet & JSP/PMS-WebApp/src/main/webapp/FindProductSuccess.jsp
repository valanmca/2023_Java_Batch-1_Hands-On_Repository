<%@page import="com.sms.bean.Product" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ include file="FindProduct.jsp" %> 
    
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href ="css/bootstrap.css">
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

<%
	out.print("<div class='show'>");
	Product bean = (Product)request.getAttribute("bean");
	out.println("<table width = '80%' align ='center' class='table table-striped'>");
	out.println("<tr class='table-success'><th>Product Id</th><th>Product Name</th><th>Product Quantity</th><th>Product Prict</th></tr>");
	if(bean !=null){
		out.println("<tr><th>"+bean.getpId()+"</th><th>"+bean.getpName()+"</th><th>"+bean.getpQnt()+"<th>"+bean.getpPrice()+"</th></th><tr>");
	}
	out.println("</table>");
	out.println("</div>");
%>

</body>
</html>