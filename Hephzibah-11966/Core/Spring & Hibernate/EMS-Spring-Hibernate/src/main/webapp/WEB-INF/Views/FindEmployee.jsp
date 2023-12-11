<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="PerformFind" method="post">

<table width="60%" align="center">
    <tr><td><b>Employee Id</b></td><td><select name="id">
    <c:forEach items = "${idList}" var="id">
    <option >${id}</option>
    </c:forEach>
    </select></td></tr>
    
    <tr><td colspan="2" align ="center"><input type="submit" value="Find Employee" /></td></tr>
</table>
</form>
</body>
</html>