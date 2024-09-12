package dto;

public class ProductDTO {
	
	private String product_name;
	private String description;
	private double price;
	private double discounted_price;
	private int quantity;
	
	private String category;
	private String image_url;
	
	public ProductDTO(String product_name, String description, double price, double discounted_price, int quantity, String category) {
//		this.sellerId = sellerID;
		this.product_name = product_name;
		this.description = description;
		this.price = price;
		this.discounted_price = discounted_price;
		this.quantity = quantity;
//		this.threshold = threshold;
		this.category = category;
//		this.image_url = image_url;
	}
	
//	public int getSellerID() {
//		return sellerId;
//	}
//	public void setSellerID(int sellerId) {
//		this.sellerId = sellerId;
//	}
	
	public String getProductName() {
		return product_name;
	}
	public void setProductName(String product_name) {
		this.product_name = product_name;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getDiscountedPrice() {
		return discounted_price;
	}
	public void setDiscountedPrice(double discounted_price) {
		this.discounted_price = discounted_price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
//	public int getThreshold() {
//		return threshold;
//	}
//	public void setThreshold(int threshold) {
//		this.threshold = threshold;
//	}
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
//	public String getImageURL() {
//		return image_url;
//	}
//	public void setImageURL(String image_url) {
//		this.image_url = image_url;
//	}
}
