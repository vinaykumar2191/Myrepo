package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.SellerService;
import service.UserService;

import java.io.IOException;

import entity.Seller;

/**
 * Servlet implementation class SellerRegDetailsServlet
 */
public class SellerRegDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SellerRegDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    UserService userService = new UserService();
    SellerService sellerService = new SellerService();
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String email = request.getParameter("email");
		String business_name = request.getParameter("company_name");
		String address = request.getParameter("address");
		String contact = request.getParameter("contact");
		
		try {
//			System.out.println(email);
			int sellerID = userService.getUserID(email);
//			System.out.println("SellerRegdetails Retrieved sellerID: " + sellerID);
		        
		        // Validate sellerID
//		        if (sellerID <= 0) {
//		            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "User not found.");
//		            return;
//		        }
			long contact_no = Long.parseLong(contact);
			
			Seller seller = new Seller(sellerID, business_name, address, contact_no, email);
			sellerService.registerSeller(seller);
//			System.out.println(sellerID + " -> " + business_name + " -> " + address + " -> " + contact_no + " -> " + email);
			System.out.println("Seller Registration Successful...!");
			request.getRequestDispatcher("LoginUser.jsp").forward(request, response);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
