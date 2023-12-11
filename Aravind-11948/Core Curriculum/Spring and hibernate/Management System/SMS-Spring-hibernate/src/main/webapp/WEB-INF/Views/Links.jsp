<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<style>
.table-striped{
height:80%;
width:100%;
}
td{
text-align:center;}

.container-fluid{
position:absolute;
top:10%;
height:80%;


}
a{
text-decoration: none;
}
body {background-color: #E8E8E8;}
</style>

</head>
<body >
<div class="container-fluid">
<table   class="table table-striped">
<thead>
<tr><td>Operations</td></tr>
</thead>
<tbody>

<tr><td><a href="Home" target="content">Home</a></td></tr>
<tr><td><a href="InsertStudent" target="content">Insert</a></td></tr>

<tr><td><a href="DeleteStudent" target="content">Delete</a></td></tr>

<tr><td><a href="UpdateStudent" target="content">Update</a></td></tr>
<tr><td><a href="FindStudent" target="content">Find</a></td></tr>
<tr><td><a href="FindAllStudentResult" target="content">Find All</a></td></tr>

</tbody>
</table>
</div>

</body>
</html>