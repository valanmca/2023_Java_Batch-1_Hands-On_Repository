package com.jeyandhan;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

public class MainClass {

	public static void main(String[] args) {
		Configuration cfg = new Configuration(); // creating configuration method
		cfg.configure("hibernate.cfg.xml"); // loading my configuration

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tn = session.beginTransaction();

//		Employee emp = new Employee();
//		emp.setId(1);
//		emp.setName("Jeyandhan");
//		emp.setSalary(5000);

//		session.save(emp); //Insert

		//HQL
		/*
		  String hql = "from Employee"; Query<Employee> query = session.createQuery(hql); List<Employee> list = query.list(); 
		  for (Employee e : list) { System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary());
		   }
		 */

		/*
		  String hql = "from Employee where id=3"; Query<Employee> query = session.createQuery(hql); 
		  List<Employee> list = query.list(); 
		  for (Employee e : list) { 
		  System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary()); 
		  }
		 */

		/*
		  String hql = "from Employee where id=:t"; Query<Employee> query = session.createQuery(hql); 
		  query.setParameter("t", 824);
		  List<Employee> list = query.list(); 
		  for (Employee e : list) { 
		  System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary()); 
		  }
		 */

		/*
		  String hql = "update Employee set salary=:s where id=:i";
		 
		  Query<Employee> query = session.createQuery(hql);
		 
		  query.setParameter("s", 3000); query.setParameter("i", 1);
		  
		  int n = query.executeUpdate();
		  
		  if (n == 1) { System.out.println("Record Updated"); } else {
		  System.out.println("Record not updated"); }
		 */

		/* String hql = "delete Employee where id=:d";
			Query<Employee> query = session.createQuery(hql);
			query.setParameter("d", 1);
			int n = query.executeUpdate();

			if (n == 1) {
				System.out.println("Record deleted");
			} else {
				System.out.println("Record deleted");
			} 
		*/
		
		//HCQL
		
		/*	Criteria query = session.createCriteria(Employee.class);
			List<Employee> list = query.list();
			for (Employee e : list) { 
			  System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary()); 
			 }
		*/
		
		/* Criteria query = session.createCriteria(Employee.class);
		query.add(Restrictions.eq("id", 1));
		List<Employee> list = query.list();
		for (Employee e : list) { 
			System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary()); 
		 }
		 */
		
		/*Criteria query = session.createCriteria(Employee.class);
		query.add(Restrictions.gt("salary", 3000));
		List<Employee> list = query.list();
		for (Employee e : list) { 
			System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary()); 
		 }*/
		
		NativeQuery<Employee> query = session.createSQLQuery("select * from tbl_employee");
		query.addEntity(Employee.class);
		List<Employee> list = query.list();
		for (Employee e : list) { 
			System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary()); 
		 }
		tn.commit();
		session.close();
		System.out.println("Object Saved");
	}

}
