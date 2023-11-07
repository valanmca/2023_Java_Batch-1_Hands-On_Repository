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
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "insert into tbl_Student1 values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, bean.getId());
			ps.setString(2, bean.getName());
			ps.setInt(4, bean.getDepart());
			n = ps.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public int deleteStudent(int id) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "delete from tbl_Student1 where stud_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
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
			String sql = "update tbl_Student1 set stud_name = ?, depart = ? where stud_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(4, bean.getId());
			ps.setString(1, bean.getName());
			ps.setInt(3, bean.getDepart());
			n = ps.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public Student findStudent(int id) {
		Student emp = null;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from tbl_Student1 where stud_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				emp = new Student();
				emp.setId(rs.getInt("stud_id"));
				emp.setName(rs.getString("stud_name"));
				emp.setDepart(rs.getInt("dno"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return emp;
	}

	public List<Student> findAllStudent() {
		List<Student> list = new ArrayList<Student>();
		
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from tbl_Student1";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			

			while (rs.next()) {
				Student bean = new Student();
				bean.setId(rs.getInt("stud_id"));
				bean.setName(rs.getString("stud_name"));
				bean.setDepart(rs.getInt("depart"));
				list.add(bean);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;

	}

}
