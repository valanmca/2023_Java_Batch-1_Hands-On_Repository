package com.aravind;

import java.util.List;
import java.util.Scanner;

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
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		Transaction tn=session.beginTransaction();
		Scanner sc=new Scanner(System.in);
		
//		Employee emp=new Employee();
//		emp.setId(2);
//		emp.setName("Dom");
//		emp.setSalary(5000);
//		emp.setDno(34);
//		session.save(emp); //insert
		
//		String hql="from Employee";
//		String hql="from Employee where id=45";
		
//		String hql="from Employee where id =:t";
//Query<Employee> query= session.createQuery(hql);
//		
//		query.setParameter("t", 45);
//		 List<Employee> list=query.list();
//		 
////		 System.out.println(list);(by using to string method)
//		 
//		 
//		 for(Employee e:list)
//		 {
//			 System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary()+" "+e.getDno());
//		 }
//		tn.commit();
//		session.close();
//		System.out.println("Object Saved");
		
		//update 
		
		
//		String hql="update Employee set salary=:s where id=:i";
//		Query<Employee> query= session.createQuery(hql);
//		
//		query.setParameter("s", 8000);
//		query.setParameter("i", 45);
//		 int n=query.executeUpdate();
//		 if(n==1)
//		 {
//			 System.out.println("Record Updated ");
//		 }
//		 else
//		 {
//			 System.out.println("Record  Not Updated ");
//		 }
//		 
////		 System.out.println(list);(by using to string method)
//		 
//		 
//		 
//		tn.commit();
//		session.close();
//		System.out.println("Object Saved");
		
		
		
		//delete
//		String hql="delete Employee where id=:i";
//		Query<Employee> query= session.createQuery(hql);
//		
//		
//		query.setParameter("i", 45);
//		 int n=query.executeUpdate();
//		 if(n==1)
//		 {
//			 System.out.println("Record Deleted ");
//		 }
//		 else
//		 {
//			 System.out.println("Record  Not Deleted ");
//		 }
//		 
////		 System.out.println(list);(by using to string method)
//		 
//		 
//		 
//		tn.commit();
//		session.close();
//		System.out.println("Object Saved");
		
		
		
		//Hcql-dynamic query------
		
//		Criteria query=session.createCriteria(Employee.class);
////		query.add(Restrictions.eq("id", 89));//id-bean class
////		query.add(Restrictions.gt("salary", 2000));//id-bean class
////		query.add(Restrictions.between("salary", 3000, 5000));
//		 query.addOrder(Order.desc("name"));  
//		List<Employee> list=query.list();
//		
//		for(Employee e:list)
//			 {
//			 System.out.println(e);
//			 }
		
		// Native query select
		
//		
//		NativeQuery <Employee> query= session.createSQLQuery("select *from tbl_employee");
//		query.addEntity(Employee.class);
//		List<Employee> list=query.list();
//		
//		for (Employee e:list)
//		{
//			System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary()+" "+e.getDno());
//		}
//		
//		tn.commit();
//		session.close();
		
		//native delete
		
//		NativeQuery <Employee> query= session.createSQLQuery("delete from tbl_employee where id=600");
//		query.addEntity(Employee.class);
//		int n=query.executeUpdate();
//		
//		if(n==1)
//		{
//			System.out.println("record deleted");
//		}
//		else
//		{
//			System.out.println("record  not deleted");
//		}
//		tn.commit();
//		session.close();
		
		// native update
		
//		NativeQuery <Employee> query= session.createSQLQuery("update  tbl_employee set name='aravindsa' where id=1");
//		query.addEntity(Employee.class);
//		int n=query.executeUpdate();
//		
//		if(n==1)
//		{
//			System.out.println("record updated");
//		}
//		else
//		{
//			System.out.println("record  not updated");
//		}
//		tn.commit();
//		session.close();
		
		
		//Named Query
		
		Query<Employee> query=session.createNamedQuery("SelectAllEmployee");
		List<Employee> list=query.list();
		for(Employee e:list)
		{
		System.out.println(e);
		}
		
		
		
	}
	
	
	
	

}
