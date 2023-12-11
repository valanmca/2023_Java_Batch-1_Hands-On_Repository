<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<style>
label
{
text-align:left;
}
</style>

</head>
<body>
<br><br>
<div class="container" align="center">
<h4 align="center">Update Student</h4>
<br><br>

  <div class="card" style="width: 35rem;">
   <div class="card-body">
    <form action="PerformUpdate" method="post" >
    
    <div class="form-group row">
      <label for="studentid" class="col-sm-4 col-form-label">Student Id </label>
      <div class="col-sm-8">
      
       <input type="text" class="form-control" name="id" 
        placeholder="Enter student id" >
        
        
      </div>
    
      
     </div>
       <br>
     
     <div class="form-group row">
      <label for="studentName" class="col-sm-4 col-form-label">Student Name</label>
      <div class="col-sm-8">
      
       <input type="text" class="form-control" name="name" 
        placeholder="Enter student name">
     
      </div>
      
     </div>
       <br>
     
     <div class=" form-group row">
      <label for="studentdepartment" class="col-sm-4 col-form-label">Student Department</label>
      <div class="col-sm-8">
       
       
       <input type="text" class="form-control" name="dep" 
        placeholder="Enter department name">
        
        
      </div>
     </div>
       <br>
     
     <div class="form-group row">
      <label for="studentfees" class="col-sm-4 col-form-label">Student fees</label>
      <div class="col-sm-8">
      
      
       <input type="text" class="form-control" name="fees" 
        placeholder="Enter Student fees">
        
        
      </div>
     </div>
       <br>
     
     <input type="submit" class="btn btn-primary"   value="Update"  name="button"/>
    </form>
   </div>
  </div>
 </div>

</body>
</html>