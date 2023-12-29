<%@page import="com.ems.bean.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="FindEmployee.jsp"%>
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
form {
	padding-left: 13%;
	width: 85%;
}

table, tr, th {
	border: 1px solid #c7c7c7;
	border-collapse: collapse;
}
</style>
</head>
<body>
	<br>
	<form>
		<%
		Employee bean = (Employee) request.getAttribute("bean");
		out.println("<table class='table table-striped'>");
		if (bean != null) {
			out.println("<tr><th>Employee Id</th><th>Employee Name</th><th>Employee Salary</th><th>Employee deptNo</th></tr>");
			out.println("<tr><th>" + bean.getId() + "</th><th>" + bean.getName() + "</th><th>" + bean.getSalary() + "</th><th>"
			+ bean.getDeptNo() + "</th></tr>");
			out.println("</table>");
		} else {
			out.println("<br><center><font color='red'><b>Employee Record Not Found !</b></font></center>");
		}
		%>
	</form>


</body>
</html>