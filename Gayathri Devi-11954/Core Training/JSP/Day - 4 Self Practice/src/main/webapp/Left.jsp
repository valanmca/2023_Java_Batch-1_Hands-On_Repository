<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<title>Hello, world!</title>
<style>
th {
	background-color: navy;
	color: white;
}

a {
	text-decoration: none;
	color:navy;
}
/* .table{
height:400px;
text-align:center;
}

 *//* .vl {
margin-top:-300px;
  border-right: 6px solid green;
  height: 700px;
  padding-left:50px;
}
 */

</style>
</head>
<body>
<!-- <br><br><br> -->
	<div class="container">
		<table class="table table-hover">
			<tr>
				<th><a href="InsertStudent.jsp" target="content">Insert</a></th>
			</tr>
			<tr>
				<th><a href="UpdateStudent.jsp" target="content">Update</a></th>
			</tr>
			<tr>
				<th><a href="DeleteStudent.jsp" target="content">Delete</a></th>
			</tr>
			<tr>
				<th><a href="SearchStudent.jsp" target="content">Find /
						Search</a></th>
			</tr>
			<tr>
				<th><a href="SmsControllerServlet" target="content">View
						All</a></th>
			</tr>
		</table>
	</div>
<!-- 	<div class="vl"></div> -->
</body>
</html>