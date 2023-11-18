package com.vms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vms.bean.Vehicle;
import com.vms.util.DBUtil;

public class VehicleDAO {

	public int insertDetails(Vehicle bean) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "insert into tbl_vehicle values(?,?,?)";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,bean.getVid());
			ps.setString(2, bean.getVname());
			ps.setString(3,bean.getVtype());
			n=ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return n;
	}
	
	public int updateVehicle(Vehicle bean) {
		
		int n=0;
		try {
		Connection con=DBUtil.getDBConnection();
		String sql="update tbl_vehicle set vname=?,vtype=? where vid=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, bean.getVname());
		ps.setString(2, bean.getVtype());
		ps.setInt(3, bean.getVid());
		n=ps.executeUpdate();
		}catch(Exception e){
			System.out.println(e);
		}
		return n;
	}

}
