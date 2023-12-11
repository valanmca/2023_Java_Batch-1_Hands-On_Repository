<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<link href="css/bootstrap.css" rel="stylesheet">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">

<!DOCTYPE html>
<html>
<head>
<style>
body {
	font-family: Fantasy;
	font-variant: small-caps;
	font-size: 15px;
}

table {
	text-align: center;
	color: white;
	height: 70%;
	width: 70%;
	margin-left: 10%;
	margin-top: 20px;
}

input {
	color: black;
	width: 5cm;
	height: 1cm;
	border: 2px solid white;
	border-radius: 20px;
}
</style>
<meta charset="ISO-8859-1">
<title>Delete Movie</title>
</head>
<body style="background: #0B0c10">
	<form action="PerformDelete" method="post">
		<table width="60%" align="center">
			<tr>
				<td>Movie Id</td>
				<td><select name="id" class="form-control" required>
						<c:forEach items="${idList}" var="a">
							<option>${a}</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Delete Movie"
					class="btn btn-danger"></td>
		</table>
	</form>

</body>
</html>