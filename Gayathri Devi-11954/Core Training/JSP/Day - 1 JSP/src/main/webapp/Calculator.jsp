<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Calculate.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String action = request.getParameter("Button");

	int a = Integer.parseInt(request.getParameter("n1"));
	int b = Integer.parseInt(request.getParameter("n2"));
	
	if(action.equals("ADD"))
		out.println("Add : "+(a+b));
	else if(action.equals("SUB"))
		out.println("Sub : "+(a-b));
	else if(action.equals("MUL"))
		out.println("Mul : "+(a*b));
	else if(action.equals("DIV"))
		out.println("Div : "+(a/b));
	else
		out.println("Error");
%>

</body>
</html>