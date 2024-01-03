package com.sms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.sms.util.DBUtil;

import com.sms.bean.Students;

public class StudentsDAO {

	Transaction transaction;
	Session session;

	public void insertStudent(Students bean) {

		session = DBUtil.getSession();
		transaction = session.beginTransaction();

		session.save(bean);
		transaction.commit();
		session.close();
	}

	public void updateStudent(Students bean) {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();

		session.update(bean);
		transaction.commit();
		session.close();
	}
	public void deleteStudent(Students bean) {
		session=DBUtil.getSession();
		transaction =session.beginTransaction();
		
		session.delete(bean);
		transaction.commit();
		session.close();
	}
	
	public List<Integer> getRnoList() {
	       session = DBUtil.getSession();
	       transaction = session.beginTransaction();

	       Query query = session.createQuery("select rno from Students");

	       List<Integer> list = query.list();
	       transaction.commit();

	       session.close();
	       return list;
	   }
	public Students findStudent(Students bean) {
		 session = DBUtil.getSession();
	       transaction = session.beginTransaction();

	       Students stud = session.get(Students.class, bean.getRno());

	       transaction.commit();

	       session.close();
	       return stud;

	}
	
	public List<Students> getStudent() {
	       session = DBUtil.getSession();
	       transaction = session.beginTransaction();

	       Query query = session.createQuery("from Students");

	       List<Students> studList = query.list();
	       
	       transaction.commit();
	       session.close();
	       
	       return studList;
	   }
	
}
