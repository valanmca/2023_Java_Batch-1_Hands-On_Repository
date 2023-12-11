<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.css">
<style>
label
{
text-align:left;
}
</style>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<br><br>
<div class="container" align="center">
<h4 align="center">Update Teacher details</h4>
<br><br>

  <div class="card" style="width: 35rem;">
   <div class="card-body">
    <form action="PerformUpdate" method="post" >
    
    <div class="form-group row">
      <label for="teacherid" class="col-sm-4 col-form-label">Teacher Id </label>
      <div class="col-sm-8">
      
       <input type="text" class="form-control" name="id" 
        placeholder="Enter teacher id" >
        
        
      </div>
      
     </div>
     <br>
     
     <div class="form-group row">
      <label for="TeacherName" class="col-sm-4 col-form-label">Teacher Name</label>
      <div class="col-sm-8">
      
       <input type="text" class="form-control" name="name" 
        placeholder="Enter Teacher name">
     
      </div>
      
     </div>
     <br>
     
     <div class=" form-group row">
      <label for="Teachersubject" class="col-sm-4 col-form-label">Teacher subject</label>
      <div class="col-sm-8">
       
       
       <input type="text" class="form-control" name="subject"  
        placeholder="Enter subject taken by teacher">
        
        
      </div>
     </div>
     <br>
     
     <div class="form-group row">
      <label for="Product Price" class="col-sm-4 col-form-label">Teacher Salary</label>
      <div class="col-sm-8">
      
      
       <input type="text" class="form-control" name="salary" 
        placeholder="Enter Salary">
        
        
        
      </div>
     </div>
     <br>
     
     <input type="submit" class="btn btn-primary"   value="update"   name="button"/>
    </form>
   </div>
  </div>
 </div>

</body>
</html>