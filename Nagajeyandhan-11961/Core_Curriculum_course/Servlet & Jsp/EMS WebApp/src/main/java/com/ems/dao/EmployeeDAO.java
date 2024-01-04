package com.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.ems.bean.Employee;
import com.ems.util.DBUtil;

public class EmployeeDAO {
public int insertEmployee(Employee bean) {
		
		int n = 0;
		
		try {
			Connection con = DBUtil.getDBConnection();
			String query = "insert into tbl_employee values (?, ?, ?)";
			
			PreparedStatement pst = con.prepareStatement(query);
			
			pst.setInt(1, bean.getEmp_id());
			pst.setString(2, bean.getEname());
			pst.setInt(3, bean.getSalary());
			
			n = pst.executeUpdate();
						
		} catch (Exception e) {
			System.out.println("Exception in Insert");
		}
		
		return n;
	}
	
	public int deleteEmployee(int emp_id) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String query = "delete from tbl_employee where emp_id = ?";
			
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, emp_id);
			n= pst.executeUpdate();
		
		} catch (Exception e) {
			System.out.println("Exception in delete");
		}
		return n;
	}
	
	
	public int updateEmployee(Employee bean) {
		int n = 0;
		try {
		Connection con = DBUtil.getDBConnection();
		String query = "update  tbl_employee set ename = ?, salary = ? where emp_id = ?";
		
		PreparedStatement pst = con.prepareStatement(query);
		
		
		pst.setString(1, bean.getEname());
		pst.setInt(2, bean.getSalary());
		pst.setInt(3, bean.getEmp_id());
		
		n = pst.executeUpdate();
					
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	return n;
	}
	
	public Employee findEmployee(int emp_id) {
		Employee bean = null;
		try {
			Connection con = DBUtil.getDBConnection();
			String query = "select * from tbl_employee where emp_id = ?";
			
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, emp_id);
			ResultSet rs  = pst.executeQuery();
			
			if(rs.next()) {
				bean = new Employee();
				bean.setEmp_id(rs.getInt("emp_id"));
				bean.setEname(rs.getString("ename"));
				bean.setSalary(rs.getInt("salary"));
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return bean;
		
	}
	
public List<Employee> findAllEmployee() {
		List<Employee> list = new LinkedList<Employee>();
		try {
			Connection con = DBUtil.getDBConnection();
			String query = "select * from tbl_employee";
			
			Statement st = con.createStatement();
			
			ResultSet rs  = st.executeQuery(query);
			
			while(rs.next()) {
				Employee bean = new Employee();
				bean.setEmp_id(rs.getInt("emp_id"));
				bean.setEname(rs.getString("ename"));
				bean.setSalary(rs.getInt("salary"));
				list.add(bean);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}
}
