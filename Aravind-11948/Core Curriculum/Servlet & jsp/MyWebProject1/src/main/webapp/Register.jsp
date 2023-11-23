<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action ="RegisterServlet">
<label>UserName:</label>&nbsp;
<input type="text" name="uname">
<br>
<br>
<label>Age&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:</label>&nbsp;
<input type="number" name="age" placeholder="Age" onfocus="this.placeholder=''" >
<br>
<br>
<label>DOB&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:</label>&nbsp;
<input type="date" name="dob">
<br>
<br>
<label>email&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:</label>&nbsp;
<input type="email" name="email">
<br>
<br>
<input type="submit" value="Register">
</form>

</body>
</html>