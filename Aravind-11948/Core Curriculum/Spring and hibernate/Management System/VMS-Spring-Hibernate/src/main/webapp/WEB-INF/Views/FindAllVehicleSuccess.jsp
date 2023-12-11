<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <%@page isELIgnored="false" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
h4 {
	font-family: "Times New Roman", Times, serif;
	font-weight:bold;
}
td{
text-align: center;
}


</style>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<br><br>
<h4 align="center">Vehicle DETAILS</h4>
<br>
<br>
<table class="table table-striped">


  
    <tr>
      <th class="text-center" scope="col">Vehicle Id</th>
      <th  class="text-center"scope="col">Vehicle Type</th>
      <th  class="text-center"scope="col">Vehicle name</th>
      <th  class="text-center"scope="col">Vehicle Number</th>
      <th  class="text-center"scope="col">Vehicle owner</th>
    </tr>
  
  
  <c:forEach items="${msg}" var="a">
  <tr>
      
     <td>${a.getId() }</td>
   <td>${a.getType() }</td>
   <td>${a.getName() }</td>
   <td>${a.getNumber() }</td>
   <td>${a.getOwner() }</td>
    </tr>
  
  
  </c:forEach>
  
  
    
    
  
</table>


</body>
</html>