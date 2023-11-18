package com.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sms.bean.Student;
import com.sms.util.*;

public class StudentDAO {
	
	public int insertStudent(Student bean) {
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="insert into SMS values(?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, bean.getStdId());
			ps.setString(2,bean.getStdName());
			ps.setString(3, bean.getStdDept());
			ps.setFloat(4, bean.getStdPercentage());
			n=ps.executeUpdate();
		}catch(Exception e) {
			System.out.println(e);
		}
		return n;
	}
	
	public int updateStudent(Student bean) {
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="update SMS set Std_Name=?, Std_Dept=?, Std_Percentage=? where std_Id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,bean.getStdName());
			ps.setString(2, bean.getStdDept());
			ps.setFloat(3, bean.getStdPercentage());
			ps.setInt(4, bean.getStdId());
			n=ps.executeUpdate();
		}catch(Exception e) {
			System.out.println(e);
		}
		return n;
	}
	
	public int deleteStudent(int id) {
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="delete from SMS where std_Id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,id);
			n=ps.executeUpdate();
		}catch(Exception e) {
			System.out.println(e);
		}
		return n;
	}
	
	public Student findStudent(int id) {
		Student bean=new Student();
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="select * from SMS where std_Id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				bean=new Student();
				bean.setStdId(rs.getInt("std_Id"));
				bean.setStdName(rs.getString("std_Name"));
				bean.setStdDept(rs.getString("std_Dept"));
				bean.setStdPercentage(rs.getFloat("std_Percentage"));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return bean;
	}
	
	public List<Student> viewStudent() {
		List<Student> list=new ArrayList<Student>();
		Student bean=new Student();
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="select * from SMS";
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				bean=new Student();
				bean.setStdId(rs.getInt("std_Id"));
				bean.setStdName(rs.getString("std_Name"));
				bean.setStdDept(rs.getString("std_Dept"));
				bean.setStdPercentage(rs.getFloat("std_Percentage"));
				list.add(bean);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return list;
	}

	
}
