<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="FindEmployee.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	
<table>

		<tr>

			<th>E Id</th>
			<th>E Name</th>
			<th>E salary</th>

		</tr>
		<tr>
			<td>${bean.id}</td>
			<td>${bean.name}</td>
			<td>${bean.salary}</td>
		</tr>
	
</table>
</body>
</html>