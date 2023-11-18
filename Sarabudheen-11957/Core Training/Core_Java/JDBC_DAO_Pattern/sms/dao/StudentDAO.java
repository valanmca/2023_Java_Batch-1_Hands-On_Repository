package com.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.LinkedList;
import java.util.List;

import com.sms.bean.Student;
import com.sms.util.DBUtil;

public class StudentDAO {

	public int insertStudent(Student bean) {
		int n1 = 0;
		try {

			Connection con = DBUtil.getDBConnection();
			String sql = "insert into student_details values (?,?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, bean.getId());
			ps.setString(2, bean.getName());
			n1 = ps.executeUpdate();

		} catch (Exception e) {

			System.out.println(e);
		}

		return n1;
	}

	public int deleteStudent(int Student_Id) {
		int n2 = 0;

		try {

			Connection con = DBUtil.getDBConnection();
			String sql = "delete from student_details where student_id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, Student_Id);
			n2 = ps.executeUpdate();

		} catch (Exception e) {

			System.out.println(e);
		}
		return n2;
	}

	public int updateStudent(Student bean) {
		int n3 = 0;

		try {

			Connection con = DBUtil.getDBConnection();
			String sql = "UPDATE student_details SET Student_name = ? WHERE student_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, bean.getName());
			ps.setInt(2, bean.getId());
			n3 = ps.executeUpdate();

		} catch (Exception e) {

			System.out.println(e);
		}
		return n3;

	}

	public Student findStudent(int Student_Id) {
		Student bean = null;

		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "Select * from student_details where Student_id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, Student_Id);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				bean = new Student();
				bean.setId(rs.getInt("Student_Id"));
				bean.setName(rs.getString("Student_Name"));
			
			}
			rs.close();
		}

		catch (Exception e) {

			System.out.println(e);
		}

		return bean;
	}

	public List<Student> findAllStudent() {
		Student bean = null;
		List<Student> list = new LinkedList<Student>();
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "Select * from student_details";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				bean = new Student();
				bean.setId(rs.getInt("Student_Id"));
				bean.setName(rs.getString("Student_Name"));
				list.add(bean);
			}

			rs.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}
}
