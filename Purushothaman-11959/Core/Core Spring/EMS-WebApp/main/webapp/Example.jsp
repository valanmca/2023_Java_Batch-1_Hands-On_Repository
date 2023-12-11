<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="v" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<v:set var="salary" value="15000"></v:set>
<v:if test="${salary>10000}">
  <p>The salary is : <v:out value="${salary }"></v:out></p>
</v:if>

<v:choose>  
    <v:when test="${salary <= 10000}">  
       Income is not good.  
    </v:when>  
    <v:when test="${salary > 10000}">  
        Income is good.  
    </v:when>  
    <v:otherwise>  
       Income is undetermined...  
    </v:otherwise>  
</v:choose>  

</body>
</html>