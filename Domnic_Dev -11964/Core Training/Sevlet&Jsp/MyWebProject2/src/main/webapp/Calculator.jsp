<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator</title>
</head>
<body>
	<form action="CalculatorServlet" >
		Enter first number<input type="number" name="num1" />
		 <br>
		Enter second number<input type="number" name="num2" />
		 <br> 
		<input type="submit" value="Addition" name="button" /> 
		<input type="submit" value="Substraction" name="button" /> 
		<input type="submit" value="Multiplication" name="button" /> 
		<input type="submit" value="Division" name="button" />

	</form>
</body>
</html>