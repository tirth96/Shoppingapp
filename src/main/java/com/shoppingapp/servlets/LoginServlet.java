package com.shoppingapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;

import com.shoppingapp.daoclasses.UserDAO;
import com.shoppingapp.entities.User;
import com.shoppingapp.helper.FactoryProvider;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserDAO user_Dao = new UserDAO(FactoryProvider.getFactory());
		String user_email = request.getParameter("user_email");
		String user_password =request.getParameter("user_password");
		User user = user_Dao.getUserByEmailAndPassword(user_email, user_password);
		//System.out.println(user);
		if(user == null) {
			HttpSession httpsession = request.getSession();
			httpsession.setAttribute("user_email", user_email+", Or Password is Incorrect");
			response.sendRedirect("login.jsp");
		}
		else {
			PrintWriter out = response.getWriter();
			out.println("Welcome " + user.getUsername());
		}
		return;	
	}

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
	}

}
