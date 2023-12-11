package com.dharshu;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.util.List;


public class MainClass {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		//sessionFactory is a predefined interface
		//It is a collection of session
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tn=session.beginTransaction();
		
		//Employee emp=new Employee();
		//emp.setId(102);
		//emp.setName("Minion");
		//emp.setSalary(4000);
		
		//session.save(emp); //Inserting the record 
		
		//HQL
		
		//String hql = "delete from Employee where id=:i";
		//Query<Employee> query=session.createQuery(hql);
		//query.setParameter("s", 7000);
		//query.setParameter("i", 101);
		//int n= query.executeUpdate();
		//if(n==1)
		//	System.out.println("Record Deleted");
		//else
		//	System.out.println("Record Not Deleted");
		
		//Criteria query = session.createCriteria(Employee.class);
		//query.add(Restrictions.ne("id", 102));
		//query.add(Restrictions.like("name", "%M%"));
		//query.add(Restrictions.isNotNull("salary"));
		//query.add(Restrictions.between("salary", 2000, 5000));
		//query.addOrder(Order.desc("name"));
		
		//List<Employee> list=query.list();
		//for(Employee e: list) {
			//System.out.println(e);
		//}
		
		
//		NativeQuery<Employee> query=session.createSQLQuery("select * from tbl_employee where EmpId=:id");
//		query.addEntity(Employee.class);//we want to specify that which object we are getting
//		query.setParameter("id", 102);
//		List<Employee> list = query.list();
//		for(Employee e: list) {
//		System.out.println(e);
		
		Query<Employee> query = session.createNamedQuery("SelectAllEmployee");
		List<Employee> list=query.list();
		for(Employee e : list) {
			System.out.println(e);	
		}
	
		tn.commit(); //Save the record
		session.close();
		System.out.println("Object Saved");
	}

}
