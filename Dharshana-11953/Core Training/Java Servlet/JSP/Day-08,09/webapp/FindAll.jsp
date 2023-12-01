<%@page import="java.util.List"%>
<%@page import="com.sms.bean.StudentServ"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<br><br>
<h1><b>STUDENT RECORDS</b></h1>
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
List<StudentServ> list= (List<StudentServ>) request.getAttribute("list");
out.println("<br><br>");
out.println("<table align='center' class='table table-border w-75'><thead class='table-info'>");
out.println("<tr><th>Student Id</th><th>Student Name</th><th>Student Department</th></tr></thead>");
for (StudentServ e: list) {
    out.println("<tr><td>" + e.getId() + "</td><td>" + e.getName() + "</td><td>" + e.getDept() + "</td></tr>");
}
out.println("</table>");
%>


</body>
</html>