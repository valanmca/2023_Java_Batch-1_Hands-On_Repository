package com.naveen;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); // connecting db and completing connection

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tn = session.beginTransaction();
		Employee emp = new Employee();
		emp.setId(824);
		emp.setName("valan");
		emp.setSalary(5000);
		
		session.save(emp); //Insert
		
		tn.commit();
		session.close();
		System.out.println("Object Saved");
	}

}
