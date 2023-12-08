<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Vehicle</title>
<link href="css/bootstrap.css" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
<style>
h2 {
	color: red;
	text-align: center;
}
</style>
</head>
<body>
	<h2>DELETE VEHICLE DETAILS</h2>
	<br>
	<form action="PerformDelete" method="post">
		<table width="60%" align="center" class="table table-bordered w-50">
			<tr>
				<td><b>Vehicle Id</b></td>
			</tr>


			<tr>
				<td><select name="id">

						<c:forEach items="${idList}" var="id">

							<option>${id}</option>


						</c:forEach>

				</select></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" class="btn btn-outline-danger"
					value="Delete Vehicle" /></td>
			</tr>
		</table>
	</form>
</body>
</html>
