package com.swetha;

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

		// connecting with database,completing mapping
		Configuration cfg = new Configuration(); // Creating configuration obj...
		cfg.configure("hibernate.cfg.xml"); // Passing the cfg file

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		// Begin my transaction
		Transaction tn = session.beginTransaction();
		
		

//		Employee emp=new Employee();
//		emp.setId(16);
//		emp.setName("Arun");
//		emp.setSalary(70000);
//		emp.setDno(10);
//		
//		session.save(emp); //Insert

		//----------------Using HQL Query-----------------------------
		//Select query
		
//		String hql="from Employee where id=5";
//
//		//String hql = "from Employee where id=:t"; // Dynamic HQL query,creating temporary variable.
//		Query<Employee> query = session.createQuery(hql);
//		//query.setParameter("t", 5); // For creating dynamic hql query
//		List<Employee> list = query.list();
//		for (Employee e : list) {
//			System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary());
//		}
		
		//Update Query
		
//		String hql="update Employee set salary=:s where id=:i";
//		Query<Employee> query = session.createQuery(hql);
//		query.setParameter("s", 7000);
//		query.setParameter("i", 5);
//		int n=query.executeUpdate();
//		if(n==1) {
//			System.out.println("Record updated");
//		}
//		else {
//			System.out.println("Record not updated");
//		}
		
//		//Delete Query
//		
//		String hql="delete from Employee where id=:i";
//		Query<Employee> query = session.createQuery(hql);
//		query.setParameter("i",5);
//		int n=query.executeUpdate();
//		if(n==1) {
//			System.out.println("Record deleted");
//		}
//		else {
//			System.out.println("Record not deleted");
//		}
		
		
		//---------------------------------HCQL queries---------------------
		
		/*Criteria query = session.createCriteria(Employee.class);
		
		//query.add(Restrictions.eq("id",13)); //Display record of id=13.
		//query.add(Restrictions.gt("salary",3000)); //Display salary greater than 3000.
		//query.add(Restrictions.between("salary",1000,10000));
		//query.add(Restrictions.like("name","sw%")); //Display record of name start with "sw.."
		//query.add(Restrictions.ilike("name","s%"));
		//query.add(Restrictions.isNull("name")); //Returns the records of name=null
		//query.add(Restrictions.isNotNull("salary"));// Returns records of salary not equals null
		
		//query.addOrder(Order.asc("id")); //Arranging in ascending oreder based on the ID
		//query.addOrder(Order.desc("id")); //Arranging in descending oreder based on ID
		
		
		List<Employee>list=query.list();
		for(Employee e: list) {
			System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary()+" "+e.getDno()+" ");
		}*/
		
		
		
		
		//------------Native SQL query-----------------
		//---------1.Select Query----------------------
		
//		NativeQuery<Employee> query=session.createSQLQuery("select * from employee");
//		query.addEntity(Employee.class);
//		List<Employee>list=query.list();
//		for(Employee e: list) {
//			System.out.println(e);
//		}
		
		//-----------Named query--------------------
		
		/*Query<Employee> query = session.createNamedQuery("SelectAllEmployee");
		
		List<Employee>list=query.list();
		for(Employee e: list) {
			System.out.println(e);
		}*/
		
		
		Query<Employee> query = session.createNamedQuery("SelectEmployee");
		query.setParameter("id",11956);
		List<Employee>list=query.list();
		for(Employee e: list) {
			System.out.println(e);
		}
		
		
		
		
		
		// To close the transaction either commit or rollback is required
		tn.commit();
		session.close();
		System.out.println("Object saved");
	}

}
