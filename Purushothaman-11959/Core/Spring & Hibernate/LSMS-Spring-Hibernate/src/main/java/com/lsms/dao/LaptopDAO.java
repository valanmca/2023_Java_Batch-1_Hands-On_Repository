package com.lsms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.lsms.bean.Laptop;
import com.lsms.util.DBUtil;

public class LaptopDAO {
	
	Transaction transaction;
	Session session;
	
	public void insertLaptop(Laptop bean) {
		session=DBUtil.getSession();
		transaction=session.beginTransaction();
		
		session.save(bean);
		transaction.commit();
		session.close();
		
	}
	
	public List<Integer> getIdList() {
		session=DBUtil.getSession();
		transaction=session.beginTransaction();
		
		Query query=session.createQuery("select lId from Laptop");
		List<Integer> list=query.list();
		transaction.commit();
		session.close();
		return list;
	}
	
	public void deleteLaptop(Laptop bean) {
		session=DBUtil.getSession();
		transaction=session.beginTransaction();
		
		session.delete(bean);
		transaction.commit();
		session.close();
		
	}
	
	public void updateLaptop(Laptop bean) {
		session=DBUtil.getSession();
		transaction=session.beginTransaction();
		
		session.update(bean);
		transaction.commit();
		session.close();
		
	}
	
	public Laptop findLaptop(Laptop bean) {
		session=DBUtil.getSession();
		transaction=session.beginTransaction();
		
		Laptop lap=session.get(Laptop.class, bean.getlId());
		transaction.commit();
		session.close();
		return lap;
			
	}
	
	public List<Laptop> getAllLaptop() {
		session=DBUtil.getSession();
		transaction=session.beginTransaction();
		
		Query query=session.createQuery("from Laptop");
		List<Laptop> lapList=query.list();
		transaction.commit();
		session.close();
		return lapList;
	}
	

}
