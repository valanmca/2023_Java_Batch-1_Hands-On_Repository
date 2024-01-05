<%@page import="com.lsms.bean.Laptop" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ include file="FindLaptop.jsp" %> 
 <%@ page isELIgnored="false" %>
    
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
     href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
    rel="stylesheet"
    integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
    crossorigin="anonymous">
<style>
	.show{
		padding-left:10%;
		padding-right:10%;
		width: 100%;
	}
	th{
		background-color: #4bc970;
	}
</style>
</head>
<body>
<div class='show'>
<table width = '80%' align ='center' class='table table-striped'>
            
            <tr class='table-success'>
                <th>Laptop ID</th>
                <th>Brand Name</th>
                <th>model Name</th>
                <th>Laptop Price</th>
                
            </tr>

            <tr>
                    <td>${lap.getLapId()}</td>
                    <td>${lap.getBrandName() }</td>
                    <td>${lap.getModelName() }</td>
                    <td>${lap.getLapPrice() }</td>
                    
            </tr>
        </table>
</div>
</body>
</html>