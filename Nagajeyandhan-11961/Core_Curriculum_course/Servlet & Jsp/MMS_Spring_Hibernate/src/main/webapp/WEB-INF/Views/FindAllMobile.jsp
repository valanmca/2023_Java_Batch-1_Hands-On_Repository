<%@page import="com.mms.dao.MobileDAO"%>
<%@page import="com.mms.bean.Mobile"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<title>Insert title here</title>
<style>
td {
    text-align: center;
}
* {
	padding: 0;
	margin: 0;
	box-sizing: border-box;
}

body {
	background: linear-gradient(90deg, rgba(2, 0, 36, 1) 0%,
		rgba(75, 14, 154, 1) 35%, rgba(0, 212, 255, 1) 100%);
	font-family: 'poppins', sans-serif;
}
h4{
	color:white;
}
</style>
</head>
<body>
<div class="container">
        <br>
        <h4 align="center">View Vehicles</h4>
        <br>
        <div class="card">
            <div class="card-body">
                <div class="table table-bordered">
                    <table class="table table-hover">
                        <thead style="text-align:center" class="dark">
                            <tr>
                               <th scope="col">Mobile Id</th>
                                <th scope="col">Mobile Brand Name</th>
                                <th scope="col">Mobile Model Name</th>
                                <th scope="col">Mobile Price	</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="d" items="${idList}">
                                <tr>
                                    <td>${d.getMobileID()}</td>
                                    <td>${d.getMobileBrand()}</td>
                                    <td>${d.getMobileModel()}</td>
                                    <td>${d.getMobilePrice()}</td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</body>
</html>