package com.aravind.dao;





import org.hibernate.query.Query;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.aravind.bean.Teacher;
import com.aravind.util.DBUtil;

public class TeacherDAO {
	Session session;
	Transaction transaction;
	
	public void insertTeacher(Teacher bean)
	{
		session=DBUtil.getSession();
		
		transaction=session.beginTransaction();
		
		session.save(bean);
		transaction.commit();
		session.close();
		
	}
	
	public List<Integer> getIdList()
	
	{
        session=DBUtil.getSession();
		
		transaction=session.beginTransaction();
		
		Query query=session.createQuery("select id from Teacher");
		List<Integer> list=query.list();
		transaction.commit();
		session.close();
		return list;
		
		
		
		
		
	}
	
	public void deleteTeacher(Teacher bean)
	{
		session=DBUtil.getSession();
		
		transaction=session.beginTransaction();
		
		session.delete(bean);
		transaction.commit();
		session.close();
		
	}
	
	
	public void updateTeacher(Teacher bean)
	{
		session=DBUtil.getSession();
		
		transaction=session.beginTransaction();
		
		session.update(bean);
		transaction.commit();
		session.close();
		
	}
	
	public Teacher findTeacher(Teacher bean)
	{
		session=DBUtil.getSession();
		
		transaction=session.beginTransaction();
		
		Teacher teach=session.get(Teacher.class, bean.getId());
		transaction.commit();
		session.close();
		return teach;
		
		
	}
	

}
