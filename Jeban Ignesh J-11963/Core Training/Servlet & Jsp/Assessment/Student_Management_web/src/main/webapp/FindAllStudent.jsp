<%@page import="com.student.bean.Student"%>
<%@page import="com.student.dao.StudentDAO"%>
<%@page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.css">
<style>
select{
width:50%
}
</style>
</head>
<body>
<br><br><h3 align='center'>Find All Students</h3>
	<div class="container">

		<table class="table table-striped">
		<thead align="center">
			<tr scope="row">
				<th scope="col">Student Roll No</th>
				<th scope="col">Student Name</th>
				<th scope="col">Student Email</th>
				<th scope="col">Student Section</th>
				<th scope="col">Student Location</th>

			</tr>
			</thead>
			<c:forEach items="${list}" var="a">
			<tbody align="center">
				<tr scope="row">
					<td scope="col">${a.getRollNo()}</td>
					<td scope="col">${a.getStudentName()}</td>
					<td scope="col">${a.getStudentEmail()}</td>
					<td scope="col">${a.getLocation()}</td>
					<td scope="col">${a.getSection()}</td>

				</tr>
			</tbody>
			</c:forEach>
		</table>

	</div>


</body>
</html>