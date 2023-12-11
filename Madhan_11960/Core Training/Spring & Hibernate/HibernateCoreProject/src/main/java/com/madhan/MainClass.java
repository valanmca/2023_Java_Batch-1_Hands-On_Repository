package com.madhan;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

public class MainClass {
	
	public static void main(String[] args)
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		Transaction tn=session.beginTransaction();
		
//		Employee emp=new Employee();
//		emp.setId(106);
//		emp.setName("Akilesh");
//		emp.setSalary(30000);
//		session.save(emp); //insert query will perform
		
//		String hql="from Employee";
//		Query <Employee> query =session.createQuery(hql);
//		List<Employee> list=query.list();
//		for(Employee e : list)
//		{
//			System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
//		}
////		
//		String hql="from Employee where id = 101";
//		Query <Employee> query =session.createQuery(hql);
//		List<Employee> list=query.list();
//		for(Employee e : list)
//		{
//			System.out.println("Display Particular record :" + e.getId()+" "+e.getName()+" "+e.getSalary());
//		}
		
		//Dynamic HQL Query
		
//		String hql="from Employee where id = :t";
//		Query <Employee> query =session.createQuery(hql);
//		query.setParameter("t", 101);
//		List<Employee> list=query.list();
//		for(Employee e : list)
//		{
//			System.out.println("Dynamic HQL Query :" + e.getId()+" "+e.getName()+" "+e.getSalary());
//		}
		
		//Update query
		
//		String hql="update Employee set salary=:s where id = :t";
//		Query <Employee> query =session.createQuery(hql);
//		query.setParameter("s", 30000);
//		query.setParameter("t", 101);
//		int n=query.executeUpdate();
//		if(n==1)
//		{
//			System.out.println("Record Updated");
//		}
//		else
//		{
//			System.out.println("Record not Updated");
//		}
		
//		String hql="delete from  Employee  where id = :t";
//		Query <Employee> query =session.createQuery(hql);
//		
//		query.setParameter("t", 520);
//		int n=query.executeUpdate();
//		if(n==1)
//		{
//			System.out.println("Record deleted");
//		}
//		else
//		{
//			System.out.println("Record not deleted");
//		}
		
//		Criteria query=session.createCriteria(Employee.class);
//		List<Employee> list=query.list();
//		for(Employee e : list)
//		{
//			System.out.println(e);
//		}
		
//		Criteria query=session.createCriteria(Employee.class);
		
//		query.add(Restrictions.eq("id",101));
//		query.add(Restrictions.gt("salary",30000));
//		query.addOrder(Order.asc("salary"));  
//		query.add(Restrictions.like("name","M%"));
//		query.add(Restrictions.between("id",101,105));
//		query.add(Restrictions.eq("id",101));
//		query.addOrder(Order.asc("name")); 
//		query.addOrder(Order.desc("name")); 
//		List<Employee> list=query.list();
//		for(Employee e : list)
//		{
//			System.out.println(e);
//		}
		
		//Projections
		
//		query.setProjection(Projections.rowCount());
//		query.setProjection(Projections.max("salary"));
//		query.setProjection(Projections.min("salary"));
//		query.setProjection(Projections.avg("salary"));
//		query.setProjection(Projections.sum("salary"));
//		query.setProjection(Projections.countDistinct("salary"));
//		List<Employee> list=query.list();
//		System.out.println("Total Count: " + list.get(0) );
		
//		Concept - NativeQuery
		
//		NativeQuery<Employee> query =session.createSQLQuery("Select * from tbl_employee");
//		 query.addEntity(Employee.class);
//		List<Employee> list=query.list();
//		for(Employee e : list)
//		{
//			System.out.println(e);
//		}
		
//		String sql =("update tbl_employee set salary=:v where EmpID=:s");
//		NativeQuery update =session.createSQLQuery(sql);
//		update.setParameter("v", 50000);
//		update.setParameter("s", 101);
//		int up=update.executeUpdate();
		
//		String sql =("delete from tbl_Employee where EmpID=105");
//		NativeQuery delete =session.createSQLQuery(sql);
//		int del=delete.executeUpdate();
		
//		Query<Employee> query= session.createNamedQuery("SelectAllEmployee");
//		List<Employee> list = query.list();
//		for(Employee e : list)
//		{
//			System.out.println(e);
//		}
		
		Query<Employee> query= session.createNamedQuery("SelectAllEmployee");
		List<Employee> list = query.list();
		for(Employee e : list)
		{
			System.out.println(e);
		}
			
			
		tn.commit();
		session.close();
//		System.out.println("Object Saved");
	}

}
