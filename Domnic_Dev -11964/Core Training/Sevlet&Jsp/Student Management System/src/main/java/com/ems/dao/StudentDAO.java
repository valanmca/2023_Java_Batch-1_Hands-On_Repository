package com.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ems.bean.*;
import com.ems.util.DBUtil;

public class StudentDAO {

	public int insertStudent(Student bean) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "insert into tbl_student values (?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, bean.getStd_id());
			ps.setString(2, bean.getStd_name());
			ps.setString(3, bean.getStd_sec());
			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public int deleteStudent(int std_id) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "delete from tbl_student where std_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, std_id);
			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public int updateStudent(Student bean) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "update tbl_student set std_name= ?, std_sec=? where std_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bean.getStd_name());
			ps.setString(2, bean.getStd_sec());
			ps.setInt(3, bean.getStd_id());
			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;

	}

	public Student findStudent(int id) {
		Student bean = null;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from tbl_student where std_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				bean = new Student();
				bean.setStd_id(rs.getInt("std_id"));
				bean.setStd_name(rs.getString("std_name"));
				bean.setStd_sec(rs.getString("std_sec"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return bean;
	}
	
	public List<Student> findAllStudents(){
		List<Student> list=new ArrayList<Student>();
		try {
			Connection con =DBUtil.getDBConnection();
			String sql="select * from tbl_student";
			PreparedStatement ps=con.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Student bean=new Student();
				bean.setStd_id(rs.getInt("std_id"));
				bean.setStd_name(rs.getString("std_name"));
				bean.setStd_sec(rs.getString("std_sec"));
				list.add(bean);
			
			}
		}catch(Exception e) {
			System.out.println(e);
		
		}
		return list;
	}

}
