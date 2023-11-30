package com.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sms.bean.StudentServ;
import com.sms.util.DBUtil;

public class StudentDAO {

	public int insertStudent(StudentServ bean) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "insert into tbl_student values(?,?,?)";
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
			String sql = "delete from  tbl_Student where sid=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public int updateStudent(StudentServ stud2) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "update tbl_student set sname=? , sdept=? where sid=?";
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

	public StudentServ findStudent(int id) {
		StudentServ stud1 = null;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from tbl_Student where sid=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				stud1 = new StudentServ(id, sql, sql);
				stud1.setId(rs.getInt("sid"));
				stud1.setName(rs.getString("sname"));
				stud1.setDept(rs.getString("sdept"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return stud1;
	}

	public List<StudentServ> findAllStudent() {
		List<StudentServ> list = new ArrayList<StudentServ>();
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from tbl_student";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				StudentServ bean = new StudentServ(0, sql, sql);
				bean.setId(rs.getInt("sid"));
				bean.setName(rs.getString("sname"));
				bean.setDept(rs.getString("sdept"));
				list.add(bean);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}
}
