<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
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
	<h3 align="center">Delete Employee</h3>
	<form action="PerformDelete" method="post">
		<table width="60%" align="center">
			<tr>
				<td>Enter Employee Id</td>
				<td><select name="eid">
				<c:forEach items="${idList}" var="eid">
				<option>${eid}</option>
				</c:forEach></select></td></tr>
			<tr>
				<td><input type="submit" value="Delete Employee" name="ems" /></td>
			</tr>
		</table>
	</form>

</body>
</html>