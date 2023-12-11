package com.vms.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vms.bean.Vehicle;
import com.vms.util.DbUtil;

public class VehicleDAO {
	Transaction transaction;
	Session session;

	public void insertVehicle(Vehicle bean) {
		session = DbUtil.getSession();
		transaction = session.beginTransaction();

		session.save(bean);

		transaction.commit();

		session.close();
	}

	public void updateVehicle(Vehicle bean) {
		session = DbUtil.getSession();
		transaction = session.beginTransaction();

		session.update(bean);

		transaction.commit();

		session.close();
	}

	public void deleteVehicle(Vehicle bean) {
		session = DbUtil.getSession();
		transaction = session.beginTransaction();

		session.delete(bean);

		transaction.commit();
		session.close();

	}

	public List<Integer> getIdList() {
		session = DbUtil.getSession();
		transaction = session.beginTransaction();

		Query query = session.createQuery("select no from Vehicle");
		List<Integer> list = query.list();

		transaction.commit();
		session.close();
		return list;

	}

	public Vehicle findVehicle(Vehicle bean) {
		session = DbUtil.getSession();
		transaction = session.beginTransaction();

		Vehicle vhl = session.get(Vehicle.class, bean.getNo());
		transaction.commit();
		session.close();
		return vhl;
	}

	public List<Vehicle> getVehicle() {
		session = DbUtil.getSession();
		transaction = session.beginTransaction();
		Query query = session.createQuery("from Vehicle");
		List<Vehicle> List = query.list();
		return List;

	}
}
