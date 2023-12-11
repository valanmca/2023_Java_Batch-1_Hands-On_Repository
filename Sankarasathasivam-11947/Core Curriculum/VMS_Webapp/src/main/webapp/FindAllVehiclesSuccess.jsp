<%@page import="java.util.List"%>
<%@ page import="com.vms.bean.Vehicle"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%--<%
	List<Vehicle> list = (List<Vehicle>) request.getAttribute("list");
	out.println("<table width='60%' align='center'>");
	out.println("<tr><th>Employee Id</th><th>Employee Name</th><th>Employee Salary</th>");

	for (Vehicle v : list) {

		if (!list.isEmpty()) {
			out.println("<tr><th>" + v.getNo() + "</th><th>" + v.getBrandname() + "</th><th>" + v.getMileage() + "</th>");
		} else {
			out.println("No Records");
		}
	}
	out.println("</table>");
	--%>

	<table width="60%" align="center">
		<tr>
			<th>Vehicle No</th>
			<th>Vehicle BrandName</th>
			<th>Vehicle Mileage</th>
		</tr>

		<c:forEach var="display" items="${list}">

			<tr>
				<th>${display.no}</th>
				<th>${display.brandname}</th>
				<th>${display.mileage}</th>
			</tr>
		</c:forEach>
	</table>
</body>
</html>