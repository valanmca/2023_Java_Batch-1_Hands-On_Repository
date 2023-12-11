package com.hephzi;


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
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tn=session.beginTransaction();
		
//		Employee emp=new Employee();
//		emp.setId(842);
//		emp.setName("emi");
//		emp.setSalary(5000);
//		emp.setDno(10);
//		
//		session.save(emp); //Insert
		
		//HQL
//		String hql="from Employee";
//		Query<Employee> query=session.createQuery(hql);	
//		List<Employee> list=query.list();
//		for(Employee e:list) {
//			System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary()+" "+e.getDno());
//		}
//		
//		String hql="from Employee where id=876";
//		Query<Employee> query=session.createQuery(hql);	
//		List<Employee> list=query.list();
//		for(Employee e:list) {
//			System.out.println("Displaying particular record "+e.getId()+" "+e.getName()+" "+e.getSalary()+" "+e.getDno());
//		}
		
//		String hql="from Employee where dno=:t";
//		Query<Employee> query=session.createQuery(hql);	
//		query.setParameter("t", 10);
//		List<Employee> list=query.list();
//		for(Employee e:list) {
//			System.out.println("Displaying particular record "+e.getId()+" "+e.getName()+" "+e.getSalary()+" "+e.getDno());
//		}
		
//		String hql="update Employee set salary=:s where id=:i";
//		Query<Employee> query=session.createQuery(hql);	
//		query.setParameter("s", 10000);
//		query.setParameter("i", 123);
//		int n=query.executeUpdate();
//		if(n==1)
//			System.out.println("Record Updated");
//		else
//			System.out.println("Record Not Updated");
//		
		
//		String hql="delete from Employee where id=:t";
//		Query<Employee> query=session.createQuery(hql);	
//		query.setParameter("t", 111);
//		int n=query.executeUpdate();
//		if(n==1) {
//			System.out.println("Successfully Deleted");
//		}
//		else {
//			System.out.println("Record not found");
//		}
		
		
		//HCQL
//		Criteria query=session.createCriteria(Employee.class);
//		query.add(Restrictions.eq("id",101));			//equal
//		query.add(Restrictions.ne("id",101));			//not equal
//		query.add(Restrictions.gt("salary",10000));   //greater than 
//		query.add(Restrictions.ge("salary",10000));		//greater than or equal
//		query.add(Restrictions.lt("salary",10000));		//less than
//		query.add(Restrictions.le("salary",10000));		//less than or equal
//		query.add(Restrictions.between("id",500,900));  //between
//		query.add(Restrictions.like("ename","%hep%"));  //like
//		query.addOrder(Order.asc("ename"));             //ascending
//		query.addOrder(Order.asc("ename")); 			//descending
//		List<Employee> list=query.list();		
//		for(Employee e:list) {
//			System.out.println(e);
//		}
		
//		NativeQuery<Employee> query = session.createSQLQuery("select *from tbl_employee");
//		query.addEntity(Employee.class);
//		List<Employee> list=query.list();		
//		for(Employee e:list) {
//			System.out.println(e);
//		}
		
//		Query<Employee> query = session.createNamedQuery("SelectAllEmployee");
//		List<Employee> list=query.list();		
//		for(Employee e:list) {
//			System.out.println(e);
//		}
		
		Query<Employee> query = session.createNamedQuery("SelectAllEmployee");
		List<Employee> list=query.list();		
		for(Employee e:list) {
			System.out.println(e);
		}
		
		tn.commit();
		session.close();
		System.out.println("Object Saved");
	}

}
