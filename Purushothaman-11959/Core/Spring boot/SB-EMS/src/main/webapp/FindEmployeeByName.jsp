<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<h3 align="center">Find Employee</h3>
<form action="PerformFindByName" method="post">
<table width="60%" align="center">
   <tr><td>Enter Employee Name </td>
   <td><input type="text" name="ename">
   <!-- <select name="eid">
				<c:forEach items="${idList}" var="eid">
				<option>${eid}</option>
				</c:forEach></select> --></td></tr>
   <tr><td><input type="submit" value="Find Employee" name="ems"/></td></tr>
</table>
</form>

</body>
</html>