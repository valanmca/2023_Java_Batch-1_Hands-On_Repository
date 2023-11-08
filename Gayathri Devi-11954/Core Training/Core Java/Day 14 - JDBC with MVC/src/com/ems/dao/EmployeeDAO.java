package com.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.ems.bean.Employee;
import com.ems.util.DBUtil;

public class EmployeeDAO {
	//insert
	public int insert(Employee bean)  {
		int n=0;
		
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "insert into tbl_employee_details values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, bean.geteId());
			ps.setString(2, bean.geteName());
			ps.setString(3, bean.geteDept());
			ps.setFloat(4, bean.geteSalary());
			n = ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return n;
		
	}
	//update
	public int update(Employee bean) {
		int n=0;
		 
		try {
			Connection	con = DBUtil.getDBConnection();
			String sql = "update tbl_employee_details set ename = ?, dept = ?, esalary = ? where eid = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, bean.geteName());
			ps.setString(2, bean.geteDept());
			ps.setFloat(3, bean.geteSalary());
			ps.setInt(4, bean.geteId());
			n=ps.executeUpdate();
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return n;
		
	}
	//delete
	public int delete(int i){
		int n=0;
		Connection con;
		try {
			con = DBUtil.getDBConnection();
			String sql = "delete from tbl_employee_details where eid = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, i);
			n=ps.executeUpdate();	
			
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return n;
	}
	//find
	public Employee find(int id){
		Employee emp = null;
		Connection con;
		try {
			con = DBUtil.getDBConnection();
			String sql = "select * from tbl_employee_details where eid = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				emp = new Employee();
				emp.seteId(rs.getInt("eid"));//database name
				emp.seteName(rs.getString("ename"));
				emp.seteDept(rs.getString("dept"));
				emp.seteSalary(rs.getFloat("esalary"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return emp;
	}
	//view
	public List <Employee> view(){
		List <Employee> list = new LinkedList <Employee> ();
		Connection con;
		try {
			con = DBUtil.getDBConnection();
			String sql = "select * from tbl_employee_details";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Employee obj = new Employee();
				obj.seteId(rs.getInt("eid"));
				obj.seteName(rs.getString("ename"));
				obj.seteDept(rs.getString("dept"));
				obj.seteSalary(rs.getFloat("esalary"));
				list.add(obj);
			}
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return list;
		
		
	}
}
