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
			Connection cons = DBUtil.getDBConnection();
			String sql = "insert into JDBC values(?,?,?)";
			PreparedStatement ps1 = cons.prepareStatement(sql);
			ps1.setInt(1, bean.getStudent_id());
			ps1.setString(2, bean.getStudent_name());
			ps1.setString(3, bean.getStudent_department());
			n = ps1.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public int deleteEmployee(int student_id) {
		int n = 0;
		try {
			Connection cons = DBUtil.getDBConnection();
			String sql = "delete from JDBC where student_id = ?";
			PreparedStatement ps1 = cons.prepareStatement(sql);
			ps1.setInt(1, student_id);
			n = ps1.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public int updateEmployee(Employee bean) {
		int index = 0;
		int ns = 0;
		try {
			Connection cons = DBUtil.getDBConnection();
			String sql = "update JDBC set student_name = ? , student_department = ? where student_id = ?";
			PreparedStatement ps1 = cons.prepareStatement(sql);
			ps1.setString(1, bean.getStudent_name());
			ps1.setString(2, bean.getStudent_department());
			ps1.setInt(3, bean.getStudent_id());
			ns = ps1.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return ns;
	}
	public Employee findEmployee(int student_id) {
		Employee bean = null;
		int n = 0;
		try {
			Connection cons = DBUtil.getDBConnection();
			String sql = "select * from JDBC where student_id = ?";
			PreparedStatement ps1 = cons.prepareStatement(sql);
			ps1.setInt(1, student_id);
			ResultSet rs1 = ps1.executeQuery();
			if (rs1.next()) {
				bean = new Employee();
				bean.setStudent_id(rs1.getInt("student_id"));
				bean.setStudent_name(rs1.getString("student_name"));
				bean.setStudent_department(rs1.getString("student_department"));

			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return bean;
	}

	public List<Employee> findAllEmployee() {
		List<Employee> list = new ArrayList<Employee>();
		int n = 0;
		try {
			Connection cons = DBUtil.getDBConnection();
			String sql = "select * from JDBC";
			PreparedStatement ps1 = cons.prepareStatement(sql);
			ResultSet rs1 = ps1.executeQuery();
			while (rs1.next()) {
				Employee bean = new Employee();
				bean.setStudent_id(rs1.getInt("student_id"));
				bean.setStudent_name(rs1.getString("student_name"));
				bean.setStudent_department(rs1.getString("student_department"));
				list.add(bean);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}
}