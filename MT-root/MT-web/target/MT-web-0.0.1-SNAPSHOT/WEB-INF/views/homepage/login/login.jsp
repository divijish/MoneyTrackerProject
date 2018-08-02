<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Money Tracker</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

</head>
<body>
<h1 class="jumbotron">Please Enter your credentials</h1>



<form action="j_spring_security_check" method="post">


<table class="table table-border">


<tr><td><span class="">Username:</span></td><td><input class="form-control" type="text" name="j_username">
</td></tr>

<tr><td>Password</td>
<td><input class="form-control" type="password" name="j_password"></td>
<tr>

</table>
<input class="btn btn-primary" name="submit" type="submit" value="Submit">
</form>

</body>
</html>