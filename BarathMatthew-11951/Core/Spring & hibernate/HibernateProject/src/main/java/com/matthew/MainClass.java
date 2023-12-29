package com.matthew;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.NativeQuery;

public class MainClass {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tn=session.beginTransaction();
		
		Employee emp=new Employee();
	
	/*   Insert Record
	 
		emp.seteId(105);
		emp.seteName("Mahesh");
		emp.seteSalary(4987);
		session.save(emp);
		tn.commit();
	*/
		
		
		 
		String hql = "from Employee";
		Query<Employee> query = session.createQuery(hql); 
		List<Employee> list = query.list() ;
		for(Employee e: list) {
			System.out.println(e.geteId()+" "+e.geteName()+" "+e.geteSalary());
		}
//		tn.commit();
		
	
		
		/*
		 * Select particular record using where
		 * 
		String hql = "from Employee where eId =105";
		Query<Employee> query = session.createQuery(hql); 
		List<Employee> list = query.list() ;
		for(Employee e: list) {
			System.out.println(e.geteId()+" "+e.geteName()+" "+e.geteSalary());
		}
		tn.commit();
		*/
		
		/*
		 * Select particular record dynamically 
		 * 
		String hql = "from Employee where eId =:t";
		Query<Employee> query = session.createQuery(hql); 
		query.setParameter("t", 105);
		List<Employee> list = query.list() ;
		for(Employee e: list) {
			System.out.println(e.geteId()+" "+e.geteName()+" "+e.geteSalary());
		}
		tn.commit();
		*/
		
		/*
		 * Update querry 
		 * 
		String hql = "update Employee set eName=:n where eId =:i";
		Query<Employee> query = session.createQuery(hql); 
		query.setParameter("n", "Jaben");
		query.setParameter("i", 104);
		int n = query.executeUpdate();
		if (n==1) {
			System.out.println("Record Updated");
		}
		else {
			System.out.println("Record not updated");
		}
		
		*/
		
		/*
		 * Delete querry
		 * 
		String hql = "delete Employee where eId =:i";
		Query<Employee> query = session.createQuery(hql);
		query.setParameter("i", 104);
		int n = query.executeUpdate();
		if (n==1) {
			System.out.println("Record Deleted");
		}
		else {
			System.out.println("Record not Deleted");
		}
		
		*/
		
		/* select particular field using hql
		Criteria query = session.createCriteria(Employee.class);
		query.add(Restrictions.eq("eId", 103));
		List<Employee> list =query.list();
		for(Employee e: list) {
			System.out.println(e);
		}
		tn.commit();
		
		*/
		
		
		/* Getting fields whose salary is greater than 5000 by using '.gt'
		Criteria query = session.createCriteria(Employee.class);
		query.add(Restrictions.gt("eSalary", 5000));
		List<Employee> list =query.list();
		for(Employee e: list) {
			System.out.println(e);
		}
		tn.commit();
		
		
		*/
		
//		Criteria query = session.createCriteria(Employee.class);
		
//		greater than
//		query.add(Restrictions.gt("eSalary", 500));
		
//		lesser than
//		query.add(Restrictions.lt("eSalary", 5000));
		
//		between
//		query.add(Restrictions.between("eSalary", 500, 5000));
		
//		is like 
//		query.add(Restrictions.ilike("eName", "Matthew"));
		
//      Ascending
//		query.addOrder(Order.asc("eSalary"));
		
//		Descending
		
//		query.addOrder(Order.desc("eSalary"));
		
//		List<Employee> list =query.list();
//		for(Employee e: list) {
//			System.out.println(e);
//		}
		
/*	
 *      Selecting fields from database using Native Query (Find All)
 *    
		NativeQuery<Employee> query = session.createSQLQuery("select * from tbl_employee");
		query.addEntity(Employee.class);
		List<Employee> list = query.list();
		for(Employee e:list) {
			System.out.println(e);
		}
		
		*/
		
		/*
		 
		 Delete using native query
		 
		NativeQuery<Employee> query = session.createSQLQuery("delete from tbl_employee where eId = 101");
		query.addEntity(Employee.class);
		int result = query.executeUpdate();
		if(result==1) {
			System.out.println("Record deleted");
		}
		else {
			System.out.println("record not deleted");
		}
		*/
		
		/*
		NativeQuery<Employee> query = session.createSQLQuery("select * from tbl_employee where eId =102");
		query.addEntity(Employee.class);
		List<Employee> list = query.list();
		System.out.println(list);
		
		*/
		
		/*
		NativeQuery<Employee> query = session.createSQLQuery("update tbl_employee set eName = 'james' where eId = 102");
		query.addEntity(Employee.class);
		int result = query.executeUpdate();
		if(result==1) {
			System.out.println("Record updated");
		}
		else {
			System.out.println("record not updated");
		}
		
		*/
		
		
//		Query<Employee> query = session.createNamedQuery("SelectAllEmployee");
//		List<Employee> list = query.list();
//		for(Employee e:list) {
//			System.out.println(e);
//		}
//		
		tn.commit();
		session.close();
		System.out.println("Object Saved");
		
	}
}
