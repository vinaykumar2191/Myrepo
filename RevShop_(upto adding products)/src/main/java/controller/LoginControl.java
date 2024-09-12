package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.UserService;

import java.io.IOException;

import dto.UserDTO;
import exception.UserNotFound;

/**
 * Servlet implementation class LoginControl
 */
public class LoginControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginControl() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    UserService userService = new UserService();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String email = request.getParameter("email");
		String password = request.getParameter("pwd");
		String role = request.getParameter("role");
		
		try {
        	UserDTO loggedInCustomer = userService.loginUser(email, password);
        	System.out.println("Login successful!");      	
        }
        catch (UserNotFound e) {
        	System.out.println("Login failed: " + e.getMessage());
        }
		
		if(role.equalsIgnoreCase("seller")) {
			response.sendRedirect("AddProduct.jsp?email=" + email);
		}
		else if(role.equalsIgnoreCase("buyer")) {
    		System.out.println("true");
    		request.getRequestDispatcher("ProductDisplay.jsp").forward(request, response);
    		System.out.println("true");
    	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
