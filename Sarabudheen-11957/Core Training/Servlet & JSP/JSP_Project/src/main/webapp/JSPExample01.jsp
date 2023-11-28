<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%-- JSP Comment Tag --%>
	
	<%-- JSP Declaration Tag --%>
	<%!
	int a = 10, b = 20, sum = 0;
	int n = 5, fact = 1;
	String name = "Sara";
	%>

	<%-- JSP Scriptlet Tag --%>
	<%
	sum = a + b;

	for (int i = 1; i <= n; i++) {
		fact = fact * i;
	}

	out.println("<br><b>Sum : </b>" + sum);
	%>

	<br>
	<b>Factoiral of 5 is : </b><%=fact%>
	<br>
	<b> Welcome <%=name%></b>
</body>
</html>