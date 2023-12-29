<%@page import="java.util.List"%>
<%@page import="com.ems.bean.Employee"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<title>Insert title here</title>
<style>
form{
padding-left:13%;
width:85%;
}
table,tr,th,td{
border: 1px solid #c7c7c7;
border-collapse: collapse;
}
</style>
</head>
<body>
<br><br>
<h1 align='center'>Find All Employee :</h1>
	<form action="EMSController" method="get">
		<%-- <%
List<Employee> list = (List<Employee>) request.getAttribute("list");
	out.println("<table width='60%' align='center'>");
	out.println("<tr><th>Employee Id</th><th>Employee Name</th><th>Employee Salary</th><th>Employee deptNo</th></tr>");
	for(Employee a:list){
	out.println("<tr><th>"+a.getId()+"</th><th>"+a.getName()+"</th><th>"+a.getSalary()+"</th><th>"+a.getDeptNo()+"</th></tr>");
	}
	out.println("</table>");
%> --%>

		<%-- JSTL Iterate code to iterate collection --%>
		
		<table class="table table-striped">
			<tr>
				<th>Employee Id</th>
				<th>Employee Name</th>
				<th>Employee Salary</th>
				<th>Employee Department</th>
			</tr>
			<c:forEach items="${list}" var="a">
				<tr>
					<td>${a.getId()}</td>
					<td>${a.getName()}</td>
					<td>${a.getSalary()}</td>
					<td>${a.getDeptNo()}</td>
				</tr>
			</c:forEach>
		</table>

	</form>
</body>
</html>