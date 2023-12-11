<%@page import="java.util.ArrayList"%>
<%@page import="com.sms.bean.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<%@ include file="FindStudent.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container-fluid ">
		<div class="col-md-8 offset-md-2 ">
			<br>
			<div class="alert alert-light" role="alert">
				<b>${bean}</b>
			</div>
		</div>

	</div>

	</font>
	</center>
</body>
</html>



