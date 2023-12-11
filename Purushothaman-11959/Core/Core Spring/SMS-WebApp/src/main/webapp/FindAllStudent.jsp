<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
      <th scope="col">Student RollNo</th>
      <th scope="col">Student Name</th>
      <th scope="col">Student Email</th>
      <th scope="col">Student Section</th>
      <th scope="col">Student Standard</th>
      <th scope="col">Student Location</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${list}" var="a">
    <tr>
      <th scope="row">${a.getStdRollNo()}</th>
      <td>${a.getStdName()}</td>
      <td>${a.getStdEmail()}</td>
      <td>${a.getStdSection()}</td>
      <td>${a.getStdStandard()}</td>
      <td>${a.getStdLocation()}</td>
    </tr>
   </c:forEach>
  </tbody>
</table>
</div>
</body>
</html>


