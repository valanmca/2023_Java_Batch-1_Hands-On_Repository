package com.emp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

import com.emp.bean.Employee;
import com.emp.util.DBUtil;

public class EmployeeDAO {
	public int insertEmployee(Employee bean) {
        int n1 = 0;
        try {
            Connection con = DBUtil.getDBConnection();
            String sql = "insert into Emp2 values (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, bean.getId());
            ps.setString(2, bean.getName());
            ps.setFloat(3, (int) bean.getSalary());
            ps.setString(4, bean.getAddress());
            ps.setString(5,bean.getPosition());
            n1 = ps.executeUpdate();
        } catch (Exception e) {

            System.out.println(e);
        }
        return n1;
    }
    public int deleteEmployee(int Id) {
        int n2 = 0;
        try {
            Connection con = DBUtil.getDBConnection();
            String sql = "delete from Emp2 where empID = ? ";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, Id);
            n2 = ps.executeUpdate();
        } catch (Exception e) {

            System.out.println(e);
        }
        return n2;
    }
    public int updateEmployee(Employee bean) {
        int n3 = 0;

        try {

            Connection con = DBUtil.getDBConnection();
            String sql = "UPDATE Emp2 SET empname = ? WHERE empID = ?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, bean.getId());
            ps.setString(2, bean.getName());
            ps.setFloat(3, bean.getSalary());
            ps.setString(4, bean.getAddress());
            ps.setString(5,bean.getPosition());
            n3 = ps.executeUpdate();

        } catch (Exception e) {

            System.out.println(e);
        }
        return n3;

    }

    public Employee findEmployee(int empID) {
        Employee bean = null;

        try {
            Connection con = DBUtil.getDBConnection();
            String sql = "Select * from Emp2 where empID= ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, empID);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                bean = new Employee();
                bean.setId(rs.getInt("id"));
                bean.setName(rs.getString("name"));
            
            }
            rs.close();
        }

        catch (Exception e) {

            System.out.println(e);
        }

        return bean;
    }

    public List<Employee> findAllEmployee() {
        Employee bean = null;
        List<Employee> list = new LinkedList<Employee>();
        try {
            Connection con = DBUtil.getDBConnection();
            String sql = "Select * from Emp2";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                bean = new Employee();
                bean.setId(rs.getInt("empId"));
                bean.setName(rs.getString("empname"));
                bean.setSalary(rs.getFloat("empSalary"));
                bean.setAddress(rs.getString("empAddress"));
               bean.setPosition(rs.getString("empPosition"));//// database 
                list.add(bean);
            }
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }}
