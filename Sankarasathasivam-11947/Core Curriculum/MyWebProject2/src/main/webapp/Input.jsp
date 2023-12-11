<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
div {
	margin:5%;
}

table {
	border: 2px solid black;
	background-color: grey;
	text-align: center;
	padding: 5%;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form action="Output.jsp">
			<table align="center">
				<tr>
					<td>Enter Number 1 : <input type="number" name="num1" /></td>
				</tr>
				<tr>
					<td>Enter Number 2 : <input type="number" name="num2" /></td>
				</tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr>
					<td><input type="submit" value="Addition" name="button" /> <input
						type="submit" value="Subtraction" name="button" /> <input
						type="submit" value="Multiplication" name="button" /> <input
						type="submit" value="Division" name="button" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>