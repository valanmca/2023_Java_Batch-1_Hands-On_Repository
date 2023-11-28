<%@page import ="com.conn.DBConnection"%>
<%@page  import="com.entity.Teacher"%>
<%@page import ="com.dao.TeacherDAO"%>
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
   <div class="container p-4">
   <div class="row">
   <div class="col-md-6 offest-md-3">
   <div class="card">
   <div class="card-body">
   <p class="fs-3 text-center">Edit Teacher Details</p>
   <% 
    int id=Integer.parseInt(request.getParameter("id"));
   TeacherDAO dao=new TeacherDAO (DBConnection.getConn());
    Teacher s= dao.getTeacherById(id);
   %>
  <form  action="register" method="post">
  <div class="mb-3">
    <label  class="form-label">Teacher ID</label>
    <input type="text" name="id" value=<%=s.getId() %>class="form-control">
  </div>
  <div class="mb-3">
        <label  class="form-label">Teacher Name</label>
    <input  type="text"   value=<%=s.getName() %> name="name"  class="form-control">
  </div>
  
  <div class="mb-3 ">
    <label  class="form-label">Teacher Experience</label>
    <input   type="text"  value=<%=s.getExperience() %> name="experience" class="form-control">
  </div>
  <div class="mb-3 ">
    <label  class="form-label">Teacher Qualification</label>
    <input  type="text" value=<%=s.getQualification() %> name="qualification" class="form-control">
  </div>
  
  <div class="mb-3 ">

    <label  class="form-label">Teacher Contact Details</label>
    <input type="text"  value=<%=s.getContact() %> name="contact" class="form-control">
  </div>
  

  <div class="mb-3 ">
    <label  class="form-label">Teacher Email</label> <input type="text"  value=<%=s.getEmail()%> name="email" 
    class="form-control">
  </div>
   
 <button type="submit" class="btn btn-primary col-md-12">Update</button>
</form>
   </div>
   </div>
   </div>
   </div> 
   </div>
</body>
</html>