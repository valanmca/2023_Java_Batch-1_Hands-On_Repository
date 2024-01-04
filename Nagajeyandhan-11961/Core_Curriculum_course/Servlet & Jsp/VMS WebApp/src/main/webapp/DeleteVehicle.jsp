<%--<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
	<link href="css/bootstrap.css" rel="stylesheet" >
</head>
<body>
<form action="VMSController" method="post">
	<input type="number" name="id"/>
	<input type="submit" value="DeleteVehicle" name="vms_button"/>

</form>

</body>
</html> --%>


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
    <h3 align="center">Delete Vehicle</h3>
    <form action="VMSController" method="post">
        <table width="60%" align="center">
            <tr>
                <td>Enter Vechile Id</td>
                <td><select name="eid">
                <c:forEach items="${list}" var="a">
                <option><c:out value="${a.getVechicleId()}"/></option>
                </c:forEach></select></td></tr>
            <tr>
                <td><input type="submit" value="DeleteVehicle" name="vms_button" /></td>
            </tr>
        </table>
    </form>

</body>
</html>