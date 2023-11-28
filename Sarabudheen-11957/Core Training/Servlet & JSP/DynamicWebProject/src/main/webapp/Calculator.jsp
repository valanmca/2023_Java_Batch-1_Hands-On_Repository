<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator</title>
</head>
<body>

<form action="CalculatorServlet" method="post">
		First Number : <input type="text" name="fnumber" /> <br> 
		Second Number : <input type="text" name="snumber" /> <br> 
		
		<input type="submit" value="ADD" name="button"/>
		<input type="submit" value="SUB" name="button"/>
		<input type="submit" value="MUL" name="button"/>
		<input type="submit" value="DIV" name="button"/>
	</form>
</body>
</html>