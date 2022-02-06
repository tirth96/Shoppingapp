package com.shoppingapp.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryProvider {
	private static SessionFactory factory;
	public static SessionFactory getFactory(){
	
		try {      //Applied Singleton Design Pattern here. Object will be created only if not exist.
			if(factory == null){
				factory = new Configuration()
						.configure("hibernate.cfg.xml")
						.buildSessionFactory();
			}
			
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return factory;
	}
	
}
