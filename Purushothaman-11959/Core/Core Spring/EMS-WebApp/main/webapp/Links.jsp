<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
   th{
    background-color:IndianRed;
    color:white;
     }
     a{
       text-decoration:none;
       color:white;
     }
</style>

</head>

<body>
<br><br>
<table align="center" width="80%">
   <tr>
   <th><a href="InsertEmployee.jsp" target="content">Insert</a></th>
   <th><a href="EMSController?id=a" target="content">Delete</a></th>
   <th><a href="UpdateEmployee.jsp" target="content">Update</a></th>
   <th><a href="EMSController?id=b" target="content">Find</a></th>
   <th><a href="EMSController?id=c" target="content">Find All</a></th>
   </tr>
</table>

</body>
</html>