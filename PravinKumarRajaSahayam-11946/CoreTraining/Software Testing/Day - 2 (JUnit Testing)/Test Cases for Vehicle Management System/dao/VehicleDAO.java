package com.vms.dao;
import com.vms.bean.Vehicle;
import com.vms.util.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
public class VehicleDAO {
	public static Connection con;   
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

			public void deleteVehicle(Vehicle bean) {
				session = DBUtil.getSession();
				transaction = session.beginTransaction();

				session.delete(bean);

				transaction.commit();
				session.close();

			}

			public List<Integer> getIdList() {
		        session = DBUtil.getSession();
		        transaction = session.beginTransaction();
		        
		        Query query =  session.createQuery("select id from Vehicle1");
		        List<Integer> list = query.list();
		        
		        
		        
		        transaction.commit();
		        session.close();
		        return list;
		        
		    }
			
			public Vehicle findVehicle(Vehicle bean) {
				session = DBUtil.getSession();
				transaction = session.beginTransaction();

				Vehicle emp = session.get(Vehicle.class, bean.getId());

				transaction.commit();
				session.close();
				return emp;

			}
			
			public List<Vehicle> getFindAllVehicle() {
		        session = DBUtil.getSession();
		        transaction = session.beginTransaction();
		        
		        Query query =  session.createQuery("from Vehicle1");
		        List<Vehicle> list = query.list();
		        
		        
		        
		        transaction.commit();
		        session.close();
		        return list;
		        
		    }
			public Vehicle getVehicleById(int key){
		        Vehicle vehicle = null;
		        String sql = "SELECT * FROM Vehicle1 WHERE id=?";
		        try{
		            PreparedStatement ps = con.prepareStatement(sql);
		            ps.setInt(1, key);
		            ResultSet rs = ps.executeQuery();
		 
		            if(rs.next()){
		                vehicle = new Vehicle();
		                vehicle.setId(rs.getInt("id"));
		                vehicle.setVehicleType(rs.getString("vehicleType"));
		                vehicle.setVehicleName(rs.getString("vehicleName"));
		                vehicle.setVehicleNumber(rs.getInt("vehicleNumber"));
		                vehicle.setOwnerName(rs.getString("ownerName"));
		            }
		        }catch(Exception e){
		            e.printStackTrace();
		        }   
		        return vehicle;
		    }
		     
		 
			
	}


