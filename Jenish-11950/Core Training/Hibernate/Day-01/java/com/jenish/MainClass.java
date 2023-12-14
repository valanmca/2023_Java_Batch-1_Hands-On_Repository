package com.jenish;

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
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tn=session.beginTransaction();
		
		Query<Employee> query = session.createNamedQuery("SelectAllEmployee");
		List<Employee> list = query.list();
		for(Employee e : list) {
			System.out.println(e);
		}
		
//		NativeQuery<Employee> query = session.createSQLQuery("SELECT * FROM tbl_employee WHERE emp_id = :id");
//		query.addEntity(Employee.class);
//		query.setParameter("id", 103);
//		List<Employee> list = query.list();
//		for(Employee e : list)
//			
//		System.out.println(e);
		
//		Criteria query = session.createCriteria(Employee.class);
//		query.add(Restrictions.eq("id", 103));
//		query.add(Restrictions.eq("salary", 3000));
//		List<Employee> list = query.list();
//		for(Employee e : list) {
//			System.out.println(e);
//		}
		
		
//		String hql = "update Employee set salary=:s where id=:i";
//		String hql = "delete Employee where id=:i";
//		Query<Employee> query = session.createQuery(hql);
//		query.setParameter("s", 8000);
//		query.setParameter("i", 102);
//		List<Employee> list = query.list();
//		System.out.println(list.);
//		for(Employee e : list) {
//			System.out.println(e.getId()+""+e.getName()+""+e.getSalary());
//		}
//		int n = query.executeUpdate();
//		if(n == 1)
//			System.out.println("Record Deleted");
//		else
//			System.out.println("Record Not Deleted");
//		
//		Employee emp=new Employee();
//		emp.setId(105);
//		emp.setName("Raja");
//		emp.setSalary(7000);
//		

//		session.save(emp); //Insert
//		
		tn.commit();
		session.close();
		//System.out.println("Object Saved");

	}

}
