package com.sara.HibernateProject;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

public class MainClass {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");

		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		/*
		  Employee emp = new Employee();
		  emp.setId(104); 
		  emp.setName("Kohli");
		  emp.setSalary(15000.00f);
		  
		  
		  session.save(emp); // Insert employee object
		 
		 //session.delete(emp);//Deleting employee object
		 */

		// HQL query Examples
		// Static Select
		/*
		   String hql = "from Employee"; 
		   Query<Employee> query = session.createQuery(hql); 
		   List<Employee> list = query.list(); 
		   for(Employee e : list) {
		  		System.out.println("Employee Id : "+e.getId()+"\nEmployee Name : "+e.getName()+"\nEmployee Salary :  "+e.getSalary());
		 		System.out.println("_____________________________________________"); 
		 	}
		 */

		// Static Select with where
		/*
		  String hql = "from Employee where id=104";
		  Query<Employee> query = session.createQuery(hql); 
		  List<Employee> list = query.list(); 
		  for (Employee e : list) { 
		  	System.out.println("Employee Id : " + e.getId() +"\nEmployee Name : " + e.getName() + "\nEmployee Salary :  " +
		  e.getSalary());
		  System.out.println("_____________________________________________"); 
		  }
		 */

		// Dynamic Select
		/*String hql = "from Employee where id =: t";
		Query<Employee> query = session.createQuery(hql);
		query.setParameter("t", 101);
		List<Employee> list = query.list();
		for (Employee e : list) {
			System.out.println("Employee Id : " + e.getId() + "\nEmployee Name : " + e.getName()
					+ "\nEmployee Salary :  " + e.getSalary());
			System.out.println("_____________________________________________");
		}*/
		
		//HQL Update
		/*String hql = "update Employee set salary =:s where id =: i";
		Query<Employee> query = session.createQuery(hql);
		query.setParameter("s", 20000.0f);
		query.setParameter("i", 104);
		int n = query.executeUpdate();
		if (n == 1) {
			System.out.println("Record Updated...");
		}else {
			System.out.println("Record Not Updated...");
		}*/
		
		//HQL delete
				/*String hql = "delete from Employee where id =: id";
				Query<Employee> query = session.createQuery(hql);
				query.setParameter("id", 102);
				int n = query.executeUpdate();
				if (n == 1) {
					System.out.println("Record Deleted...");
				}else {
					System.out.println("Record Not Deleted...");
				}*/
		
		//HCQL query for Equal
		/*Criteria query = session.createCriteria(Employee.class);
		query.add(Restrictions.eq("id", 101));
		List<Employee> list = query.list();
		for (Employee e : list) {
			System.out.println(e);
		}*/
		
		//HCQL query for Greater than
		/*Criteria query = session.createCriteria(Employee.class);
		query.add(Restrictions.gt("salary", 10000.0f));
		List<Employee> list = query.list();
		for (Employee e : list) {
			System.out.println(e);
		}*/
		
		//HCQL query for Between
		/*Criteria query = session.createCriteria(Employee.class);
		query.add(Restrictions.between("salary",10000.0f,15000.0f));
		List<Employee> list = query.list();
		for (Employee e : list) {
			System.out.println(e);
		}*/
		
		//HCQL query for Like
		/*Criteria query = session.createCriteria(Employee.class);
		query.add(Restrictions.like("name","S%"));
		List<Employee> list = query.list();
		for (Employee e : list) {
			System.out.println(e);
		}*/
		
		//HCQL query for  Descending order
		/*Criteria query = session.createCriteria(Employee.class);
		query.addOrder(Order.desc("id"));
		List<Employee> list = query.list();
		for (Employee e : list) {
			System.out.println(e);
		}*/
		
		//HCQL query for  Descending order
		/*Criteria query = session.createCriteria(Employee.class);
		query.addOrder(Order.asc("name"));
		List<Employee> list = query.list();
		for (Employee e : list) {
			System.out.println(e);
		}*/
		
		//Native Query Example
		/*NativeQuery<Employee> query = session.createSQLQuery("Select * from employee");
		query.addEntity(Employee.class);
		List<Employee> list = query.list();
		for(Employee e : list) {
			System.out.println(e);
		}*/
		
		//Example for NamedQueries
		/*Query<Employee> query = session.getNamedQuery("SelectAllEmployee");
		List<Employee> list = query.list();
		for(Employee e : list) {
			System.out.println(e);
		}*/
		
		Query<Employee> query = session.getNamedQuery("SelectEmployee");
		query.setParameter("id", 108);
		List<Employee> list = query.list();
		for(Employee e : list) {
			System.out.println(e);
		}

		transaction.commit();
		session.close();

		// System.out.println("Object is Saved...");
		// System.out.println("Object is Deleted...");

	}

}
