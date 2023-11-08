package com.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ems.bean.*;
import com.ems.util.DBUtil;

public class EmployeeDAO {

	public int insertEmployee(Employee bean) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "insert into tbl_Student values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, bean.getId());
			ps.setString(2, bean.getName());
			ps.setString(3, bean.getDept());
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
			String sql = "delete from  tbl_Student where stud_id=?";
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
			String sql = "update tbl_Student set stud_name=? , stud_depart=? where stud_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(3, bean.getId());
			ps.setString(1, bean.getName());
			ps.setString(2, bean.getDept());
			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public Employee findEmployee(int id) {
		Employee emp2 = null;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from tbl_Student where stud_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				emp2 = new Employee();
				emp2.setId(rs.getInt("stud_id"));
				emp2.setName(rs.getString("stud_name"));
				emp2.setDept(rs.getString("stud_depart"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return emp2;
	}

	public List<Employee> findAllEmployee() {
		List<Employee> list = new ArrayList<Employee>();
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from tbl_Student";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Employee bean = new Employee();
				bean.setId(rs.getInt("stud_id"));
				bean.setName(rs.getString("stud_name"));
				bean.setDept(rs.getString("stud_depart"));
				list.add(bean);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}
}
