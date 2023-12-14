package com.cms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.cms.bean.Customer;
import com.cms.util.DBUtil;

public class CustomerDAO {
	Transaction transaction;
	Session session;

	public void insertCustomer(Customer bean) {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();

		session.save(bean);

		transaction.commit();
		session.close();

	}

	public void deleteCustomer(Customer bean) {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();

		session.delete(bean);

		transaction.commit();
		session.close();

	}

	public List<Integer> getIdList() {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();

		Query query = session.createQuery("select id from Customer");
		List<Integer> list = query.list();

		transaction.commit();
		session.close();
		return list;

	}

	public void updateCustomer(Customer bean) {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();

		session.update(bean);

		transaction.commit();
		session.close();

	}

	public Customer findCustomer(Customer bean) {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();

		Customer cus = session.get(Customer.class, bean.getId());

		transaction.commit();
		session.close();
		return cus;
	}

	public List<Customer> getCustomer() {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();
		Query query = session.createQuery("from Customer");
		List<Customer> cusList = query.list();
		return cusList;

	}

}
