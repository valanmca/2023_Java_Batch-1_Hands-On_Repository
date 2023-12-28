<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
 integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
 <style>
.cardr{
margin:10px auto;
}
 </style>
</head>
<body  class="bg-light">  
  <div class="container p-4">
  <div class="row" >
  <div class="col-md-6   cardr ">
  <div  class="card">
  <div class="card-body card-center ">
  <p class="fs-3 text-center">Add Car Record</p>  
   
  
   
 
  <form  action="CarController" method="post">
  <div class="mb-1">
   <label  class="form-label">Car No</label>
   <input  type="text"   name="Carno" class="form-control" required>
 </div>
 <div class="mb-1">
   <label  class="form-label">Car Manufacture</label>
   <input type="text" name="Manufacture" class="form-control" required  >
 </div>
 <div class="mb-1 ">
   <label  class="form-label">Car Model</label>
   <input  type="text" name="Model" class="form-control" required>
 </div>
 <div class="mb-1 ">
   <label  class="form-label">Car KmsRan</label>
   <input  type="text" name="KmsRan" class="form-control" required>
 </div>
 <div class="mb-1 ">
   <label  class="form-label">Car PriceExpected</label>
   <input  type="text" name="PriceExpected" class="form-control" required>
 </div>
 <div class="mb-1 ">
   <label  class="form-label">Car noOfOwn</label>
   <input  type="text" name="noOfOwn" class="form-control" required>
 </div>
  <input  type="submit" value="registerCarz" class="btn btn-primary col-md-12" name="car_button">
</form>
</div>
</div>
</div>
</div>
</div>
</body>
</html>




