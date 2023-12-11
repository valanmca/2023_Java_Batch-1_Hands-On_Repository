<%@page import="java.util.ArrayList"%>
<%@page import="com.ems.bean.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table width='60%' align="center">
 <tr><th>Employee Id</th><th>Employee Name</th><th>Employee Salary</th>
    <c:forEach var="dis" items="${list}">
        
        <tr>
        
            <th>${dis.emp_id}</th>
            <th>${dis.ename}</th>
            <th>${dis.salary}</th>
        
        </tr>
        
        
        
    </c:forEach>
</table>

</body>
</html>