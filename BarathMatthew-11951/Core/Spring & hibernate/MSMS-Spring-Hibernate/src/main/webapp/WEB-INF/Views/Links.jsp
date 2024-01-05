<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

	th,a{
	
		text-decoration: none;
		color: black;
		padding: 15px 0px 15px 0px;
		font-size: 18px;
		text-align: center;
	 
	}
	
	.sideoption{
	 background: rgba(255,255,255,0.1);
	border: 2px solid #FFF;
            font-size:larger;
            text-align:center;
		padding-left: 20px;
		padding-bottom: 15px;
		padding-right: 20px;
		padding-top: 15px;
		margin-top:20px;
		margin-bottom: 55px;
		border-radius: 10px;
		
	}
	.sideoption:hover{
			border-color: rgb(144, 255, 237);
            color: white;
            box-shadow: 0 0.5em 0.5em -0.4em rgb(158, 126, 62);
            transform: translateY(-0.25em);
            cursor: pointer;
            padding-left: 10px;
            padding-right: 10px;
            padding-top: 20px;
            padding-bottom: 20px;
	}

</style>
</head>
<body style="background-color: #4bc970;">
<br>
<br>

<div class = "container-fluid">
		<div class = "sideoption"><a href="InsertMobile" target="content">Insert</a></div>
		<div class = "sideoption"><a href="UpdateMobile" target="content">Update</a></div>
		<div class = "sideoption"><a href="DeleteMobile" target="content">Delete</a></div>
		<div class = "sideoption"><a href="FindMobile" target="content">Find</a></div>
		<div class = "sideoption"><a href="FindAllMobile" target="content">FindAll</a></div>
</div>		

</body>
</html>