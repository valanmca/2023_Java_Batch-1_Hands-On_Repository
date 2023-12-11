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
<script>
function validate()
{
	var name="^[A-Z a-z]+$";   
    var pass="^[0-9]+$";
    
    var vid=document.getElementById("vid").value;
  
    var vtype=document.getElementById("vtype").value
    var vname=document.getElementById("vname").value;
    
    var vnumber=document.getElementById("vnumber").value
    var oname=document.getElementById("vowner").value
    
    //id
    if (vid==null || vid=="")
    {
    alert("Id cannot be blank");
    return false;
    
    }
else if(!vid.match(pass))
    {
    alert("Enter valid id");
    return false;
    
    }
//name
    
    if (vname==null || vname=="")
    {
    alert("Name cannot be blank");
    return false;
    
    }

    
    //number
      if (vnumber==null || vnumber=="")
        {
        alert("Vehicle Number cannot be blank");
        return false;
        
        }
    
    //owner
    
      <%--   owner name validation--%>
      
      if (oname==null || oname=="")
      {
      alert("Owner Name cannot be blank");
      return false;
      
      }
  else if(!oname.match(name))
      {
      alert("Enter valid Name");
      return false;
      
      }
      
      if (vtype==null || vtype=="")
      {
      alert("Vehicle type cannot be blank");
      return false;
      
      }
	
	
	}

</script>
 




</head>
<body>
<br><br>
<div class="container" align="center">
<h4 align="center" >Insert Vehicle</h4>
<br><br>

  <div class="card" style="width: 35rem;" >
   <div class="card-body">
    <form action="PerformInsert" method="post" >
    
    <div class="form-group row">
      <label for="Vehicleid" class="col-sm-4 col-form-label">Vehicle Id </label>
      <div class="col-sm-8">
      
       <input type="text" class="form-control" name="id"     id="vid"
        placeholder="Enter Vehicle id" >
        
        
      </div>
    
      
     </div>
       <br>
     
     <div class="form-group row">
      <label for="VehicleType" class="col-sm-4 col-form-label">Vehicle type</label>
      <div class="col-sm-8">
      
       <input type="text" class="form-control" name="type"  id="vtype"
        placeholder="Enter Vehicle  Type">
     
      </div>
      
     </div>
       <br>
     
     <div class=" form-group row">
      <label for="vehiclename" class="col-sm-4 col-form-label">Vehicle Name</label>
      <div class="col-sm-8">
       
       
       <input type="text" class="form-control" name="name"   id="vname"
        placeholder="Enter Vehicle name">
        
        
      </div>
     </div>
       <br>
     
     <div class="form-group row">
      <label for="vehiclenumber" class="col-sm-4 col-form-label">Vehicle number</label>
      <div class="col-sm-8">
      
      
       <input type="text" class="form-control" name="number"  id="vnumber"
        placeholder="Enter vehicle number">
        
        
      </div>
     </div>
       <br>
       
        <div class="form-group row">
      <label for="vehicleOwner" class="col-sm-4 col-form-label">Vehicle Owner</label>
      <div class="col-sm-8">
      
      
       <input type="text" class="form-control" name="owner"   id="vowner"
        placeholder="Enter vehicle Owner">
        
        
      </div>
     </div>
       <br>
     
     <input type="submit" class="btn btn-primary"   value="insert" onclick="validate()"  name="button"/>
    </form>
   </div>
  </div>
 </div>

</body>
</html>