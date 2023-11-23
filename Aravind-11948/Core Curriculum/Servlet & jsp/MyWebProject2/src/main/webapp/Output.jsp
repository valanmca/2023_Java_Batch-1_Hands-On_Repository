<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ include file="Input.jsp" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
p{
color:red;
font-weight:bold;

position:absolute;
left:500px;
top:250px;

}
</style>
</head>
<body>
<% 
String action=request.getParameter("button");
int a=Integer.parseInt(request.getParameter("n1"));
int b=Integer.parseInt(request.getParameter("n2"));

 
if (action.equals("Addition"))
{
	int sum=a+b;
	out.println("<p> Addition of  :" +a+"+"+b+" = "+sum+"<p>");
}
else if(action.equals("Subtraction"))
{
	int sum=a-b;
	out.println("<p> Subtraction :" +a+"+"+b+" = "+sum+"<p>");
}

else if(action.equals("Multiplication"))
{
	int sum=a*b;
	out.println("<p> Multiplication  :" +a+"+"+b+" = "+sum+"<p>");
}
else
{
	int sum=a/b;
	out.println("<p> Division  :" +a+"+"+b+" = "+sum+"<p>");
	
}
%>

</body>
</html>