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
int n1=Integer.parseInt(request.getParameter("num1"));
		int n2=Integer.parseInt(request.getParameter("num2"));
		
		
		String action=request.getParameter("button");
		
		if(action.equals("Add")) {
			int sum=n1+n2;
			RequestDispatcher rd=request.getRequestDispatcher("Calc.jsp");
			rd.include(request, response);
			out.println("Addition is : "+sum);
		}
		else if(action.equals("Sub")) {
			int sub=n1-n2;
			RequestDispatcher rd=request.getRequestDispatcher("Calc.jsp");
			rd.include(request, response);
			out.println("Subtraction is : "+sub);
		}
		else if(action.equals("Mul")) {
			int mul=n1*n2;
			RequestDispatcher rd=request.getRequestDispatcher("Calc.jsp");
			rd.include(request, response);
			out.println("Multiplication is : "+mul);
		}
		else if(action.equals("Div")) {
			int div=n1/n2;
			RequestDispatcher rd=request.getRequestDispatcher("Calc.jsp");
			rd.include(request, response);
			out.println("Division is : "+div);
		}
		
		%>

</body>
</html>