<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete</title>
<link href="css/bootstrap.css" rel="stylesheet" >
<style>
select {
        width:180px;
    }
</style>
</head>
<body>
    <form action="SMSController" method="post">
     
        <div class="card" align="center">
            <div class="card-body">
                <div class="table table-bordered responsive" style="width:70%">
                <br>
                    <table>
                        <div class="input-group mb-3 responsive" style="width: 30%; margin-left:5%">
                        <label>Select Roll number You want to delete</label>
                        <select name="rno">
               				 <c:forEach items="${list}" var="a">
                				<option><c:out value="${a.getRollNo()}"/></option>
                			 </c:forEach>
                		</select>
						</div>					
						<input type="submit" onClick()="validate()" value="DeleteStudent" name="sms_button" class="btn btn-primary" />
                    </table>
                    <br>
                </div>
            </div>
        </div>
    </form>

</body>
</html>