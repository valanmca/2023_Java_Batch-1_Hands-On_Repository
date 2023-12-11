package com.ems.DAO;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ems.bean.Employee;
import com.ems.util.DBUtil;

public class EmployeeDAO {
	Transaction transaction;
	Session session;
	
	public void  insertEmployee(Employee bean) {
		session=DBUtil.getSession();
		transaction=session.beginTransaction();
		
		session.save(bean);
		transaction.commit();
		session.close();
	}
	
	public void  updateEmployee(Employee bean) {
		session=DBUtil.getSession();
		transaction=session.beginTransaction();
		
		session.update(bean);
		transaction.commit();
		session.close();
	}
	
	public void  deleteEmployee(Employee bean) {
		session=DBUtil.getSession();
		transaction=session.beginTransaction();
		
		session.delete(bean);
		transaction.commit();
		session.close();
	}
	
	public List<Integer> getIdList() {
	session=DBUtil.getSession();
	transaction=session.beginTransaction();
	Query query=session.createQuery("select eid from Employee");
	List<Integer> list=query.list();
	transaction.commit();
	session.close();
	
	return list;
	}
	
	public Employee  findEmployee(Employee bean) {
		session=DBUtil.getSession();
		transaction=session.beginTransaction();
		
		Employee emp=session.get(Employee.class, bean.getEid());
		
		transaction.commit();
		session.close();
		return emp;
	}
	
	public List<Employee> getEmployees(){ 
		session=DBUtil.getSession();
		 transaction=session.beginTransaction();
		 Query query= session.createQuery("from Employee"); 
		 List<Employee> empList=query.list();
		 return empList;
	    
	}  
	
	
	
}  