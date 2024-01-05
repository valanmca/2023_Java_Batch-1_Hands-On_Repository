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
form{

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
	    var vmanufac=document.getElementById("VManufacturer").value;
	    
	    
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
	    
	    
	<%--   Manufacturer validation--%>
	    
	    if (vmanufac==null || vmanufac=="")
	    {
	    alert("Manufacturer cannot be blank");
	    return false;
	    
	    }
	else if(!vmanufac.match(name))
	    {
	    alert("Enter valid manufacturer");
	    return false;
	    
	    }

	    
	}
	    

	
	
	</script>
	
	
	
</head>
<body>
	
	<br>
	<br>

	<form action="PerformInsert" method="post" >
		<div class="mb-3">
			<input placeholder="Vehicle ID" type="text" class="form-control"
				name="vId" id="VId">
		</div>
		<div class="mb-3">
			<input placeholder="Vehicle Name" type="text" class="form-control"
				name="vName" id="VName">
		</div>
		<div class="mb-3">
			<input placeholder="Vehicle Manufacturer" type="text"
				class="form-control" name="vManufacturer" id="VManufacturer">
		</div>


		<div class="insert">
			<button type="submit" class="btn btn-primary" value="Insert Vehicle"  onclick="validate()">Insert</button>
		</div>
	</form>

</body>
</html>