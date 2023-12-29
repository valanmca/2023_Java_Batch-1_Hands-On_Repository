package com.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.ems.bean.Mobile;
import com.ems.util.DBUtil;

public class MobileDAO {
//Insert
	public int insertMobile(Mobile bean) {
	int n =0;
	try {
		Connection con = DBUtil.getDBConnection();
		String sql = "insert into tbl_msms values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, bean.getMobId());
		ps.setString(2, bean.getBrandName());
		ps.setString(3, bean.getModelName());
		ps.setInt(4, bean.getMobPrice());
		n = ps.executeUpdate();
		
	}catch(Exception e) {
		System.out.println(e);
	}
	return n;
	}
	
//Delete 
	
	public int deleteMobile(int id) {
		int n =0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "delete from tbl_msms Where mobId = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			n = ps.executeUpdate();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return n;
	}
	
//Update
	public int updateMobile(Mobile bean) {
		int n =0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "update tbl_msms set brandName = ?,modelName =?,mobPrice=? Where mobId = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bean.getBrandName());
			ps.setString(2, bean.getModelName());
			ps.setInt(3, bean.getMobPrice());
			ps.setInt(4, bean.getMobId());
			n = ps.executeUpdate();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return n;
		}
//	Find
	
	public Mobile findMobile(int id) {
		Mobile bean =null;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from tbl_msms Where mobId = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				bean = new Mobile();
				bean.setMobId(rs.getInt("mobId"));
				bean.setBrandName(rs.getString("brandName"));
				bean.setBrandName(rs.getString("modelName"));
				bean.setMobPrice(rs.getInt("mobPrice"));
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return bean;
	}
	
//	Find all
	public List<Mobile> findAllMobile() {
	    List<Mobile> list = new ArrayList<Mobile>();
	      
	       try {
	           Connection con = DBUtil.getDBConnection();
	           String sql = "select * from tbl_msms";
	           PreparedStatement ps = con.prepareStatement(sql);
	           ResultSet rs = ps.executeQuery();
	           while(rs.next()) {
	               Mobile bean =new Mobile();
	               bean.setMobId(rs.getInt("mobId"));
	               bean.setBrandName(rs.getString("brandName"));
	               bean.setBrandName(rs.getString("modelName"));
	               bean.setMobPrice(rs.getInt("mobPrice"));
	               list.add(bean);
	               
	           }
	       }catch(Exception e) {
	           System.out.println(e);
	       }
	       return list;
	}
}

