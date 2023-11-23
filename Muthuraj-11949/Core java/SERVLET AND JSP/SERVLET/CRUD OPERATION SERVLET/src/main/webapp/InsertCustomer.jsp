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
tr:hover {background-color: #D6EEEE;}


</style>
</head>
<body>
<br>
<form action="CUSController" method="post">
			<h3 align="center">CUSTOMER DETAILS</h3>

<table width='60%' align="center">
<tr><td>Customer Id </td><td> <input type="text" name="cusID"/></td></tr>
<tr><td>Customer Name </td><td> <input type="text" name="cusname"/></td></tr>
<tr><td>Customer Email </td><td> <input type="text" name="cusEmail"/></td></tr>
<tr><td>Customer Contact </td><td> <input type="text" name="cusContactNumber"/></td></tr>
<tr><td>Customer Location  </td><td> <input type="text" name="cusLocation"/></td></tr>
<tr><td colspan="2" align="center"><input  type="submit" value="Insert Customer" style="color:green; name="cus_button"/></td></tr>
</table>
</form>
</body>
</html>