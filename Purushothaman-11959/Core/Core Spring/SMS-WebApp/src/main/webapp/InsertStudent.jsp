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
</style>
<script>
function validate(){
var name="^[A-Z a-z]+$";
var pass="^[0-9]+$";
var sRollNo=document.getElementById("srollno").value;
var sName=document.getElementById("sname").value;
var sEmail=document.getElementById("semail").value;
var sSec=document.getElementById("ssec").value;
var sStd=document.getElementById("sstd").value;
var sLoc=document.getElementById("sloc").value;


if (sRollNo==null || sRollNo==""){  
    alert("Student Roll No can't be blank");  
    return false;  
    } else if(! sRollNo.match(pass)){
    	alert("Enter valid Student Roll No");  
        return false; 
    }

if (sName==null || sName==""){  
    alert("Student Name can't be blank");  
    return false;  
    } else if(! sName.match(name)){
    	alert("Enter valid Student Name");  
        return false; 
    }

if (sEmail==null || sEmail==""){  
    alert("Student Email can't be blank");  
    return false;  
    } 
    
if (sSec==null || sSec==""){  
    alert("Student Section can't be blank");  
    return false;  
    } else if(! sSec.match(name)){
    	alert("Enter valid Student Section");  
        return false; 
    }

if (sStd==null || sStd==""){  
    alert("Student Standard can't be blank");  
    return false;  
    } else if(! sStd.match(pass)){
    	alert("Enter valid Student Standard");  
        return false; 
    }

if (sLoc==null || sLoc==""){  
    alert("Student Location can't be blank");  
    return false;  
    } else if(! sLoc.match(name)){
    	alert("Enter valid Student Location");  
        return false; 
    }
}
</script>
</head>
<body>
<br><br>
<div class="container" align="center">
<h4 align="center">Insert Student</h4>
<br>
  <div class="card" style="width: 35rem;">
   <div class="card-body">
    <form action="SMSController" method="post" >
    
    <div class="form-group row">
      <label for="studentRollNo" class="col-sm-4 col-form-label">Student RollNo </label>
      <div class="col-sm-8">
       <input type="text" class="form-control" name="srollno" id="srollno"
        placeholder="Enter student rollno">
      </div>
     </div>
     
     <div class="form-group row">
      <label for="studentName" class="col-sm-4 col-form-label">Student Name</label>
      <div class="col-sm-8">
       <input type="text" class="form-control" name="sname" id="sname"
        placeholder="Enter student name">
      </div>
     </div>
     
     <div class=" form-group row">
      <label for="studentEmail" class="col-sm-4 col-form-label">Student Email</label>
      <div class="col-sm-8">
       <input type="text" class="form-control" name="semail" id="semail"
        placeholder="Enter student email">
      </div>
     </div>
     
     <div class="form-group row">
      <label for="studentSection" class="col-sm-4 col-form-label">Student Section</label>
      <div class="col-sm-8">
       <input type="text" class="form-control" name="ssec" id="ssec"
        placeholder="Enter student section">
      </div>
     </div>
     
     <div class="form-group row">
      <label for="studentStandard" class="col-sm-4 col-form-label">Student Standard</label>
      <div class="col-sm-8">
       <input type="text" class="form-control" name="sstd" id="sstd"
        placeholder="Enter student standard">
      </div>
     </div>
     
     <div class="form-group row">
      <label for="studentLocation" class="col-sm-4 col-form-label">Student Location</label>
      <div class="col-sm-8">
       <input type="text" class="form-control" name="sloc" id="sloc"
        placeholder="Enter student location">
      </div>
     </div>
     
     <input type="submit" class="btn btn-primary" value="Insert Student" onclick="validate()" name="sms"/>
    </form>
   </div>
  </div>
 </div>

</body>
</html>