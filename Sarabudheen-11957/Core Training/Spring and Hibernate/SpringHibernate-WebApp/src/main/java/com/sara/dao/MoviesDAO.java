package com.sara.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.core.io.buffer.DataBufferUtils;

import com.sara.Util.DBUtil;
import com.sara.bean.Movies;

public class MoviesDAO {

	Transaction transaction;
	Session session;

	public void insertMovie(Movies bean) {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();

		session.save(bean);
		transaction.commit();

		session.close();
	}

	public void updateMovie(Movies bean) {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();

		session.update(bean);
		transaction.commit();

		session.close();
	}

	public void deleteMovie(Movies bean) {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();

		session.delete(bean);
		transaction.commit();

		session.close();
	}

	public List<Integer> getIdList() {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();

		Query query = session.createQuery("select id from Movies");

		List<Integer> list = query.list();
		transaction.commit();

		session.close();
		return list;
	}

	public Movies findMovie(Movies bean) {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();

		Movies movie = session.get(Movies.class, bean.getId());

		transaction.commit();

		session.close();
		return movie;
	}

	public List<Movies> getMovies() {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();

		Query query = session.createQuery("from Movies");

		List<Movies> moviesList = query.list();
		return moviesList;
	}

}
