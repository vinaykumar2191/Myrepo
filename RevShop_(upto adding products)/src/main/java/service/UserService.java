package service;

import java.sql.SQLException;

import dao.UserDAO;
import dto.UserDTO;
//import entity.Seller;
import entity.User;
import exception.UserNotFound;

public class UserService {
	
	private static UserDAO userDAO;
	
	public UserService() {
		userDAO = new UserDAO();
	}
	
	public static void registerUser(User user) {
//		User user = new User(user1.getEmail(), user1.getPassword(), user1.getName(), user1.getPhoneNO(), user1.getRole());
		userDAO.addUser(user);
	}
	
	public int getUserID(String email) throws SQLException {
//		System.out.println("userservice");
        return userDAO.getUserID(email);
    }
	
	public UserDTO loginUser(String email, String password) throws UserNotFound{
		User user = UserDAO.getUserByEmail(email);
//		System.out.println(user.getEmail()+" "+user.getPassword());
		if (user == null || !user.getPassword().equals(password) || !user.getEmail().equals(email)) {
			throw new UserNotFound("Invalid email or password");
		}
		return new UserDTO(user.getEmail(), user.getName(), user.getPhoneNO(), user.getRole());
	}
	
}