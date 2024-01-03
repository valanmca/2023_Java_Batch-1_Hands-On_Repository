<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <meta name="viewport" content="width=device-width, initial-scale=1">
<link
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
    rel="stylesheet"
    integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
    crossorigin="anonymous">
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Student</title>
</head>
<body>

<form action="PerformUpdate" method="post">

<table width="60%" align="center">
    <tr><td>Student rno</td><td><input type="text" name="rno"/></td></tr>
    <tr><td>Student Name</td><td><input type="text" name="name"/></td></tr>
    <tr><td>Student Dept</td><td><input type="text" name="dept"/></td></tr>
    
    <tr><td align="center"><input type="submit" class="btn btn-primary" value="UpdateStudent" /></td></tr>
</table>

</form>
</body>
</html>