package com.vms.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.vms.model.Vehicle;
import com.vms.util.DBUtil;

public class VehicleDAO {
	
//	private static final int Stu_id = 0;

	public int insertVehicle(Vehicle model) 
	{
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="insert into vehicledet values(?,?,?)";
			PreparedStatement ps1=con.prepareStatement(sql);
			ps1.setInt(1,model.getVehId());
			ps1.setInt(2, model.getVehNo());
			ps1.setString(3, model.getVehType());
			n=ps1.executeUpdate();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return n;
	}

	public int deleteVehicle(int veh_id) 
	{
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="delete from vehicledet where veh_id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,veh_id);
			
			n=ps.executeUpdate();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return n;
	}
	
	public int updateVehicle(Vehicle model) 
	{
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="update vehicledet set veh_no=?,veh_type=? where veh_id=? ";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(3,model.getVehId());
			ps.setInt(1, model.getVehNo());
			ps.setString(2, model.getVehType());
			n=ps.executeUpdate();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return n;
	}
	
	public Vehicle findVehicle(int veh_id) 
	{
		Vehicle bean1=null;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="select * from vehicledet where veh_id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,veh_id);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
		      {
				bean1=new Vehicle();
				bean1.setVehId(rs.getInt("Veh_id"));
				bean1.setVehNo(rs.getInt("Veh_no"));
				bean1.setVehType(rs.getString("Veh_type"));
		      }
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return bean1;
	}
	
	public List<Vehicle> findAllVehicle() 
	{
		List<Vehicle> list1=new ArrayList<Vehicle>();
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="select * from vehicledet";
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
		      {
				Vehicle bean=new Vehicle();
				bean.setVehId(rs.getInt("Veh_id"));
				bean.setVehNo(rs.getInt("Veh_no"));
				bean.setVehType(rs.getString("Veh_type"));
				list1.add(bean);
		      }
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return list1;
	}
}

