<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="PerformFind" method="post">
		<!--  <table width="60%" align="center">

			<tr>
				<td>Student Id</td>
				<td><input type="text" name="std_id"></td>
			</tr>

			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Delete Student" name="sms_button"></td>
			</tr>

		</table>-->
		
				<label>Student Id</label>
				


		<select name="std_id">
			<c:forEach items="${idList}" var="a">

				<option>${a}</option>
			</c:forEach>
			</select>
			
			<input type="submit"
					value="Find Student" name="sms_button">
	</form>

</body>
</html>