<%@page import="java.util.LinkedList"%>
<%@page import="com.mms.bean.Movies"%>
<%@page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<link href="css/bootstrap.css" rel="stylesheet">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find All Movies</title>
</head>
<body>
	<table width='60%' align='center' class="table table-striped">
		<trclass="table-primary" >
		<th>Movie Id</th>
		<th>Movie Name</th>
		<th>Movie Type</th>
		<th>Movie Language</th>
		<th>Movie Duration</th>
		</tr>
		<c:forEach items="${list}" var="a">
			<tr class="table-primary">
				<th>${a.getMovie_Id()}</th>
				<th>${a.getMovie_Name()}</th>
				<th>${a.getMovie_Type()}</th>
				<th>${a.getMovie_Language()}</th>
				<th>${a.getMovie_Duration()}</th>
			</tr>
		</c:forEach>
	</table>
</body>
</html>