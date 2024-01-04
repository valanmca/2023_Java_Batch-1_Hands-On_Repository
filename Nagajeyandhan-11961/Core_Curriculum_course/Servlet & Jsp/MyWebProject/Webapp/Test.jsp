<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--Jsp Comment tag --%>

<%!  //Declaration tag
	int a = 10,b = 20, sum=0;
	int n = 5, fact = 1;
	String name = "Jeyandhan";
%>

<% //Scriplet tag
	sum = a+b;
	
	for(int i=1; i<=n;i++){
		fact = fact*i;
	}
	out.println("<br><b>Sum: "+sum);
%>
<br>
Factorial of 5 is <%= //Expression tag
					fact %> 
<br>
Welcome <%= //Expression tag
					name %>
</body>
</html>