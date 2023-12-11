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
body {background-color: #E8E8E8;}

 
</style>

<script >
function validate()
{
	var name="^[A-Z a-z]+$";
		var pass="^[0-9.]+$";
	var eId=document.getElementById("id1").value;
	var eName=document.getElementById("name").value;
	var eDep=document.getElementById("dep").value;
	var eFees=document.getElementById("fees").value;
	
	if (eId==null || eId==""){  
	    alert("Student Id can't be blank!!!");  
	    return false;  
	    } 
	else if(!eId.match(pass))
		{
		alert("Enter valid ID!!!");
		 return false;
		}
	
	if (eName==null || eName==""){  
	    alert("Student Name can't be blank!!!");  
	    return false;  
	    } 
	else if(!eName.match(name))
		{
		alert("Enter valid Name!!!");
		return false;
		}
	
	if (eDep==null || eDep==""){  
	    alert("Student Department can't be blank!!!");  
	    return false;  
	    } 
	else if(!eDep.match(name))
		{
		alert("Enter valid department!!!");
		 return false;
		}
	
	if (eFees==null || eFees==""){  
	    alert("Student fee can't be blank!!!");  
	    return false;  
	    } 
	else if(!eFees.match(pass))
		{
		alert("Enter valid fees!!!");
		 return false;
		}
	
	
	}
</script>



</head>
<body>
<br><br>
<div class="container" align="center">
<h4 align="center">Insert Student</h4>
<br><br>

  <div class="card" style="width: 35rem;">
   <div class="card-body">
    <form action="PerformInsert" method="post" >
    
    <div class="form-group row">
      <label for="studentid" class="col-sm-4 col-form-label">Student Id </label>
      <div class="col-sm-8">
      
       <input type="text" class="form-control" name="id" id="id1"   required
        placeholder="Enter student id" >
        
        
      </div>
    
      
     </div>
       <br>
     
     <div class="form-group row">
      <label for="studentName" class="col-sm-4 col-form-label">Student Name</label>
      <div class="col-sm-8">
      
       <input type="text" class="form-control" name="name" id="name" required
        placeholder="Enter student name">
     
      </div>
      
     </div>
       <br>
     
     <div class=" form-group row">
      <label for="studentdepartment" class="col-sm-4 col-form-label">Student Department</label>
      <div class="col-sm-8">
       
       
       <input type="text" class="form-control" name="dep"  id="dep" required
        placeholder="Enter department name">
        
        
      </div>
     </div>
       <br>
     
     <div class="form-group row">
      <label for="studentfees" class="col-sm-4 col-form-label">Student fees</label>
      <div class="col-sm-8">
      
      
       <input type="text" class="form-control" name="fees"  id="fees"  required
        placeholder="Enter Student fees">
        
        
      </div>
     </div>
       <br>
     
     <input type="submit" class="btn btn-primary"  onclick="validate()" value="insert"   name="button"/>
    </form>
   </div>
  </div>
 </div>

</body>
</html>