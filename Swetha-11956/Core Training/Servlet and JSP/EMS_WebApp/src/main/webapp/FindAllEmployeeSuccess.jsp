
<%@page import="java.util.ArrayList"%>
<%@page import="com.ems.bean.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find All Employee Success</title>
<link rel="stylesheet" href="css/bootstrap.css">

 </head>
<%--
<body>
<br>
<%

      ArrayList<Employee> list=(ArrayList<Employee>)request.getAttribute("list");
         
             out.println("<table width='60%' align='center'>");
             out.println("<tr><th>Employee Id</th><th>Employee Name</th><th>Employee Salary</th><th>Employee Department</th></tr>");
             for(Employee a:list) {
             out.println("<tr><th>"+a.getId()+"</th><th>"+a.getName()+"</th><th>"+a.getSalary()+"</th><th>"+a.getDno()+"</th></tr>");
             }
             out.println("</table>");
%>

</body>--%>
<body>

	<%-- JSTL Iterate code to iterate collection --%>
	<table width='60%' align='center' class="table table-sm table-dark">
		<tr>
			<th>Employee Id</th>
			<th>Employee Name</th>
			<th>Employee Salary</th>
			<th>Employee Department</th>
		</tr>
		<c:forEach items="${list}" var="a">
			<tr >
				<td>${a.getId()}</td>
				<td>${a.getName()}</td>
				<td>${a.getSalary()}</td>
				<td>${a.getDno()}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>
