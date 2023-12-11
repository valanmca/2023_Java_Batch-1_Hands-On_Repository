package com.aravind.dao;

import org.hibernate.query.Query;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.aravind.bean.Student;
import com.aravind.util.DBUtil;

public class StudentDAO {
	Session session;
	
	Transaction transaction;
	
	public void  insertStudent(Student bean)
	{
		session=DBUtil.getSession();
		transaction=session.beginTransaction();
		session.save(bean);
		transaction.commit();
		session.close();
		
		
	}
	
	public void  updateStudent(Student bean)
	{
		session=DBUtil.getSession();
		transaction=session.beginTransaction();
		session.update(bean);
		transaction.commit();
		session.close();
		
		
	}
	public List<Integer> getIdList()
	{
		session=DBUtil.getSession();
		transaction=session.beginTransaction();
		Query query=session.createQuery("select id from Student");
		List<Integer> list=query.list();
		transaction.commit();
		session.close();
		return list;
		
}
	
	public List<Integer> getAllList()
	{
		session=DBUtil.getSession();
		transaction=session.beginTransaction();
		Query query=session.createQuery(" from Student");
		List<Integer> list=query.list();
		transaction.commit();
		session.close();
		return list;
		
}
	
	
	public void  deleteStudent(Student bean)
	{
		session=DBUtil.getSession();
		transaction=session.beginTransaction();
		session.delete(bean);
		transaction.commit();
		session.close();
		
		
	}
	public Student findStudent(Student bean)
	{
		session=DBUtil.getSession();
		transaction=session.beginTransaction();
		Student stu=session.get(Student.class,bean.getId());
		transaction.commit();
		session.close();
		return stu;
		
		
	}
	

}
