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

<%!              //declaration tag
   int a=10, b=20, sum=0;
	int n=5, fact=1;
	String name="Hephzi";
%>
<%				// Scriplet tag (write any java code & any bussiness logic)
	sum=a+b;

	for(int i=1; i<=n; i++){
	fact=fact*1;
}
	out.println("<br><b>Sum:"+sum);
%>
Factorial of 5: <% %>
Welcome<%=name %>


</body>
</html>