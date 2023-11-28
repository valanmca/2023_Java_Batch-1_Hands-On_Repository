 package com.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

import com.sms.bean.StudentBean;
import com.sms.util.DBUtil;

public class StudentDAO {
	//insert
	public int insertStudent(StudentBean bean)  {
		int n=0;
		
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "insert into tbl_Student_details values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, bean.getsId());
			ps.setString(2, bean.getsName());
			ps.setString(3, bean.getsDept());
			n = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return n;
		
	}
	//update
	public int updateStudent(StudentBean bean) {
		int n=0;
		 
		try {
			Connection	con = DBUtil.getDBConnection();
			String sql = "update tbl_Student_details set sname = ?, sdept = ? where sid = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, bean.getsName());
			ps.setString(2, bean.getsDept());
			ps.setInt(3, bean.getsId());
			n=ps.executeUpdate();
		}  catch (Exception e) {
			e.printStackTrace();
		}
		
		return n;
		
	}
	//delete
	public int deleteStudent(int i){
		int n=0;
		Connection con;
		try {
			con = DBUtil.getDBConnection();
			String sql = "delete from tbl_Student_details where sid = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, i);
			n=ps.executeUpdate();	
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return n;
	}
	//find
	public StudentBean findStudent(int id){
		StudentBean emp = null;
		Connection con;
		try {
			con = DBUtil.getDBConnection();
			String sql = "select * from tbl_Student_details where sid = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				emp = new StudentBean();
				emp.setsId(rs.getInt("sid"));//database name
				emp.setsName(rs.getString("sname"));
				emp.setsDept(rs.getString("sdept"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return emp;
	}
	//view
	public List <StudentBean> viewStudent(){
		List <StudentBean> list = new LinkedList <StudentBean> ();
		Connection con;
		try {
			con = DBUtil.getDBConnection();
			String sql = "select * from tbl_Student_details";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				StudentBean obj = new StudentBean();
				obj.setsId(rs.getInt("sid"));
				obj.setsName(rs.getString("sname"));
				obj.setsDept(rs.getString("sdept"));
				list.add(obj);
			}
		}  catch (Exception e) {
			e.printStackTrace();
		} 
		
		return list;		
		}
}
