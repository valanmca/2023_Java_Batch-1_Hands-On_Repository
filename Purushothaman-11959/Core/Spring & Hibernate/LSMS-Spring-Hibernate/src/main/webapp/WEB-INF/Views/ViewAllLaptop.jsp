<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
     tr{
      text-align:center;
     }
</style>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<br><br>
    <div class="container">
    <p align="center"><b>View All</b></p>
    <br>
	<table class="table">
	
  <thead class="thead-dark">
    <tr>
      <th scope="col">Laptop Id</th>
      <th scope="col">Laptop Brand Name</th>
      <th scope="col">Laptop Model Name</th>
      <th scope="col">Laptop Price</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${lapList}" var="a">
    <tr>
      <th scope="row">${a.getlId()}</th>
      <td>${a.getlBrandName()}</td>
      <td>${a.getlModelName()}</td>
      <td>${a.getlPrice()}</td>
    </tr>
   </c:forEach>
  </tbody>
</table>
</div>
</body>
</html>


