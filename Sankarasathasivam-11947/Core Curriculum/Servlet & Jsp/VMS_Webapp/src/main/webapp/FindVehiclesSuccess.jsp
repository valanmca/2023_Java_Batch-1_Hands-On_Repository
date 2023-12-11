<%@ page import="com.vms.bean.Vehicle"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="FindVehicles.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	Vehicle bean = (Vehicle) request.getAttribute("bean");
	out.println("<table width ='60%' align='center'>");
	out.println("<tr> <th>Vehicle Number</th> <th>Vehicles Brand</th> <th>Vehicles Mileage</th></tr>");

	if (bean != null) {
		out.println("<tr><th>" + bean.getNo() + "</th><th>" + bean.getBrandname() + "</th><th>" + bean.getMileage()
		+ "</th></tr>");
	}
	
	out.println("</table>");
	%>
</body>
</html>