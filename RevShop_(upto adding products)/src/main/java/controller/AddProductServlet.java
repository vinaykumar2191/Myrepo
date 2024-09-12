package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import service.ProductService;
import service.UserService;

import java.io.IOException;
import java.util.List;

import dto.ProductDTO;
import entity.Product;


/**
 * Servlet implementation class AddProductServlet
 */
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    ProductService productService = new ProductService();
    UserService userService = new UserService();
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		List<ProductDTO> products = productService.displayProductsForBuyer();
		
		HttpSession session = request.getSession();
        session.setAttribute("products", products);
        
        request.getRequestDispatcher("productList.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String email = request.getParameter("email");
		String product_name = request.getParameter("product_name");
		String description = request.getParameter("description");
		String prod_price = request.getParameter("price");
		String discount = request.getParameter("discountPrice");
		String quantity = request.getParameter("quantity");
		String threshold = request.getParameter("threshold");
		String category = request.getParameter("category");
		String img_url = request.getParameter("image_url");
		
		try {
			double product_price = Double.parseDouble(prod_price);
			double discount_price = Double.parseDouble(discount);
			int prod_quantity = Integer.parseInt(quantity);
			int prod_threshold = Integer.parseInt(threshold);
			
			int sellerId = userService.getUserID(email);
			Product product = new Product(sellerId, product_name, description, product_price, discount_price, prod_quantity, prod_threshold, category, img_url);
			
			productService.insertProduct(product);
			
			System.out.println("Product Added Successfully...!");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
