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
	int num1 = Integer.parseInt(request.getParameter("fnumber"));
	int num2 = Integer.parseInt(request.getParameter("snumber"));

	String option = request.getParameter("button");

	if (option.equals("ADD")) {

		RequestDispatcher rd = request.getRequestDispatcher("CalcFrontPage.jsp");
		rd.include(request, response);
		int sum = num1 + num2;

		out.print("Addition of " + num1 + " and " + num2 + " is : " + sum);
	}

	else if (option.equals("SUB")) {

		RequestDispatcher rd = request.getRequestDispatcher("CalcFrontPage.jsp");
		rd.include(request, response);
		int sub = num1 - num2;
		out.print("Subraction of " + num1 + " and " + num2 + " is : " + sub);
	}

	else if (option.equals("MUL")) {

		RequestDispatcher rd = request.getRequestDispatcher("CalcFrontPage.jsp");
		rd.include(request, response);
		int mul = num1 * num2;
		out.print("Multiplication of " + num1 + " and " + num2 + " is : " + mul);
	}

	else if (option.equals("DIV")) {

		RequestDispatcher rd = request.getRequestDispatcher("CalcFrontPage.jsp");
		rd.include(request, response);
		int div = num1 / num2;
		out.print("Division of " + num1 + " and " + num2 + " is : " + div);
	}
	%>

</body>
</html>