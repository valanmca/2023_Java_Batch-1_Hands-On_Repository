<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert page</title>
<link href="css/bootstrap.css" rel="stylesheet" >

</head>

<body>
  <script>
        function validate() {
            var name = "^[A-Z a-z]+$";
            var location = "^[A-Z a-z]";
            var pass = "[0-9]+$";
            var email = "/^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/"
            
            var id = document.getElementById("rno").value;
            var name = document.getElementById("name").value;
            var email = document.getElementById("email").value;
            var section = document.getElementById("section").value;
            var location = document.getElementById("location").value;
            
    <%--   Id validation--%>
        if (id == null || id == "") {
                alert("Id cannot be blank");
                return false;
            } else if (!id.match(pass)) {
                alert("Enter valid id");
                return false;
            }
    <%--   name validation--%>
        if (name == null || name == "") {
                alert("Name cannot be blank");
                return false;
            } else if (!name.match(name)) {
                alert("Enter valid Name");
                return false;
            }
    <%--   Email validation--%>
        if (email == null || email == "") {
                alert("Email cannot be blank");
                return false;
            } else if (!email.match(email)) {
                alert("Enter valid Email");
                return false;
            }
    <%--   Number validation--%>
        if (section == null || section == "") {
                alert(" Section cannot be blank");
                return false;
            } else if (!section.match(name)) {
                alert("Enter valid Section");
                return false;
            }
    <%--   Location validation--%>
        if (location == null || location == "") {
                alert(" Location cannot be blank");
                return false;
            } else if (!location.match(location)) {
                alert("Enter valid Location");
                return false;
            }
        }
    </script>
<form action="SMSController" method="post" onSubmit="validate()">

	<div class="card" align="center">
            <div class="card-body">
                <div class="table table-bordered responsive" style="width:70%">
                <br>
                    <table>
                        <div class="input-group mb-3 responsive" style="width: 30%; margin-left:5%">
						  <input type="number" class="form-control" name="rno" placeholder="Enter Roll Number" required/>
						</div>
						
						<div class="input-group mb-3 responsive" style="width: 30%; margin-left: 5%">
						  <input type="text" class="form-control" name="name" placeholder="Enter Name" required/>
						</div>
						
						<div class="input-group mb-3 responsive" style="width: 30%; margin-left: 5%">
						  <input type="email" class="form-control" name="email" placeholder="Enter EmailID" required/>
						</div>
												
						<div class="input-group mb-3 responsive" style="width: 30%; margin-left: 5%">
						  <input type="text" class="form-control" name="section" placeholder="Enter Class/section" required/>
						</div>
						
						<div class="input-group mb-3 responsive" style="width: 30%; margin-left: 5%">
						  <input type="text" class="form-control" name="location" placeholder="Enter Location" required/>
						</div>
												
						
					<button onclick="validate()"value="InsertStudent" type="submit" name="sms_button" class="btn btn-primary">InsertStudent</button>
                    </table>
                    <br>
                </div>
            </div>
        </div>
	
</form>
</body>
</html>