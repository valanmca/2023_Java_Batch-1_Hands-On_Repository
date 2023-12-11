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
.card{
background-color:#427D9D ;


}
h4{
font-family:"Times New Roman", Times, serif;
}

label{
color:white;
font-family:"Times New Roman", Times, serif;
font-weight: bold;
font-size:large;
}
.form-control{
border-radius: 20px;
}
.form-control:hover{

background-color:#daedeb; ;
}

 
</style>





</head>
<body>
<br><br>
<div class="container" align="center">
<h4 align="center" >Update Student</h4>
<br><br>

  <div class="card" style="width: 35rem;" >
   <div class="card-body">
    <form action="PerformUpdate" method="post" >
    
    <div class="form-group row">
      <label for="studentid" class="col-sm-4 col-form-label">Product Id </label>
      <div class="col-sm-8">
      
       <input type="text" class="form-control" name="id" id="id1"   required
        placeholder="Enter product id" >
        
        
      </div>
    
      
     </div>
       <br>
     
     <div class="form-group row">
      <label for="studentName" class="col-sm-4 col-form-label">Product Name</label>
      <div class="col-sm-8">
      
       <input type="text" class="form-control" name="name" id="name" required
        placeholder="Enter product name">
     
      </div>
      
     </div>
       <br>
     
     <div class=" form-group row">
      <label for="studentdepartment" class="col-sm-4 col-form-label">Product Quantity</label>
      <div class="col-sm-8">
       
       
       <input type="text" class="form-control" name="quantity"  id="dep" required
        placeholder="Enter product Quantity">
        
        
      </div>
     </div>
       <br>
     
     <div class="form-group row">
      <label for="studentfees" class="col-sm-4 col-form-label">Product Price</label>
      <div class="col-sm-8">
      
      
       <input type="text" class="form-control" name="price"  id="fees"  required
        placeholder="Enter product fees">
        
        
      </div>
     </div>
       <br>
     
     <input type="submit" class="btn btn-primary"   value="Update"   name="button"/>
    </form>
   </div>
  </div>
 </div>

</body>
</html>