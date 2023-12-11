package com.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.bean.Employee;
import com.util.EmployeeDBUtil;

public class EmployeeDAO {
	
	public int insertEmployee(Employee bean) {
		int n=0;
		try {
			Connection con=EmployeeDBUtil.getDBConnection();
			String sql= "insert into tbl_employee values(?,?,?)";
			
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,bean.getId());
			ps.setString(2, bean.getName());
			ps.setInt(3, bean.getSalary());
			
			n=ps.executeUpdate();	
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return n;
		
	}
	
	public int updateEmployee(Employee bean) {
		int n=0;
		try {
			Connection con=EmployeeDBUtil.getDBConnection();
			String sql= "update tbl_employee set Name=?, Salary=? where EmpId=?";
			
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setString(1, bean.getName());
			ps.setInt(2, bean.getSalary());
			ps.setInt(3,bean.getId());
			
			n=ps.executeUpdate();	
		}
		catch(Exception e) {
			System.out.println("Exception in update");
		}
		return n;
		
	}
	
	public int deleteEmployee(int id) {
		int n=0;
		
		try {
			Connection con=EmployeeDBUtil.getDBConnection();
			String sql= "delete from tbl_employee where EmpId=?";
			
			PreparedStatement ps=con.prepareStatement(sql);
				
			ps.setInt(1,id);
			
			n=ps.executeUpdate();
		}
		
		catch (Exception e){
			System.out.println("Exception in deletion");
		}
		
		return n;
	}
	
	public Employee findEmployee(int id) {
		Employee bean=null;
		
		try {
			Connection con=EmployeeDBUtil.getDBConnection();
			String sql= "select * from tbl_employee where EmpId=?";
			
			PreparedStatement ps=con.prepareStatement(sql);
				
			ps.setInt(1,id);
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next()) {
				bean=new Employee();
				bean.setId(rs.getInt("EmpId"));
				bean.setName(rs.getString("Name"));
				bean.setSalary(rs.getInt("Salary"));
			}
		}
		catch (Exception e){
			System.out.println("Exception in find");	
			
		}
		return bean;
	}
	
	public List<Employee> findAllEmployee(){
	List<Employee> list=new LinkedList<Employee>();
	
	try {
		Connection con=EmployeeDBUtil.getDBConnection();
		String sql= "select * from tbl_employee";
		
		Statement st=con.createStatement();
			
		
		ResultSet rs= st.executeQuery(sql);
		
		while(rs.next()) {
			Employee bean=new Employee();
			bean.setId(rs.getInt("EmpId"));
			bean.setName(rs.getString("Name"));
			bean.setSalary(rs.getInt("Salary"));
			list.add(bean);
		}
		
	}
	catch (Exception e){
		System.out.println("Exception in find");	
		
	}
	return list;
	
	}
}
