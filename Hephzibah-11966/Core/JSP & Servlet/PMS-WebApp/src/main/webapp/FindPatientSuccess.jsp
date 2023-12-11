<%@page import="com.bean.Patient"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@include file="FindPatient.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
<%
out.print("<div class='show'>");

Patient bean=(Patient) request.getAttribute("bean");
out.println("<table width = '80%' align ='center' class='table table-striped'>");
out.println("<tr class='table-success'><th>Patient Id</th><th>Patient Name</th><th>Patient Age</th><th>Patient Email</th><th>Patient BloodGroup</th><th>Patient Location</th></tr>");
if(bean!=null){
	out.println("<tr><th>"+bean.getId()+"</th><th>"+bean.getName()+"</th><th>"+bean.getAge()+"</th><th>"+bean.getEmail()+"</th><th>"+bean.getBloodGroup()+"</th><th>"+bean.getLocation()+"</th></tr>");

}
out.println("</table>");
out.println("</div>");
%>
</body>
</html>




</head>
<body>
