package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.student.bean.Student;
import com.student.util.DButil;

public class StudentDAO {

	public int insertStudent(Student bean) {
		int n = 0;
		try {
			Connection con = DButil.getDbConnection();
			String sql = "insert into tbl_Student values(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, bean.getRollNo());
			ps.setString(2, bean.getStudentName());
			ps.setString(3, bean.getStudentEmail());
			ps.setString(4, bean.getSection());
			ps.setString(5, bean.getLocation());
			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public int deleteStudent(int rno) {
		int n = 0;
		try {
			Connection con = DButil.getDbConnection();
			String sql = "delete from tbl_Student where Rollno=(?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, rno);
			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;

	}

	public int updateStudent(Student bean) {
		int n = 0;
		try {
			Connection con = DButil.getDbConnection();
			String sql = "update tbl_Student set Studentname=?,Studentemail=?,Section=?,Location=? where Rollno=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bean.getStudentName());
			ps.setString(2, bean.getStudentEmail());
			ps.setString(3, bean.getSection());
			ps.setString(4, bean.getLocation());
			ps.setInt(5, bean.getRollNo());
			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public Student findStudent(int Id) {
		Student bean = null;
		try {
			Connection con = DButil.getDbConnection();
			String sql = "select * from tbl_Student where Rollno=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, Id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				bean = new Student();
				bean.setRollNo(rs.getInt("Rollno"));
				bean.setStudentName(rs.getString("Studentname"));
				bean.setStudentEmail(rs.getString("Studentemail"));
				bean.setSection(rs.getString("Section"));
				bean.setSection(rs.getString("Location"));
			}

		} catch (Exception e) {
			System.out.println(e);

		}
		return bean;

	}

	public List<Student> findallStudent() {
		List<Student> list = new ArrayList<Student>();
		try {
			Connection con = DButil.getDbConnection();
			String sql = "select * from tbl_Student";
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Student bean = new Student();
				bean.setRollNo(rs.getInt("Rollno"));
				bean.setStudentName(rs.getString("Studentname"));
				bean.setStudentEmail(rs.getString("Studentemail"));
				bean.setSection(rs.getString("Section"));
				bean.setSection(rs.getString("Location"));
				list.add(bean);
			}

		} catch (Exception e) {
			System.out.println(e);

		}
		return list;
	}

}
