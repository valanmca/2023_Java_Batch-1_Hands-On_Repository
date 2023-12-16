
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
 integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>  
 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <style>
.cardr{
margin:10px auto;
}
  select{
            width:100px;
            height: 50px;
            border: 1px solid black;
            border-radius: 10px;
            background-color: blueviolet;
            color: white;
            text-align: center;
            cursor: pointer;
            
        }
       select option{
            width:100px;
            height: 50px;
            border: 1px solid black;
            border-radius: 10px;
            background-color: blueviolet;
            color: white;
            
        }
        
        label{
        margin:0 0 0 25%;
        }
</style>
</head>
<body class="bg-light">
  <div class="container p-4">
  <div class="row">
  <div class="col-md-6 cardr">
  <div  class="card">
  <div  class="card-body">
  <p class="fs-3 text-center">Delete Employee Details</p>   
  <form  action="PerformDelete" method="Post">
  <div class="mb-1">
   <label  class="form-label">Employee ID</label>
       <input name="empid">
     
                  
 </div>
 <input  type="submit" value="DeleteEmployee"   class="btn btn-primary col-md-6"  name="ems button" >
</form>
  </div>
  </div>
  </div>
  </div>
  </div>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>
