package com.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HbUtil {
	
	static Configuration config = null;
	static SessionFactory sf  = null;
	static  Session session  = null;
	
	public static Session getDBSession() {
		
		 config = new Configuration().configure("hibernate.cfg.xml");
	      sf =	 config.buildSessionFactory();
	      session = sf.openSession();
		
	      return session;
	}

}
