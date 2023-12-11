<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Products</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet" />
</head>
<style>
.card {
	background-image: ;
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
			var id = document.getElementById("pId").value;
			var name = document.getElementById("pName").value;
			var quantity = document.getElementById("pQty").value;
			var price = document.getElementById("pPrice").value;

			if (id == null || id == "") {
				alert("Product Id can't be blank!!!");
				return false;
			} else if (!id.match(pass)) {
				alert("Enter valid Id!!!");
				return false;
			}

			if (name == null || name == "") {
				alert("Product Name can't be blank!!!");
				return false;
			} else if (!name.match(name)) {
				alert("Enter valid Product Name!!!");
				return false;
			}

			if (quantity == null || quantity == "") {
				alert("Product Quantity can't be blank!!!");
				return false;
			} else if (!quantity.match(pass)) {
				alert("Enter valid Product Quantity!!!");
				return false;
			}
			
			if (price == null || price == "") {
				alert("Product price can't be blank!!!");
				return false;
			} else if (!price.match(pass)) {
				alert("Enter valid Product price!!!");
				return false;
			}

		}
	</script>

	<div class="container" align="center">
		<br>
		<h3 align="center">
			<b>Update Products</b>
		</h3>
		<br>
		<div class="card" style="width: 50rem;">
			<div class="card-body">
				<form action="performUpdate" method="post">
					<div class="form-group row">
						<label for="Productid" class="col-sm-4 col-form-label">Product
							Id </label>
						<div class="col-sm-6">
							<input type="number" class="form-control" name="no" id="pId"
								placeholder="Enter Product id">
						</div>
					</div>
					<br>
					<div class="form-group row">
						<label for="Productname" class="col-sm-4 col-form-label">Product
							Name </label>
						<div class="col-sm-6">
							<input type="text" class="form-control" name="name" id="pName"
								placeholder="Enter Product Name">
						</div>
					</div>
					<br>
					<div class="form-group row">
						<label for="Productquantity" class="col-sm-4 col-form-label">Product
							Quantity </label>
						<div class="col-sm-6">
							<input type="text" class="form-control" name="quantity"
								id="pQty" placeholder="Enter Product Quantity">
						</div>
					</div>
					<br>
					<div class="form-group row">
						<label for="Productprice" class="col-sm-4 col-form-label">Product
							Price </label>
						<div class="col-sm-6">
							<input type="text" class="form-control" name="price"
								id="pPrice" placeholder="Enter Product Price">
						</div>
					</div>
					<br> <br> <input class="btn btn-primary" type="submit"
						value="Update Product" onclick="validate()" />
				</form>
			</div>
		</div>
	</div>
</body>
</html>
