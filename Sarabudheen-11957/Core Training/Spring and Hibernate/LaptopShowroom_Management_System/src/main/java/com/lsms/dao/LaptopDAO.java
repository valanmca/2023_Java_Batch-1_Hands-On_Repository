package com.lsms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.lsms.bean.Laptop;
import com.lsms.util.DBUtil;

public class LaptopDAO {

	Transaction tn;
	Session session;

	public void insertLaptop(Laptop bean) {

		session = DBUtil.getSession();
		tn = session.beginTransaction();

		session.save(bean);
		tn.commit();

		session.close();

	}

	public void deleteLaptop(Laptop bean) {
		session = DBUtil.getSession();
		tn = session.beginTransaction();

		session.delete(bean);
		tn.commit();

		session.close();
	}

	public void updateLaptop(Laptop bean) {
		session = DBUtil.getSession();
		tn = session.beginTransaction();

		session.update(bean);
		tn.commit();

		session.close();
	}

	public Laptop findLaptop(Laptop bean) {
		session = DBUtil.getSession();
		tn = session.beginTransaction();

		Laptop laptop = session.get(Laptop.class, bean.getId());
		tn.commit();

		session.close();
		return laptop;
	}

	public List<Integer> getIdList() {
		session = DBUtil.getSession();
		tn = session.beginTransaction();

		Query query = session.createQuery("Select id from Laptop");
		List<Integer> list = query.list();
		tn.commit();
		session.close();

		return list;
	}

	public List<Laptop> getLaptopList() {
		session = DBUtil.getSession();
		tn = session.beginTransaction();

		Query query = session.createQuery("from Laptop");
		List<Laptop> laptopList = query.list();

		tn.commit();
		session.close();
		return laptopList;
	}
}
