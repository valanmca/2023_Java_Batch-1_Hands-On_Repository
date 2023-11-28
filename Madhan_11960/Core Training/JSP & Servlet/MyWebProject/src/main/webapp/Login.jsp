<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="LoginServlet" method="post">
	<label>UserName</label>
	<input type="text" name="uname"/>
	<br><br>
	<label>Password</label>
    <input type="password" name="pwd"/>
	<br><br>
	<input type="Submit" value="login"/>
	</form>
</body>
</html>