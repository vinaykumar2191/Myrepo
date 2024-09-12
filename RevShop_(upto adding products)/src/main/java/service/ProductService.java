package service;

import java.util.ArrayList;
import java.util.List;

import dao.ProductDAO;
import dto.ProductDTO;
import entity.Product;

public class ProductService {
	private static ProductDAO productDAO;
	
	public ProductService() {
		productDAO = new ProductDAO();
	}
	
	public static void insertProduct(Product product) {
		try {
			productDAO.addProduct(product);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<ProductDTO> displayProductsForBuyer() {
	    List<ProductDTO> products = new ArrayList<>();
	    try {
	        products = productDAO.getAllProducts();  // Fetch products from DAO
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return products;  // Return the list of products
	}
}
