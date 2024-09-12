package dao;
import java.sql.*;

import entity.Seller;
import util.DatabaseConnection;

public class SellerDAO {

	private static Connection connection;
	public SellerDAO() {
		connection = DatabaseConnection.getInstance().getConnection();
	}
	
	public void addSeller(Seller seller) {
		try {
//			System.out.println(seller.getSellerID());
			String query = "INSERT INTO sellers VALUES(?, ?, ?, ?, ?)";
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setInt(1, seller.getSellerID());
			ps.setString(2, seller.getBusinessName());
			ps.setString(3, seller.getAddress());
			ps.setLong(4, seller.getContact());
			ps.setString(5, seller.getSellerEmail());
			
			ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
//	public int getSellerID()
}
