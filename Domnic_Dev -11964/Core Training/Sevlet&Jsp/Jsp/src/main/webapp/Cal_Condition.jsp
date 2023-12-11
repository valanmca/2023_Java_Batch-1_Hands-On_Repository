<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="Calculator.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	String action = request.getParameter("button");

	int n1 = Integer.parseInt(request.getParameter("num1"));
	int n2 = Integer.parseInt(request.getParameter("num2"));

	if (action.equals("Addition")) {
		int sum = n1 + n2;

		out.println(n1 + " + " + n2 + " = " + sum);

	}
	if (action.equals("Substraction")) {
		int sub = n1 - n2;

		out.println(n1 + " - " + n2 + " = " + sub);
	}
	if (action.equals("Multiplication")) {
		int mul = n1 * n2;

		out.println(n1 + " * " + n2 + " = " + mul);
	}
	if (action.equals("Division")) {
		int div = n1 / n2;

		out.println(n1 + " / " + n2 + " = " + div);
	}
	%>


</body>
</html>