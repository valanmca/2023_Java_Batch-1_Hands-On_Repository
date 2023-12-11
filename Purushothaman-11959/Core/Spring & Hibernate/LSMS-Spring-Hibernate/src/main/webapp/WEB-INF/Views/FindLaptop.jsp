<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style>
label{
  text-align:left;
 }
select{
  width:180px;
  }
.class{
   background:black;
}
.btn{
  background:#E9967A;
  color:white;
}
</style>
</head>
<body>
<br><br>
<div class="container" align="center">
<h4 align="center">Find Laptop</h4>
<br>
  <div class="card class" style="width: 35rem;">
   <div class="card-body">
    <form action="PerformFind" method="post" >
    
    <div class="form-group row">
      <label for="laptopId" class="col-sm-4 col-form-label text-light">Laptop Id </label>
      <div class="col-sm-8">
       <select name="lId" class="form-select">
       <c:forEach items="${idList}" var="a">
       <option>${a}</option>
       </c:forEach>
       </select>
      </div>
     </div>
     
     <input type="submit" class="btn" value="Find Laptop" name="lsms"/>
    </form>
   </div>
  </div>
 </div>

</body>
</html>