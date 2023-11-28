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
	int num1 = Integer.parseInt(request.getParameter("value1"));
	int num2 = Integer.parseInt(request.getParameter("value2"));

	String operation = request.getParameter("button");

	if (operation.equals("Addition")) {
		RequestDispatcher rd = request.getRequestDispatcher("ArithmeticOper.jsp");
		rd.include(request, response);
		int add = num1 + num2;
		out.println("Addition is: " + add);
	} else if (operation.equals("Subtraction")) {
		RequestDispatcher rd = request.getRequestDispatcher("ArithmeticOper.jsp");
		rd.include(request, response);
		int sub = num1 - num2;
		out.println("Subtraction is: " + sub);
	} else if (operation.equals("Multiplication")) {
		RequestDispatcher rd = request.getRequestDispatcher("ArithmeticOper.jsp");
		rd.include(request, response);
		int mul = num1 * num2;
		out.println("Multiplication is: " + mul);
	} else if (operation.equals("Division")) {
		RequestDispatcher rd = request.getRequestDispatcher("ArithmeticOper.jsp");
		rd.include(request, response);
		int div = num1 / num2;
		if (num1 >= num2)
			out.println("Division is: " + div);
		else
			out.println("The division cannot be performed");
	}
	%>
</body>
</html>