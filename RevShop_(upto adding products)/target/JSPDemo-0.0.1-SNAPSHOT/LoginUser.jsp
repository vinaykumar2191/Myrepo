<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<h1>Login Form</h1>
	<form action="LoginControl" method="post">
		<label>Email : </label>
		<input type="text" name="email"><br><br>
		<label>Password : </label>
		<input type="password" name="pwd"><br><br>
		<input type="submit" value="Login">
		
	</form>
</body>
</html>