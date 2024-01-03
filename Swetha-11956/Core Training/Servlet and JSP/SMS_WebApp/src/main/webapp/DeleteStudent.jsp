<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Student</title>
<link rel="stylesheet" href="css/bootstrap.css">

<style>
table {
	margin-left: 25%;
	margin-top: 5%;
}

td {
	padding: 10px;
}
</style>
</head>
<body>
<form action="SMSController" method="post">
<table>
		<tr>
			<td>Enter Student Rollno </td>
			<td>:</td>
			
		
		<td><select name="sid">
                        <c:forEach var="d" items="${list}">
                            <option><c:out value="${d.getRno()}" />
                            </option>
                        </c:forEach>
                </select></td>
		
		<tr>
			<td colspan="3" align="center"><input type="submit"
				class="btn btn-secondary " value="Delete Student" name="sms_button"/></td>
		</tr>
</table>

</form>

</body>
</html>