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
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "insert into tbl_employee values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, bean.getId());
			ps.setString(2, bean.getName());
			ps.setInt(3, bean.getSalary());
			ps.setInt(4, bean.getDno());
			n = ps.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public int deleteEmployee(int id) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "delete from tbl_employee where emp_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public int updateEmployee(Employee bean) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "update tbl_employee set emp_name = ?, salary=?, dno = ? where emp_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(4, bean.getId());
			ps.setString(1, bean.getName());
			ps.setInt(2, bean.getSalary());
			ps.setInt(3, bean.getDno());
			n = ps.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public Employee findEmployee(int id) {
		Employee emp = null;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from tbl_Employee where emp_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				emp = new Employee();
				emp.setId(rs.getInt("emp_id"));
				emp.setName(rs.getString("emp_name"));
				emp.setSalary(rs.getInt("salary"));
				emp.setDno(rs.getInt("dno"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return emp;
	}

	public List<Employee> findAllEmployee() {
		List<Employee> list = new ArrayList<Employee>();
		
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from tbl_Employee";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			

			while (rs.next()) {
				Employee bean = new Employee();
				bean.setId(rs.getInt("emp_id"));
				bean.setName(rs.getString("emp_name"));
				bean.setSalary(rs.getInt("salary"));
				bean.setDno(rs.getInt("dno"));
				list.add(bean);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

}
