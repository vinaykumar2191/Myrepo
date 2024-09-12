package dto;

public class UserDTO {
//	private int user_id;
	private String email;
	private String name;
	private long phone_number;
	private String role;
	
	public UserDTO(String email, String name, long phone_number, String role) {
//		this.user_id = user_id;
		this.email = email;
		this.name = name;
		this.phone_number = phone_number;
		this.role = role;
	}
	
//	public int getUserID() {
//		return user_id;
//	}
//	public void setUserID(int user_id) {
//		this.user_id = user_id;
//	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public long getPhoneNO() {
		return phone_number;
	}
	public void setPhoneNO(long phone_number) {
		this.phone_number = phone_number;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
