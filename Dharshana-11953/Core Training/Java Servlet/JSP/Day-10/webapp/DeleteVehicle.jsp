<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<br><br>
<h1><b>Delete Vehicle Details</b></h1>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.css" rel="stylesheet">
<style>
h1{
text-align: center;
color:blue;
}
</style>
</head>
<body>
<br><br>
<form action="VMSController" method="post">

<table width="60%" align="center" class="table table-striped w-50" border="5">
	<tr><td><b>Vehicle Id</b></td></tr>
	
	
	<tr><td><select name="VecId">
	
	<c:forEach items="${msg}" var="a">
	
	<option><c:out value="${a.getId() }"/></option>
	
	</c:forEach>
	</select>
	</td></tr>
<tr><td><input type="submit"  name="vms_button" class="btn btn-outline-success" value="Delete Vehicle" /></td></tr>
</table>
</form>
</body>
</html>