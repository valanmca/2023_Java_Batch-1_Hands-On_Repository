package com.domnic;

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

//		Employee emp=new Employee();
//		emp.setId(104);
//		emp.setName("Mahesh");
//		emp.setSalary(5000);
//		

//		session.save(emp);//Insert

//		String hql="from Employee";

//      String hql="from Employee where id=102";  //the id mentioned here is bean property name

//		String hql="from Employee where id=:temp";  //the id mentioned here is bean property name
//		Query<Employee> query=session.createQuery(hql);
//		query.setParameter("temp", 102);
//		List<Employee> list=query.list();
//		
//		//System.out.println(list); (By using toString)
//		for(Employee e:list) {   //(for printing line by line)
//			System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
//		}

//		String hql = "update Employee set salary=:s where id=:i";
//		Query<Employee> query = session.createQuery(hql);
//		query.setParameter("s", 3020);
//		query.setParameter("i", 102);
//		int n = query.executeUpdate();
//		if (n == 1)
//			System.out.println("Record Updated");
//		else
//			System.out.println("Record not updated");
//		tn.commit();
//		session.close();
		
//		String hql1 = "delete Employee where id=:i";
//		Query<Employee> query1 = session.createQuery(hql1);
//		query1.setParameter("i", 102);
//		int n1 = query1.executeUpdate();
//		if (n1 == 1)
//			System.out.println("Record Deleted");
//		else
//			System.out.println("Record not Deleted");

	
	
	
	//HCQL -(Hibernate Criteria query lang.)
//		
//		Criteria cquery=session.createCriteria(Employee.class);
//		//cquery.add(Restrictions.eq("id", 101)); 
//		//cquery.add(Restrictions.gt("salary",3000 ));
//		//cquery.add(Restrictions.like("name","%d%" ));
//		//cquery.add(Restrictions.le("salary",3000 ));
//		cquery.addOrder(Order.desc("id"));
//		List<Employee> list=cquery.list();
//		for(Employee e: list) {
//			System.out.println(e);
//		}
		
		
		
		//Native query language
		
//		NativeQuery<Employee> query=session.createSQLQuery("select * from table_employee");
//		query.addEntity(Employee.class);
//		List<Employee>list=query.list();
//		for(Employee e: list) {
//			System.out.println(e);
//		}	
		
//		NativeQuery<Employee> query=session.createSQLQuery("delete from table_employee where id=101");
//		query.addEntity(Employee.class);
//		int output=query.executeUpdate();
//		if(output==1) {
//			System.out.println("Deleted successfully");
//		}else {
//			{
//				System.out.println("Not Deleted");
//			}
//		}
		
//		NativeQuery<Employee> query=session.createSQLQuery("update table_employee set name='Aravindu' where id=102");
//		query.addEntity(Employee.class);
//		int output=query.executeUpdate();
//		if(output==1) {
//			System.out.println("Updated successfully");
//		}else {
//			{
//				System.out.println("Not Updated");
//			}
//		}
		
		Query<Employee> query=session.createNamedQuery("SelectAllEmployee");
		List<Employee> list=query.list();
		for(Employee e:list) {
			System.out.println(e);
		}
		
		
		tn.commit();
		session.close();
	}
        

}
