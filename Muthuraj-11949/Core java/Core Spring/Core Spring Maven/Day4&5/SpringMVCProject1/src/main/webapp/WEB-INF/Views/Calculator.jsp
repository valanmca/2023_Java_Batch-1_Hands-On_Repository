<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored = "false" %>
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
<input type="submit" value="Addition" name="fn">
<input type="submit" value="Subtraction" name="fn">
<input type="submit" value="multiplication" name="fn">
<input type="submit" value="division" name="fn">

<input type="text" value=${sum } >
</form>
</div>
</body>
</html>