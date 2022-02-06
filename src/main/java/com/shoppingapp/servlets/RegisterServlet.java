package com.shoppingapp.servlets;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.mindrot.jbcrypt.BCrypt;

import com.shoppingapp.entities.User;
import com.shoppingapp.helper.*;
/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			String user_name = request.getParameter("user_name");
			String user_email = request.getParameter("user_email");
			String user_password = request.getParameter("user_password");
			String user_contactno = request.getParameter("user_contactno");
			String user_address = request.getParameter("user_address");
				
			User user = new User(user_name, user_email, user_password, user_contactno, user_address,"normal");
			Session hibernateSession= FactoryProvider.getFactory().openSession();
				Transaction registertx = hibernateSession.beginTransaction();
				hibernateSession.save(user);
				registertx.commit();
			hibernateSession.close();
			
			HttpSession httpsession = request.getSession();
			httpsession.setAttribute("user_name", user_name+", your Registration is Successful");
			response.sendRedirect("register.jsp");
			return;
			
		}catch(Exception e){
		// TODO: handle exception
			e.printStackTrace();
		}
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
