<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sample program 1</title>
</head>
<body>
<h1>JSP tags</h1>
<%---JSP Declaration tag --%>
<%!
	int a=10,b=20,sum=0;
	String s1 = "Gayathri";
	int n=5,fact=1;
%>
<%--Script tag --%>
<%
	sum = a+b;
	for(int i=1;i<=n;i++){
		fact = fact*i;
	}
	out.println("Sum : "+sum);
%>
<%-- Jsp Expression tag --%>
Factorial of 5 : <%= fact %><br><br>
Welcome <%= s1 %>

</body>
</html>