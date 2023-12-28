package com.jeban;

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
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Transaction tn = session.beginTransaction();

//		Employee emp = new Employee();
//		emp.setId(11);
//		emp.setName("Macmillan");
//		emp.setSalary(5000);
//		emp.setSalary(20);
//		emp.setDno(10);
//		session.save(emp);// insert

//		String hql="from Employee";
//		String hql="from Employee where id=34";
//		String hql = "from Employee where id=:t";// dynamic hql query
//		Query query = session.createQuery(hql);
//		query.setParameter("t", 13);
//		List<Employee> list = query.list();
//
//		for (Employee e : list) {
//			System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary() + " " + e.getDno());
//		}

//		String hql="update Employee set salary=:s where id=:i";
//		Query query = session.createQuery(hql);
//		query.setParameter("s", 2000000);
//		query.setParameter("i", 13);
//		int n=query.executeUpdate();
//        if(n==1)
//        	System.out.println("Record Updated");
//        else
//        	System.out.println("Record Not Updated");

//		String hql = "delete Employee where id=:i";
//		Query query = session.createQuery(hql);
//
//		query.setParameter("i", 10);
//		int n = query.executeUpdate();
//		if (n == 1)
//			System.out.println("Record Deleted");
//		else
//			System.out.println("Record Not Deleted");

//		
//		Criteria query=session.createCriteria(Employee.class);
////		query.add(Restrictions.eq("id",12));
////		query.add(Restrictions.gt("salary",3000));
////		query.addOrder(Order.asc("dno"));//assending order
//		query.setFirstResult(5);
//		List<Employee> list=query.list();
//		for(Employee e:list) {
//			System.out.println(e);
//		}
//
//		NativeQuery<Employee> query = session.createSQLQuery("select * from tbl_emp");
//		query.addEntity(Employee.class);
//		List<Employee> list = query.list();
//		for (Employee e : list) {
//			System.out.println(e);
//		}
		
//		NativeQuery query=session.createSQLQuery("delete from tbl_emp where empid=103");
//		query.addEntity(Employee.class);
//		int id=query.executeUpdate();
//		System.out.println(id);
		
		
		Query<Employee> query=session.createNamedQuery("SelectAllEmployee");
		List<Employee> list=query.list();
		for(Employee e:list) {
			System.out.println(e);
		}
		tn.commit();
		session.close();
		System.out.println("Object Saved");

	}

}
