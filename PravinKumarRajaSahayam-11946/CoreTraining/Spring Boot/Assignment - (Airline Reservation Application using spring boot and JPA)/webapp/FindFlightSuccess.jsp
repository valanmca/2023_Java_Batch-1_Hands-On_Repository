<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="FindFlight.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<br>
<center>
<table align="center">
<tr>
<th>
<td><b>Flight No</b></td>
<td><b>Flight Type</b></td>
<td><b>Source</b></td>
<td><b>Destination</b></td>
<td><b>Economy Seats Count</b></td>
<td><b>Business Seats Count</b></td>
<td><b>Economy Fare</b></td>
<td><b>Business Fare</b></td>
</th>
</tr>
<tr align="center">
<th>
<td>${air.flightno}</td>
<td>${air.flighttype}</td>
<td>${air.source}</td>
<td>${air.destination}</td>
<td>${air.economyseatscount}</td>
<td>${air.businessseatscount}</td>
<td>${air.economyfare}</td>
<td>${air.businessfare}</td>
</th>
</tr>
</table>
</body>
</html>
