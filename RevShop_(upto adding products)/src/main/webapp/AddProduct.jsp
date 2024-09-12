<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Product</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
            background-color: #fff;
            padding: 20px;
            border: 1px solid #ddd;
            border-radius: 8px;
            box-shadow: 0 2px 4px rgba(0,0,0,0.1);
            width: 600px;
            box-sizing: border-box;
        }
        h1 {
            font-size: 1.5em;
            margin-bottom: 20px;
            text-align: center;
            color: #333;
        }
        .form-group {
            display: flex;
            flex-wrap: wrap;
            margin-bottom: 15px;
        }
        .form-group label {
            flex: 0 0 30%;
            margin-bottom: 0;
            font-weight: bold;
            display: flex;
            align-items: center;
        }
        .form-group input {
            flex: 1;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        .form-group:nth-child(even) {
            margin-top: 15px;
        }
        input[type="submit"] {
            width: 100%;
            background-color: #007bff;
            color: white;
            border: none;
            padding: 10px;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
        }
        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Add Your Product</h1>
        <form action="AddProductServlet" method="post">
            <input type="hidden" name="email" value="${param.email}">
            
            <div class="form-group">
                <label for="product_name">Product Name:</label>
                <input type="text" id="product_name" name="product_name">
            </div>
            
            <div class="form-group">
                <label for="description">Description:</label>
                <input type="text" id="description" name="description">
            </div>
            
            <div class="form-group">
                <label for="price">Product Price:</label>
                <input type="number" id="price" name="price">
            </div>
            
            <div class="form-group">
                <label for="discountPrice">Discount Price:</label>
                <input type="number" id="discountPrice" name="discountPrice">
            </div>
            
            <div class="form-group">
                <label for="quantity">Quantity:</label>
                <input type="number" id="quantity" name="quantity">
            </div>
            
            <div class="form-group">
                <label for="threshold">Threshold:</label>
                <input type="number" id="threshold" name="threshold">
            </div>
            
            <div class="form-group">
                <label for="category">Category:</label>
                <input type="text" id="category" name="category">
            </div>
            
            <div class="form-group">
                <label for="image_url">Image URL:</label>
                <input type="text" id="image_url" name="image_url">
            </div>
            
            <input type="submit" value="Add Product">
        </form>
    </div>
</body>
</html>
