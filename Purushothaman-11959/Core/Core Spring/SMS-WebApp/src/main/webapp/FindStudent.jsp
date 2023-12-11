<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
</style>
</head>
<body>
<br><br>
<div class="container" align="center">
<h4 align="center">Find Student</h4>
<br>
  <div class="card" style="width: 35rem;">
   <div class="card-body">
    <form action="SMSController" method="post" >
    
    <div class="form-group row">
      <label for="studentRollNo" class="col-sm-4 col-form-label">Student RollNo </label>
      <div class="col-sm-8">
       <select name="srollno" class="form-select">
       <c:forEach items="${list}" var="a">
       <option>${a.getStdRollNo()}</option>
       </c:forEach>
       </select>
      </div>
     </div>
     
     <input type="submit" class="btn btn-primary" value="Find Student" name="sms"/>
    </form>
   </div>
  </div>
 </div>

</body>
</html>