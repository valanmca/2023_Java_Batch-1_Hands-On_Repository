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
<body >
<ul class="nav nav-underline nav-fill p-2 mb-1 bg-warning-subtle text-emphasis-warning" style="font-size:130%">
  <li class="nav-item">
    <a class="nav-link" aria-current="page" href="InsertPatient.jsp" target="content" style="color:black"><b>Insert</b></a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="UpdatePatient.jsp" target="content" style="color:black"><b>Update</b></a>
  </li>
   <li class="nav-item">
   <a class="nav-link " aria-current="page" href="PMSController?auto=a" target="content" style="color:black"><b>Delete</b></a>
 </li>
 <li class="nav-item">
    <a class="nav-link " aria-current="page" href="FindPatient.jsp" target="content" style="color:black"><b>Find</b></a>
  </li>
  <li class="nav-item">
   <a class="nav-link " aria-current="page" href="PMSController?auto1=b" target="content" style="color:black"><b>FindAll</b></a>
 </li>
</ul>


</body>
</html>