<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="FindEmployeee.jsp"%>
<!DOCTYPE html>
<html>
<head>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 20%;
}

td, th{
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}

.center{
  margin-left: auto;
  margin-right: auto;
}
</style>
</head>
<body>
<h2></h2>
<table class="center">
<tr>
	<th>Id</th>
	<th>Name</th>
	<th>Salary</th>
	</tr>									
	<tr>
	   <td>${emp.getEmpid()}</td>
		<td>${emp.getName()}</td>
		<td>${emp.getSalary()}</td>
	</tr>
</table>
</body>
</html>






