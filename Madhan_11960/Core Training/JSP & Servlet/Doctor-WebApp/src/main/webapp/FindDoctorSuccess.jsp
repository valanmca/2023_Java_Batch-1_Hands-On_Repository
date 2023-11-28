<%@page import="com.dms.bean.Doctor"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@include file="FindDoctor.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.show {
	padding-left: 0%;
	padding-right: 10%;
	width: 20%;
}

th {
	background-color: #4bc970;
}
</style>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>
	<%
out.print("<div class='show'>");
Doctor bean=(Doctor) request.getAttribute("bean");
out.println("<table width = '90%' align ='center' class='table table-striped'>");
out.println("<tr class='table-success'><th>Doctor Id</th><th>Doctor Name</th><th>Doctor Age</th><th>Doctor Email</th><th>Doctor Specialization</th><th>Doctor Contact</th><th>Doctor Location</th></tr>");
if(bean!=null){
	out.println("<tr><th>"+bean.getDoctorId()+"</th><th>"+bean.getDoctorName()+"</th><th>"+bean.getDoctorAge()+"</th><th>"+bean.getDoctorEmail()+"</th><th>"+bean.getDoctorSpecialization()+"</th><th>"+bean.getDoctorContact()+"</th><th>"+bean.getDoctorLocation()+"</th><tr>");
}
out.println("</table>");
out.println("</div>");
%>
</body>
</html>
</head>
<body>