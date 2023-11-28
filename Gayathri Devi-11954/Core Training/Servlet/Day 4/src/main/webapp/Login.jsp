<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page using JSP Servlet</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<form action="InboxServlet" method="get">
<table class="table w-25">
<tr><td>User Name</td><td><input type="text" name="uname" /></td><tr>
<tr><td>Password</td><td><input type = "password" name="pwd" /></td><tr>
<tr align="center"><td colspan="2"><input type="submit" class="btn btn-success" value="Login"></td><tr>
</table>
</form>
</body>
</html>