<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="PerformUpdate" method="post">
<table width="60%" align="center">
<tr><td>Flight No</td><td><input type="text" name="flightno"/></td></tr>
<tr><td>Flight Type</td><td><input type="text" name="flighttype"/></td></tr>
<tr><td>Source</td><td><input type="text" name="source"/></td></tr>
<tr><td>Destination</td><td><input type="text" name="destination"/></td></tr>
<tr><td>Economy Seats Count</td><td><input type="text" name="economyseatscount"/></td></tr>
<tr><td>Business Seats Count</td><td><input type="text" name="businessseatscount"/></td></tr>
<tr><td>Economy Fare</td><td><input type="text" name="economyfare"/></td></tr>
<tr><td>Business Fare</td><td><input type="text" name="businessfare"/></td></tr>
<tr><td>   </td></tr>
<tr><td>   </td></tr>
<tr><td>   </td></tr>
<tr><td colspan="2" align="center"><input type="submit" value="Update Flight"/></td></tr>
<tr><td>   </td></tr>
<tr><td>   </td></tr>
<tr><td>   </td></tr>
</table>
</form>
</body>
</html>