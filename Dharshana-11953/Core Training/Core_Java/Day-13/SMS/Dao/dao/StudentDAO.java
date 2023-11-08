package com.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import com.sms.bean.*;
import com.sms.util.DBUtil;

public class StudentDAO {

	public int insertStudent(Student bean) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "insert into tbl_Student values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, bean.getId());
			ps.setString(2, bean.getName());
			ps.setString(3, bean.getDept());
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
			String sql = "delete from  tbl_Student where stud_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public int updateStudent(Student stud2) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "update tbl_Student set stud_name=? , stud_depart=? where stud_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(3, stud2.getId());
			ps.setString(1, stud2.getName());
			ps.setString(2, stud2.getDept());
			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public Student findStudent(int id) {
		Student stud1 = null;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from tbl_Student where stud_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				stud1 = new Student();
				stud1.setId(rs.getInt("stud_id"));
				stud1.setName(rs.getString("stud_name"));
				stud1.setDept(rs.getString("stud_depart"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return stud1;
	}
	public List<Student> findAllStudent() {
		List<Student> list = new ArrayList<Student>();
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from tbl_Student";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Student bean = new Student();
				bean.setId(rs.getInt("stud_id"));
				bean.setName(rs.getString("stud_name"));
				bean.setDept(rs.getString("stud_depart"));
				list.add(bean);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

		
}
