package com.muthu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tn = session.beginTransaction();
		Employee emp = new Employee();
		emp.setId(111);
		emp.setName("Kumar");
		emp.setSalary(5000);
		
		session.save(emp);///Insert
		
		tn.commit();
		session.close();
		System.out.println("Object Saved");
	}

}
