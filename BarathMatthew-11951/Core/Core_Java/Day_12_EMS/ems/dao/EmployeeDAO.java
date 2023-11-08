package com.ems.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ems.bean.Employee;
import com.ems.util.DBUtil;
public class EmployeeDAO {

	public  int insertEmployee(Employee bean) {
		int n=0;
		try {
		Connection con = DBUtil.getDBConnection();
		String sql="insert into tbl_Employee values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, bean.getId());
		ps.setString(2,bean.getName() );
		ps.setInt(3,bean.getSalary() );
		ps.setInt(4, bean.getDno());
		n = ps.executeUpdate();
		}catch(Exception e){
			System.out.println(e);
		}
		return n;

	}
	public  int deleteEmployee(int id) {
		int n=0;
		try {
		Connection con = DBUtil.getDBConnection();
		String sql="delete from tbl_Employee where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		n = ps.executeUpdate();
		}catch(Exception e){
			System.out.println(e);
		}
		
		return n;
	}
	
	public  int updateEmployee(Employee bean) {
		int n=0;
		try {
		Connection con = DBUtil.getDBConnection();
		String sql="update tbl_Employee set eName =?,eSalary=?,DepNo=? where Id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,bean.getName() );
		ps.setInt(2,bean.getSalary() );
		ps.setInt(3, bean.getDno());
		ps.setInt(4, bean.getId());
		n = ps.executeUpdate();
		}catch(Exception e){
			System.out.println(e);
		}
		return n;

	}
	
	public Employee findEmployee(int id) {
		Employee bean=null;
//		int n=0;
		try {
		Connection con = DBUtil.getDBConnection();
		String sql="select * from tbl_employee where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs= ps.executeQuery();
		
		if(rs.next()) {
			bean = new Employee();
			bean.setId(rs.getInt("id"));
			bean.setName(rs.getString("eName"));
			bean.setId(rs.getInt("eSalary"));
			bean.setId(rs.getInt("DepNo"));
		}
		
		}catch(Exception e){
			System.out.println(e);
		}
		
		return bean;
	} 

	public List<Employee> findAllEmployee() {
	    List<Employee> list = new ArrayList<Employee>();
	      
	       try {
	           Connection con = DBUtil.getDBConnection();
	           String sql = "select * from tbl_employee";
	           PreparedStatement ps = con.prepareStatement(sql);
	           ResultSet rs = ps.executeQuery();
	           while(rs.next()) {
	               Employee bean =new Employee();
	               bean.setId(rs.getInt("id"));
	               bean.setName(rs.getString("eName"));
	               bean.setSalary(rs.getInt("eSalary"));
	               bean.setDno(rs.getInt("DepNo"));
	               list.add(bean);
	               
	           }
	       }catch(Exception e) {
	           System.out.println(e);
	       }
	       return list;
	}
}
