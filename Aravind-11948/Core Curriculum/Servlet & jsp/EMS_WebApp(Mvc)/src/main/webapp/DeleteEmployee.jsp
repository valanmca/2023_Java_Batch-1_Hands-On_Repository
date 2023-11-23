<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
<form action="EMScontroller" method="post">
<table width="60%" align="center">

<tr>
 <td> Employee Id</td>
 <!-- <td> <select>
 
  <c:forEach items="${list2}" var="a">
 
  <option>${a.getId()}</option>
  </c:forEach>
 
 
 </select>
 </td>
 </tr>
  -->

   <td><input type="text" name="eid"></td></tr>
 <tr>
 
 
 
 <tr><td colspan="2" align="center"> <input type="submit" value="Delete Employee" name="ems_button"/></td></tr>
 
 

</table>
</form>

</body>
</html>