<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4; /* Light grey background */
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
            background-color: #fff; /* White background for form */
            padding: 20px;
            border: 1px solid #ddd;
            border-radius: 4px;
            box-shadow: 0 2px 4px rgba(0,0,0,0.1);
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
        input[type="text"], input[type="email"], input[type="password"], input[type="tel"] {
            width: calc(100% - 22px); /* Full width minus padding and border */
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }
        .radio-group {
            margin-bottom: 15px;
        }
        .radio-group label {
            display: inline-block;
            margin-right: 10px;
            font-weight: normal; /* Use normal font weight for inline labels */
        }
        input[type="radio"] {
            margin-right: 5px;
        }
        input[type="submit"] {
            width: 100%;
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
        <h1>Registration</h1>
        <form action="RegistrationControl" method="post">
            <label for="email">Email:</label>
            <input type="email" name="email" id="email" required>
            
            <label for="pwd">Password:</label>
            <input type="password" name="pwd" id="pwd" required>
            
            <label for="username">Name:</label>
            <input type="text" name="username" id="username" required>
            
            <label for="ph_no">Mobile-No:</label>
            <input type="tel" name="ph_no" id="ph_no" required>
            
            <div class="radio-group">
                <input type="radio" id="buyer" name="role" value="Buyer" required>
                <label for="buyer">Buyer</label>
                
                <input type="radio" id="seller" name="role" value="Seller" required>
                <label for="seller">Seller</label>
            </div>
            
            <input type="submit" value="Submit">
        </form>
    </div>
</body>
</html>
