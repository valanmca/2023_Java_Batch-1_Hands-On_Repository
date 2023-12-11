package com.pms.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pms.bean.Product;
import com.pms.util.DbUtil;

public class ProductDAO {
	Transaction transaction;
	Session session;

	public void insertProduct(Product bean) {
		session = DbUtil.getSession();
		transaction = session.beginTransaction();

		session.save(bean);

		transaction.commit();

		session.close();
	}

	public void updateProduct(Product bean) {
		session = DbUtil.getSession();
		transaction = session.beginTransaction();

		session.update(bean);

		transaction.commit();

		session.close();
	}

	public void deleteProduct(Product bean) {
		session = DbUtil.getSession();
		transaction = session.beginTransaction();

		session.delete(bean);

		transaction.commit();
		session.close();

	}

	public List<Integer> getIdList() {
		session = DbUtil.getSession();
		transaction = session.beginTransaction();

		Query query = session.createQuery("select id from Product");
		List<Integer> list = query.list();

		transaction.commit();
		session.close();
		return list;

	}

	public Product findProduct(Product bean) {
		session = DbUtil.getSession();
		transaction = session.beginTransaction();

		Product pd = session.get(Product.class, bean.getId());
		transaction.commit();
		session.close();
		return pd;
	}

	public List<Product> getProduct() {
		session = DbUtil.getSession();
		transaction = session.beginTransaction();
		Query query = session.createQuery("from Product");
		List<Product> List = query.list();
		return List;

	}
}
