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

			String sql = "Insert into tbl_employee value (?,?,?,?)";
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

	// update employee
	public int updateEmployee(Employee bean) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "update tbl_employee set name=?,salary=?,dno=? where id =? ";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, bean.getName());
			ps.setInt(2, bean.getSalary());
			ps.setInt(3, bean.getDno());
			ps.setInt(4, bean.getId());

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

			String sql = "delete from tbl_employee where id=?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);

			n = ps.executeUpdate();

			// n=ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}

		return n;
	}
//
//	// find employee
//
//	public void findEmployee(int id) {
//		int n = 0;
//		try {
//			Connection con = DBUtil.getDBConnection();
//
//			String sql = "select * from tbl_employee where id =?";
//
//			PreparedStatement ps = con.prepareStatement(sql);
//			ps.setInt(1, id);
//
//			ResultSet rs = ps.executeQuery();
//			int flag=0;
//			while (rs.next()) {
//
//				if (rs.getInt("id") == id) {
//					flag=1;
//
//					System.out.println("Id = " + rs.getInt("id") + " Name = " + rs.getString("name") + " Salary = "
//							+ rs.getInt("salary") + " department Number = " + rs.getInt("dno"));
//				}
//
//				}
//			
//			if (flag==0)
//			{
//				System.out.println("Employee not found");
//			}
//
//			// n=ps.executeUpdate();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//
//	}
	
	
	
	
	
	
	//// find  correct code mvc architecture 
	
	
	public Employee findEmployee1(int id) {
		Employee bean=null;
		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "select * from tbl_employee where id =?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			if (rs.next())
			{
				bean=new Employee();
				
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setSalary(rs.getInt("salary"));
				bean.setDno(rs.getInt("dno"));
				
			}
			
			

			// n=ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return bean;

	}

	// find All

	public void findAllEmployee() {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "select * from tbl_employee";

			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
            int flag=0;
     
			while (rs.next()) {
				flag=1;
				System.out.println("Id = " + rs.getInt("id") + " Name = " + rs.getString("name") + " Salary = "
						+ rs.getInt("salary") + " department Number = " + rs.getInt("dno"));
			}
			if (flag==0)
			{
				System.out.println("Table is empty");
			}
				

			// n=ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	// find All correct code mvc Architecture 
	
	
	public ArrayList<Employee>  findAllEmployee1() {
		
		ArrayList<Employee > list= new ArrayList<Employee>();
		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "select * from tbl_employee";

			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			
			while (rs.next())
			{
				Employee bean=new Employee();
				
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setSalary(rs.getInt("salary"));
				bean.setDno(rs.getInt("dno"));
				
				list.add(bean);
				
			}
            
				

			// n=ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
		
	}
}
