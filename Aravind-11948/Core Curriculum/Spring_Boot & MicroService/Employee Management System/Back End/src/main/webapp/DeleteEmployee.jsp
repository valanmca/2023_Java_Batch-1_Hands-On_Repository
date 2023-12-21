<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
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
<form action="PerformDelete" method="post">
<table width="60%" align="center">

<tr>
 <td> Employee Id</td>
  <td> <!-- <input type="text" name="id"> -->
  <select name='id'>
 
  <c:forEach items="${idList}" var="a">
 
  <option>${a}</option>
  </c:forEach>
 
 
 </select>
 </td>
 </tr>
  
  
 
 
 <tr><td colspan="2" align="center"> <input type="submit" value="Delete Employee" /></td></tr>
 
 

</table>
</form>

</body>
</html>