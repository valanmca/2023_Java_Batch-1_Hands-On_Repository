<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String action = request.getParameter("button");
	String num1 = request.getParameter("calc1");
	String num2 = request.getParameter("calc2");
	int x = Integer.parseInt(request.getParameter("num1"));
	int y = Integer.parseInt(request.getParameter("num2"));

	if (action.equals("Addition")) {
		int sum = x + y;
		RequestDispatcher rd = request.getRequestDispatcher("Calc.jsp");
		rd.include(request, response);
		out.println("Addition:" + sum);

	}

	else if (action.equals("subtraction")) {
		int sum = x - y;
		RequestDispatcher rd = request.getRequestDispatcher("Calc.jsp");
		rd.include(request, response);
		out.println("subtraction:" + sum);
	}

	else if (action.equals("Multiplication")) {
		int sum = x * y;
		RequestDispatcher rd = request.getRequestDispatcher("Calc.jsp");
		rd.include(request, response);
		out.println("Multiplication:" + sum);
	}
	else if (action.equals("divison")) {
		int sum = x / y;
		RequestDispatcher rd = request.getRequestDispatcher("Calc.jsp");
		rd.include(request, response);
		out.println("divison:" + sum);
	}
	%>
</body>
</html>