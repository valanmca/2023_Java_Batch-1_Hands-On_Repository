package com.vms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


import com.vms.bean.Vehicle;
import com.vms.util.DBUtil;

public class VehicleDAO {
	
	Session session;
	Transaction transaction;
	public void insertVehicle(Vehicle bean)
	{
		session=DBUtil.getSession();
		transaction=session.beginTransaction();
		session.save(bean);
		transaction.commit();
		session.close();
		
	}
	
	public List<Vehicle> getIdList()
	{
		session=DBUtil.getSession();
		transaction=session.beginTransaction();
		Query query=session.createQuery("select id from Vehicle");
		List<Vehicle> list=query.list();
		transaction.commit();
		session.close();
		return list;
	}
	
	public void deleteVehicle(Vehicle bean)
	{
		session=DBUtil.getSession();
		transaction=session.beginTransaction();
		session.delete(bean);
		transaction.commit();
		session.close();
		
	}
	
	public void updateVehicle(Vehicle bean)
	{
		session=DBUtil.getSession();
		transaction=session.beginTransaction();
		session.update(bean);
		transaction.commit();
		session.close();
		
	}
	
	public Vehicle findVehicle(Vehicle bean)
	{
		session=DBUtil.getSession();
		transaction=session.beginTransaction();
		Vehicle pro=session.get(Vehicle.class,bean.getId());
		transaction.commit();
		session.close();
		return pro;
		
	}
	
	public List<Vehicle> getAllList()
	{
		session=DBUtil.getSession();
		transaction=session.beginTransaction();
		Query query=session.createQuery(" from Vehicle");
		List<Vehicle> list=query.list();
		transaction.commit();
		session.clear();
		return list;
	}

}
