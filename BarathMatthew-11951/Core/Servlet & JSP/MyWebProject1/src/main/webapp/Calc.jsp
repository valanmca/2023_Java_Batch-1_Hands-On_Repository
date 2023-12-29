<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<%@ include file ="Display.jsp" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String process = request.getParameter("button");
		int n1 = Integer.parseInt(request.getParameter("num1"));
		int n2 = Integer.parseInt(request.getParameter("num2"));
	
	if(process.equals("Add")) {
		int sum = n1+n2;
		out.println(sum);
	}
	else if(process.equals("Sub")) {
		int sub = n1-n2;
		out.println(sub);
	}
	else if(process.equals("Mul")) {
		int mul = n1*n2;
		out.println(mul);
	}
	else if(process.equals("Div")) {
		int div = n1/n2;
		out.println(div);
	}
	%>

</body>
</html>