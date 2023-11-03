package com.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

import com.ems.bean.Employee;
import com.ems.util.DBUtil;

public class EmployeeDAO {
	public int insertEmployee(Employee bean) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "insert into tbl_student values(?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bean.getsName());
			ps.setInt(2, bean.getsId());
			n = ps.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	// delete
	public int deleteEmployee(int id) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "delete from tbl_student where sid = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			n = ps.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	// update
	public int updateEmployee(Employee bean) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "update tbl_student set sname = ? where sid = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bean.getsName());
			ps.setInt(2, bean.getsId());
			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	// find
	public Employee findEmployee(int id) {
		Employee emp = null;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from tbl_Student where sid=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				emp = new Employee();
				emp.setsId(rs.getInt("sid"));
				emp.setsName(rs.getString("sname"));

			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return emp;
	}

	// find All
	public List<Employee> findAllEmployee() {
		List<Employee> list = new LinkedList<Employee>();

		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from tbl_Student";
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee bean = new Employee();
				bean.setsName(rs.getString("sname"));
				bean.setsId(rs.getInt("sid"));
				list.add(bean);

			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

}
