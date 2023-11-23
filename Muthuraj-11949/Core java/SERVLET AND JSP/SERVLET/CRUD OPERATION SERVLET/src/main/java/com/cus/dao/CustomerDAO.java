package com.cus.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

import com.cus.bean.Customer;
import com.cus.util.DBUtil;

public class CustomerDAO {

	public int insertCustomer(Customer bean) {
        int n1 = 0;
        try {
            Connection con = DBUtil.getDBConnection();
            String sql = "insert into Cus4 values (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, bean.getId());
            ps.setString(2, bean.getName());
            ps.setString(3,  bean.getEmail());
            ps.setInt(4, bean.getConNmuber());
            ps.setString(5,bean.getLocation());
            n1 = ps.executeUpdate();
        } catch (Exception e) {

            System.out.println(e);
        }
        return n1;
    }
    public int deleteCustomer(int Id) {
        int n2 = 0;
        try {
            Connection con = DBUtil.getDBConnection();
            String sql = "delete from Cus4 where cusID = ? ";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, Id);
            n2 = ps.executeUpdate();
        } catch (Exception e) {

            System.out.println(e);
        }
        return n2;
    }
    public int updateCustomer(Customer bean) {
        int n3 = 0;
        try {
            Connection con = DBUtil.getDBConnection();
            String sql = "UPDATE Cus4 SET cusname=?,cusEmail = ?,cusContactNumber=?, cusLocation= ? WHERE cusID =?";
            PreparedStatement ps = con.prepareStatement(sql);            
            ps.setString(1, bean.getName());
            ps.setString(2,  bean.getEmail());
            ps.setInt(3, bean.getConNmuber());
            ps.setString(4,bean.getLocation());
            ps.setInt(5, bean.getId());
            n3 = ps.executeUpdate();

        } catch (Exception e) {

            System.out.println(e);
        }
        return n3;
    }
    //FindCustomer:
    public Customer findCustomer(int cusID) {
        Customer bean = null;
        try {
            Connection con = DBUtil.getDBConnection();
            String sql = "select * from Cus4 where cusID= ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cusID);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                bean = new Customer();
                bean.setId(rs.getInt("cusID"));
                bean.setName(rs.getString("cusname"));
                bean.setEmail(rs.getString("cusEmail"));
                bean.setConNumber(rs.getInt("cusContactNumber"));
                bean.setLocation(rs.getString("cusLocation"));//// database 
            }
            rs.close();
        }
        catch (Exception e) {

            System.out.println(e);
        }
        return bean;
    }
    //FindAllCustomer:
    public List<Customer> findAllCustomer() {
        Customer bean = null;
        List<Customer> list = new LinkedList<Customer>();
        try {
            Connection con = DBUtil.getDBConnection();
            String sql = "Select * from Cus4";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                bean = new Customer();
                bean.setId(rs.getInt("cusID"));
                bean.setName(rs.getString("cusname"));
                bean.setEmail(rs.getString("cusEmail"));
                bean.setConNumber(rs.getInt("cusContactNumber"));
                bean.setLocation(rs.getString("cusLocation"));//// database 
                list.add(bean);
            }
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }	
}
