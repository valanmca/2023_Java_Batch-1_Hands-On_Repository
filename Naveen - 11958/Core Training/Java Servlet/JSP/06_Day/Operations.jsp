<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ include file="Calculator.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	int n1 = Integer.parseInt(request.getParameter("n1"));
	int n2 = Integer.parseInt(request.getParameter("n2"));
	int sum = n1 + n2;
	int sub = n1 - n2;
	int mul = n1 * n2;
	int div = n1 / n2;

	
	String action = request.getParameter("button");

	if (action.equals("Add")) {
		out.println("<br><b>Sum : " + sum + "</b>");
	}
	if (action.equals("Sub")) {
		out.println("<br><b>Subtraction : " + sub + "</b>");
	}
	if (action.equals("Mul")) {
		out.println("<br><b>Multiplication : " + mul + "</b>");
	}
	if (action.equals("Div")) {
		out.println("<br><b>Division : " + div + "</b>");
	}
	%>
</body>
</html>