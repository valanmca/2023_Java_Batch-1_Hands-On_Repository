<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Doctor</title>
<style>
.mb-3 {
	width: 50%;
	padding-left: 19%;
	padding-top: 1%;
}

.update {
	padding-left: 30%;
}
</style>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
	
<script >
	
	function validate()
	{
	    var name="^[A-Z a-z]+$";   
	    
	    var pass="[0-9]+$";
	    var did=document.getElementById("DId").value;
	    var dname=document.getElementById("DName").value;
	    var dage=document.getElementById("DAge").value;
	    var demail=document.getElementById("DEmail").value;
	    var dspec=document.getElementById("DSpec").value;
	    var dphno=document.getElementById("DPhno").value;
	    var dloc=document.getElementById("DLoc").value;
	    
	    
	    <%--   Id validation--%>
	    
	    if (did==null || did=="")
	        {
	        alert("Id cannot be blank");
	        return false;
	        
	        }
	    else if(!did.match(pass))
	        {
	        alert("Enter valid id");
	        return false;
	        
	        }
	    
	    <%--   name validation--%>
	    
	    if (dname==null || dname=="")
	    {
	    alert("Name cannot be blank");
	    return false;
	    
	    }
	else if(!dname.match(name))
	    {
	    alert("Enter valid Name");
	    return false;
	    
	    }
	    
 <%--   Age validation--%>
	    
	    if (dage==null || dage=="")
	        {
	        alert("Age cannot be blank");
	        return false;
	        
	        }
	    else if(!dage.match(pass))
	        {
	        alert("Enter valid Age");
	        return false;
	        
	        }
	    
 <%--   email validation--%>
	    
	    if (demail==null || demail=="")
	    {
	    alert("Email cannot be blank");
	    return false;
	    
	    }
	    
 <%--   Spec validation--%>
	    
	    if (dspec==null || dspec=="")
	    {
	    alert("Spec cannot be blank");
	    return false;
	    
	    }
	else if(!dspec.match(name))
	    {
	    alert("Enter valid Spec");
	    return false;
	    
	    }
	    
 <%--   Phno validation--%>
	    
	    if (dphno==null || dphno=="")
	        {
	        alert("Phno cannot be blank");
	        return false;
	        
	        }
	    else if(!dphno.match(pass))
	        {
	        alert("Enter valid Phno");
	        return false;
	        
	        }
  <%--   Location validation--%>
	    
	    if (dloc==null || dloc=="")
	    {
	    alert("Location cannot be blank");
	    return false;
	    
	    }
	else if(!dloc.match(name))
	    {
	    alert("Enter valid Location");
	    return false;
	    
	    }
	    
	    
	}
	    
	    
	
	
	
	</script>
</head>
<body>

	<form action="DmsController" method="post">
		<div class="mb-3">
			<input placeholder="Doctor ID" type="text" class="form-control"
				name="did" id="DId">
		</div>
		<div class="mb-3">
			<input placeholder="Doctor Name" type="text" class="form-control"
				name="dname" id="DName">
		</div>
		<div class="mb-3">
			<input placeholder="Doctor Age" type="text" class="form-control"
				name="dage" id="DAge">
		</div>
		<div class="mb-3">
			<input placeholder="Doctor Email" type="text" class="form-control"
				name="demail" id="DEmail">
		</div>
		<div class="mb-3">
			<input placeholder="Doctor Specialization" type="text" class="form-control"
				name="dspec" id="DSpec">
		</div>
		<div class="mb-3">
			<input placeholder="Doctor Contact Number" type="text" class="form-control"
				name="dphno" id="DPhno">
		</div>
		<div class="mb-3">
			<input placeholder="Doctor Location" type="text" class="form-control"
				name="dloc" id="DLoc">
		</div>
		<div class="update">
			<button type="submit" class="btn btn-primary" value="Update Doctor"
				name="dms_button" onclick="validate()">Update</button>
		</div>
		
	</form>

</body>
</html>