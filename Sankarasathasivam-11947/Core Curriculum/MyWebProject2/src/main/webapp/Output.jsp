<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="Input.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator</title>
</head>
<body>
	<%
	String action = request.getParameter("button");
	int a = Integer.parseInt(request.getParameter("num1"));
	int b = Integer.parseInt(request.getParameter("num2"));

	if (action.equals("Addition")) {
		int sum = a + b;
		out.println("<b><center>Addition " + a + " and " + b + " : " + sum);
	}

	if (action.equals("Subtraction")) {
		int sum = a - b;
		out.println("<b><center>Subtraction of " + a + " and " + b + " : " + sum);
	}
	
	if (action.equals("Multiplication")) {
		int sum = a * b;
		out.println("<b><center>Multiplication of " + a + " and " + b + " : " + sum);
	}
	
	if (action.equals("Division")) {
		int sum = a / b;
		out.println("<b><center>Division of " + a + " and " + b + " : " + sum);
	}
	%>
</body>
</html>