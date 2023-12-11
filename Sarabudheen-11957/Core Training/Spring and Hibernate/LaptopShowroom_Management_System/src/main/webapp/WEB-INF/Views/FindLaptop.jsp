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
	color: #0073CF;
	height: 40%;
	width: 40%;
	margin-left: 30%;
	margin-top: 20px;
	border: 2px solid #0073CF;
	border-radius: 20px;
}

input {
	color: 0073CF;
	width: 5cm;
	height: 1cm;
	border: 2px solid white;
	border-radius: 20px;
}
</style>
<meta charset="ISO-8859-1">
<title>Find Movie</title>
</head>
<body style="background: #FAF9F6">
	<form action="PerformFind" method="post">
		<table width="60%" align="center">
			<tr>
				<td>Laptop Id</td>
				<td><select name="id" class="form-control" required>
						<c:forEach items="${idList}" var="a">
							<option>${a}</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Find Laptop"
					class="btn btn-primary"></td>
		</table>
	</form>

</body>
</html>