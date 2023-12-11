package com.mms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


import com.mms.bean.Movie;


import com.mms.util.DBUtil;

public class MovieDAO {
	
	Transaction transaction;
	Session session;
	
	public void insertMovie(Movie bean) {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();
		
		session.save(bean);
		
		transaction.commit();
		session.close();
	}
	
	public void updateMovie(Movie bean) {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();
		
		session.update(bean);
		
		transaction.commit();
		session.close();
	}
	
	public void deleteMovie(Movie bean) {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();
		
		session.delete(bean);
		
		transaction.commit();
		session.close();
	}
	
	public List<Integer> getIdList() {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();
		
		Query query=session.createQuery("select Id from Movie");
		List<Integer> list= query.list();
		
		
		transaction.commit();
		session.close();
		
		return list;
	}
	
	public List<Integer> getAllList() {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();
		
		Query query=session.createQuery("from Movie");
		List<Integer> list= query.list();
		
		
		transaction.commit();
		session.close();
		
		return list;
	}
	
	public Movie findMovie(Movie bean) {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();
		
		Movie mov=session.get(Movie.class, bean.getId());
		
		transaction.commit();
		session.close();
		
		return mov;
	}
	

}
