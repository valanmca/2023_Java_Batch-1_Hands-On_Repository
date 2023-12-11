<%@page import="com.ems.dao.EmployeeDAO"%>
<%@page import="com.ems.bean.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
td {
	text-align: center;
}
</style>
</head>
<body>
	<p align='center'>
		<b>View All</b>
	</p>
	<%-- JSTL Iterate code to iterate collection --%>
	<table width='60%' align='center'>
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
				<td>${a.getDno()}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>