package com.tms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tms.model.Teacher;
import com.tms.util.DBUtil;

public class TeacherDAO {

	public int insertTeacher(Teacher model) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "insert into teacherdet values(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, model.getTeacherId());
			ps.setString(2, model.getTeacherName());
			ps.setString(3, model.getTeacherEmail());
			ps.setString(4, model.getTeacherQualification());
			ps.setString(5, model.getTeacherLocation());
			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public int deleteTeacher(int teach_id) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "delete from teacherdet where teach_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, teach_id);

			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public int updateTeacher(Teacher model) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "update teacherdet set teach_name=?,teach_email=?,teach_qual=?,teach_loc=? where teach_id=? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(5, model.getTeacherId());
			ps.setString(1, model.getTeacherName());
			ps.setString(2, model.getTeacherEmail());
			ps.setString(3, model.getTeacherQualification());
			ps.setString(4, model.getTeacherLocation());
			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public Teacher findTeacher(int teacherId) {
		Teacher bean1 = null;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from teacherdet where teach_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, teacherId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				bean1 = new Teacher(teacherId, sql, sql, sql, sql);
				bean1.setTeacherId(rs.getInt("teach_id"));
				bean1.setTeacherName(rs.getString("teach_name"));
				bean1.setTeacherEmail(rs.getString("teach_email"));
				bean1.setTeacherQualification(rs.getString("teach_qual"));
				bean1.setTeacherLocation(rs.getString("teach_loc"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return bean1;
	}

	public List<Teacher> findAllTeacher() {
		List<Teacher> list = new ArrayList<Teacher>();
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from teacherdet";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Teacher bean = new Teacher(0, sql, sql, sql, sql);
				bean.setTeacherId(rs.getInt("teach_id"));
				bean.setTeacherName(rs.getString("teach_name"));
				bean.setTeacherEmail(rs.getString("teach_email"));
				bean.setTeacherQualification(rs.getString("teach_qual"));
				bean.setTeacherLocation(rs.getString("teach_loc"));
				list.add(bean);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

}
