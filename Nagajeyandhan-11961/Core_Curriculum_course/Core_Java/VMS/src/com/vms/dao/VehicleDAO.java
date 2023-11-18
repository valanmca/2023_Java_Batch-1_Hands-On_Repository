package com.vms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.vms.bean.Vehicle;
import com.vms.util.DBUtil;

public class VehicleDAO {

	public int insertVehicle(Vehicle bean) {
		int n = 0;
		try {
			Connection con = DBUtil.getConnection();
			String query = "insert into tbl_vehicle values(?, ?, ?, ?)";
			
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, bean.getId());
			pst.setInt(2, bean.getVehicleNumber());
			pst.setString(3, bean.getVehicleName());
			pst.setInt(4, bean.getPrice());
			
			n = pst.executeUpdate();
			pst.close();
			con.close();
		} catch (Exception e) {
			System.out.println("Exception in insertion");
		}
		return n;	
	}
	
	public int deleteVehicle(int vehicleId) {
		int n = 0;
		try {
			Connection con = DBUtil.getConnection();
			String query = "delete from tbl_vehicle where vehicleId = ?";
			
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, vehicleId);
			
			n = pst.executeUpdate();
			pst.close();
			con.close();
			
		} catch (Exception e) {
			System.out.println("Exception in Deletion");
		}
		return n;
	}
	
	public int updateVehicle(Vehicle bean) {
		int n = 0;
		try {
			Connection con = DBUtil.getConnection();
			String query = "update tbl_vehicle set vehicleNumber = ?, vehicleName = ?, price = ? where vehicleId = ?";
			
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, bean.getVehicleNumber());
			pst.setString(2, bean.getVehicleName());
			pst.setInt(3, bean.getPrice());
			pst.setInt(4, bean.getId());
			
			n = pst.executeUpdate();
		} catch (Exception e) {
			System.out.println("Exception in Updation");
		}
		return n;
	}
	
	public Vehicle findVehicle(int vehicleId) {
		Vehicle bean = null;
		try {
			Connection con = DBUtil.getConnection();
			String query = "select * from tbl_vehicle where vehicleId = ?";
			
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, vehicleId);
			
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				bean = new Vehicle();
				bean.setId(rs.getInt("vehicleId"));
				bean.setVehicleNumber(rs.getInt("vehicleNumber"));
				bean.setVehicleName(rs.getString("vehicleName"));
				bean.setPrice(rs.getInt("price"));
			}
			
			pst.close();
			con.close();
		} catch (Exception e) {
			System.out.println("Exception in Find");
		}
		return bean;
	}
	
	public List<Vehicle> findAllVehicle() {
		
		List<Vehicle> list = new LinkedList<Vehicle>();
		
		try {
			
			Connection con = DBUtil.getConnection();
			String query = "select * from tbl_vehicle";
			
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				Vehicle bean = new Vehicle();
				bean.setId(rs.getInt("vehicleId"));
				bean.setVehicleNumber(rs.getInt("vehicleNumber"));
				bean.setVehicleName(rs.getString("vehicleName"));
				bean.setPrice(rs.getInt("price"));
				list.add(bean);
			}
			
		} catch (Exception e) {
			System.out.println("Exception in FindAll");
		}
		
		return list;
	}
	
	
}
