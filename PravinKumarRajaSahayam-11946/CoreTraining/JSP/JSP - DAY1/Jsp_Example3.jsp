<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Jsp_Example2.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <% String action = request.getParameter("a");
		String Number4 = request.getParameter("s1");
		String Number5 = request.getParameter("s4");
		%>
		<%
		int e = Integer.parseInt(Number4);
		int p = Integer.parseInt(Number5);
		%>
		<%
		if(action.equals("Add"))
		{
			int sum = 0;
			sum = e + p;
			out.println("<font color='red'><b>\nSum of the given Numbers is : </b></font>" + sum);
		}
		if(action.equals("Sub"))
		{
			int sub = 0;
			sub = e - p;
			out.println("<font color='red'><b>\nSub of the given Numbers is : </b></font>" + sub);
		}
		if(action.equals("Div"))
		{
			int div = 0;
			div = e / p;
			out.println("<font color='red'><b>\nDiv of the given Numbers is : </b></font>" + div);
		}
		if(action.equals("Mul"))
		{
			int mul = 0;
			mul = e * p;
			out.println("<font color='red'><b>\nMul of the given Numbers is : </b></font>" + mul);
		}
		%>
</body>
</html>