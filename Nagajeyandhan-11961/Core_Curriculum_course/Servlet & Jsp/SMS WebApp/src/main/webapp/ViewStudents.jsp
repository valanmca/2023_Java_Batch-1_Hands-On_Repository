<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Students Page</title>
<link href="css/bootstrap.css" rel="stylesheet" >
</head>
<body>
<div class="container">
        <br>
        <h4 align="center">Student Details</h4>
        <br>
        <div class="card">
            <div class="card-body">
                <div class="table table-bordered">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th scope="col">Student RollNumber</th>
                                <th scope="col">Student Name</th>
                                <th scope="col">Student EmailId</th>
                                <th scope="col">Student Class/Section</th>
                                <th scope="col">Student Location</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="display" items="${list}">
                                <tr>
                                    <td>${display.getRollNo()}</td>
                                    <td> ${display.getName()}</td>
                                    <td> ${display.getEmail()}</td>
                                    <td> ${display.getSection()}</td>
                                    <td> ${display.getLocation()}</td>
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