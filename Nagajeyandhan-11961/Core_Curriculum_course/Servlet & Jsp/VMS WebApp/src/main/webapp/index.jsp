<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index page</title>
<style>
        body{
            background-color: rgb(0, 0, 0);
        }
        li{
            border:3px solid rgb(0, 0, 0);
            border-radius: 9px;
            width: 115px;
            font-style: italic;
        }
        li:hover{
            font-weight: 200;
            background-color: rgb(255, 119, 0);
            border-color: rgb(255, 119, 0);
            text-align: center;
            cursor: pointer;
        }
        a{
            color: orange;
        }
        a:hover{
            color: white;
        }
    </style>
	<link href="css/bootstrap.css" rel="stylesheet" >
	<title>HomePage</title>
    <frameset rows="15%,85%" border="1" >
    <frame src="Header.jsp"></frame>
        <frameset cols="12%,88%">
            <frame src="Links.jsp">
            <frame src="InsertVehicle.jsp" name="content">
        </frameset>
    </frameset>

</head>
<body>

</body>
</html>