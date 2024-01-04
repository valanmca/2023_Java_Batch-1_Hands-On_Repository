package com.vms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.vms.bean.Vehicle;
import com.vms.util.DBUtil;

public class VehicleDAO {
	Transaction transaction;
	Session session;
	
	public void insertVehicle(Vehicle bean) {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();
		
		session.save(bean);
		
		transaction.commit();
		
		session.close();
	}
	
	public void updateVehicle(Vehicle bean) {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();
		
		session.update(bean);
		
		transaction.commit();
		
		session.close();
	}
	
	public void  deleteVehicle(Vehicle bean) {
        session=DBUtil.getSession();
        transaction=session.beginTransaction();
        
        session.delete(bean);
        transaction.commit();
        session.close();
    }
    
    public List<Integer> getIdList() {
    session=DBUtil.getSession();
    transaction=session.beginTransaction();
    Query query=session.createQuery("select vNo from Vehicle");
    List<Integer> list=query.list();
    transaction.commit();
    session.close();
    
    return list;
    }
    
    public Vehicle findVehicle(Vehicle bean) {
        session=DBUtil.getSession();
        transaction=session.beginTransaction();
        
        Vehicle vec=session.get(Vehicle.class, bean.getvNo());
        
        transaction.commit();
        session.close();
        return vec;
    }
    
    public List<Vehicle> getVehicles(){ 
        session=DBUtil.getSession();
         transaction=session.beginTransaction();
         Query query= session.createQuery("from Vehicle"); 
         List<Vehicle> vecList=query.list();
         return vecList;
        
    }
}
