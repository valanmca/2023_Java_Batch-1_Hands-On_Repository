<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<!-- <form action="LoginServlet" method="post"> -->

<form action="Inbox" method="get">
	<label class="form-label">User Name</label> 
	<input class="form-control w-25" type ="text" name="uname" />
	<br>
	<label class="form-label">Password</label> 
	<input class="form-control w-25" type ="password" name="pwd" />
	<br>
	<input class="secondary" type="submit" value="Login" />
	</form>
	
</body>
</html>
