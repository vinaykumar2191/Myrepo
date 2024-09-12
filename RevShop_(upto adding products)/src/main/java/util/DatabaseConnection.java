package util;
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	private static DatabaseConnection instance;
	private static Connection connection;
	
	private DatabaseConnection(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Loads the MySQL JDBC driver. 
			//This step is necessary to register the driver with the JDBC driver manager.
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rev_shop", "root", "Vinaykumar@2002");
			//Establishes a connection to the MySQL database using the specified URL, username, and password.
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static DatabaseConnection getInstance() {
		if(instance == null) {
			instance = new DatabaseConnection();
		}
		return instance;
	}
	
	public static Connection getConnection() {
		return connection;
	}
}

