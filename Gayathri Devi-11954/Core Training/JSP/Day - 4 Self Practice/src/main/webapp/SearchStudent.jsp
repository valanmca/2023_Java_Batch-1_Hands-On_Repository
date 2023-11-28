<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.css" rel="stylesheet">
<style>
th{
text-align : left;}
.container{
margin-top:60px;
padding-top:30px;
padding-bottom:30px;
border:4px solid navy;
width:70%;
}
</style>
</head>
<body>

<div class="container">
<form action="SmsControllerServlet" method="post"><!-- url pattern of the servlet -->
<table width="40%" align="center" class="table table-bordered w-50">
<tr><th>Student ID</th><td><input class="form-control me-2" type="number" name="sid" required/></td></tr>
<tr><td colspan="2" align="center"><input type="submit" value="Search Student" name="sms_button" class="btn btn-secondary"/></td></tr>
</table>
</form></div>
</body>
</html>