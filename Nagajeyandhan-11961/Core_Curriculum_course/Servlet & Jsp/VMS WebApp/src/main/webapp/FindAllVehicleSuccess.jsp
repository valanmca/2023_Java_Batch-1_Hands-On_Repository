<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
	<link href="css/bootstrap.css" rel="stylesheet" >
</head>
<body>
<div class="container">
        <br>
        <h4 align="center">Vehicles</h4>
        <br>
        <div class="card">
            <div class="card-body">
                <div class="table table-bordered">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th scope="col">Vehicle Id</th>
                                <th scope="col">Vehicle Name</th>
                                <th scope="col">Vehicle Price	</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="display" items="${list}">
                                <tr>
                                    <td>${display.getVechicleId()}</td>
                                    <td>${display.getVehicleName()}</td>
                                    <td>${display.getPrice()}</td>
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