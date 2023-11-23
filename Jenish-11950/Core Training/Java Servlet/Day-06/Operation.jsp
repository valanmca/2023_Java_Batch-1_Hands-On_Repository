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
String action = request.getParameter("add");
       String Number3 = request.getParameter("d1");
       String Number4 = request.getParameter("d2");
       int a = Integer.parseInt(Number3);
       int b = Integer.parseInt(Number4);
       if(action.equals("Add"))
       {
           RequestDispatcher rd = request.getRequestDispatcher("Calc.jsp");
           rd.include(request, response);
           int sum = 0;
           sum = a + b;
          
           out.println("<br><br><font color='green'><b>\nSum of the given Numbers is : </b></font>" + sum);
       }
       if(action.equals("Sub"))
       {
           RequestDispatcher rd = request.getRequestDispatcher("Calc.jsp");
           rd.include(request, response);
           int sub = 0;
           sub = a - b;
          
           out.println("<br><br><font color='green'><b>\nSub of the given Numbers is : </b></font>" + sub);
       }
       if(action.equals("Div"))
       {
           RequestDispatcher rd = request.getRequestDispatcher("Calc.jsp");
           rd.include(request, response);
           int div = 0;
           div = a / b;
          
           out.println("<br><br><font color='green'><b>\nDiv of the given Numbers is : </b></font>" + div);
       }
       if(action.equals("Mul"))
       {
           RequestDispatcher rd = request.getRequestDispatcher("Calc.jsp");
           rd.include(request, response);
           int mul = 0;
           mul = a * b;
          
           out.println("<br><br><font color='green'><b>\nMul of the given Numbers is : </b></font>" + mul);
       }
%>

</body>
</html>