package com.shoppingapp.daoclasses;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.shoppingapp.entities.User;

public class UserDAO {
	private SessionFactory session_factory;

	public UserDAO(SessionFactory session_factory) {
		super();
		this.session_factory = session_factory;
	}
	// Methods to access data
	
	public User getUserByEmailAndPassword(String user_email, String user_password) {
		User user = null;
		try {
				String fetch_query = "from User where user_email =: e and user_password=:p";
				Session session = this.session_factory.openSession();
				Query f_q = session.createQuery(fetch_query);
				f_q.setParameter("e", user_email);
				f_q.setParameter("p",user_password);
				user = (User)f_q.uniqueResult();
				
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return user;
	
	}
	
}
