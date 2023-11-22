<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="FactoServlet">
Enter a number : <input type="number" name="num" />
<input type="submit" value="Find Factorial" />

<%-- <font color='green'><b>Factorial value :  <%= request.getAttribute("fact") %></b></font> --%>
</form>
</body>
</html>