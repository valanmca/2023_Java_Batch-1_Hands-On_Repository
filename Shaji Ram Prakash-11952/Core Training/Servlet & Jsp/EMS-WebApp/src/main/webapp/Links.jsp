<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<title>Insert title here</title>
<style>
body {
	padding: 60px 10px 10px 20px;
}

a {
	padding: 10px 40px 10px 40px;
	font-size: larger;
	color: white;
	font-weight: bold;
	text-decoration: none;
	color: white;
}

</style>
</head>
<body>
	<%-- <table align="center" width=50%>
		<tr>
			<td><button><a href="InsertEmployee.jsp" target="content">Insert<br><br></a></button></td>
		</tr>
		<tr>
			<td><a href="DeleteEmployee.jsp" target="content">Delete<br><br></a></td>
		</tr>
		<tr>
			<td><a href="UpdateEmployee.jsp" target="content">Update<br><br></a></td>
		</tr>
		<tr>
			<td><a href="FindEmployee.jsp" target="content">Find<br><br></a></td>
		</tr>
		<tr>
			<td><a href="EMSController" target="content">FindALL<br><br></a></td>
		</tr>
	</table>--%>
	<div class="btn-group-vertical" role="group"
		aria-label="Vertical button group">
		<button type="button" class="btn btn-primary">
			<a href="InsertEmployee.jsp" target="content">Insert</a>
		</button>
		<br>
		<button type="button" class="btn btn-danger">
			<a href="EMSController?del='a'" target="content">Delete</a>
		</button>
		<br>
		<button type="button" class="btn btn-warning">
			<a href="UpdateEmployee.jsp" target="content">Update</a>
		</button>
		<br>
		<button type="button" class="btn btn-info">
			<a href="EMSController?find='c'" target="content">Find</a>
		</button>
		<br>
		<button type="button" class="btn btn-success">
			<a href="EMSController?findAll='b'" target="content">FindALL</a>
		</button>
	</div>
	<%-- <ul style="list-style-type:none;" align="center">
<li><a href="InsertEmployee.jsp" target="content">Insert</a></li>
<li><a href="DeleteEmployee.jsp" target="content">Delete</a></li>
<li><a href="UpdateEmployee.jsp" target="content">Update</a></li>
<li><a href="FindEmployee.jsp" target="content">Find</a></li>
<li><a href="EMSController" target="content">FindALL</a></li>
</ul>--%>
</body>
</html>