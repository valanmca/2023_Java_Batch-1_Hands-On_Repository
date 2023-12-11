<%@page import="com.dms.bean.Doctor"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="FindDoctor.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
 .div{
 padding-left: 5%;
	width: 80%;
}
</style>
</head>
<body>
	<br>
	<div class="div">
	<table class="table table-bordered">
		<thead>
			<tr>
				<th>Doctor Id</th>
				<th>Doctor Name</th>
				<th>Doctor Age</th>
				<th>Doctor Email</th>
				<th>Doctor Specialization</th>
				<th>Doctor Phno</th>
				<th>Doctor loc</th>
				
			</tr>
		</thead>
		<tbody>
			<%
			Doctor bean = (Doctor) request.getAttribute("bean");

			if (bean != null) {

				out.println("<tr><td>" + bean.getdId() + "</td><td>" + bean.getdName() + "</td><td>" + bean.getdAge()
				+ "</td><td>" + bean.getdEmail()+ "</td><td>" + bean.getdSpecialization()+ "</td><td>" + bean.getdPhoneNumber()+ "</td><td>" + bean.getdLocation()+ "</td></tr>");

			} else {
				out.println("<font color='red'>Record Not Found</font>");
			}
			%>
		</tbody>
	</table>
	</div>
</body>
</html>