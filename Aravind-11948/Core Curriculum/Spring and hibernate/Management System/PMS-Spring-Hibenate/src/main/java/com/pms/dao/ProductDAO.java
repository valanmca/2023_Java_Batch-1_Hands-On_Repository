package com.pms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.pms.bean.Product;
import com.pms.util.DBUtil;

public class ProductDAO {
	
	Session session;
	Transaction transaction;
	public void insertProduct(Product bean)
	{
		session=DBUtil.getSession();
		transaction=session.beginTransaction();
		session.save(bean);
		transaction.commit();
		session.close();
		
	}
	public List<Product> getIdList()
	{
		session=DBUtil.getSession();
		transaction=session.beginTransaction();
		Query query=session.createQuery("select id from Product");
		List<Product> list=query.list();
		transaction.commit();
		session.close();
		return list;
	}
	
	
	public List<Product> getAllList()
	{
		session=DBUtil.getSession();
		transaction=session.beginTransaction();
		Query query=session.createQuery(" from Product");
		List<Product> list=query.list();
		transaction.commit();
		session.clear();
		return list;
	}
	
	public void deleteProduct(Product bean)
	{
		session=DBUtil.getSession();
		transaction=session.beginTransaction();
		session.delete(bean);
		transaction.commit();
		session.close();
		
	}
	
	public void updateProduct(Product bean)
	{
		session=DBUtil.getSession();
		transaction=session.beginTransaction();
		session.update(bean);
		transaction.commit();
		session.close();
		
	}
	public Product findProduct(Product bean)
	{
		session=DBUtil.getSession();
		transaction=session.beginTransaction();
		Product pro=session.get(Product.class,bean.getId());
		transaction.commit();
		session.close();
		return pro;
		
	}
	
	
	
	

}
