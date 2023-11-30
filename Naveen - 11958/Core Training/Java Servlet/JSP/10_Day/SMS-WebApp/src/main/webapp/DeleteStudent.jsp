<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.css" rel="stylesheet">
<style>
h2{
color: red;
text-align: center;
}
</style>
</head>
<body>
	<h2>DELETE STUDENT DETAILS</h2><br>
	<form action="SMSController" method="post">
		<table width="60%" align="center" class="table table-bordered w-50">
			<tr><td><b>Student Id</b></td></tr>
    
    
    <tr><td><select name="StuId">
    
    <c:forEach items="${msg}"  var="a">
    
    <option><c:out value="${a.getcId() }"/></option>
    
    
    </c:forEach>
    
    </select>
    
    </td></tr>
				<tr><td colspan="2" align="center"><input type="submit"
					name="cms_button" class="btn btn-outline-danger"
					value="Delete Student" /></td>
			</tr>
		</table>
	</form>
</body>
</html>
