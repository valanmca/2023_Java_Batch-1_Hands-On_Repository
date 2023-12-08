
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<link href="css/bootstrap.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>ALL VEHICLE DETAILS</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
<style>
td, th {
	text-align: center;
}

h2 {
	color: purple;
	text-align: center;
}
</style>
</head>
<body>
	<h2>VEHICLE DETAILS</h2><br>
	<%-- JSTL Iterate code to iterate collection --%>
         <table align='center' class='table table-stripped w-75'><thead class='table-info'>
         <tr><th>Vehicle Id </th><th>Brand</th><th>Owner</th><th>Contact</th><th>Price</th></thead></tr>
         <c:forEach items="${idList}" var="a">
         <tr><td>${a.getId()}</td><td>${a.getBrand()}</td><td>${a.getOwner()}</td><td>${a.getContact()}</td><td>${a.getPrice()}</td></tr>
         </c:forEach>
         </table>
</body>
</html>
