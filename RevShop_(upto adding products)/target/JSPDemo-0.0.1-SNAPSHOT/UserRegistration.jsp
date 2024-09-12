<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
	<title>Registration</title>
</head>
<body>
	<h1>Registration Form : </h1>
	<form action="RegistrationControl" method="post">
		<label>Email : </label>
		<input type="email" name="email"><br><br>
		<label>Password : </label>
		<input type="password" name="pwd"><br><br>
		<label>Name : </label>
		<input type="text" name="username"><br><br>
		<label for="ph_no">Mobile-No : </label>
		<input type="tel" name="ph_no"><br><br>
		
		<label for="role">Role:</label>
        <select id="role" name="role">
            <option value="buyer">Buyer</option>
            <option value="seller">Seller</option>
        </select><br><br>
		
		<input type="submit" value="Submit">
		
	</form>
</body>
</html>