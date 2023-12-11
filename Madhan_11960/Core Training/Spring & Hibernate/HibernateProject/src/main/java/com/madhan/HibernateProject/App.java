package com.madhan.HibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		Transaction tn = session.beginTransaction();

		Employee emp = new Employee();
		emp.setEid(108);
		emp.setEname("Abi");
		emp.setEsalary(7000);
		session.save(emp); // insert query will perform

		tn.commit();
		session.close();
		System.out.println("Object Saved");
	}
}
