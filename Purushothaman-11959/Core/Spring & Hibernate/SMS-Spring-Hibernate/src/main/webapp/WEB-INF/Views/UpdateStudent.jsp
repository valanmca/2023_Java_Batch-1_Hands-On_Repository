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
<script>
function validate(){
var name="^[A-Z a-z]+$";
var pass="^[0-9]+$";
var sId=document.getElementById("sid").value;
var sName=document.getElementById("sname").value;
var sDept=document.getElementById("sdept").value;


if (sId==null || sId==""){  
    alert("Student Id can't be blank");  
    return false;  
    } else if(! sId.match(pass)){
    	alert("Enter valid Student Id");  
        return false; 
    }

if (sName==null || sName==""){  
    alert("Student Name can't be blank");  
    return false;  
    } else if(! sName.match(name)){
    	alert("Enter valid Student Name");  
        return false; 
    }

if (sDept==null || sDept==""){  
    alert("Student Department can't be blank");  
    return false;  
    } else if(! sDept.match(name)){
    	alert("Enter valid Student Department");  
        return false; 
    }

    
}
</script>
</head>
<body>
<br><br>
<div class="container" align="center">
<h4 align="center">Update Student</h4>
<br>
  <div class="card class" style="width: 35rem;">
   <div class="card-body">
    <form action="PerformUpdate" method="post" >
    
    <div class="form-group row">
      <label for="studentid" class="col-sm-4 col-form-label text-light">Student Id </label>
      <div class="col-sm-8">
       <input type="text" class="form-control" name="stdId" id="sid"
        placeholder="Enter student id" required>
      </div>
     </div>
     
     <div class="form-group row">
      <label for="studentName" class="col-sm-4 col-form-label text-light">Student Name</label>
      <div class="col-sm-8">
       <input type="text" class="form-control" name="stdName" id="sname"
        placeholder="Enter student name" required>
      </div>
     </div>
     
     <div class=" form-group row">
      <label for="studentEmail" class="col-sm-4 col-form-label text-light">Student Dept</label>
      <div class="col-sm-8">
       <input type="text" class="form-control" name="stdDept" id="sdept"
        placeholder="Enter student department" required>
      </div>
     </div>
     
     
     <input type="submit" class="btn" value="Update Student" onclick="validate()" name="sms"/>
    </form>
   </div>
  </div>
 </div>

</body>
</html>