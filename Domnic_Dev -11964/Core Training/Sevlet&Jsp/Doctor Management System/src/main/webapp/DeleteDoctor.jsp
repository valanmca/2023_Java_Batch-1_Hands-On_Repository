<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<style>
.mb-3 {
	width: 50%;
	padding-left: 19%;
	padding-top: 2%;
}

.delete {
	padding-left: 30%;
}
</style>

</head>
<body>


<div class="container">
      
        <br>
        <div class="card">
            <div class="card-body">
                <form action="DmsController" method="post">
                    <div class="form-group row">
                        <label for="DoctorId" class="col-sm-4 col-form-label">Enter
                            Doctor Id </label>
                        <div class="col-sm-6">

                            <select name="did">
                            <c:forEach items="${list}" var="d">
                                
                                    <option><c:out value="${d.getdId()}" />
                                    </option>
                                </c:forEach>
                            </select> <br> <br> <input class="btn btn-primary" type="submit"
                                value="Delete Doctor" name="dms_button" />
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>


	



</body>
</html>