<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="UpdateStudent.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int n=Integer.parseInt(request.getParameter("msg"));

%><%=n %>

	<center>

		<font color="red"><b>Student Record Not Updated</b></font>
	</center>

</body>
</html>