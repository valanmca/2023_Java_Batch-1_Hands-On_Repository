package com.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ems.model.Employee;
import com.ems.util.DBUtil;

public class EmployeeDAO {
	
//	private static final int Stu_id = 0;

	public int insertEmployee(Employee model) 
	{
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="insert into studetail values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,model.getStu_id());
			ps.setString(2, model.getStu_name());
			ps.setString(3, model.getStu_dep());
			n=ps.executeUpdate();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return n;
	}

	public int deleteEmployee(int Stu_id) 
	{
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="delete from studetail where stu_id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,Stu_id);
			
			n=ps.executeUpdate();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return n;
	}
	
	public int updateEmployee(Employee model) 
	{
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="update studetail set stu_name=?,stu_dep=? where stu_id=? ";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(3,model.getStu_id());
			ps.setString(1, model.getStu_name());
			ps.setString(2, model.getStu_dep());
			n=ps.executeUpdate();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return n;
	}
	
	public Employee findEmployee(int Stu_id) 
	{
		Employee bean=null;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="select * from studetail where stu_id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,Stu_id);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
		      {
				bean=new Employee();
				bean.setStu_id(rs.getInt("Stu_id"));
				bean.setStu_name(rs.getString("Stu_name"));
				bean.setStu_dep(rs.getString("Stu_dep"));
		      }
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return bean;
	}
	
	public List<Employee> findAllEmployee() 
	{
		List<Employee> list=new ArrayList<Employee>();
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="select * from studetail";
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
		      {
				Employee bean=new Employee();
				bean.setStu_id(rs.getInt("Stu_id"));
				bean.setStu_name(rs.getString("Stu_name"));
				bean.setStu_dep(rs.getString("Stu_dep"));
				list.add(bean);
		      }
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return list;
	}
}
