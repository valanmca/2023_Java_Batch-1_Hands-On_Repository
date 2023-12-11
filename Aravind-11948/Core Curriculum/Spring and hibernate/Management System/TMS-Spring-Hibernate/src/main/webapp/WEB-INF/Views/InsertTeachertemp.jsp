<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table{
border:2px solid black;
border-radius:20px;
padding:20px;
}
tr{

}
td{
color:black;
height:30px;
width:30px;}
</style>
</head>
<body>
<br>
<div>
<form action="PerformInsert" method="post">
<table width="50%" align="center">
<tr>
 <td> Teacher Id</td>
 <td><input type="text" name="id"></td></tr>
 <tr>
 
 <td> Teacher Name</td>
 <td><input type="text" name="name"></td></tr>
 <tr>
 
 <td> Employee Subject</td>
 <td><input type="text" name="subject"></td></tr>
 <tr>
 
 <td> Employee salary</td>
 <td><input type="text" name="salary"></td></tr>
 
 <tr><td colspan="2" align="center"> <input type="submit"   value="Insert Employee" name="ems_button"/></td></tr>
 
 

</table>
</form>
</div>

</body>
</html>