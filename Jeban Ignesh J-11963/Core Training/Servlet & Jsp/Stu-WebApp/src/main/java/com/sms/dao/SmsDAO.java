package com.sms.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sms.bean.Sms;

import com.sms.util.DButil;

public class SmsDAO {

	public int insertStudent(Sms bean) {
		int n = 0;
		try {
			Connection con = DButil.getDbConnection();
			String sql = "insert into tbl_Student values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, bean.getRollno());
			ps.setString(2, bean.getStudentname());
			ps.setString(3, bean.getStudentemail());
			ps.setString(4, bean.getSection());
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

	public int updateStudent(Sms bean) {
		int n = 0;
		try {
			Connection con = DButil.getDbConnection();
			String sql = "update tbl_Student set Studentname=?,Studentemail=?,Section=? where Rollno=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bean.getStudentname());
			ps.setString(2, bean.getStudentemail());
			ps.setString(3, bean.getSection());
			ps.setInt(4, bean.getRollno());
			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public Sms findStudent(int Id) {
		Sms bean = null;
		try {
			Connection con = DButil.getDbConnection();
			String sql = "select * from tbl_Student where Rollno=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, Id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				bean = new Sms();
				bean.setRollno(rs.getInt("Rollno"));
				bean.setStudentname(rs.getString("Studentname"));
				bean.setStudentemail(rs.getString("Studentemail"));
				bean.setSection(rs.getString("Section"));
			}

		} catch (Exception e) {
			System.out.println(e);

		}
		return bean;

	}

	public List<Sms> findallStudent() {
		List<Sms> list = new ArrayList<Sms>();
		try {
			Connection con = DButil.getDbConnection();
			String sql = "select * from tbl_Student";
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Sms bean = new Sms();
				bean.setRollno(rs.getInt("Rollno"));
				bean.setStudentname(rs.getString("Studentname"));
				bean.setStudentemail(rs.getString("Studentemail"));
				bean.setSection(rs.getString("Section"));
				list.add(bean);
			}

		} catch (Exception e) {
			System.out.println(e);

		}
		return list;
	}

}

