<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.List" %>
<%@ page import="dto.ProductDTO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product List</title>
</head>
<body>
	<h2>Product List</h2>
	
	<%
        List<ProductDTO> products = (List<ProductDTO>) session.getAttribute("products");

        if (products != null && !products.isEmpty()) {
    %>
        <table border="1">
            <tr>
                <th>Product Name</th>
                <th>Description</th>
                <th>Price</th>
                <th>Quantity</th>
                <th>Discount Price</th>
                <th>Category</th>
            </tr>
            <%
                for (ProductDTO product : products) {
            %>
                <tr>
                    <td><%= product.getProductName() %></td>
                    <td><%= product.getDescription() %></td>
                    <td><%= product.getPrice() %></td>
                    <td><%= product.getQuantity() %></td>
                    <td><%= product.getDiscountedPrice() %></td>
                    <td><%= product.getCategory() %></td>
                </tr>
            <%
                }
            %>
        </table>
    <%
        } else {
    %>
        <p>No products to display.</p>
    <%
        }
    %>
    <br>
    <a href="addProduct.jsp">Add another product</a>
	
</body>
</html>