package com.vms.dao;
import com.vms.bean.Car;
import com.vms.util.DBUtil;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
public class CarDAO {
	Transaction transaction;
	Session session;
	public void insertCar(Car bean) {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();

		session.save(bean);

		transaction.commit();
		session.close();

	}
}