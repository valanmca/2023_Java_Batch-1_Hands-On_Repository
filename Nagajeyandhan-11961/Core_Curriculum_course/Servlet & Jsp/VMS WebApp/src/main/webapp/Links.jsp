<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.css" rel="stylesheet" >
<style>
        body{
            background-color: white;
        }
        li{
            border:3px solid black;
            border-radius: 9px;
            width: 115px;
            height:50px;
            font-style: italic;
            text-align:center;
            
        }
        li:hover{
            font-weight: 200;
            background-color: black;
            border-color: white;
            text-align: center;
            cursor: pointer;
        }
        a{
            color: black;
        }
        a:hover{
            color: white;
        }
    </style>

</head>
<body>
<ul>
<li type="none"><a href="InsertVehicle.jsp" target="content" style="text-decoration: none; ">Insert</a></li> 
<%--<li type="none"><a href="DeleteVehicle.jsp" target="content" style="text-decoration: none; ">Delete</a></li> --%>
<li type="none"><a href="UpdateVehicle.jsp" target="content" style="text-decoration: none; ">Update</a></li>
<li type="none"><a href="VMSController?id='a'" target="content" style="text-decoration: none; ">Delete</a></li>
<li type="none"><a href="FindVehicle.jsp" target="content" style="text-decoration: none; ">Find</a></li>
<li type="none"><a href="VMSController" target="content" style="text-decoration: none; ">Find All</a></li>
</ul>

</body>
</html>