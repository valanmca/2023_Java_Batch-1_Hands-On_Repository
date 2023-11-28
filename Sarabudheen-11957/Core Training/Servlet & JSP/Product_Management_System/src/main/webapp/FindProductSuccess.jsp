<%@page import="com.pms.bean.Products"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="FindProduct.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Success Page</title>
</head>
<body>

	<br>
	<%
	Products bean = (Products) request.getAttribute("bean");
	out.println("<table width='60%' align='center'>");
	if (bean != null) {
		out.println("<tr><th>Product Id</th> <th> Product Name</th> <th> Product Quantity</th> <th> Product Price</th>");

		out.println("<tr><th>" + bean.getProductId() + "</th><th>" + bean.getProductName() + "</th><th>"
		+ bean.getProductQuantity() + "</th><th>" + bean.getProductPrice() + "</th>");
	}

	else {
		out.println("<center><b><font color='red' >Product not found!!!</font></b></center>");
	}
	out.println("</table>");
	%>
</body>
</html>