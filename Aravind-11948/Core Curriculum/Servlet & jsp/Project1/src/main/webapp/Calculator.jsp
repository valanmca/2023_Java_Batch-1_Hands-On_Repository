<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
.div{
position:absolute;
top:200px;
left:200px;
border:2px solid black;
padding-top:50px;
padding-left:50px;
padding-right:50px;
height:300px;
width:400px;
content-align:center;
}
</style>
</head>
<body>
<div class=div>
	<form action="CalculatorServlet" method="post">


		Enter num1:<input type="number" name="num1"> <br> <br>
		Enter num2:<input type="number" name="num2"> <br> <br>
		
		 <input type="submit"  value="Addition" name="button"> 
			<input type="submit" value="Subtration" name="button"> 
			<input type="submit" value="Multiplication" name="button"> 
			<input type="submit" value="Division" name="button">

	</form>
	</div>

</body>
</html>