<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator</title>
</head>
<body>
<h3 align="center">Calculator using JSP Servlet</h3>
<form action="CalculatorServlet">
<table align="center">
<tr><td>Number 1</td><td><input type="number" name="num1" /></td></tr>
<tr><td>Number 2</td><td><input type="number" name="num2" /></td></tr>
<tr><td colspan="2" ><input type="submit" value="Add" name="oper"/>
<input type="submit" value="Sub" name="oper"/>
<input type="submit" value="Mul" name="oper"/>
<input type="submit" value="Div" name="oper"/></td></tr>
</table>
</form>
</body>
</html>