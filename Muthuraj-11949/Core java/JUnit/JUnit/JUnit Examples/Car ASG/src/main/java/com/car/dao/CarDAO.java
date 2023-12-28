package com.car.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

import com.car.bean.Car;
import com.util.DBUtil;

public class CarDAO {
	public int insertCar(Car bean) {
        int n1 = 0;
        try {
            Connection con = DBUtil.getDBConnection();
            String sql = "insert into Car values (?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1,bean.getNo());
            ps.setString(2,bean.getMan());
            ps.setString(3,bean.getMod());
            ps.setInt(4, bean.getKms());
            ps.setInt(5,bean.getPrice());
            ps.setInt(6,bean.getNoOfOwn());

            n1 = ps.executeUpdate();
        } catch (Exception e) {

            System.out.println(e);
        }
        return n1;
    }}
//    public int deleteCustomer(int Id) {
//        int n2 = 0;
//        try {
//            Connection con = DBUtil.getDBConnection();
//            String sql = "delete from car where cusID = ? ";
//            PreparedStatement ps = con.prepareStatement(sql);
//
//            ps.setInt(1, Id);
//            n2 = ps.executeUpdate();
//        } catch (Exception e) {
//
//            System.out.println(e);
//        }
//        return n2;
//    }
//    public int updateCar(Car bean) {
//        int n3 = 0;
//        try {
//            Connection con = DBUtil.getDBConnection();
//            String sql = "UPDATE Cus4 SET cusname=?,cusEmail = ?,cusContactNumber=?, cusLocation= ? WHERE cusID =?";
//            PreparedStatement ps = con.prepareStatement(sql);            
//            ps.setString(1, bean.getNo());
//            ps.setString(2, bean.getMan());
//            ps.setString(3,  bean.getMod());
//            ps.setInt(4, bean.getKms());
//            ps.setInt(5,bean.getPrice());
//            ps.setInt(6,bean.getNoOfOwn());
//            n3 = ps.executeUpdate();
//
//        } catch (Exception e) {
//
//            System.out.println(e);
//        }
//        return n3;
//    }
//
//}
