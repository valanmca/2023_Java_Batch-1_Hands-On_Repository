<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.css">
<style>
body{
background-color:#51D3BF ;
color:white;
position-absolute;
}
table{
position-absolute;
margin-top:5%;
}
</style>
</head>
<body>
<table align="center" width=50%>
<th><a href="InsertStudent.jsp" target="content"><button type="button" class="btn btn-primary btn-lg">Insert</button></a></th><th></th>
<th><a href="UpdateStudent.jsp" target="content"><button type="button" class="btn btn-warning btn-lg">Update</button></a></th><th></th>
<th><a href="SMScontroller?id='a'" target="content"><button type="button" class="btn btn-danger btn-lg">Delete</button></a></th><th></th>
<th><a href="SMScontroller?id2='c'"  target="content"><button type="button" class="btn btn-info btn-lg">Find</button></a></th><th></th>
<th><a href="SMScontroller?id1='b'" target="content"><button type="button" class="btn btn-success btn-lg">Find All</button></a></th><th></th>

</table>
  

</body>
</html>