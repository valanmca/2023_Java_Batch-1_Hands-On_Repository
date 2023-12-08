<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
 integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{
background-color: #34b2ff;
padding: 60px 10px 10px 10px;
}
a{
border:1px solid black;
padding :10px;
margin:5px;
border-radius:5px;
width:100px;
text-decoration:none;
color:white;
}
</style>
</head>
<body>    
<a href="InsertEmployee" target="content">Insert</a>  
<a href="DeleteEmployee" target="content">delete</a>     
<a href="UpdateEmployee" target="content">Update</a>     
<a href="FindEmployee" target="content">View</a>     
<a href="FindAllEmployee" target="content">ViewALL</a>        
</body>
</html>