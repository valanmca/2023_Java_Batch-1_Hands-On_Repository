
<%@page import="com.lsms.bean.Laptop"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="FindLaptop.jsp"%>
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
</head>
<body>
<br>
<br><br>
<div class="container">
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
    <tr>
      <th scope="row">${bean.getlId()}</th>
      <td>${bean.getlBrandName()}</td>
      <td>${bean.getlModelName()}</td>
      <td>${bean.getlPrice()}</td>
    </tr>
  </tbody>
</table>
</div>
  
      
</body>
</html>