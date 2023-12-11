package com.example;

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
		
//		Employee emp=new Employee();
//		emp.setEid(102);
//		emp.setEname("Sandy");
//		emp.setEsalary(5000);
//		
//		session.save(emp); //Insert
//		
		
		//String hql="from Employee";  //To get full table objects
		//String hql="from Employee where eid=102";  //To get particular object
		//String hql="from Employee where eid=:temp"; //To get particular object dynamically
		//String hql="update Employee set esalary=:temp where eid=:temp1"; //To update
		
//		String hql="delete Employee where eid=:temp1";
//		Query<Employee> query=session.createQuery(hql);
//		
//		//query.setParameter("temp", 101);  //To get particular object dynamically
//		//query.setParameter("temp", 20000);  //To update
//		//query.setParameter("temp1", 101);   //To update
//		query.setParameter("temp1", 102);
//		
////		List<Employee> list=query.list();
////		for(Employee e:list){
////			System.out.println(e.getEid()+" "+e.getEname()+" "+e.getEsalary());
////		}
//		
//		int n=query.executeUpdate();
//		if(n==1)
//			//System.out.println("Record updated");
//			System.out.println("Record deleted");
//		else
//			//System.out.println("Record not updated");
//			System.out.println("Record not deleted");
//		Criteria query=session.createCriteria(Employee.class);
//		//query.add(Restrictions.eq("eid", 105));  // For equal
//		//query.add(Restrictions.gt("esalary", 17000));  // For greater than
//		query.add(Restrictions.between("esalary", 12000,20000));  // For between
//		//query.add(Restrictions.like("ename", "%S%"));
//		List<Employee> list=query.list();
//		for(Employee e:list) {
//			System.out.println(e);
//		}
//		
//		tn.commit(); //Save
//		
//		session.close(); //Close
//		
		//System.out.println("Object Saved");

//		NativeQuery<Employee> query=session.createSQLQuery("select * from tbl_emp");
//		query.addEntity(Employee.class);
//		List<Employee> list=query.list();
//		for(Employee e:list) {
//			System.out.println(e);
//		}
		
//		NativeQuery<Employee> query=session.createSQLQuery("delete from tbl_emp where e_id=105");
//		query.addEntity(Employee.class);
//		int n=query.executeUpdate();
//		if(n==1) {
//			System.out.println("record deleted");
//		} else {
//			System.out.println("not deleted");
//		}
		
//		Query<Employee> query=session.getNamedQuery("SelectAllEmployee");
//		List<Employee> list=query.list();
//		for(Employee e:list) {
//			System.out.println(e);
//		}

		Query<Employee> query=session.getNamedNativeQuery("SelectAllEmployee");
		List<Employee> list=query.list();
		for(Employee e:list) {
			System.out.println(e);
		}

		tn.commit();
		session.close();
	}

}
