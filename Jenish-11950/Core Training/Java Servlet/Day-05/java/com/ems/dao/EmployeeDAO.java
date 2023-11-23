package com.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ems.bean.EmployeeServ;
import com.ems.util.DBUtil;

public class EmployeeDAO {
	public int insertEmployee(EmployeeServ bean) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "insert into Employee values (?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, bean.getId());
			ps.setString(2, bean.getName());
			ps.setInt(3, bean.getSalary());
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
			String sql = "delete from Employee where EmpId = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public int updateEmployee(EmployeeServ bean) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "update Employee set EmpName = ?, EmpSalary=?  where EmpId = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(3, bean.getId());
			ps.setString(1, bean.getName());
			ps.setInt(2, bean.getSalary());
			n = ps.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public EmployeeServ findEmployee(int id) {
		EmployeeServ emp = null;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from Employee where EmpId=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				emp = new EmployeeServ();
				emp.setId(rs.getInt("EmpId"));
				emp.setName(rs.getString("EmpName"));
				emp.setSalary(rs.getInt("EmpSalary"));
				
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return emp;
	}

	public List<EmployeeServ> findAllEmployee() {
		List<EmployeeServ> list = new ArrayList<EmployeeServ>();
		
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from Employee";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			

			while (rs.next()) {
				EmployeeServ bean = new EmployeeServ();
				bean.setId(rs.getInt("EmpId"));
				bean.setName(rs.getString("EmpName"));
				bean.setSalary(rs.getInt("EmpSalary"));
				list.add(bean);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

}
