package entity;

public class Seller {
	private int sellerId;
	private String businessName;
	private String address;
	private long contact_no;
	private String sellerEmail;
	
	public Seller(int sellerId, String businessName, String address, long contact_no, String sellerEmail) {
		this.sellerId = sellerId;
		this.businessName = businessName;
		this.address = address;
		this.contact_no = contact_no;
		this.sellerEmail = sellerEmail;
	}
	
	public int getSellerID() {
		return sellerId;
	}
	public void setSellerID(int sellerId) {
		this.sellerId = sellerId;
	}
	
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public long getContact() {
		return contact_no;
	}
	public void setContact(long contact_no) {
		this.contact_no = contact_no;
	}
	
	public String getSellerEmail() {
		return sellerEmail;
	}
	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}
}
