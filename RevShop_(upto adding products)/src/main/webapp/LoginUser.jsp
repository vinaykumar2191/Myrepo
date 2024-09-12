<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4; /* Light grey background */
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh; /* Full viewport height */
        }
        .container {
            background-color: #fff; /* White background for form */
            padding: 20px;
            border: 1px solid #ddd;
            border-radius: 8px; /* Rounded corners */
            box-shadow: 0 2px 4px rgba(0,0,0,0.1); /* Subtle shadow */
            width: 300px; /* Fixed width */
        }
        h1 {
            font-size: 1.5em;
            margin-bottom: 20px;
            text-align: center;
            color: #333; /* Darker text color */
        }
        label {
            display: block;
            margin-bottom: 8px;
            font-weight: bold;
        }
        input[type="text"], input[type="password"], select {
            width: calc(100% - 22px); /* Full width minus padding and border */
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box; /* Include padding and border in width calculation */
        }
        input[type="submit"] {
           
            background-color: #007bff; /* Blue background */
            color: white;
            border: none;
            padding: 10px;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
        }
        input[type="submit"]:hover {
            background-color: #0056b3; /* Darker blue on hover */
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Login Form</h1>
        <form action="LoginControl" method="post">
            <label for="email">Email:</label>
            <input type="text" name="email" id="email" required>
            
            <label for="pwd">Password:</label>
            <input type="password" name="pwd" id="pwd" required>
            
            <label for="role">Role:</label>
            <select id="role" name="role" required>
                <option value="buyer">Buyer</option>
                <option value="seller">Seller</option>
            </select>
            
            <input type="submit" value="Login">
        </form>
    </div>
</body>
</html>
