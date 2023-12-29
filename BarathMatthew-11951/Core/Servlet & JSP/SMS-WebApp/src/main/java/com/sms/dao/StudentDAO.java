package com.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import com.sms.bean.Student;
import com.sms.util.DBUtil;

public class StudentDAO {

	public  int insertStudent(Student bean) {
		int n=0;
		try {
		Connection con = DBUtil.getDBConnection();
		String sql="insert into tbl_Student values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, bean.getsID());
		ps.setString(2,bean.getsName() );
		ps.setInt(3,bean.getSclass() );
		ps.setString(4, bean.getGender());
		n = ps.executeUpdate();
		}catch(Exception e){
			System.out.println(e);
		}
		return n;

	}
	
	public  int updateStudent(Student bean) {
		int n=0;
		try {
		Connection con = DBUtil.getDBConnection();
		String sql="update tbl_Student set stu_name=?,stu_class=?,stu_gender=? where stu_id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,bean.getsName() );
		ps.setInt(2,bean.getSclass() );
		ps.setString(3, bean.getGender());
		ps.setInt(4, bean.getsID());
		n = ps.executeUpdate();
		}catch(Exception e){
			System.out.println(e);
		}
		return n;

	}

	
//	public  int deleteEmployee(int id) {
//		int n=0;
//		try {
//		Connection con = DBUtil.getDBConnection();
//		String sql="delete from tbl_Employee where id = ?";
//		PreparedStatement ps = con.prepareStatement(sql);
//		ps.setInt(1, id);
//		n = ps.executeUpdate();
//		}catch(Exception e){
//			System.out.println(e);
//		}
//		
//		return n;
//	}
	
		
//	public Employee findEmployee(int id) {
//		Employee bean=null;
////		int n=0;
//		try {
//		Connection con = DBUtil.getDBConnection();
//		String sql="select * from tbl_employee where id = ?";
//		PreparedStatement ps = con.prepareStatement(sql);
//		ps.setInt(1, id);
//		ResultSet rs= ps.executeQuery();
//		
//		if(rs.next()) {
//			bean = new Employee();
//			bean.setId(rs.getInt("Id"));
//			bean.setName(rs.getString("eName"));
//			bean.setSalary(rs.getInt("eSalary"));
//			bean.setDno(rs.getInt("DepNo"));
//		}
//		
//		}catch(Exception e){
//			System.out.println(e);
//		}
//		
//		return bean;
//	} 
//
//	public List<Employee> findAllEmployee() {
//	    List<Employee> list = new ArrayList<Employee>();
//	      
//	       try {
//	           Connection con = DBUtil.getDBConnection();
//	           String sql = "select * from tbl_employee";
//	           PreparedStatement ps = con.prepareStatement(sql);
//	           ResultSet rs = ps.executeQuery();
//	           while(rs.next()) {
//	               Employee bean =new Employee();
//	               bean.setId(rs.getInt("Id"));
//	               bean.setName(rs.getString("eName"));
//	               bean.setSalary(rs.getInt("eSalary"));
//	               bean.setDno(rs.getInt("DepNo"));
//	               list.add(bean);
//	               
//	           }
//	       }catch(Exception e) {
//	           System.out.println(e);
//	       }
//	       return list;
//	}

	
}
