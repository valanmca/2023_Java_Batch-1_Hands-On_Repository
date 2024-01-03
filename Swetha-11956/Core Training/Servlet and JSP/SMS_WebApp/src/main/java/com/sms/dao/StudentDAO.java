package com.sms.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.sms.bean.Student;
import com.sms.util.dbUTIL;

public class StudentDAO {
	
	public int InsertStudent(Student bean) {
		int n=0;
		
		try {
			Connection con=dbUTIL.getDBConnection();
			String sql="Insert into Student values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, bean.getRno());
			ps.setString(2,bean.getName());
			ps.setString(3,bean.getDept());
			n=ps.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println(e);
		}
		return n;
	}
	public int DeleteStudent(int rno) {
		int n=0;
		
		try {
			Connection con=dbUTIL.getDBConnection();
			String sql="delete from Student where rno=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,rno);
			n=ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
		}
		return n;
	}
	public Student findStudent(int rno) {
		Student bean=null;
		try {
			Connection con=dbUTIL.getDBConnection();
			String sql="select * from Student where rno=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, rno);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				bean=new Student();
				bean.setRno(rs.getInt("rno"));
				bean.setName(rs.getString("name"));
				bean.setDept(rs.getString("dept"));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return bean;
		
		
		
	}
	
	public int UpdateStudent(Student bean) {
		int n=0;
		try {
		Connection con=dbUTIL.getDBConnection();
		String sql="update Student set name=?,dept=? where rno=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(3,bean.getRno());
		ps.setString(1,bean.getName());
		ps.setString(2, bean.getDept());
		
		n=ps.executeUpdate();
		}
		catch(Exception e){
			System.out.println(e);
		}
		return n;
		
	}
		public ArrayList<Student> findAllStudent() {
			
			ArrayList<Student> list=new ArrayList<Student>();
			
			try {
				
			Connection con=dbUTIL.getDBConnection();
			String sql="select * from Student";
			
			PreparedStatement ps=con.prepareStatement(sql);
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				Student bean=new Student(); 
				bean=new Student();
				bean.setRno(rs.getInt("rno"));
				bean.setName(rs.getString("name"));
				bean.setDept(rs.getString("dept"));
				
				list.add(bean);
				
			}
		
	}catch(Exception e) {
		System.out.println(e);
	}
			return list;
	}
	

	public static void main(String[] args) {

		
	}

}
