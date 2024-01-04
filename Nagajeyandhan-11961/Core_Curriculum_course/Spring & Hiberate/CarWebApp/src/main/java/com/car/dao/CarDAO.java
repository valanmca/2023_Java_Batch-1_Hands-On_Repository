package com.car.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.car.bean.Car;
import com.car.util.DBUtil;

public class CarDAO {

	public int insertCar(Car bean) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String query = "insert into tbl_car values(?,?,?,?,?,?)";

			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, bean.getCarNo());
			pst.setString(2, bean.getManufacture());
			pst.setString(3, bean.getModel());
			pst.setInt(4, bean.getKmsRan());
			pst.setInt(5, bean.getPriceExcepted());
			pst.setInt(6, bean.getNoOfOwners());

			n = pst.executeUpdate();

		} catch (Exception e) {
			System.out.println("Exception in Insertion");
		}
		return n;
	}
}
