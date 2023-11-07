package com.stu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

import com.stu.bean.student;
import com.stu.util.DBUtil;

public class StudentDAO {



		public int insertStudent(student bean) {
	        int n1 = 0;
	        try {

	            Connection con = DBUtil.getDBConnection();
	            String sql = "insert into student1 values (?,?)";
	            PreparedStatement ps = con.prepareStatement(sql);

	            ps.setInt(1, bean.getId());
	            ps.setString(2, bean.getName());
	            n1 = ps.executeUpdate();

	        } catch (Exception e) {

	            System.out.println(e);
	        }

	        return n1;
	    }

	    public int deleteStudent(int id) {
	        int n2 = 0;

	        try {

	            Connection con = DBUtil.getDBConnection();
	            String sql = "delete from student1 where id = ? ";
	            PreparedStatement ps = con.prepareStatement(sql);

	            ps.setInt(1, id);
	            n2 = ps.executeUpdate();

	        } catch (Exception e) {

	            System.out.println(e);
	        }
	        return n2;
	    }

	    public int updateStudent(student bean) {
	        int n3 = 0;

	        try {

	            Connection con = DBUtil.getDBConnection();
	            String sql = "UPDATE student1 SET name = ? WHERE id = ?";
	            PreparedStatement ps = con.prepareStatement(sql);

	            ps.setString(1, bean.getName());
	            ps.setInt(2, bean.getId());
	            n3 = ps.executeUpdate();

	        } catch (Exception e) {

	            System.out.println(e);
	        }
	        return n3;

	    }

	    public student findStudent(int Student_Id) {
	        student bean = null;

	        try {
	            Connection con = DBUtil.getDBConnection();
	            String sql = "Select * from student1 where id = ? ";
	            PreparedStatement ps = con.prepareStatement(sql);
	            ps.setInt(1, Student_Id);
	            ResultSet rs = ps.executeQuery();

	            if (rs.next()) {
	                bean = new student();
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

	    public List<student> findAllStudent1() {
	        student bean = null;
	        List<student> list = new LinkedList<student>();
	        try {
	            Connection con = DBUtil.getDBConnection();
	            String sql = "Select * from student1";
	            PreparedStatement ps = con.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();

	            while (rs.next()) {
	                bean = new student();
	                bean.setId(rs.getInt("id"));
	                bean.setName(rs.getString("name"));
	                list.add(bean);
	            }

	            rs.close();
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	        return list;
	    }		
		public int insertstudent(student insertStudent) {
			// TODO Auto-generated method stub
			return 0;
		}

		public List<student> findAllStudent() {
			// TODO Auto-generated method stub
			return null;
		}

		public int deletestudent(int deleteStudent) {
			// TODO Auto-generated method stub
			return 0;
		}
	}
