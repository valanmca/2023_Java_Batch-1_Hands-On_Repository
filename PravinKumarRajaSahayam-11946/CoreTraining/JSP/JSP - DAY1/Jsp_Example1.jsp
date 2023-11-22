<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- JSP Comments Tag --%>
<%!
int a = 10, b = 40 , sum = 0;
int s = 5 ,fact = 1;
String name = "PravinKumar";
%>
<%
int a = 10;
sum = a + b;
for(int i=1;i<=s;i++)
{
	fact = fact * i;
}
out.println("<br><b>Sum : " + sum);
%>
<br>
Factorial of 5 : <%= fact %>
<br>
Welcome <%= name %>
</body>
</html>