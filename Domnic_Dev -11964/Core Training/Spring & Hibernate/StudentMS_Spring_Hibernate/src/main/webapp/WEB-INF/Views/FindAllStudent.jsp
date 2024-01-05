<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<style>
.div {
	padding-left: 5%;
	width: 80%;
}
</style>
</head>
<body>


<br>
<br>
	<div class="div">
		<table class="table table-bordered table-striped">
			<thead>
				<tr>
					<th>Student Id</th>
					<th>Student Name</th>
					<th>Student Section</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${idList}" var="e">

					<tr>
						<td>${e.getStd_id()}</td>
						<td>${e.getStd_name()}</td>
						<td>${e.getStd_sec()}</td>
					</tr>

				</c:forEach>
			</tbody>
		</table>
	</div>





</body>
</html>