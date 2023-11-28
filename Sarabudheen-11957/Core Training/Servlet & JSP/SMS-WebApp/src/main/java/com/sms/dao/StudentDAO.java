package com.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

import com.sms.bean.Students;
import com.sms.util.DBUtil;

public class StudentDAO {

	public int InsertStudent(Students bean) {

		int n = 0;

		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "Insert into Student_details values (?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, bean.getStudentId());
			ps.setString(2, bean.getStudentName());
			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public int deleteStudent(int studentId) {
		int n = 0;

		try {

			Connection con = DBUtil.getDBConnection();
			String sql = "delete from student_details where student_id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, studentId);
			n = ps.executeUpdate();

		} catch (Exception e) {

			System.out.println(e);
		}
		return n;
	}

	public int updateStudent(Students bean) {
		int n = 0;

		try {

			Connection con = DBUtil.getDBConnection();
			String sql = "UPDATE student_details SET Student_name = ? WHERE student_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, bean.getStudentName());
			ps.setInt(2, bean.getStudentId());
			n = ps.executeUpdate();

		} catch (Exception e) {

			System.out.println(e);
		}
		return n;

	}

	public Students findStudent(int studentId) {
		Students bean = null;

		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "Select * from student_details where Student_id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, studentId);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				bean = new Students();
				bean.setStudentId(rs.getInt("student_Id"));
				bean.setStudentName(rs.getString("Student_Name"));

			}
			rs.close();
		}

		catch (Exception e) {

			System.out.println(e);
		}

		return bean;
	}

	public List<Students> findAllStudent() {
		Students bean = null;
		List<Students> list = new LinkedList<Students>();
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "Select * from student_details";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				bean = new Students();
				bean.setStudentId(rs.getInt("student_Id"));
				bean.setStudentName(rs.getString("student_Name"));
				list.add(bean);
			}

			rs.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

}
