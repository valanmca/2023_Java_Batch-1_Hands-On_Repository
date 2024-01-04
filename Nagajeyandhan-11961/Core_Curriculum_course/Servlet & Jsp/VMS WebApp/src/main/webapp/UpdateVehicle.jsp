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
<form action="VMSController" method="post">
	<input type="number" name="id"/>
	<input type="text" name="name"/>
	<input type="number" name="price"/>
	<input type="submit" value="UpdateVehicle" name="vms_button"/>
</form>
</body>
</html>