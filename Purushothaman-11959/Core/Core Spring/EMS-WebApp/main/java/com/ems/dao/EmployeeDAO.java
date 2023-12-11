package com.ems.dao;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ems.bean.Employee;
import com.ems.util.DBUtil;

public class EmployeeDAO {

	public int insertEmployee(Employee bean) {
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();//To connect
			String sql="insert into employee values(?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, bean.getId());
			ps.setString(2,bean.getName());
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
			Connection con=DBUtil.getDBConnection();//To connect
			String sql="delete from employee where EmpId=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			n=ps.executeUpdate();
		}catch(Exception e) {
			System.out.println(e);
		}
		return n;
	}
	
	public int updateEmployee(Employee bean1) {
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();//To connect
			String sql="update employee set EmpName=? , EmpSalary=? , EmpDeptNo=? where EmpId=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,bean1.getName());
			ps.setInt(2, bean1.getSalary());
			ps.setInt(3, bean1.getDno());
			ps.setInt(4, bean1.getId());
			n=ps.executeUpdate();
		}catch(Exception e) {
			System.out.println(e);
		}
		return n;
	}
	
	public Employee findEmployee(int value) {
		Employee bean=null;
		try {
			Connection con=DBUtil.getDBConnection();//To connect
			String sql="Select * from employee where EmpId=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, value);
			ResultSet rs=ps.executeQuery();
				
			if(rs.next()){
				bean = new Employee();
				bean.setId(rs.getInt("EmpId"));
				bean.setName(rs.getString("EmpName"));
				bean.setSalary(rs.getInt("EmpSalary"));
				bean.setDno(rs.getInt("EmpDeptNo"));
				}
			}
		    catch(Exception e){
			System.out.println(e);	
		}
		return bean;
	}

	public List<Employee> viewEmployee() {
		List<Employee> list=new ArrayList<Employee>();
		try {
			Connection con=DBUtil.getDBConnection();//To connect
			String sql="select * from employee";
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Employee bean=new Employee();
				bean.setId(rs.getInt("EmpId"));
				bean.setName(rs.getString("EmpName"));
				bean.setSalary(rs.getInt("EmpSalary"));
				bean.setDno(rs.getInt("EmpDeptNo"));
				list.add(bean);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return list;
	}
}