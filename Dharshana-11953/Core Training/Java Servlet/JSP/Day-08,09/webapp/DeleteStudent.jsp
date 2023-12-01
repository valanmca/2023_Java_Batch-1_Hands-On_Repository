<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<br><br>
<h1><b>Delete Student Details</b></h1>
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
<form action="SMSController" method="post">

<table width="60%" align="center" class="table table-striped w-50" border="5">
	<tr><td><b>Student Id</b></td></tr>
	
	
	<tr><td><select name="StuId">
	
	<c:forEach items="${msg}" var="a">
	
	<option><c:out value="${a.getId() }"/></option>
	
	</c:forEach>
	</select>
	</td></tr>
<tr><td><input type="submit"  name="sms_button" class="btn btn-outline-success" value="Delete Student" /></td></tr>
</table>
</form>
</body>
</html>