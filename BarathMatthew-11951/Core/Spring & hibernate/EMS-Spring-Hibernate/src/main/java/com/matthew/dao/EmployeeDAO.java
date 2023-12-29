package com.matthew.dao;

import org.hibernate.Session;


import org.hibernate.Transaction;

import com.matthew.bean.Employee;
import com.matthew.util.DBUtil;

public class EmployeeDAO {

	Transaction transaction;
	Session session;
	public void insertEmployee(Employee bean) {
		session=DBUtil.getSession();
 		
		transaction = session.beginTransaction();
		
		session.save(bean);
		transaction.commit();
		session.close();
	}
}
