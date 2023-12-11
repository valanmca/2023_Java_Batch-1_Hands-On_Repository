<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
select {
        width:180px;
    }
</style>
</head>
<body>
<h3 align="center">Find Employee</h3>
<form action="EMSController" method="post">
<table width="60%" align="center">
   <tr><td>Enter Employee Id </td>
   <td>
   <select name="eid">
	<c:forEach items="${list}" var="a">
	<option><c:out value="${a.getId()}"/></option>
	</c:forEach>
	</select></td></tr>
   <tr><td><input type="submit" value="Find Employee" name="ems"/></td></tr>
</table>
</form>

</body>
</html>