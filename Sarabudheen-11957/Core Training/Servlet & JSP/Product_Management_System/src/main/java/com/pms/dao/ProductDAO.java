package com.pms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

import com.pms.bean.Products;
import com.pms.util.DBUtil;

public class ProductDAO {

	public int insertProduct(Products bean) {
		int n = 0;
		try {

			Connection con = DBUtil.getDBConnection();
			String sql = "insert into products_details values (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, bean.getProductId());
			ps.setString(2, bean.getProductName());
			ps.setInt(3, bean.getProductQuantity());
			ps.setFloat(4, bean.getProductPrice());
			n = ps.executeUpdate();

		} catch (Exception e) {

			System.out.println(e);
		}

		return n;
	}

	public int updateProduct(Products bean) {
		int n = 0;

		try {

			Connection con = DBUtil.getDBConnection();
			String sql = "UPDATE products_details SET Product_Name = ?, Product_Quantity = ? , Product_price =?  WHERE Product_Id = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(4, bean.getProductId());
			ps.setString(1, bean.getProductName());
			ps.setInt(2, bean.getProductQuantity());
			ps.setFloat(3, bean.getProductPrice());
			n = ps.executeUpdate();

		} catch (Exception e) {

			System.out.println(e);
		}
		return n;

	}

	public int deleteProduct(int Product_Id) {
		int n = 0;

		try {

			Connection con = DBUtil.getDBConnection();
			String sql = "delete from products_details where Product_Id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, Product_Id);
			n = ps.executeUpdate();

		} catch (Exception e) {

			System.out.println(e);
		}
		return n;
	}

	public Products findProduct(int Product_Id) {
		Products bean = null;

		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "Select * from products_details where Product_Id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, Product_Id);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				bean = new Products();
				bean.setProductId(rs.getInt("Product_Id"));
				bean.setProductName(rs.getString("Product_Name"));
				bean.setProductQuantity(rs.getInt("Product_Quantity"));
				bean.setProductPrice(rs.getFloat("Product_Price"));

			}
			rs.close();
		}

		catch (Exception e) {

			System.out.println(e);
		}

		return bean;
	}

	public List<Products> findAllProducts() {
		Products bean = null;
		List<Products> list = new LinkedList<Products>();
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "Select * from products_details";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				bean = new Products();
				bean.setProductId(rs.getInt("Product_Id"));
				bean.setProductName(rs.getString("Product_Name"));
				bean.setProductQuantity(rs.getInt("Product_Quantity"));
				bean.setProductPrice(rs.getFloat("Product_Price"));
				list.add(bean);
			}

			rs.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

}
