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
		int n=0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql="insert into tbl_Vehicle values (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, bean.getVehi_id());
			ps.setString(2,bean. getVehi_type());
			ps.setString(3, bean.getVehi_brandname());
			ps.setString(4, bean.getVehi_ownername());
			n=ps.executeUpdate();
		}catch(Exception e) {
			System.out.println(e);
		}
		return n;
	}
	
	public int deleteVehicle(int vehi_id) {
		int n=0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql =" delete from tbl_Vehicle where vehi_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,vehi_id);
			n=ps.executeUpdate();
		}catch(Exception e) {
			System.out.println(e);
		}
		return n;
	}
	
	public int updateVehicle(Vehicle vehi ) {
		int n=0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql="update tbl_Vehicle set vehi_type=?,vehi_brandname=?,vehi_ownername=? where vehi_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(4, vehi.getVehi_id());
			ps.setString(1, vehi.getVehi_type());
			ps.setString(2, vehi.getVehi_brandname());
			ps.setString(3, vehi.getVehi_ownername());
			n=ps.executeUpdate();
		}catch(Exception e) {
			System.out.println(e);
		}
		return n;
	}
	
	public Vehicle findVehicle(int vehic) {
		Vehicle vehi1=null;
		int n=0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql="select * from tbl_Vehicle where vehi_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, vehic);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				vehi1 = new Vehicle();
				vehi1.setVehi_id(rs.getInt("vehi_id"));
				vehi1.setVehi_type(rs.getString("vehi_type"));
				vehi1.setVehi_brandname(rs.getString("vehi_brandname"));
				vehi1.setVehi_ownername(rs.getString("vehi_ownername"));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return vehi1;
	}
	
	public List<Vehicle> findAllVehicle(){
		List<Vehicle> list=new ArrayList<Vehicle>();
		try {
			Connection con = DBUtil.getDBConnection();
			String sql="select * from tbl_Vehicle";
			PreparedStatement ps= con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				Vehicle bean = new Vehicle();
				bean.setVehi_id(rs.getInt("vehi_id"));
				bean.setVehi_type(rs.getString("vehi_type"));
				bean.setVehi_brandname(rs.getString("vehi_brandname"));
				bean.setVehi_ownername(rs.getString("vehi_ownername"));
				list.add(bean);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return list;
	}
}
