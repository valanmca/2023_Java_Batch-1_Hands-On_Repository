<%@page import="com.ems.bean.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table width='60%' align='center'>
		<tr>
			<th>Student Id</th>
			<th>Student Name</th>
			<th>Student Section</th>
		</tr>
		<c:forEach items="${list}" var="e">

			<tr>
				<th>${e.getStd_id()}</th>
				<th>${e.getStd_name()}</th>
				<th>${e.getStd_sec()}</th>
			</tr>

		</c:forEach>
	</table>
</body>
</html>