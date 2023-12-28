package com.teacher.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


import com.teacher.bean.Teacher;
import com.teacher.util.DButil;

public class TeacherDAO {
	Transaction transaction;
	Session session;

	public void insertTeacher(Teacher bean) {
		session = DButil.getsession();
		transaction = session.beginTransaction();

		session.save(bean);
		transaction.commit();
		session.close();

	}

	public void updateTeacher(Teacher bean) {
		session = DButil.getsession();
		transaction = session.beginTransaction();
		session.update(bean);
		transaction.commit();
		session.close();
	}

	public void deleteTeacher(Teacher bean) {
		session = DButil.getsession();
		transaction = session.beginTransaction();
		session.delete(bean);
		transaction.commit();
		session.close();

	}

	public List<Integer> getIdList() {
		session = DButil.getsession();
		transaction = session.beginTransaction();

		Query query = session.createQuery("select id from Teacher");

		List<Integer> list = query.list();
		transaction.commit();
		session.close();
		return list;
	}

	public Teacher findTeacher(Teacher bean) {
		session = DButil.getsession();
		transaction = session.beginTransaction();

		Teacher tea = session.get(Teacher.class, bean.getId());
		transaction.commit();
		session.close();
		return tea;

	}

	public List<Teacher> getTeachers() {
		session = DButil.getsession();
		transaction = session.beginTransaction();
		Query query = session.createQuery("from Teacher");
		List<Teacher> empList = query.list();
		return empList;

	}

}
