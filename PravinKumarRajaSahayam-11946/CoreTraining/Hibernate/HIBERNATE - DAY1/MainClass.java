package com.hibernates;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.hibernate.Criteria;
import org.hibernate.Session;
public class MainClass {
public static void main(String[] args)
{
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	Transaction tns = session.beginTransaction();
	//String hql = "from Employee";
	//String hql = "from Employee where id=101";
	//String hql = "from Employee where id=:t";
	/*query.setParameter("t", 101);
	List<Employee> list = query.list();
	for(Employee e : list)
    {
		System.out.println(e.getId() + " " + e.getName() + " " + e.getDepartment());
	}*///For display the details
	
	//For update the details
	/*
	String hql = "update Employee set department=:s where id=:i";
	query.setParameter("s", "AID");
	query.setParameter("i", 101);
	int d = query.executeUpdate();
	if(d == 1)
		System.out.println("Record Updated");
	else
		System.out.println("Record Not Updated");*/
	
	//For delete the details 
	/*String hql = "delete from Employee where id=:i";
	Query<Employee> query = session.createQuery(hql);
	query.setParameter("i", 101);
	int d = query.executeUpdate();
	if(d == 1)
	System.out.println("Record Deleted");
	else
		System.out.println("Record Not Deleted");
	*/
	
	
	//Criteria Query Method(hcql)
	//Select * from Employee Query Method
	/*Criteria query = session.createCriteria(Employee.class);
	List<Employee> list = query.list();
	for(Employee e : list)
	{
		System.out.println(e);
	}*/
	
	//Displaying only the particular details
	/*Criteria query = session.createCriteria(Employee.class);
	query.add(Restrictions.eq("id", 101));
	List<Employee> list = query.list();
	for(Employee e : list)
	{
		System.out.println(e);
	}*/
	
	//Displaying the greater than or lesser than or equal than Method the particular details
	/*Criteria query = session.createCriteria(Employee.class);
	//query.add(Restrictions.gt("department","CSE");
	query.add(Restrictions.eq("department", "CSE"));
	//Equal with the eq Method
	//query.add(Restrictions.eqOrIsNull("id", 101));
	List<Employee> list = query.list();
	for(Employee e : list)
	{
		System.out.println(e);
	}*/
	
	//Displaying the particular letter present for the database like Method
	/*Criteria query = session.createCriteria(Employee.class);
	query.add(Restrictions.like("department", "%C%"));
	List<Employee> list = query.list();
	for(Employee e : list)
	{
		System.out.println(e);
	}*/
	tns.commit();//It will be commit the transaction
	session.close();
}
}
