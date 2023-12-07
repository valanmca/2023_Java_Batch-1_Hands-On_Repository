package com.hibernates;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.NativeQuery;
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
	//Select and displaying all the employee details
    /*NativeQuery<Employee> query = session.createSQLQuery("select * from Employee");
    query.addEntity(Employee.class);
	List<Employee> list = query.list();
	for(Employee e : list)
	{
		System.out.println(e);
	}*/
	//Update and diplaying the particular employee details
    /*NativeQuery<Employee> query = session.createSQLQuery("update Employee set department=:s where id=:i");
    query.addEntity(Employee.class);
    query.setParameter("s", "ECE");
    query.setParameter("i", 101);
	int list = query.executeUpdate();
	if(list == 1)
	{
		System.out.println("Employee Record Updated Successfully");
	}
	else
	{
		System.out.println("Employee Record Not Updated");
	}*/
	//Delete and Displaying the particular employee details
	/*NativeQuery<Employee> query = session.createSQLQuery("delete from Employee where id=:i");
    query.addEntity(Employee.class);
    query.setParameter("i", 101);
	int list = query.executeUpdate();
	if(list == 1)
	{
		System.out.println("Employee Record Delete Successfully");
	}
	else
	{
		System.out.println("Employee Record Not Delete");
	}*/
	//Insert into the table and displaying the particular employee details
	/*NativeQuery<Employee> query = session.createSQLQuery("insert into Employee (id, name, department) values (?,?,?)");
    query.addEntity(Employee.class);
    query.setParameter(1, 101);
    query.setParameter(2, "Raja");
    query.setParameter(3, "CSE");
	int list = query.executeUpdate();
	if(list == 1)
	{
		System.out.println("Employee Record Inserted Successfully");
	}
	else
	{
		System.out.println("Employee Record Not Inserted");
	}*/
	//Named Query Method
	/*Query<Employee> query = session.createNamedQuery("selectAllEmployee");
	List<Employee> list = query.list();
	for(Employee e : list)
	{
		System.out.println(e);
	}*/
	//Named Native Query Method
	NativeQuery<Employee> query = session.createNativeQuery("FindAllEmployee");
	query.addEntity(Employee.class);
	List<Employee> list = query.list();
	for(Employee e : list)
	{
		System.out.println(e);
	}
	tns.commit();
	session.close();
	
}
}