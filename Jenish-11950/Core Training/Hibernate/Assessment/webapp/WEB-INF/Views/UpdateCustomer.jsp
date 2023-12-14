<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<style>
.button {
	background-color: #008CBA;
	border: none;
	color: white;
	padding: 15px 32px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	border-radius: 12px;
}

h2 {
	text-align: center;
}

.form-control {
	border: 2px solid black;
}

.img {
	background-image:
		url("https://media.istockphoto.com/id/614623414/tr/foto%C4%9Fraf/abstract-orange-watercolor-background.jpg?s=170667a&w=0&k=20&c=LArjaHKL70p3K7_4heAmgTKf_7iPqn2aWOmphkZAU-A=");
	background-color: #cccccc;
	height: 570px;
	width: 1200px;
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
	position: relative;
}
</style>
</head>
<body>
	<div class="img">
		<br> <br> <br>
		<h2>Update Customer Details</h2>
		<br>
		<form action="PerformUpdate" method="post">
			<table width="60%" align="center" cellpadding="10">
				<tr>
					<td><b>Customer Id</b></td>
					<td><input type="number" name="id" class="form-control w-100"
						placeholder="Enter Customer ID" required /></td>
				</tr>
				<tr>
					<td><b>Customer Name</b></td>
					<td><input type="text" name="name" class="form-control w-100"
						placeholder="Enter Customer Name" required /></td>
				</tr>
				<tr>
					<td><b>Customer Email</b></td>
					<td><input type="text" name="email" class="form-control w-100"
						placeholder="Enter Email " required /></td>
				</tr>
				<tr>
					<td><b>Customer Contactnumber</b></td>
					<td><input type="number" name="number"
						class="form-control w-100" placeholder="Enter Contactnumber"
						required /></td>
				</tr>
				<tr>
					<td><b>Customer Location</b></td>
					<td><input type="text" name="location"
						class="form-control w-100" placeholder="Enter Customer Location"
						required /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Update Customer" class=button /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>