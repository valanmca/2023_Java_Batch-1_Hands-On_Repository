package com.muthu;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
public abstract class MainClass {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tn = session.beginTransaction();
		
		
		//NamedQueries:
		Query<Employee> query=session.createNamedQuery("SelectAllEmployee");
		List<Employee> list=query.list();
		for(Employee e:list) {
			System.out.println(e);
		}
		
		//Insert:
//		Employee emp = new Employee();
//		emp.setId(111);
//		emp.setName("Kumar");
//		emp.setSalary(5000);
//		
//		session.save(emp);///Insert
//		
//		tn.commit();
//		session.close();
//		System.out.println("Object Saved");
		
		
		
      //NativeQuery:	
//		NativeQuery<Employee> query=session.createSQLQuery("select * from emp_table6");
//		query.addEntity(Employee.class);
//		List<Employee> list=query.list();
//		for(Employee e: list) {
//			System.out.println(e);
//		}
		
		
	//NativeQUERIES UPDATE:
  //NativeQuery query = session.createSQLQuery("update emp_table6 set Emp_name='ShajiRam',Emp_salary=30000 where  Emp_id= 103");
  //query.addEntity(Employee.class);
  //int update = query.executeUpdate();

	tn.commit();	
	session.close();
	}
}