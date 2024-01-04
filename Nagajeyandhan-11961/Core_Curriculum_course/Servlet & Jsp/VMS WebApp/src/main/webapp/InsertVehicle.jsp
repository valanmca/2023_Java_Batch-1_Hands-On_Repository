<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
	<link href="css/bootstrap.css" rel="stylesheet" >

</head>
<body>
<br><br>
<form action="VMSController" method="post">
<center>

		
	<div class="card">
            <div class="card-body">
                <div class="table table-bordered responsive" style="width:70%">
                <br>
                    <table>
                        <div class="input-group mb-3 responsive" style="width: 30%; margin-left:5%">
						  <input type="number" class="form-control" name="id" placeholder="Enter Id" >
						</div>
						
						<div class="input-group mb-3 responsive" style="width: 30%; margin-left: 5%">
						  <input type="text" class="form-control" name="name" placeholder="Enter Name" >
						</div>
						
						<div class="input-group mb-3 responsive" style="width: 30%; margin-left: 5%">
						  <input type="number" class="form-control" name="price" placeholder="Enter Price">
						</div>
						
						<input type="submit" value="InsertVehicle" name="vms_button" class="btn btn-primary" />
				
                    </table>
                    <br>
                </div>
            </div>
        </div>
	
</form>
</center>

</body>
</html>