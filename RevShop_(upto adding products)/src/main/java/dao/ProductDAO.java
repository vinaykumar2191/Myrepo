package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.ProductDTO;
import entity.Product;
import util.DatabaseConnection;

public class ProductDAO {
	private static Connection connection;
	public ProductDAO() {
		connection = DatabaseConnection.getInstance().getConnection();
	}
	
	public void addProduct(Product product) {
		try {
			
			String query = "INSERT INTO products (seller_id, product_name, description, price, discounted_price, quantity, threshold, category, image_url) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement ps = connection.prepareStatement(query);
//			System.out.println(product.getSellerID()+" dao");
			ps.setInt(1, product.getSellerID());
			ps.setString(2, product.getProductName());
			ps.setString(3, product.getDescription());
			ps.setDouble(4, product.getPrice());
			ps.setDouble(5, product.getDiscountedPrice());
			ps.setInt(6, product.getQuantity());
			ps.setInt(7, product.getThreshold());
			ps.setString(8, product.getCategory());
			ps.setString(9, product.getImageURL());
			
			ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<ProductDTO> getAllProducts() {
		List<ProductDTO> products = new ArrayList<>();
		try {
			String query = "SELECT * FROM products";
			PreparedStatement ps = connection.prepareStatement(query);
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				ProductDTO product;
				String product_name = rs.getString("product_name");
				String description = rs.getString("description");
				double price = rs.getDouble("price");
				double discounted_price = rs.getDouble("discounted_price");
				int quantity = rs.getInt("quantity");
				String category = rs.getString("category");
                product = new ProductDTO(product_name, description, price, discounted_price, quantity, category);
                
//                product.setProductId(rs.getInt("product_id"));
//                product.setProductName(rs.getString("product_name"));
//                product.setDescription(rs.getString("description"));
//                product.setPrice(rs.getDouble("price"));
//                product.setDiscountedPrice(rs.getDouble("discounted_price"));
//                product.setQuantity(rs.getInt("quantity"));
//                product.setThreshold(rs.getInt("threshold"));
//                product.setCategory(rs.getString("category"));
//                product.setImageUrl(rs.getString("image_url"));
                products.add(product);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return products;
		
	}
}