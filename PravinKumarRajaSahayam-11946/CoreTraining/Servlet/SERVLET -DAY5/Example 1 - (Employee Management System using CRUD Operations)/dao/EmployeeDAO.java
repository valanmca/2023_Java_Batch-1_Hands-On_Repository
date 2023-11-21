package com.ems.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ems.Util.DBUtil;
import com.ems.bean.Employee;

public class EmployeeDAO {
		public int InsertEmployee(Employee bean) {
			int n = 0;
			try {
				Connection cons = DBUtil.getDBConnection();
				String sql = "insert into SERVLET values(?,?,?)";
				PreparedStatement ps1 = cons.prepareStatement(sql);
				ps1.setInt(1, bean.getEmployee_id());
				ps1.setString(2, bean.getEmployee_name());
				ps1.setString(3, bean.getEmployee_department());
				n = ps1.executeUpdate();
			} catch (Exception e) {
				System.out.println(e);
			}
			return n;
		}
		public int DeleteEmployee(int Employee_id) {
			int n = 0;
			try {
				Connection con = DBUtil.getDBConnection();
				String sql = "delete from SERVLET where Employee_id = ?";
				PreparedStatement ps1 = con.prepareStatement(sql);
				ps1.setInt(1, Employee_id);
				n = ps1.executeUpdate();
			} catch (Exception e) {
				System.out.println(e);
			}
			return n;
		}
		public int UpdateEmployee(Employee bean) {
			int index = 0;
			int s = 0;
			try {
				Connection con = DBUtil.getDBConnection();
				String sql = "update SERVLET set Employee_name = ? , Employee_department = ? where Employee_id = ?";
				PreparedStatement ps1 = con.prepareStatement(sql);
				ps1.setString(1, bean.getEmployee_name());
				ps1.setString(2, bean.getEmployee_department());
				ps1.setInt(3, bean.getEmployee_id());
				s = ps1.executeUpdate();
			} catch (Exception e) {
				System.out.println(e);
			}
			return s;
		}
		public Employee FindEmployee(int Employee_id) {
		Employee bean = null;
			int n = 0;
			try {
				Connection con = DBUtil.getDBConnection();
				String sql = "select * from SERVLET where Employee_id = ?";
				PreparedStatement ps1 = con.prepareStatement(sql);
				ps1.setInt(1, Employee_id);
				ResultSet rs1 = ps1.executeQuery();
				if (rs1.next()) {
					bean = new Employee();
					bean.setEmployee_id(rs1.getInt("Employee_id"));
					bean.setEmployee_name(rs1.getString("Employee_name"));
					bean.setEmployee_department(rs1.getString("Employee_department"));
				}
			} catch (Exception e) {
				System.out.println(e);
			}
			return bean;
		}
		public List<Employee> FindAllEmployee() {
			List<Employee> lists = new ArrayList<Employee>();
			int n = 0;
			try {
				Connection con = DBUtil.getDBConnection();
				String sql = "select * from SERVLET";
				PreparedStatement ps1 = con.prepareStatement(sql);
				ResultSet rs1 = ps1.executeQuery();
				while (rs1.next()) {
				Employee bean = new Employee();
					bean.setEmployee_id(rs1.getInt("Employee_id"));
					bean.setEmployee_name(rs1.getString("Employee_name"));
					bean.setEmployee_department(rs1.getString("Employee_department"));
					lists.add(bean);
				}
			} catch (Exception e) {
				System.out.println(e);
			}
			return lists;
		}
}
