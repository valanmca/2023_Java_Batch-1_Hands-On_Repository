package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.bean.Student;
import com.util.DBUtil;

public class StudentDAO {
	
	public int insertStudent(Student bean) {
		int n = 0;
		
		try {
			
			Connection con = DBUtil.getDBConnection();
			String query = "insert into tbl_student values(?,?,?,?,?)";
			
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, bean.getRollNo());
			pst.setString(2, bean.getName());
			pst.setString(3, bean.getEmail());
			pst.setString(4, bean.getSection());
			pst.setString(5, bean.getLocation());
			
			n = pst.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("Exception in Insertion");
		}
		
		return n;
	}
	
	public int updateStudent(Student bean) {
		int n = 0;
		
		try {
			
			Connection con = DBUtil.getDBConnection();
			String query = "update tbl_student set s_name = ?, s_email = ?, s_section = ?, s_location = ? where s_rno = ?";
			
			PreparedStatement pst = con.prepareStatement(query);
			
			pst.setString(1, bean.getName());
			pst.setString(2, bean.getEmail());
			pst.setString(3, bean.getSection());
			pst.setString(4, bean.getLocation());
			pst.setInt(5, bean.getRollNo());
			
			n = pst.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("Exception in Updation");
		}
		
		return n;
	}
	public int deleteStudent(int rollNo) {
		int n = 0;
		
		try {
			
			Connection con = DBUtil.getDBConnection();
			String query = "delete from tbl_student where s_rno = ?";
			
			PreparedStatement pst = con.prepareStatement(query);
			
			pst.setInt(1, rollNo);
			
			n = pst.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("Exception in Deletion");
		}
		
		return n;
	}
	
	public Student findStudent(int rollNo) {
		Student bean = null;
		
		try {
			
			Connection con = DBUtil.getDBConnection();
			String query = "select * from tbl_student where s_rno = ?";
			
			PreparedStatement pst = con.prepareStatement(query);
			
			pst.setInt(1, rollNo);
			
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				bean = new Student();
				bean.setRollNo(rs.getInt("s_rno"));
				bean.setName(rs.getString("s_name"));
				bean.setEmail(rs.getString("s_email"));
				bean.setSection(rs.getString("s_section"));
				bean.setLocation(rs.getString("s_location"));
			}
			
		} catch (Exception e) {
			System.out.println("Exception in Find");
		}
		
		return bean;
	}
	
	public List<Student> findAllStudent() {
		
		List<Student> list = new LinkedList<Student>();
		try {
			
			Connection con = DBUtil.getDBConnection();
			String query = "select * from tbl_student";
			
			Statement st = con.createStatement();
						
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				Student bean = new Student();
				bean.setRollNo(rs.getInt("s_rno"));
				bean.setName(rs.getString("s_name"));
				bean.setEmail(rs.getString("s_email"));
				bean.setSection(rs.getString("s_section"));
				bean.setLocation(rs.getString("s_location"));
				list.add(bean);
			}
			
		} catch (Exception e) {
			System.out.println("Exception in FindAll");
		}
		
		return list;
	}
}
