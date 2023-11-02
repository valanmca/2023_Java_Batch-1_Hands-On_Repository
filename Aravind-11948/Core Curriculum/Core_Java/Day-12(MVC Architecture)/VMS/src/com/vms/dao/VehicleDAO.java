package com.vms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.vms.bean.Vehicle;
import com.vms.util.DBUtil;

public class VehicleDAO {
	
	
	//--insert
	
	public int  insertVehicle(Vehicle bean)
	{
		int n=0;
		try {
			 Connection con=DBUtil.getDBConnection();
			 String sql="insert into vehicle values(?,?,?)";
			 
			 PreparedStatement ps=con.prepareStatement(sql);
			 
			 ps.setInt(1, bean.getId());
			 ps.setString(2,bean.getType());
			 ps.setString(3,bean.getBrand());
			 
			 n=ps.executeUpdate();
			 
		}catch(Exception e) {
		System.out.println(e);
		}
		
		return n;
		
		
		
	}
	
	
	///--update
	
	
	
	
	public int updateVehicle(Vehicle bean)
	{
		int n=0;
		try {
			 Connection con=DBUtil.getDBConnection();
			 String sql="update vehicle set type =?,brand =? where id=?";
			 
			 PreparedStatement ps=con.prepareStatement(sql);
			
			 ps.setString(1,bean.getType());
			 ps.setString(2,bean.getBrand());
			 ps.setInt(3, bean.getId());
			 
			
			 
			 n=ps.executeUpdate();
			 
		}catch(Exception e) {
		System.out.println(e);
		}
		
		return n;
		
		
		
	}
	
	
	//--find 
	
	public Vehicle findVehicle(int id)
	{
		Vehicle bean=null;
		try
		{
			Connection con=DBUtil.getDBConnection();
			
			String sql="Select * from vehicle where id =?";
			
			PreparedStatement ps= con.prepareStatement(sql);
			 
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				 bean=new Vehicle();
				 bean.setId(rs.getInt("id"));
				 bean.setType(rs.getString("type"));
				 bean.setBrand(rs.getString("brand"));
			}
			
			
			
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return bean;
		
		
	}
	
	//--findAll
	
	public ArrayList<Vehicle> findAllVehicle()
	{
		ArrayList <Vehicle> list=new ArrayList<Vehicle>();
		
		try {
			Connection con=DBUtil.getDBConnection();
			
			String sql="Select * from vehicle";
			PreparedStatement  ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while (rs.next())
			{
				Vehicle bean=new Vehicle();
				bean.setId(rs.getInt("id"));
				bean.setType(rs.getString("type"));
				bean.setBrand(rs.getString("brand"));
				list.add(bean);
				
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return list;
	}
	
	//--delete
	
	public int  deleteVehicle(int id )
	{
		int n=0;
		try {
			
			Connection con=DBUtil.getDBConnection();
			String sql ="delete from vehicle where id =?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,id);
			 n=ps.executeUpdate();
			
			
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return n;

	}
	
}
