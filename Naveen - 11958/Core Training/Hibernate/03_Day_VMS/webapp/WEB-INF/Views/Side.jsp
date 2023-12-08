<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sidebar</title>
<link href="css/bootstrap.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style>
th {
	text-align: center;
}

#hover1:hover {
	background: #7ef29d;
	
}

table {
	margin-left: 10px;
}
a{
  text-decoration: none;
}

</style>
</head>
<body>
	<table align="center" width="50%" class="table">
		<tr>
			<th id="hover1" align="center"><a href="InsertVehicle"
				target="content"><font color='green'>INSERT</font></a></th>
		</tr>
		<tr>
			<th id="hover1"><a href="DeleteVehicle"
				target="content"><font color='red'>DELETE</font></a></th>
		</tr>
		<tr>
			<th id="hover1"><a href="UpdateVehicle" target="content"><font
					color='blue'>UPDATE</font></a></th>
		</tr>
		<tr>
			<th id="hover1"><a href="FindVehicle" target="content"><font
					color='#54B4D3'>FIND</font></a></th>
		</tr>
		<tr>
			<th id="hover1"><a href="FindAllVehicle" target="content"><font
					color='purple'>FIND ALL</font></a></th>
		</tr>
	</table>
</body>
</html>