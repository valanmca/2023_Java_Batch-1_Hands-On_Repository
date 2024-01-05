package com.domnic.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.domnic.bean.Vehicle;
import com.domnic.util.DBUtil;

public class VehicleDAO {

	Transaction transaction;
	Session session;
	
	public void insertVehicle(Vehicle bean) {
		session = DBUtil.getSession();
		transaction=session.beginTransaction();
		session.save(bean);
		transaction.commit();
		session.close();
	}
	
	public void updateVehicle(Vehicle bean) {
		session = DBUtil.getSession();
		transaction=session.beginTransaction();
		session.update(bean);
		transaction.commit();
		session.close();
	}
	
	public void deleteVehicle(Vehicle bean) {
		session = DBUtil.getSession();
		transaction=session.beginTransaction();
		session.delete(bean);
		transaction.commit();
		session.close();
	}
	
	public List<Integer> getIdList() {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();

		Query query = session.createQuery("select vId from Vehicle");
		List<Integer> list = query.list();

		transaction.commit();
		session.close();
		return list;

	}
	
	public Vehicle findVehicle(Vehicle bean) {
		session = DBUtil.getSession();
		transaction = session.beginTransaction();

		Vehicle vh = session.get(Vehicle.class, bean.getvId());
		transaction.commit();
		session.close();
		return vh;
	}
	
	public List<Vehicle> getVehicle(){ 
        session=DBUtil.getSession();
         transaction=session.beginTransaction();
         Query query= session.createQuery("from Vehicle"); 
         List<Vehicle> List=query.list();
         return List;
        
    }
}
