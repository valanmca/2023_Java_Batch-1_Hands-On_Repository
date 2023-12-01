<%@page import="java.util.List"%>
<%@page import="com.vms.bean.Vehicle"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<br><br>
<h1><b>VEHICLE RECORDS</b></h1>
<link href="css/bootstrap.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
td,th{
	text-align: center;
}
h1{
text-align: center;
color:blue;
}

</style>
</head>
<body>
	<%
List<Vehicle> list= (List<Vehicle>) request.getAttribute("list");
out.println("<br><br>");
out.println("<table align='center' class='table table-border w-75'><thead class='table-info'>");
out.println("<tr><th>Vehicle Id</th><th>Vehicle Name</th><th>Vehicle No</th><th>Vehicle Owner</th></tr></thead>");
for (Vehicle e: list) {
    out.println("<tr><td>" + e.getId() + "</td><td>" + e.getName() + "</td><td>" + e.getNo() + "</td><td>" + e.getOwner() + "</td></tr>");
}
out.println("</table>");
%>


</body>
</html>