<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    <%@ include file="FindVehicle.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<%-- JSTL Iterate code to iterate collection --%>
         <table align='center' class='table table-stripped w-75'><thead class='table-info'>
         <tr><th>Vehicle Id </th><th>Brand</th><th>Owner</th><th>Contact</th><th>Price</th></thead></tr>
         <tr><td>${vec.getId()}</td><td>${vec.getBrand()}</td><td>${vec.getOwner()}</td><td>${vec.getContact()}</td><td>${vec.getPrice()}</td></tr>
         </table>
</body>
</html>