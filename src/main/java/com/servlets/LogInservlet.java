package com.servlets;

import java.io.IOException;

import com.service.UserService;
import com.service.UserServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LogInservlet
 */
@WebServlet("/LogInservlet")
public class LogInservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogInservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("LoginForm.jsp").forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		UserService service = new UserServiceImpl();
		
		if(service.login(username, password)) {
			   
			   request.setAttribute("username",username);
			   request.getRequestDispatcher("Home.jsp").forward(request, response); 
			   
			  }
			  
			 else {
			   request.setAttribute("message", "user not found!!!");
			   request.getRequestDispatcher("LoginForm.jsp").forward(request, response);
			   
			  }
		
		}

}
