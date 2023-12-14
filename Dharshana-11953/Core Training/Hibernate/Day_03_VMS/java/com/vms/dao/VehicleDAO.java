package com.vms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.vms.bean.Vehicle;
import com.vms.util.DBUtil;


public class VehicleDAO {
	public int insertVehicle( Vehicle bean) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "insert into tbl_vehicle values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, bean.getId());
			ps.setString(2, bean.getName());
			ps.setInt(3, bean.getNo());
			ps.setString(4, bean.getOwner());
			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}
	
	public int deleteVehicle(int id) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "delete from  tbl_Vehicle where vec_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}
	
	public int updateVehicle(Vehicle vec2) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "update tbl_Vehicle set vec_name=? , vec_no=?, vec_owner=? where vec_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(4, vec2.getId());
			ps.setString(1, vec2.getName());
			ps.setInt(2, vec2.getNo());
			ps.setString(3, vec2.getOwner());
			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}
	
	public Vehicle findVehicle(int id) {
		Vehicle vec1 = null;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from tbl_Vehicle where vec_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				vec1 = new Vehicle(id, sql, id, sql);
				vec1.setId(rs.getInt("vec_id"));
				vec1.setName(rs.getString("vec_name"));
				vec1.setNo(rs.getInt("vec_no"));
				vec1.setOwner(rs.getString("vec_owner"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return vec1;
	}
	
	public List<Vehicle> findAllVehicle() {
		List<Vehicle> list = new ArrayList<Vehicle>();
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from tbl_Vehicle";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Vehicle bean = new Vehicle(0, sql, 0, sql);
				bean.setId(rs.getInt("vec_id"));
				bean.setName(rs.getString("vec_name"));
				bean.setNo(rs.getInt("vec_no"));
				bean.setOwner(rs.getString("vec_owner"));
				list.add(bean);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

}
