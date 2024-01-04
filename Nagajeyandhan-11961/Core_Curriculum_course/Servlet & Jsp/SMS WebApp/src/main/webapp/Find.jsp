<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find page</title>
<link href="css/bootstrap.css" rel="stylesheet" >
</head>
<body>
<form action="SMSController" method="post">


	
	
<div class="card">
            <div class="card-body" align="center">
                <div class="table table-bordered responsive" style="width:70%">
                <br>
                    <table>
                        <div class="input-group mb-3 responsive" style="width: 30%; margin-left:5%">
                        Enter Roll Number:<input type="number" name="rno">
	
						</div>					
						<input type="submit"  value="FindStudent" name="sms_button" class="btn btn-primary" />
                    </table>
                    <br>
                </div>
            </div>
        </div>
</form>
</body>
</html>