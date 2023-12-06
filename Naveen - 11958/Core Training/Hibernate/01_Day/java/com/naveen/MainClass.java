package com.naveen;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class MainClass {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); // connecting db and completing connection

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tn = session.beginTransaction();

//		Employee emp = new Employee();
//		emp.setId(824);hql
//		emp.setName("valan");5-Dec-2023	Day-69
//		emp.setSalary(5000);
//		
//		session.save(emp); //Insert

		// Select queries.

		// String hql = "from Employee"; //select all
		// String hql = "from Employee where id=3"; //select static
		/*
		 * String hql = "from Employee where id=:t"; //select dynamic Query<Employee>
		 * query = session.createQuery(hql); query.setParameter("t", 104);
		 * List<Employee> list = query.list();
		 * 
		 * for(Employee e : list) {
		 * System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary()); }
		 * tn.commit(); session.close(); System.out.println("Object Saved");
		 */

		
		
		// Update Queries.
		
		
//		String hql = "update Employee set salary=:s where id=:i";
//		Query<Employee> query = session.createQuery(hql);
//		query.setParameter("s", 3000);
//		query.setParameter("i", 105);
//		int n = query.executeUpdate();
//		if(n==1)
//			System.out.println("Record Updated!");
//		else
//			System.out.println("Record Not Updated!");
//		
//		tn.commit();
//		session.close();
//		System.out.println("Object Saved");

		// Delete Query.

//		String hql = "delete from Employee where id=:i";
//		Query<Employee> query = session.createQuery(hql);
//		query.setParameter("i", 149);
//		int n = query.executeUpdate();
//		if (n == 1)
//			System.out.println("Record Deleted!");
//		else
//			System.out.println("Record Not Deleted!");
//
//		tn.commit();
//		session.close();
//		System.out.println("Object Saved");
		
		
		//HCQL - select
		
//		Criteria query = session.createCriteria(Employee.class);
//		//query.add(Restrictions.eq("id", 105));
//		query.add(Restrictions.gt("salary", 3000));
//		List<Employee> list  = query.list();
//		for(Employee e : list) {
//			System.out.println(e);
//		}
//		tn.commit();
//		session.close();
//		System.out.println("Object Saved");
		
		
		Criteria query = session.createCriteria(Employee.class);
		//query.add(Restrictions.eq("id", 105));
		//query.add(Restrictions.gt("salary", 3000));
		//query.add(Restrictions.like("name", "%K_%"));
		//query.addOrder(Order.asc("salary"));
		//query.addOrder(Order.desc("id"));
		query.add(Restrictions.between("salary", 2000, 5500));
		List<Employee> list  = query.list();
		
		
		if (list.isEmpty())
			System.out.println("No data present!");
		else {
			for(Employee e : list) {
				System.out.println(e);
			}
		}
			
		tn.commit();
		session.close();
		System.out.println("Object Saved");
	}

}
