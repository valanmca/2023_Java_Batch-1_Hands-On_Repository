<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    <%@page isELIgnored="false"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="all_css.jsp" %>
</head>
<body class="bg-light">
   <%@include file="navbar.jsp"%>
   <div class="container p-4">
   <div class="row">
   <div class="col-md-6 offest-md-3">
   <div class="card">
   <div class="card-body">
   <p class="fs-3 text-center">Add Teacher Details</p>
    
   <c:if test="${not empty sucuessMessage }">
   <p class="text-center  text-success">${sucuessMessage} </p>
   <c:remove var="sucuessMessage"/>
   </c:if>
   
   <c:if test="${not empty errorMessage }">
   <p class="text-center  text-success">${errorMessage} </p>
   <c:remove var="errorMessage"/>
   </c:if> 
     
   <form  action="register" method="post">
   <div class="mb-4">
    <label  class="form-label">Teacher ID</label>
    <input  type="text" name="id" class="form-control">
  </div>
  <div class="mb-4">
    <label  class="form-label">Teacher Name</label>
    <input type="text" name="name" class="form-control">
    
  </div>
  <div class="mb-4 ">
    <label  class="form-label">Teacher Experience</label>
    <input  type="text" name="experience" class="form-control">
  </div>
  <div class="mb-4 ">
    <label  class="form-label">Teacher Qualification</label>
    <input  type="text" name="qualification" class="form-control">
  </div>
  <div class="mb-4 ">
    <label  class="form-label">Teacher Contact Details</label>
    <input   type="text" name="contact" class="form-control">
  </div>
  <div class="mb-4 ">
    <label  class="form-label">Teacher Email</label>
    <input  type="text" name="email" class="form-control">
  </div>
  <button type="submit" class="btn btn-primary col-md-12">Submit</button>
</form>
   </div>
   </div>
   </div>
   </div> 
   </div>
</body>
</html>