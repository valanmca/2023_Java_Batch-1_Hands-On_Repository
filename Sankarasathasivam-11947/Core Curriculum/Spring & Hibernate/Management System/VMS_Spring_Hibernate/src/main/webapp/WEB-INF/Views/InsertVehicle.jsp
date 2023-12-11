<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Vehicles</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet" />
</head>
<style>
.card {
	background-image: linear-gradient(-225deg, #5D9FFF 0%, #B8DCFF 48%, #6BBBFF 100%);
}

body {
	font-weight: bold;
	font-family: Times New Roman;
	color: black;
}
</style>
<body>
	<script>
		function validate() {
			var name = "^[A-Z a-z]+$";
			var pass = "^[0-9.]+$";
			var id = document.getElementById("vid").value;
			var brand = document.getElementById("vbrand").value;
			var mile = document.getElementById("vmileage").value;

			if (id == null || id == "") {
				alert("Vehicle Id can't be blank!!!");
				return false;
			} else if (!id.match(pass)) {
				alert("Enter valid ID!!!");
				return false;
			}

			if (brand == null || brand == "") {
				alert("Vehicle Brand Name can't be blank!!!");
				return false;
			} else if (!brand.match(name)) {
				alert("Enter valid Brand Name!!!");
				return false;
			}

			if (mile == null || mile == "") {
				alert("Vehicle Mileage can't be blank!!!");
				return false;
			} else if (!mile.match(pass)) {
				alert("Enter valid Vehicle Mileage!!!");
				return false;
			}

		}
	</script>

	<div class="container" align="center">
		<br>
		<h3 align="center">
			<b>Insert Vehicles</b>
		</h3>
		<br>
		<div class="card" style="width: 50rem;">
			<div class="card-body">
				<form action="performInsert" method="post">
					<div class="form-group row">
						<label for="Vehicleid" class="col-sm-4 col-form-label">Vehicle
							Id </label>
						<div class="col-sm-6">
							<input type="number" class="form-control" name="no" id="vid"
								placeholder="Enter Vehicle id">
						</div>
					</div>
					<br>
					<div class="form-group row">
						<label for="Vehicletype" class="col-sm-4 col-form-label">Vehicle
							Brand </label>
						<div class="col-sm-6">
							<input type="text" class="form-control" name="brand" id="vbrand"
								placeholder="Enter Vehicle Type">
						</div>
					</div>
					<br>
					<div class="form-group row">
						<label for="Vehiclename" class="col-sm-4 col-form-label">Vehicle
							Mileage </label>
						<div class="col-sm-6">
							<input type="text" class="form-control" name="mileage"
								id="vmileage" placeholder="Enter Vehicle Name">
						</div>
					</div>
					<br> <br> <input class="btn btn-primary" type="submit"
						value="Insert Vehicle" onclick="validate()" />
				</form>
			</div>
		</div>
	</div>
</body>
</html>
