package com.car.dao;

import org.hibernate.Transaction;
import org.hibernate.Session;

import com.car.bean.Car;
import com.car.util.DBUtil;

public class CarDAO {
	
	Transaction transaction;
	Session session;

	public void insert(Car bean) {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();

		session.save(bean);

		transaction.commit();
		session.close();

	}
}
