package com.shiva;

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
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tn = session.beginTransaction();

//		Employee emp = new Employee();
//		emp.setId(8);
//		emp.setName("Arvind");
//		emp.setSalary(5000);
//		emp.setDno(100);
//
//		session.save(emp);// Insert

//		String hql = "from Employee where id=:t";
//		Query<Employee> query = session.createQuery(hql);
//		query.setParameter("t",1);
//		List<Employee> list = query.list();
//		for (Employee e : list) {
//			System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary()+" "+e.getDno());
//		}

//		String hql = "update Employee set salary=:s where id=:i";
//		Query<Employee> query = session.createQuery(hql);
//		query.setParameter("s", 3000);
//		query.setParameter("i", 6);
//		int n = query.executeUpdate();
//		if (n == 1)
//			System.out.println("Record Updated");
//		else
//			System.out.println("Record Not Updated");

//		String hql = "delete Employee where id=:d";
//		Query<Employee> query = session.createQuery(hql);
//		query.setParameter("d", 8);
//		int n = query.executeUpdate();
//		
//		if(n==1) {
//			System.out.println("Record Deleted");
//		} else {
//			System.out.println("Record Not Deleted");
//		}

//		Criteria query = session.createCriteria(Employee.class);
//		query.add(Restrictions.gt("salary", 1000));
//		List<Employee> list = query.list();
//		for (Employee e : list) {
//			System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary() + " " + e.getDno());
//		}

		/* NativeQuery */

		NativeQuery<Employee> query = session.createSQLQuery("select * from tbl_employee");
		query.addEntity(Employee.class);
		List<Employee> list = query.list();
		for (Employee e : list)
			System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary() + " " + e.getDno());

		tn.commit();
		session.close();
//		System.out.println("Object Saved");
	}

}
