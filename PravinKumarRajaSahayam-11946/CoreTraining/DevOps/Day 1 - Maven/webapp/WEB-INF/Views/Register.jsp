<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3 align="center">Carz.com</h3>
<form action="PerformInsert" method="post">
<table align="center">
<tr><td><b>Car No : </b></td>
<td><input type="text" name="carNo" id="carNo"/>
</td>
</tr>
<tr>
<td><b>Manufacturer : </b></td>
<td>
<select name="Manufacturer" id="Manufacturer">  
<option value = "VM"> VM 
</option>  
<option value = "Hyundai"> Hyundai   
</option>  
<option value = "Honda"> Honda  
</option>  
<option value = "Suzuki"> Suzuki  
</option>  
</select> 
</td> 
</tr>
<tr>
<td><b>Model : </b></td>
<td>
<select name="Model" id="Model">
  <option value = "Polo"> Polo
</option>  
<option value = "Creta"> Creta   
</option>  
<option value = "City"> City  
</option>  
<option value = "Civic"> Civic
</option>  
</select>
</td>
</tr>
<tr> 
<td><b>KmsRan : </b></td>
<td><input type="text" name="kmsRan" id="kmsRan"/></td>
</tr>
<tr> 
<td><b>Price Expected : </b></td>
<td><input type="text" name="priceExpected" id="priceExpected"/></td>
</tr>
<tr> 
<td><b>No Of Owners : </b></td>
<td><input type="text" name="noOfOwners" id="noOfOwners"/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Register" name="Register">
</tr>
</table>
</form>
</body>
</html>