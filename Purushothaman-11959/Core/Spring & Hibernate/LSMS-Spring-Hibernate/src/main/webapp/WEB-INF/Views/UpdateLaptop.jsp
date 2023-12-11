<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
.class{
  background: black;
}
.btn{
  background:#E9967A;
  color:white;
}
</style>
<script type="text/javascript">
function validate(){
	var name="^[A-Z a-z]+$";
	var pass="^[0-9]+$";
	var name1="/^[a-zA-Z0-9 ]+$/";
	var price="^\d+(?:[.,]\d+)*$";
	var lId=document.getElementById("lid").value;
	var lBName=document.getElementById("lbrandname").value;
	var lMName=document.getElementById("lmodelname").value;
	var lPrice=document.getElementById("lprice").value;


	if (lId==null || lId==""){  
	    alert("Laptop Id can't be blank");  
	    return false;  
	    } else if(! lId.match(pass)){
	    	alert("Enter valid Laptop Id");  
	        return false; 
	    }

	if (lBName==null || lBName==""){  
	    alert("Laptop Brand Name can't be blank");  
	    return false;  
	    } else if(! lBName.match(name)){
	    	alert("Enter valid Laptop Brand Name");  
	        return false; 
	    }

	if (lMName==null || lMName==""){  
	    alert("Laptop Model Name can't be blank");  
	    return false;  
	    } 
	
	if (lPrice==null || lPrice==""){  
	    alert("Laptop Price can't be blank");  
	    return false;  
	    } 
	    
	}
</script>
</head>
<body>
<br><br>
<div class="container" align="center">
<h4 align="center">Update Laptop</h4>
<br>
  <div class="card class" style="width: 35rem;">
   <div class="card-body">
    <form action="PerformUpdate" method="post" >
    
    <div class="form-group row">
      <label for="laptopId" class="col-sm-4 col-form-label text-light">Laptop Id </label>
      <div class="col-sm-8">
       <input type="text" class="form-control" name="lId" id="lid"
        placeholder="Enter laptop id" required>
      </div>
     </div>
     
     <div class="form-group row">
      <label for="laptopBrandName" class="col-sm-4 col-form-label  text-light">Laptop Brand Name</label>
      <div class="col-sm-8">
       <input type="text" class="form-control" name="lBrandName" id="lbrandname"
        placeholder="Enter laptop brand name" required>
      </div>
     </div>
     
     <div class="form-group row">
      <label for="laptopModelName" class="col-sm-4 col-form-label  text-light">Laptop Model Name</label>
      <div class="col-sm-8">
       <input type="text" class="form-control" name="lModelName" id="lmodelname"
        placeholder="Enter laptop model name" required>
      </div>
     </div>
     
      <div class="form-group row">
      <label for="laptopModelName" class="col-sm-4 col-form-label  text-light">Laptop Price</label>
      <div class="col-sm-8">
       <input type="text" class="form-control" name="lPrice" id="lprice"
        placeholder="Enter laptop price" required>
      </div>
     </div>
     
     <input type="submit" class="btn" value="Update Laptop" onclick="validate()" name="lsms"/>
    </form>
   </div>
  </div>
 </div>

</body>
</html>