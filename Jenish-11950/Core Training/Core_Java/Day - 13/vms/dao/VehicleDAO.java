package com.vms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.vms.bean.Vehicle;
import com.vms.util.DBUtil;

public class VehicleDAO {
	public int insertVehicle(Vehicle bean) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "insert into tbl_vehicle values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, bean.getId());
			ps.setString(2, bean.getType());
			ps.setString(3, bean.getBrandname());
			ps.setString(4, bean.getOwnername());
			n = ps.executeUpdate();
		}catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}
	public int deleteVehicle(int id) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "delete from tbl_vehicle where vec_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			n = ps.executeUpdate();
		}catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}
	public int updateVehicle(Vehicle bean) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "update tbl_vehicle set vec_type = ?, vec_brandname = ?, vec_ownername = ? where vec_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(4, bean.getId());
			ps.setString(1, bean.getType());
			ps.setString(2, bean.getBrandname());
			ps.setString(3, bean.getOwnername());
			n = ps.executeUpdate();
			}catch (Exception e) {
			System.out.println(e);
		}
		return n;
}
	public Vehicle findVehicle(int id) {
		Vehicle vec = null;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from tbl_vehicle where vec_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				vec = new Vehicle();
				vec.setId(rs.getInt("vec_id"));
				vec.setType(rs.getString("vec_type"));
				vec.setBrandname(rs.getString("vec_brandname"));
				vec.setOwnername(rs.getString("vec_ownername"));
			}
			
		}catch (Exception e) {
			System.out.println(e);
		}
		return vec;
		
	}
	public List<Vehicle> findAllVehicle() {
		List<Vehicle> list = new ArrayList<Vehicle>();
		
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from tbl_vehicle";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			

			while (rs.next()) {
				Vehicle bean = new Vehicle();
				bean.setId(rs.getInt("vec_id"));
				bean.setType(rs.getString("vec_type"));
				bean.setBrandname(rs.getString("vec_brandname"));
				bean.setOwnername(rs.getString("vec_ownername"));
				list.add(bean);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

}

	