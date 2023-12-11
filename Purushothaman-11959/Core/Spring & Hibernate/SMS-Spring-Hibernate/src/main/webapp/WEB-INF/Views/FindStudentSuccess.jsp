
<%@page import="com.sms.bean.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="FindStudent.jsp"%>
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
<br>
<br><br>
<div class="container">
    <p align="center"><b>View All</b></p>
    <br>
	<table class="table">
	
  <thead class="thead-dark">
    <tr>
      <th scope="col">Student Id</th>
      <th scope="col">Student Name</th>
      <th scope="col">Student Department</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">${a.getStdId()}</th>
      <td>${a.getStdName()}</td>
      <td>${a.getStdDept()}</td>
    </tr>
  </tbody>
</table>
</div>
  
      
</body>
</html>