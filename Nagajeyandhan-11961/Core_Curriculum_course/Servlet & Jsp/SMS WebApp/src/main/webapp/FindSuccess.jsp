<%@page import="com.bean.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="Find.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/bootstrap.css" rel="stylesheet" >
</head>
<body>
<%
 Student bean = (Student) request.getAttribute("bean");
	if(bean!=null){
		out.println("<center><table border='1px solid black'responsive><tr><th>Student RollNo</th><th>Student Name</th><th>Student EmailId</th><th>Student Class/Section</th><th>Student Location</th><br>");
		out.println("<tr><td>"+bean.getRollNo()+"</td><td>"+bean.getName()+"</td><td>"+bean.getEmail()+"</td>"+"</td><td>"+bean.getSection()+"</td>"+"</td><td>"+bean.getLocation()+"</td></table></center>");
	}else{
		out.println("No records in that roll number");
	}
%>


</body>
</html>