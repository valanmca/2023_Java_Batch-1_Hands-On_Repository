<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>
<body>

<nav class="navbar navbar-expand-sm navbar-dark bg-primary fixed-top">
  <div class="container-fluid">
  <i class="material-icons" style="font-size:48px;color:black">school</i>
    <a class="navbar-brand" href="javascript:void(0)">Student Management System</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="mynavbar">
      <ul class="navbar-nav me-auto">
        <li class="nav-item">
          <a class="nav-link" href="InsertStudent.jsp" target="content">Add Details</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="SmsControllerServlet" target="content" >View All</a>
        </li>
      </ul>
      <form class="d-flex" >      
        <input class="form-control me-2"  type="text" placeholder="Enter student id">
        <input type="submit" value="Search"  class="btn btn-warning" />
           </form>
    </div>
  </div>
</nav>

</body>
</html>