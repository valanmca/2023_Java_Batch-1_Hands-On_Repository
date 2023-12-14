<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.css" rel="stylesheet">
<style>
th {
	color: black;
	text-align: center;
	height: 110px;
	background-color: DarkOrange;
	background-image: linear-gradient(to bottom right, DarkOrange, White);
}

a {
	text-decoration: none;
	color: black;
	padding-top: 10px;
}
</style>
</head>


<body>
	<table align="center" width="80%" class="table table-hover">
		<tr>
			<th align="center" class="table-danger"><a href="InsertCustomer"
				target="content">INSERT</a></th>
		</tr>
		<tr>
			<th align="center" class="table-danger"><a href="DeleteCustomer"
				target="content">DELETE</a></th>
		</tr>
		<tr>
			<th class="table-danger"><a href="UpdateCustomer"
				target="content">UPDATE</a></th>
		</tr>
		<tr>
			<th class="table-danger"><a href="FindCustomer" target="content">FIND</a></th>
		</tr>
		<tr>
			<th class="table-danger"><a href="FindAllCustomer"
				target="content">FIND ALL</a></th>
		</tr>


	</table>

</body>
</html>