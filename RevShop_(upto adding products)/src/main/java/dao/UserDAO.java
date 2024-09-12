package dao;

import java.sql.*;

import com.mysql.cj.protocol.Resultset;

import entity.Seller;
import entity.User;
import util.DatabaseConnection;

public class UserDAO {
	
	private static Connection connection;
	
	public UserDAO() {
		connection = DatabaseConnection.getInstance().getConnection();
	}
	
	public void addUser(User user) {
		try {
			String query = "INSERT INTO users(email, password, name, phone_number, role) VALUES(?, ?, ?, ?, ?)";
			PreparedStatement ps = connection.prepareStatement(query);
//			ps.setInt(1, user.getUserID());
			ps.setString(1, user.getEmail());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getName());
			ps.setLong(4, user.getPhoneNO());
			ps.setString(5, user.getRole());
			
			ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int getUserID(String email)  {
		
		String query="select user_id from users where email=?";
		try {
//			System.out.println("true");
			PreparedStatement ps=connection.prepareStatement(query);
			ps.setString(1,email);
			   ResultSet rs=ps.executeQuery();
			   if(rs.next())
			   {
//				   System.out.println("true1");
				   int id = rs.getInt(1);
//				   System.out.println(id);
				   return id;
			   }
			   else
			   {
				   return 0;
			   }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
		
		
	    
//	    String query = "SELECT user_id FROM users WHERE email = ?";  // Adjust query as needed
//	    
//	    try (PreparedStatement pstmt = connection.prepareStatement(query)) {
//	        pstmt.setString(1, email);
//	        ResultSet rs = pstmt.executeQuery();
//	        
//	        if (rs.next()) {
//	            userID = rs.getInt("user_id");
//	        }
//	    }
//	    return userID;
	}

	
//	public void updateUser(User user) {
//		try {
//			String query = "UPDATE users SET email = ?, name = ?, phone_number = ?, role = ? WHERE user_id = ?";
//			PreparedStatement ps = connection.prepareStatement(query);
//			
//			ps.setString(1, user.getEmail());
//			ps.setString(3, user.getName());
//			ps.setLong(4, user.getPhoneNO());
//			ps.setString(5, user.getRole());
//			ps.setInt(5, user.get());
//			
//			ps.executeUpdate();
//		}
//		catch(SQLException e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void deleteUser(User user) {
//		try {
//			String query = "DELETE FROM users WHERE user_id = ?";
//			PreparedStatement ps = connection.prepareStatement(query);
//			
//			ps.setInt(1, user.getUserID());
//			ps.executeUpdate();
//		}
//		catch(SQLException e) {
//			e.printStackTrace();
//		}
//	}
	
	public static User getUserByEmail(String email) {
		User user = null;
		try {
			String query = "SELECT * FROM users WHERE email = ?";
			PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();     	
            if (rs.next()) {           		
//            	System.out.println("true");
            	user = new User(
            				rs.getString("email"),
            				rs.getString("password"),
            				rs.getString("name"),
            				rs.getLong("phone_number"),
            				rs.getString("role"));
//            		int userId = rs.getInt("user_id");
//                    String email1 = rs.getString("email");
//                    String name = rs.getString("name");
//                    String phoneNumber = rs.getString("phone_number");
//                    String role = rs.getString("role");
                    
            	}
            	         
        } 
		catch (SQLException e) {
            e.printStackTrace();
        }
		return user;
	}
	
//	public void addSeller(Seller seller) {
//		try {
//			String query = "INSERT INTO sellers VALUES (?, ?, ?, ?)";
//			PreparedStatement ps = connection.prepareStatement(query);
//			
//			ps.setInt(1, seller.getSellerID());
//			ps.setString(2, seller.getBusinessName());
//			ps.setString(3, seller.getAddress());
//			ps.setLong(4, seller.getContact());
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
}


