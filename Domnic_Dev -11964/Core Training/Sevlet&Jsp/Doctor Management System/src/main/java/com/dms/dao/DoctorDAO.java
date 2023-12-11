package com.dms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dms.bean.*;
import com.dms.util.DBUtil;




public class DoctorDAO {

	public int insertDoctor(Doctor bean) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "insert into tbl_Doctor values (?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, bean.getdId());
			ps.setString(2, bean.getdName());
			ps.setInt(3, bean.getdAge());
			ps.setString(4, bean.getdEmail());
			ps.setString(5, bean.getdSpecialization());
			ps.setInt(6, bean.getdPhoneNumber());
			ps.setString(7, bean.getdLocation());
			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}
	
	public int deleteDoctor(int dId) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "delete from tbl_Doctor where d_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, dId);
			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}
	
	public int updateDoctor(Doctor bean) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "update tbl_Doctor set d_name=?, d_age=?, d_email=?, d_specialization=?, d_phno=?, d_loc=? where d_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(7, bean.getdId());
			ps.setString(1, bean.getdName());
			ps.setInt(2, bean.getdAge());
			ps.setString(3, bean.getdEmail());
			ps.setString(4, bean.getdSpecialization());
			ps.setInt(5, bean.getdPhoneNumber());
			ps.setString(6, bean.getdLocation());
			
			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;

	}
	
	public Doctor findDoctor(int id) {
		Doctor bean = null;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from tbl_Doctor where d_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				bean = new Doctor();
				bean.setdId(rs.getInt("d_id"));
				bean.setdName(rs.getString("d_name"));
				bean.setdAge( rs.getInt("d_age"));
				bean.setdEmail(rs.getString("d_email"));
				bean.setdSpecialization(rs.getString("d_specialization"));
				bean.setdPhoneNumber(rs.getInt("d_phno"));
				bean.setdLocation(rs.getString("d_loc"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return bean;
	}
	
	public List<Doctor> findAllDoctor(){
		List<Doctor> list=new ArrayList<Doctor>();
		try {
			Connection con =DBUtil.getDBConnection();
			String sql="select * from table_vehicle";
			PreparedStatement ps=con.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Doctor bean=new Doctor();
				bean.setdId(rs.getInt("d_id"));
				bean.setdName(rs.getString("d_name"));
				bean.setdAge( rs.getInt("d_age"));
				bean.setdEmail(rs.getString("d_email"));
				bean.setdSpecialization(rs.getString("d_specialization"));
				bean.setdPhoneNumber(rs.getInt("d_phno"));
				bean.setdLocation(rs.getString("d_loc"));
				list.add(bean);
			
			}
		}catch(Exception e) {
			System.out.println(e);
		
		}
		return list;
		
	}
	
	public List<Doctor> findAllDoctors(){
		List<Doctor> list=new ArrayList<Doctor>();
		try {
			Connection con =DBUtil.getDBConnection();
			String sql="select * from tbl_Doctor";
			PreparedStatement ps=con.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Doctor bean=new Doctor();
				bean.setdId(rs.getInt("d_id"));
				bean.setdName(rs.getString("d_name"));
				bean.setdAge( rs.getInt("d_age"));
				bean.setdEmail(rs.getString("d_email"));
				bean.setdSpecialization(rs.getString("d_specialization"));
				bean.setdPhoneNumber(rs.getInt("d_phno"));
				bean.setdLocation(rs.getString("d_loc"));
				list.add(bean);
				
			
			}
		}catch(Exception e) {
			System.out.println(e);
		
		}
		return list;
	}
	
	

}
