package com.msms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.msms.bean.Mobile;
import com.msms.util.DBUtil;

public class MobileDAO {
	Transaction transaction;
	Session session;

	public void insertMobile(Mobile bean) {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();

		session.save(bean);

		transaction.commit();
		session.close();

	}

	public void deleteMobile(Mobile bean) {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();

		session.delete(bean);

		transaction.commit();
		session.close();

	}

	public void updateMobile(Mobile bean) {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();

		session.update(bean);

		transaction.commit();
		session.close();

	}

	public List<Integer> getIdList() {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();

		Query query = session.createQuery("select id from Mobile");
		List<Integer> list = query.list();

		transaction.commit();
		session.close();
		return list;

	}

	public Mobile findMobile(Mobile bean) {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();

		Mobile mob = session.get(Mobile.class, bean.getId());

		transaction.commit();
		session.close();
		return mob;
	}

	public List<Mobile> getMobile() {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();
		Query query = session.createQuery("from Mobile");
		List<Mobile> mobList = query.list();
		return mobList;

	}

}
