package com.domnic.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBUtil {

	public static Session getSession() {
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		return session;
 	}
}
