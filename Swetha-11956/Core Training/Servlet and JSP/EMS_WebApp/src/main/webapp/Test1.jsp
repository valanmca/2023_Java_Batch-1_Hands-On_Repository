<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP basics</title>
</head>
<body>
<%!
int num1=5,num2=10;
int n=5,x;
%>

<%
int sum=num1+num2;
int sub=num1-num2;
for(int i=0;i<n;i++){
	x+=i;
}
out.println(x);
%>
<br>
Sum is <%=sum %>

</body>
</html>