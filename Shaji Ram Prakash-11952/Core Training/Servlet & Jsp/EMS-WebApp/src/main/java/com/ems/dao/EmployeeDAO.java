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
			String sql = "insert into Employee values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, bean.getId());
			ps.setString(2, bean.getName());
			ps.setInt(3, bean.getSalary());
			ps.setInt(4, bean.getDeptNo());
			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public int deleteEmployee(int Id) {

		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "delete from Employee where Id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, Id);
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
			String sql = "update Employee set ename =?,eSalary=?, deptNo=? where Id = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, bean.getName());
			ps.setInt(2, bean.getSalary());
			ps.setInt(3, bean.getDeptNo());
			ps.setInt(4, bean.getId());
			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public Employee findEmployee(int Id) {
		Employee bean = null;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from Employee where Id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, Id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				bean = new Employee();
				bean.setId(rs.getInt("ID"));
				bean.setName(rs.getString("ename"));
				bean.setSalary(rs.getInt("eSalary"));
				bean.setDeptNo(rs.getInt("deptNo"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return bean;
	}

	public List<Employee> findAllEmployee() {

		List<Employee> list = new ArrayList<Employee>();
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select*from Employee";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee bean = new Employee();
				bean.setId(rs.getInt("Id"));
				bean.setDeptNo(rs.getInt("deptNo"));
				bean.setSalary(rs.getInt("eSalary"));
				bean.setName(rs.getString("ename"));
				list.add(bean);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;

	}

}
