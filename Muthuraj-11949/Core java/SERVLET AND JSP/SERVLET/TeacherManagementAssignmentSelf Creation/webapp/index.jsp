<%@page import="java.sql.Connection"%>
<%@page import ="com.conn.DBConnection"%>
<%@page  import="com.entity.Teacher"%>
<%@page import ="com.dao.TeacherDAO"%>
<%@page import ="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="all_css.jsp" %>
</head>
<body class="bg-light">
<%@include file="navbar.jsp"%>  
<div class="container p-3">
<div class="card">
<div class="card-body">
<p class="text-center fs-1">All Teacher Details</p>
<table class="table">
  <thead>
    <tr>
      <th scope="col">Teacher ID</th>
      <th scope="col"> Teacher Name</th>
      <th scope="col">Teacher Experience</th>
      <th scope="col">Teacher Qualification</th>
      <th scope="col">Teacher Contact Details </th>
      <th scope="col">Teacher Email </th>  
      <th scope="col">Action</th>    
    </tr>
  </thead>
  <tbody>
     <%TeacherDAO dao=new TeacherDAO (DBConnection.getConn());
     List<Teacher> list=dao.getAllTeacher();
     for(Teacher s: list){
     %> 
    <tr>     
    <th scope="row"><%=s.getId()%></th>
     <td><%=s.getName()%></td>
     <td><%=s.getExperience()%></td>
     <td><%=s.getQualification()%></td>
     <td><%=s.getContact()%></td>
     <td><%=s.getEmail()%></td>
     <td><a href="edit_teacher.jsp?id=<%=s.getId()%>"
     class="btn btn-sm btn-primary">Edit</a></td>
     <td><a href="" class="btn btn-sm btn-danger">Delete</a></td>     
   </tr>
 <%}
 %>
</tbody>
</table>
</div>
</div>
</div>
</body>
</html>