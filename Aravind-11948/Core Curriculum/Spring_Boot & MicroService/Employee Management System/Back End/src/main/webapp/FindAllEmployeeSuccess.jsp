<%@page import="java.util.Iterator"%>
<%@page import="com.ems.bean.Employee"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page isELIgnored="false" %>
    
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<br>

<p align='center'><b>View All</b></p>

<%-- JSTL Iterate code to iterate collection --%>
         <table width='60%' align='center'>
         <tr><th>Employee Id</th><th>Employee Name</th><th>Employee Salary</th><th>Employee Department</th></tr>  
         
         
         <c:forEach items="${idList}" var="a">
         
         <tr><td>${a.getId()}</td><td>${a.getName()}</td><td>${a.getSalary()}</td><td>${a.getDno()}</td></tr>
         </c:forEach>
          
          
          
          
         
         </table>
         
         
         
<%-- 
<%


      ArrayList<Employee> list=(ArrayList<Employee>)request.getAttribute("list");
         

    
        if(list.isEmpty())
        {
        	
        	 out.println("<table width='60%' align='center'>");
             out.println("<tr><th>Employee Id</th><th>Employee Name</th><th>Employee Salary</th><th>Employee Department</th></tr>");
             out.println("</table>");
             out.println("<h3 style='color:red;text-align:center;'>Table is empty<h3>");
        }
        else
        {
        	
        
             out.println("<table width='60%' align='center'>");
             out.println("<tr><th>Employee Id</th><th>Employee Name</th><th>Employee Salary</th><th>Employee Department</th></tr>");
             for(Employee a:list) {
             out.println("<tr><th>"+a.getId()+"</th><th>"+a.getName()+"</th><th>"+a.getSalary()+"</th><th>"+a.getDno()+"</th></tr>");
             }
             out.println("</table>");
             
        }
      %>
      --%>

</body>
</html>