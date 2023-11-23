<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

table, th, td {
  border: 1px solid black;
  
}
</style>
</head>
<body>
<br>
<form action="CUSController" method="post">
<table width='60%' align="center">
<h3 align="center">CUSTOMER DETAILS</h3>
<tr><td>Customer Id </td><td> <input type="text" name="cusID"/></td></tr>
<tr><td colspan="2" align="center"><input type="submit" value="Delete Customer" name="cus_button"/></td></tr>
</table>
</form>
</body>
</html>