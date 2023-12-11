<%@page import="com.sara.bean.Movies"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ include file="FindMovie.jsp"%>
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
<title>Find Movie Success</title>
</head>
<body>

	<center>
		<font color="white"><b>${bean}</b></font>
	</center>
</body>
</html>