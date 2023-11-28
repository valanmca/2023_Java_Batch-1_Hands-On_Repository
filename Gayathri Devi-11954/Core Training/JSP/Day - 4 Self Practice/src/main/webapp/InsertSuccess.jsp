<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- <%@ page import = "java.util.List" %>    
<%@ page import = "com.sms.bean.StudentBean" %>
    <%@ page import = "com.sms.dao.StudentDAO" %>;
 --%><%@ include file="InsertStudent.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>


</style>
</head>
<body>
<br><center>
<div class="alert alert-success w-50 align-items-center">
  <strong><h3>Record Inserted Successfully !.</h3></strong> </div></center>
<!-- <h1 align="center" ><font color="green"></font></h1> -->

<%-- 
<%

StudentDAO dao = new StudentDAO();
List<StudentBean> list = dao.viewStudent();
request.setAttribute("list", list);
RequestDispatcher rd = request.getRequestDispatcher("ViewAll.jsp");
rd.forward(request, response);

%>

--%>
</body>
</html>