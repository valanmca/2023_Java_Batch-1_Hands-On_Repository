package com.vms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.vms.bean.Vehicle;
import com.vms.util.DbUtil;

public class VehicleDAO {

	public int insertVehicle(Vehicle bean) {
		int n = 0;
		try {
			Connection con = DbUtil.getDBConnection();
			String sql = "Insert into tbl_vehicles values(?,?,?)";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, bean.getNo());
			ps.setString(2, bean.getBrandname());
			ps.setFloat(3, bean.getMileage());

			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}

		return n;
	}

	public int deleteVehicle(int v_no) {
		int n = 0;
		try {
			Connection con = DbUtil.getDBConnection();
			String sql = "Delete from tbl_vehicles where v_no = ?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, v_no);

			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public int UpdateVehicle(Vehicle bean) {
		int n = 0;
		try {
			Connection con = DbUtil.getDBConnection();
			String sql = "Update tbl_vehicles set v_brand = ?, v_mileage = ? where v_no = ?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bean.getBrandname());
			ps.setFloat(2, bean.getMileage());
			ps.setInt(3, bean.getNo());

			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public Vehicle viewVehicle(int v_no) {
		Vehicle bean = null;
		try {
			Connection con = DbUtil.getDBConnection();
			String sql = "select * from tbl_vehicles where v_no = ?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, v_no);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				bean = new Vehicle();
				bean.setNo(rs.getInt("v_no"));
				bean.setBrandname(rs.getString("v_brand"));
				bean.setMileage(rs.getFloat("v_mileage"));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return bean;
	}

	public List<Vehicle> viewAllVehicle() {
		List<Vehicle> list = new ArrayList<Vehicle>();
		try {
			Connection con = DbUtil.getDBConnection();
			String sql = "select * from tbl_vehicles";

			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Vehicle bean = new Vehicle();
				bean.setNo(rs.getInt("v_no"));
				bean.setBrandname(rs.getString("v_brand"));
				bean.setMileage(rs.getFloat("v_mileage"));
				list.add(bean);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

}
