<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Employee</title>
<link
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
    rel="stylesheet" />
<style>
select {
    width: 200px;
}

body {
    font-weight: bold;
    font-family: Times New Roman;
    color: black;
}
</style>
</head>
<body>
    <div class="container" align="center">
        <br>
        <h3 align="center">
            <b>Find Employee</b>
        </h3>
        <br>
        <div class="card" style="width: 50rem;">
            <div class="card-body">
                <form action="PerformFind" method="post">
                    <div class="form-group row">
                        <label for="Employeeid" class="col-sm-4 col-form-label">Enter
                            Employee Id </label>
                        <div class="col-sm-6">
                            <tr>
                                <td><input type="number" name="id" /></td>
                            </tr>

                            <br> <br> <input class="btn btn-primary" type="submit"
                                value="Find Employee" />
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>
</html>