<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Links Page</title>
<link href="css/bootstrap.css" rel="stylesheet" >
<style>
        body{
            background-color: white;
        }
        li{
            border:3px solid green;
            border-radius: 9px;
            width: 115px;
            height:50px;
            font-style: italic;
            text-align:center;
            justify-content:center;
            
        }
        li:hover{
            font-weight: 200;
            background-color: lightgreen;
            border-color: white;
            text-align: center;
            cursor: pointer;
        }
        a{
            color: black;
        }
        a:hover{
            color: black;
        }
    </style>

</head>
<body>
<ul><br><br>
<li type="none"><a href="Insert.jsp" target="content" style="text-decoration: none; ">Insert</a></li> <br><br>
<li type="none"><a href="Update.jsp" target="content" style="text-decoration: none; ">Update</a></li><br><br>
<li type="none"><a href="SMSController?id='a'" target="content" style="text-decoration: none; ">Delete</a></li><br><br>
<li type="none"><a href="Find.jsp" target="content" style="text-decoration: none; ">Find</a></li><br><br>
<li type="none"><a href="SMSController" target="content" style="text-decoration: none; ">Find All</a></li>
</ul>

</body>
</html>