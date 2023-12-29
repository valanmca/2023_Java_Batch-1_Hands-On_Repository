package com.pms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import com.pms.bean.Product;
import com.pms.util.DBUtil;

public class ProductDAO {

	public  int insertProduct(Product bean) {
		int n=0;
		try {
		Connection con = DBUtil.getDBConnection();
		String sql="insert into tbl_Product values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, bean.getpId());
		ps.setString(2,bean.getpName() );
		ps.setInt(3,bean.getpQnt() );
		ps.setInt(4, bean.getpPrice());
		n = ps.executeUpdate();
		}catch(Exception e){
			System.out.println(e);
		}
		return n;
		
	}
	
	
	
	public  int updateProduct(Product bean) {
		int n=0;
		try {
		Connection con = DBUtil.getDBConnection();
		String sql="update tbl_Product set pro_name=?,pro_qnt=?,pro_price =? where pro_id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,bean.getpName() );
		ps.setInt(2,bean.getpQnt() );
		ps.setInt(3, bean.getpPrice());
		ps.setInt(4, bean.getpId());
		n = ps.executeUpdate();
		}catch(Exception e){
			System.out.println(e);
		}
		return n;

	}
	
	public  int deleteProduct(int id) {
		int n=0;
		try {
		Connection con = DBUtil.getDBConnection();
		String sql="delete from tbl_Product where pro_id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		n = ps.executeUpdate();
		}catch(Exception e){
			System.out.println(e);
		}
		
		return n;
	}
	
	public Product findProduct(int id) {
		Product bean=null;
//		int n=0;
		try {
		Connection con = DBUtil.getDBConnection();
		String sql="select * from tbl_product where pro_id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs= ps.executeQuery();
		
		if(rs.next()) {
			bean = new Product();
			bean.setpId(rs.getInt("pro_id"));
			bean.setpName(rs.getString("pro_name"));
			bean.setpQnt(rs.getInt("pro_qnt"));
			bean.setpPrice(rs.getInt("pro_price"));
		}
		
		}catch(Exception e){
			System.out.println(e);
		}
		
		return bean;
	} 

	public List<Product> findAllProduct() {
	    List<Product> list = new ArrayList<Product>();
	      
	       try {
	           Connection con = DBUtil.getDBConnection();
	           String sql = "select * from tbl_product";
	           PreparedStatement ps = con.prepareStatement(sql);
	           ResultSet rs = ps.executeQuery();
	           while(rs.next()) {
	               Product bean =new Product();
	               bean.setpId(rs.getInt("pro_id"));
	   			   bean.setpName(rs.getString("pro_name"));
	   			   bean.setpQnt(rs.getInt("pro_qnt"));
	   			   bean.setpPrice(rs.getInt("pro_price"));
	               list.add(bean);
	               
	           }
	       }catch(Exception e) {
	           System.out.println(e);
	       }
	       return list;
	}

}
