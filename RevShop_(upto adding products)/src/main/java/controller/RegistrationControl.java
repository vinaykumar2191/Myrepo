package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.UserService;

import java.io.IOException;

import entity.User;

/**
 * Servlet implementation class RegistrationControl
 */
//@WebServlet("/register")
public class RegistrationControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RegistrationControl() {
        // TODO Auto-generated constructor stub
    }
    
    UserService userService = new UserService();
    
    
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
        String password = request.getParameter("pwd");
        String name = request.getParameter("username");
        String phone = request.getParameter("ph_no");
        String role = request.getParameter("role");
//        phone = Long.parseLong(phone);
//        System.out.println(email);
//        System.out.println(password);
//        System.out.println(name);
//        System.out.println( phone);
//        System.out.println(role);
        
        
        try {
        	long phone_no = Long.parseLong(phone);
        	
        	User user = new User(email, password, name, phone_no, role);
        	
//        	System.out.println(email + "=" + password + "=" + name + "=" + phone_no + "=" + role);
        	UserService.registerUser(user);
        	if(role.equalsIgnoreCase("seller")) {   
        		System.out.println("Registration successfull for seller in users ...!");
//            	response.sendRedirect("SellerRegistration.jsp?email=" + email);
            	request.getRequestDispatcher("SellerRegistration.jsp").forward(request, response);
            }
        	else{
        		System.out.println("Registered Successfully...!");
//        		response.sendRedirect("LoginUser.jsp");
        		request.getRequestDispatcher("LoginUser.jsp").forward(request, response);
        	}
        	
        	
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
        
        
	}

}
