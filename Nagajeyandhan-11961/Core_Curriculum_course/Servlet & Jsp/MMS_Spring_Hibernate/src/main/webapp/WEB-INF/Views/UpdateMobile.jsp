<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>Update Page</title>
<style>
* {
	padding: 0;
	margin: 0;
	box-sizing: border-box;
}

body {
	background: linear-gradient(90deg, rgba(2, 0, 36, 1) 0%,
		rgba(75, 14, 154, 1) 35%, rgba(0, 212, 255, 1) 100%);
	font-family: 'poppins', sans-serif;
}

form {
	width: 24%;
	background-color: white;
	padding: 50px;
	border-radius: 20px;
	margin-top: 10px;
}

.btn-primary {
	width: 100%;
	border: none;
	border-radius: 50px;
	background: linear-gradient(90deg, rgba(2, 0, 36, 1) 0%,
		rgba(75, 14, 154, 1) 35%, rgba(0, 212, 255, 1) 100%);
}

.form-control {
	color: rgba(0, 0, 0, 87);
	border-bottom-color: rgba(0, 0, 0, .47);
	box-shadow: none !important;
	border: none;
	border-bottom: 1px solid black;
	border-radius: 4px 4px 0 0;
}

h4 {
	font-size: 2rem !important;
	font-weight: 700;
}

@media only screen and (max-width:500px) {
	form {
		width: 100%;
	}
}
</style>
</head>
<body>
	<script>
		function validate() {
			var name = "^[A-Z a-z]+$";
			var pass = "[0-9]+$";
			var mname = "^[A-Z a-z 0-9]+$"
			
			var id = document.getElementById("mid").value;
			var brand = document.getElementById("mBrand").value;
			var model = document.getElementById("mModel").value;
			var price = document.getElementById("mPrice").value;
	<%--   Id validation--%>
		if (id == null || id == "") {
				alert("Id cannot be blank");
				return false;
			} else if (!id.match(pass)) {
				alert("Enter valid id");
				return false;
			}
	<%--   Brand name validation--%>
		if (brand == null || brand == "") {
				alert("Brand Name cannot be blank");
				return false;
			} else if (!brand.match(name)) {
				alert("Enter valid Brand Name");
				return false;
			}
	<%--   Model name validation--%>
		if (model == null || model == "") {
				alert("Model Name cannot be blank");
				return false;
			} else if (!model.match(mname)) {
				alert("Enter valid Model Name");
				return false;
			}
	<%--   Price validation--%>
		if (price == null || price == "") {
				alert(" Price cannot be blank");
				return false;
			} else if (!price.match(pass)) {
				alert("Enter valid Price");
				return false;
			}
		}
	</script>
	<div class="container-fluid responsive">
		<form class="mx-auto" action="performUpdate" method="post">
			<h4 class="text-center">Update</h4>
			<div class="form-floating mb-3 mt-5">
				<input type="number" class="form-control" name="mobileID" id="mid">
				<label for="mid">Mobile Id</label>
			</div>
			<div class="form-floating mb-3 mt-5">
				<input type="text" class="form-control" name="mobileBrand" id="mBrand"> 
			<label for="mBrand">Mobile BrandName</label>
			</div>
			<div class="form-floating mb-3 mt-5">
				<input type="text" class="form-control" id="mModel" name="mobileModel"> 
				<label for="mModel">Mobile ModelName</label>
			</div>
			<div class="form-floating mb-3 mt-5">
				<input type="number" class="form-control" id="mPrice" name="mobilePrice"> 
				<label for="mPrice">Mobile Price</label>
			</div>
			<button type="submit" onclick="validate()" value="UpdateMobile"
				class="btn btn-primary mt-4">Update Mobile</button>
		</form>
	</div>
</body>
</html>