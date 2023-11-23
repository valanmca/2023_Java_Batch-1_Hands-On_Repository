<%@page import="java.util.List"%>
<%@page import="com.ems.bean.EmployeeServ"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
td{
	text-align: center;
}
</style>
</head>
<body>
	<%
List<EmployeeServ> list= (List<EmployeeServ>) request.getAttribute("list");
out.println("<br><br>");
out.println("<table width='60%' align='center' class='u'>");
out.println("<tr><th>Employee Id</th><th>Employee Name</th><th>Employee Salary</th></tr>");
for (EmployeeServ e: list) {
    out.println("<tr><td>" + e.getId() + "</td><td>" + e.getName() + "</td><td>" + e.getSalary() + "</td></tr>");
}
out.println("</table>");
%>


</body>
</html>