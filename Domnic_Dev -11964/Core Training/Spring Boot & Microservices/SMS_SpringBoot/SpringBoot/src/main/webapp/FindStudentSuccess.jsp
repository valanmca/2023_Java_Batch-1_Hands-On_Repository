<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="FindStudent.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	
<table>

		<tr>

			<th>S Id</th>
			<th>S Name</th>
			<th>S section</th>

		</tr>
		<tr>
			<td>${bean.std_id}</td>
			<td>${bean.std_name}</td>
			<td>${bean.std_sec}</td>
		</tr>
	
</table>
</body>
</html>