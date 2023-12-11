package com.sms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.sms.bean.Student;
import com.sms.util.DBUtil;

public class StudentDAO {

	Transaction transaction;
	Session session;

	public void insertStudent(Student bean) {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();
		session.save(bean);
		transaction.commit();
		session.close();
	}

	public void updateStudent(Student bean) {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();
		session.update(bean);
		transaction.commit();
		session.close();
	}

	public void deleteStudent(Student bean) {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();
		session.delete(bean);
		transaction.commit();
		session.close();
	}

	public List<Integer> getIdList() {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();
		Query query = session.createQuery("select id from Student");
		List<Integer> list = query.list();
		transaction.commit();
		session.close();

		return list;
	}

	public Student findStudent(Student bean) {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();
		Student emp = session.get(Student.class, bean.getRno());
		transaction.commit();
		session.close();
		return emp;
	}

	public List<Integer> getAllList() {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();
		Query query = session.createQuery("from Student");
		List<Integer> list = query.list();
		transaction.commit();
		session.close();

		return list;
	}
}
