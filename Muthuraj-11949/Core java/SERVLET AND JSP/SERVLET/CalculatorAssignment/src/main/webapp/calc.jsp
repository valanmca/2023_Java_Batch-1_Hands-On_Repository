<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator</title>
<style>
.div{
position: absolute;

  background-color: tomato;
  color: white;
  border: 2px solid black;
  margin: 20px;
  padding: 20px;
}
</style>
</head>
<body>
<div class=div>
<form action="Calculator">
<label>Enter Number-1</label><br>
<input type="number" name="num1"><br>
<label>Enter Number-2</label><br>
<input type="number" name="num2"><br>
<input type="submit" value="Addition" name="button">
<input type="submit" value="subtraction" name="button">
<input type="submit" value="Multiplication" name="button">
<input type="submit" value="divison" name="button">
</form>
</div>
</body>
</html>