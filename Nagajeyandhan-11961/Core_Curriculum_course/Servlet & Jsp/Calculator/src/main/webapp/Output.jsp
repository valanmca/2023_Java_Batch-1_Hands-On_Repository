<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Input.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String s = request.getParameter("button");
String number = request.getParameter("num1");
int a= Integer.parseInt(number);
String number1 = request.getParameter("num2");
int b = Integer.parseInt(number1);
if(s.equals("Add")){
	out.println("The Addition of given number is: "+(a+b));
}
if(s.equals("Sub")){
	out.println("The Subtraction of given number is: "+(a-b));
}
if(s.equals("Mul")){
	out.println("The Multiplication of given number is: "+(a*b));
}
if(s.equals("Div")){
	out.println("The Division of given number is: "+(a/b));
}
%>
</body>
</html>