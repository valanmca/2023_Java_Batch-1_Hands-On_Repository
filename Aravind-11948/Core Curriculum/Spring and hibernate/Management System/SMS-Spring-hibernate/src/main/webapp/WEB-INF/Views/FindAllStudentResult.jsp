<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <%@page isELIgnored="false" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Student Id</th>
      <th scope="col">Student Name</th>
      <th scope="col">Student department</th>
      <th scope="col">Student fees</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${msg}" var="a">
  <tr>
      <td>${a.getId()} </td>
      <td>${a.getName()}</td>
      <td>${a.getDep() }</td>
      <td>${a.getFees() }</td>
    </tr>
  
  
  </c:forEach>
  
  
    
    
  </tbody>
</table>


</body>
</html>