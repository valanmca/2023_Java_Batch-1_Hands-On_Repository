package com.ems.dao;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.ems.bean.Employee;
import com.ems.util.dbUTIL;

public class EmployeeDAO {

	public int insertEmployee(Employee bean){
		int n=0;
		try {
			Connection con=dbUTIL.getDBConnection();
			String sql="insert into Employee values(?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, bean.getId());
			ps.setString(2, bean.getName());
			ps.setInt(3, bean.getSalary());
			ps.setInt(4, bean.getDno());
			n=ps.executeUpdate();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return n;
		
		
	}
	public int deleteEmployee(int id) {
		int n=0;
		try {
			Connection con=dbUTIL.getDBConnection();
			String sql="delete from Employee where id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,id);
			
			n=ps.executeUpdate();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return n;
		
	}
	public int updateEmployee(Employee bean){
		int n=0;
		try {
			Connection con=dbUTIL.getDBConnection();
			String sql="update Employee set name = ?,salary = ?, dno = ? where id = ?";
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setString(1, bean.getName());
			ps.setInt(2, bean.getSalary());
			ps.setInt(3, bean.getDno());
			ps.setInt(4, bean.getId());
			
			n=ps.executeUpdate();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return n;
	}
	public Employee findEmployee(int id) {
		
		Employee bean=null;
		try {
			
		Connection con=dbUTIL.getDBConnection();
		String sql="select * from Employee where id=?";
		
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		
		if(rs.next()) {
			bean=new Employee();
			bean.setId(rs.getInt("id"));
			bean.setName(rs.getString("name"));
			bean.setSalary(rs.getInt("salary"));
			bean.setDno(rs.getInt("dno"));
			
		}
		} catch (SQLException e) {
			System.out.println(e);
		}
		
	return bean;

	
	}
	
	//Store multiple bean object in single  --> use any one of collection
	
public ArrayList<Employee> findAllEmployee() {
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		
		try {
			
		Connection con=dbUTIL.getDBConnection();
		String sql="select * from Employee";
		
		PreparedStatement ps=con.prepareStatement(sql);
		
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {
			Employee bean=new Employee(); 
			bean=new Employee();
			bean.setId(rs.getInt("id"));
			bean.setName(rs.getString("name"));
			bean.setSalary(rs.getInt("salary"));
			bean.setDno(rs.getInt("dno"));
			list.add(bean);
			
		}
		} catch (SQLException e) {
			System.out.println(e);
		}
		
	return list;

	
	}
}
