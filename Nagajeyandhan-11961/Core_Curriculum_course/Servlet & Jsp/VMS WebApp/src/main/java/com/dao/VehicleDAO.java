package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.bean.Vehicle;
import com.util.DBUtil;

public class VehicleDAO {

	public int insertVehicle(Vehicle bean) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String query = "insert into tbl_vehicle values(?,?,?)";
			
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, bean.getVechicleId());
			pst.setString(2, bean.getVehicleName());
			pst.setInt(3, bean.getPrice());
			
			n = pst.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("Exception in Insertion");
		}
		return n;
	}
	public int updateVehicle(Vehicle bean) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String query = "update tbl_vehicle set vname=?, price=? where vec_id=?";
			
			PreparedStatement pst = con.prepareStatement(query);
			
			pst.setString(1, bean.getVehicleName());
			pst.setInt(2, bean.getPrice());
			pst.setInt(3, bean.getVechicleId());
			
			n = pst.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("Exception in Updation");
		}
		return n;
	}
	
	public int deleteVehicle(int vehicleId) {
		int n= 0;
		
		try {
			
			Connection con = DBUtil.getDBConnection();
			String query = "delete from tbl_vehicle where vec_id=?";
			
			PreparedStatement pst = con.prepareStatement(query);
			
			pst.setInt(1, vehicleId);
			
			n = pst.executeUpdate();
			
			
		} catch (Exception e) {
			System.out.println("Exception in deletion");
		}
		
		return n;
	}
	
	public Vehicle findVehicle(int vehicleId) {
		Vehicle bean = null;
		
		try {
			
			Connection con = DBUtil.getDBConnection();
			String query = "select * from tbl_vehicle where vec_id=?";
			
			PreparedStatement pst = con.prepareStatement(query);
			
			pst.setInt(1, vehicleId);
			
			ResultSet rs  = pst.executeQuery();
			
			if(rs.next()) {
				bean = new Vehicle();
				bean.setVechicleId(rs.getInt("vec_id"));
				bean.setVehicleName(rs.getString("vname"));
				bean.setPrice(rs.getInt("price"));
			}
			
		} catch (Exception e) {
			System.out.println("Exception in Find");
		}
		
		return bean;
	}
	
	public List<Vehicle> findAllVehicle() {
		List<Vehicle> list = new LinkedList<Vehicle>();
				
		try {
			
			Connection con = DBUtil.getDBConnection();
			String query = "select * from tbl_vehicle";
			
			Statement st = con.createStatement();
			
			
			ResultSet rs  = st.executeQuery(query);
			
			while(rs.next()) {
				Vehicle bean = new Vehicle();
				bean.setVechicleId(rs.getInt("vec_id"));
				bean.setVehicleName(rs.getString("vname"));
				bean.setPrice(rs.getInt("price"));
				list.add(bean);
			}
			
		} catch (Exception e) {
			System.out.println("Exception in FindAll");
		}
		
		return list;
	}
	
	
}
