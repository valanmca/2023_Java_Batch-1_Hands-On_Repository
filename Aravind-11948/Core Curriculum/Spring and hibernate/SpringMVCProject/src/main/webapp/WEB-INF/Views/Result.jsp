<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Calculator.jsp"></jsp:include>
<!--  ${msg}-->
<b>Addition: ${bean.num1+bean.num2}</b>   <!-- Calling the getter method  in the Addition.java-->


</body>
</html>