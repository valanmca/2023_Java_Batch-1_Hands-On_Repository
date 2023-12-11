<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
    rel="stylesheet"
    integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
    crossorigin="anonymous">
    <style>
input{
font-weight:bold;
}
body {
    font-family: 'Nunito', sans-serif;
    color: #384047;
}

form {
    max-width: 300px;
    margin: 10px auto;
    padding: 10px 20px;
    background: #f4f7f8;
    border-radius: 8px;
}

input[type="text"] {
    background: rgba(255, 255, 255, 0.1);
    border: none;
    font-size: 16px;
    height: auto;
    margin: 0;
    outline: 0;
    padding: 15px;
    width: 100%;
    background-color: #e8eeef;
    color: #8a97a0;
    box-shadow: 0 1px 0 rgba(0, 0, 0, 0.03) inset;
    margin-bottom: 30px;
}

button {
    padding: 19px 39px 18px 39px;
    color: #FFF;
    background-color: #4bc970;
    font-size: 18px;
    text-align: center;
    font-style: normal;
    border-radius: 5px;
    width: 100%;
    border: 1px solid #3ac162;
    border-width: 1px 1px 3px;
    box-shadow: 0 -1px 0 rgba(255, 255, 255, 0.1) inset;
    margin-bottom: 10px;
}

@media screen and (min-width: 740px) {
    form {
        max-width: 850px;
    }
}
</style> 
<script>
function validateform() {
        var name = "^[A-Z a-z]+$";
        var pass = "^[0-9]+$";
        var mid = document.getElementById("movid").value;
        var mname = document.getElementById("movname").value;
        

        if (pid == null || pid == "") {
            alert("Movie Id can't be blank");
            return false;
        } else if (!pid.match(pass)) {
            alert("Enter valid Movie Id");
            return false;
        }

        if (pname == null || pname == "") {
            alert("Movie Name can't be blank");
            return false;
        } else if (!pname.match(name)) {
            alert("Enter valid Movie Name");
            return false;
        }

       

    }
</script>
</head>
<body>
<br>
<form action="PerformInsert" method="post">
 <table width="30%" align="center" class="table table-Danger w-100">
            <tr class="table-success">
                <td><b>Movie Id</b></td>
                <td><input type="text" placeholder="Movie Id" name="Id"
                    id="movid" /></td>
            </tr>
            <tr class="table-success">
                <td><b>Movie Name</b></td>
                <td><input type="text" placeholder="Movie Name" name="Name"
                    id="movname" /></td>
            </tr>
            <tr class="table-success">
                <td><b>Movie Type</b></td>
                <td><input type="text" placeholder="Movie Type"
                    name="Type" id="movtype" /></td>
            </tr>
            <tr class="table-success">
                <td><b>Movie Language</b></td>
                <td><input type="text" placeholder="Movie Language"
                    name="Language" id="movtype" /></td>
            </tr>
            <tr class="table-success">
                <td><b>Movie Duration</b></td>
                <td><input type="text" placeholder="Movie Duration"
                    name="Duration" id="movtype" /></td>
            </tr>
            <nav class="navbar bg-body-tertiary">
                <form class="container-fluid justify-content-start">
                    <tr class="table-warning">
                        <td colspan="2" align="center"><input type="submit"
                            class="btn btn-outline-primary me-2" 
                            value="Insert Movie" onclick="validateform()" />
                        </td>
                    </tr>
                </form>
            </nav>
        </table>

</form>
</body>
</html>