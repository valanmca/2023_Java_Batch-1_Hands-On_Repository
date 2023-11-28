<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--Basic JSP Tags --%>  <%--Comment tag --%>

<%! int a=10,b=20,sum=0;    
     int n=5,fact=1;   
     String name="Madhan";
%>

<%
   sum=a+b;
	for(int i=0;i<=n;i++)
	{
		fact=fact*i;
	}
	
	out.println("<br><b>Sum :"+sum);
%>
<br>
Factorial of 5 is <%= fact %>
<br>
Welcome <%= name %>
</body>
</html>