package com.mms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.mms.bean.Mobile;
import com.mms.util.DBUtil;

public class MobileDAO {
	Transaction transaction;
	Session session;
	
	public void insertMobile(Mobile bean) {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();
		
		session.save(bean);
		
		transaction.commit();
		
		session.close();
	}
	
	public void updateMobile(Mobile bean) {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();
		
		session.update(bean);
		
		transaction.commit();
		
		session.close();
	}
	
	public void  deleteMobile(Mobile bean) {
        session=DBUtil.getSession();
        transaction=session.beginTransaction();
        
        session.delete(bean);
        transaction.commit();
        session.close();
    }
    
    public List<Integer> getIdList() {
    session=DBUtil.getSession();
    transaction=session.beginTransaction();
    Query query=session.createQuery("select mobileID from Mobile");
    List<Integer> list=query.list();
    transaction.commit();
    session.close();
    
    return list;
    }
    
    public Mobile findMobile(Mobile bean) {
        session=DBUtil.getSession();
        transaction=session.beginTransaction();
        
        Mobile mob=session.get(Mobile.class, bean.getMobileID());
        
        transaction.commit();
        session.close();
        return mob;
    }
    
    public List<Mobile> getMobiles(){ 
        session=DBUtil.getSession();
         transaction=session.beginTransaction();
         Query query= session.createQuery("from Mobile"); 
         List<Mobile> mobList=query.list();
         return mobList;
        
    }
}
