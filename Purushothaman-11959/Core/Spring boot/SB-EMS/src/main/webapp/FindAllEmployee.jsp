<%@page import="com.ems.bean.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
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
		</tr>
		${temp}
			
	</table>

</body>
</html>