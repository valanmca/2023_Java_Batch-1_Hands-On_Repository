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
	  	
		
		font-size:xx-large;
		text-align: center;
		font-style: normal;
	
	}
</style>

</head>
<body>
<ul class="nav nav-underline nav-fill navbar-light bg-light .text-success" style="font-size:150%">
  <li class="nav-item">
    <a class="nav-link" aria-current="page" href="InsertEmployee.jsp" target="content" style="color:black">Insert</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="UpdateEmployee.jsp" target="content" style="color:black">Update</a>
  </li>
   <li class="nav-item">
   <a class="nav-link " aria-current="page" href="EMSController?auto=a" target="content" style="color:black">Delete</a>
 </li>
 <li class="nav-item">
    <a class="nav-link " aria-current="page" href="FindEmployee.jsp" target="content" style="color:black">Find</a>
  </li>
  <li class="nav-item">
   <a class="nav-link " aria-current="page" href="EMSController?auto1=b" target="content" style="color:black">FindAll</a>
 </li>
</ul>


</body>
</html>