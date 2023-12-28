<%@page import="com.student.bean.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ include file="FindStudent.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.css">
<style>
form {position-absolute;
	margin-left: 5%;
	width: 50%;
}

table, tr, th {
	border: 1px solid #c7c7c7;
	border-collapse: collapse; position-absolute;
	margin-left: 1%;
}
</style>
</head>
<body>
	<form>
		<%
		Student bean1 = (Student) request.getAttribute("bean");
		out.println("<center><table class='table table-striped'align='center'></center>");
		if (bean1 != null) {
			out.println("<tr><th>Student Roll No</th><th>Student Name</th><th>Student Email</th><th>Student Section</th><th>Student Location</th></tr>");
			out.println("<tr><th>" + bean1.getRollNo() + "</th><th>" + bean1.getStudentName() + "</th><th>"
			+ bean1.getStudentEmail() + "</th><th>"+ bean1.getLocation() + "</th><th>"+ bean1.getSection() + "</th></tr>");
			out.println("</table>");
		} else {
			out.println("<br><center><font color='red'><b>Student Record Not Found !</b></font></center>");
		}
		%>
	</form>
</body>
</html>