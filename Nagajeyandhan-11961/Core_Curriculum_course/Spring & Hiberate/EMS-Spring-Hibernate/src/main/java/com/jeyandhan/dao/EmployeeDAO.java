package com.jeyandhan.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.jeyandhan.bean.Employee;
import com.jeyandhan.util.DBUtil;

public class EmployeeDAO {
	Transaction transaction;
	Session session;
	
	public void insertEmployee(Employee bean) {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();
		
		session.save(bean);
		
		transaction.commit();
		
		session.close();
	}
	
	public void updateEmployee(Employee bean) {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();
		
		session.update(bean);
		
		transaction.commit();
		
		session.close();
	}
	
	public void DeleteEmployee(Employee bean) {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();
		
		session.update(bean);
		
		transaction.commit();
		
		session.close();
	}
}
