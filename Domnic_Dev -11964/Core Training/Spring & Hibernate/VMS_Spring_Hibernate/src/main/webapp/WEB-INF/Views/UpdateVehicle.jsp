<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.mb-3 {
	width: 50%;
	padding-left: 19%;
	padding-top: 2%;
}

.insert {
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
	    var pass="^[0-9]+$";
	    
	    var vid=document.getElementById("VId").value;
	    var vname=document.getElementById("VName").value;
	    var vtype=document.getElementById("VType").value
	    var vnumber=document.getElementById("VNumber").value
	    var oname=document.getElementById("OName").value

	    
	    <%--   Id validation--%>
	    
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
	    
	    <%--   name validation--%>
	    
	    if (vname==null || vname=="")
	    {
	    alert("Name cannot be blank");
	    return false;
	    
	    }
	else if(!vname.match(name))
	    {
	    alert("Enter valid Name");
	    return false;
	    
	    }
	    
 <%--   type validation--%>
	    
	    if (vtype==null || vtype=="")
	    {
	    alert("Vehicle type cannot be blank");
	    return false;
	    
	    }
	    
 <%--   vnumber validation--%>
	    
	    if (vnumber==null || vnumber=="")
	    {
	    alert("Vehicle Number cannot be blank");
	    return false;
	    
	    }
	    
   <%--   owner name validation--%>
	    
	    if (oname==null || oname=="")
	    {
	    alert("Name cannot be blank");
	    return false;
	    
	    }
	else if(!oname.match(name))
	    {
	    alert("Enter valid Name");
	    return false;
	    
	    }
	    	    
	}
	    

	
	
	</script>

</head>
<body>
	
	<br>
	<br>

	<form action="PerformUpdate" method="post" >
		<div class="mb-3">
			<input placeholder="Vehicle ID" type="text" class="form-control"
				name="vId" id="VId">
		</div>
		
		<div class="mb-3">
			<input placeholder="Vehicle Type" type="text" class="form-control"
				name="vType" id="VType">
		</div>
		
		<div class="mb-3">
			<input placeholder="Vehicle Name" type="text"
				class="form-control" name="vName" id="VName">
		</div>
		
		<div class="mb-3">
			<input placeholder="Vehicle Number" type="text"
				class="form-control" name="vNumber" id="VNumber">
		</div>
			<div class="mb-3">
			<input placeholder="Owner Name" type="text"
				class="form-control" name="oName" id="OName">
		</div>
		
        <div class="insert">
			<button type="submit" class="btn btn-primary" value="Update Vehicle" onclick="validate()">Update</button>
		</div>
	</form>

</body>
</html>