package com.sms.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sms.bean.Student;
import com.sms.util.DBUtil;

public class StudentDAO {
	
	public int insertEmployee(Student bean) {
		int n=0;
		try {
			Connection con=DBUtil.getConnection();
			String sql="insert into tbl_sms values(?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, bean.getStdRollNo());
			ps.setString(2, bean.getStdName());
			ps.setString(3, bean.getStdEmail());
			ps.setString(4,bean.getStdSection());
			ps.setInt(5, bean.getStdStandard());
			ps.setString(6, bean.getStdLocation());
			n=ps.executeUpdate();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return n;
		
	}
	
	public int updateEmployee(Student bean) {
		int n=0;
		try {
			Connection con=DBUtil.getConnection();
			String sql="update tbl_sms set std_name=?, std_email=?, std_section=?, std_standard=?, std_location=? where std_rollno=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, bean.getStdName());
			ps.setString(2, bean.getStdEmail());
			ps.setString(3,bean.getStdSection());
			ps.setInt(4, bean.getStdStandard());
			ps.setString(5, bean.getStdLocation());
			ps.setInt(6, bean.getStdRollNo());
			n=ps.executeUpdate();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return n;
		
	}
	
	public int deleteEmployee(int rollno) {
		int n=0;
		try {
			Connection con=DBUtil.getConnection();
			String sql="delete from tbl_sms where std_rollno=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, rollno);
			n=ps.executeUpdate();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return n;
	}
	
	public Student findStudent(int rollno) {
		Student bean=new Student();
		try {
			Connection con=DBUtil.getConnection();
			String sql="select * from tbl_sms where std_rollno=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,rollno);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				bean=new Student();
				bean.setStdRollNo(rs.getInt("std_rollno"));
				bean.setStdName(rs.getString("std_name"));
				bean.setStdEmail(rs.getString("std_email"));
				bean.setStdSection(rs.getString("std_section"));
				bean.setStdStandard(rs.getInt("std_standard"));
				bean.setStdLocation(rs.getString("std_location"));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return bean;
	}
	
	public List<Student> viewAllStudent() {
		List<Student> list=new ArrayList<Student>();
		Student bean=new Student();
		try {
			Connection con=DBUtil.getConnection();
			String sql="select * from tbl_sms";
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				bean=new Student();
				bean.setStdRollNo(rs.getInt("std_rollno"));
				bean.setStdName(rs.getString("std_name"));
				bean.setStdEmail(rs.getString("std_email"));
				bean.setStdSection(rs.getString("std_section"));
				bean.setStdStandard(rs.getInt("std_standard"));
				bean.setStdLocation(rs.getString("std_location"));
				list.add(bean);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return list;
	}

}
