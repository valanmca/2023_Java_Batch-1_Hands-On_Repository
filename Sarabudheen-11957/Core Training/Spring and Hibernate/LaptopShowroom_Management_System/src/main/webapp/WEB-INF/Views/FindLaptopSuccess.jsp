<%@page import="com.lsms.bean.Laptop"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ include file="FindLaptop.jsp"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
font {
	text-align: center;
	font-family: Fantasy;
	font-variant: small-caps;
	font-size: 25px;
	font-weight: lighter;
}
</style>
<meta charset="ISO-8859-1">
<title>Find Laptop Success</title>
</head>
<body>

	<center>
		<font color="#00008B"><b>${bean}</b></font>
	</center>
</body>
</html>