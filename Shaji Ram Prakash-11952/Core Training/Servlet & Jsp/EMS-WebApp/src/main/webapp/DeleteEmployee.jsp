<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<title>Insert title here</title>
<style>
.input-group{
padding-left:13%;
width: 85%;
}
</style>
</head>
<body>
<br><br>
<form action="EMSController" method="post">
<center><h1>Delete Employee:</h1></center>
<br>
<div class="input-group" align="center">
  <div class="input-group mb-3">
  <span class="input-group-text" id="inputGroup-sizing-default">Employee Id :</span>
  <select class="form-select" id="inputGroupSelect01" name="eid">
  <option>Choose...</option>
    <c:forEach items="${list}" var="a">
    <option><c:out value="${a.getId()}"/></option>
    </c:forEach>
    </select>
</div>
</div>
<center>
	<input type="submit" class="btn btn-danger" value="DeleteEmployee" name="ems_button" />
</center>
</form>
 </body>
</html>