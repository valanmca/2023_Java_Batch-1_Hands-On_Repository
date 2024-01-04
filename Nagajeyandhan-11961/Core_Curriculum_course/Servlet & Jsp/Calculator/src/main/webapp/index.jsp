<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="MyServlet">
	<center> <h1>Calculator</h1> 
	
	<br><br>
	
	Enter a number <input type="number" name= "num1"/> <br><br>
	Enter a number <input type="number" name= "num2"/> <br><br>
	<input type="submit"  value="Add" name="button"/> &nbsp;&nbsp;&nbsp;
	<input type="submit"  value="Sub" name="button"/>
	<br><br>
	<input type="submit"  value="Mul" name="button"/>&nbsp;&nbsp;&nbsp;
	<input type="submit"  value="Div" name="button"/>
	</center>
</form>
</body>
</html>