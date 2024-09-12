<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Seller Registration</title>
</head>
<body>
	<h1>Fill your business details...!</h1>
	<form action="SellerControl" method="post">
		<input type="hidden" name="email" value="${param.email}">
		<label>Business-Name : </label>
		<input type="text" name="company_name"><br><br>
		<label>Address : </label>
		<input type="text" name="address"><br><br>
		<label>Contact-No : </label>
		<input type="tel" name="contact"><br><br>
		<input type="submit" value="Register">
	</form>
</body>
</html>