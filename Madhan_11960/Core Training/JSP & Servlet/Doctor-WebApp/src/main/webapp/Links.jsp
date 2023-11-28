<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<style>
	a{	
		text-decoration: none;
		color: white;
		padding: 19px 39px 18px 39px;
	  	color: #FFF;
		background-color: #4bc970;
		font-size: 18px;
		text-align: center;
		font-style: normal;	
	}
</style>
</head>
<body>
<ul class="nav  nav-underline nav-pills nav-fill p-3 mb-2 bg-info text-dark" style= "font-size:150%">
 <li class="nav-item ">
   <a  class="nav-link text-light  " aria-current="page" href="InsertDoctor.jsp" target="content">Insert</a>
 </li>
 <li class="nav-item">
   <a class="nav-link text-light" href="UpdateDoctor.jsp" target="content">Update</a>
 </li>
  <li class="nav-item">
   <a class="nav-link text-light " aria-current="page" href="DMSController?id=a" target="content">Delete</a>
 </li>
<li class="nav-item">
   <a class="nav-link text-light" aria-current="page" href="FindDoctor.jsp" target="content">Find</a>
 </li>
 <li class="nav-item">
   <a class="nav-link text-light " aria-current="page" href="DMSController?id1=b" target="content">FindAll</a>
 </li>
</ul>
</body>
</html>


