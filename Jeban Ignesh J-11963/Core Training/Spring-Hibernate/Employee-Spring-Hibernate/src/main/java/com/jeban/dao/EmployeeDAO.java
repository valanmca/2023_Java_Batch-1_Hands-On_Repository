package com.jeban.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.jeban.bean.Employee;
import com.jeban.util.DButil;

public class EmployeeDAO {
	Transaction transaction;
	Session session;
	
	public void insertEmployee(Employee bean) {
		session =DButil.getSession();
		transaction=session.beginTransaction();
		
		session.save(bean);
		
		transaction.commit();
		session.close();
		
	}
	public void updateEmployee(Employee bean) {
		session =DButil.getSession();
		transaction=session.beginTransaction();
		
		session.update(bean);
		
		transaction.commit();
		session.close();
		
	}
	public void deleteEmployee(Employee bean) {
		session =DButil.getSession();
		transaction=session.beginTransaction();
		
		session.delete(bean);
		
		transaction.commit();
		session.close();
		
	}
	public List<Integer> getIdList() {
		session =DButil.getSession();
		transaction=session.beginTransaction();
		
		Query query=session.createQuery("select id from Employee");
		
		List<Integer> list=query.list();
		
		transaction.commit();
		session.close();
		return list;
		
	}
	public Employee findEmployee(Employee bean) {
		session =DButil.getSession();
		transaction=session.beginTransaction();
		
		Employee emp = session.get(Employee.class,bean.getId());
		
		transaction.commit();
		session.close();
		return emp;
		
	}
	public List<Employee> getEmployees(){ 
        session=DButil.getSession();
         transaction=session.beginTransaction();
         Query query= session.createQuery("from Employee"); 
         List<Employee> empList=query.list();
         return empList;
        
    }

}
