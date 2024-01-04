<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>Index Page</title>
<style>
* {
	padding: 0;
	margin: 0;
	box-sizing: border-box;
}
body{
	background:linear-gradient(90deg, rgba(2,0,36,1)0%, rgba(75,14,154,1)35%, rgba(0,212,255,1)100%);
	font-family:'poppins',sans-serif;
}
form{
	width:24%;
	background-color:white;
	padding:50px;
	border-radius:20px;
	margin-top:100px;
}
.btn-primary{
	width:100%;
	border:none;
	border-radius:50px;
	background:linear-gradient(90deg, rgba(2,0,36,1)0%, rgba(75,14,154,1)35%, rgba(0,212,255,1)100%);
}
.form-control{
	color:rgba(0,0,0,87);
	border-bottom-color:rgba(0,0,0,.47);
	box-shadow:none !important;
	border:none;
	border-bottom: 1px solid black;
	border-radius: 4px 4px 0 0;
}
.form-label{
	font-family:800 !important;
}
h4{
	font-size:2rem !important;
	font-weight:700;
}

@media only screen and (max-width:500px){
	form{
	width:100%;
	}
}
</style>
</head>
<body>
<script>
		function validate() {
			var name = "^[A-Z a-z]+$";
			var pass = "[0-9]+$";

			var id = document.getElementById("vid").value;
			var vName = document.getElementById("vname").value;
			var price = document.getElementById("vPrice").value;
	<%--   Id validation--%>
		if (id == null || id == "") {
				alert("Id cannot be blank");
				return false;
			} else if (!id.match(pass)) {
				alert("Enter valid id");
				return false;
			}
	<%--   name validation--%>
		if (vName == null || vName == "") {
				alert("Name cannot be blank");
				return false;
			} else if (!vName.match(name)) {
				alert("Enter valid Name");
				return false;
			}
	<%--   Number validation--%>
		if (price == null || price == "") {
				alert(" Price cannot be blank");
				return false;
			} else if (!price.match(name)) {
				alert("Enter valid Price");
				return false;
			}
		}
	</script>
	<div class="container-fluid responsive">
		<form class="mx-auto"  action="performUpdate" method="post">
		<h4 class="text-center">Update</h4>
      <div class="form-floating mb-3 mt-5">
        <input type="number" class="form-control" name="vNo" id="vid">
        <label for="vid">Vehicle ID</label>
      </div>
      <div class="form-floating mb-3 mt-5">
        <input type="text" class="form-control" name="vName" id="vname">
        <label for="vname">Vehicle Name</label>
      </div>
      <div class="form-floating mb-3 mt-5">
        <input type="number" class="form-control" id="vPrice" name="vPrice">
        <label for="vPrice">Vehicle Price</label>
      </div>
			<button type="submit" onclick="validate()" value="UpdateVehicle" class="btn btn-primary mt-4" >UpdateVehicle</button>
		</form>
	</div>
</body>
</html>