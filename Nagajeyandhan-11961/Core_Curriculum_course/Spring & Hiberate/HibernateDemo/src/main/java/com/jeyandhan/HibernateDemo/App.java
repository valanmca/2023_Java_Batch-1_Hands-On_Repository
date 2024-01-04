package com.jeyandhan.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Student student = new Student();
		student.setRollNo(11);
		student.setName("Jeyandhan");
		student.setLocation("Rajapalayam");

		Configuration con = new Configuration();
		
		SessionFactory sf = con.buildSessionFactory();
		
		Session session = sf.openSession();

		session.save(student);

	}
}
