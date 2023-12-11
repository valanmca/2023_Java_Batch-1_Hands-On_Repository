
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ include file="FindStudent.jsp" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.css">
<style >

.div{
position:absolute;
top:55%;
left:25%;}</style>
</head>
<body>

<div class="div">
<table class="table table-dark table-striped">
  <thead>
    <tr>
      <th scope="col">Student Id</th>
      <th scope="col">Student Name</th>
      <th scope="col">Student dep</th>
      <th scope="col">Student Fees</th>
    </tr>
  </thead>
   <tbody>
   <tr>
   <td>${bean.getId()}</td>
    <td>${bean.getName()}</td>
     <td>${bean.getDep()}</td>
      <td>${bean.getFees()}</td>
   
   </tr>
 
  </tbody>
  </table>
  </div>
   


  
 
</body>
</html>