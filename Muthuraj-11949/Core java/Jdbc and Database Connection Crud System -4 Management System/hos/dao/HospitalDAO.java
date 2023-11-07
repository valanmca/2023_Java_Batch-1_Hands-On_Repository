package com.hos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;
import com.hos.bean.hospital;
import com.hos.util.DBUtil;

public class HospitalDAO {
		public int inserthosptial(hospital bean) {
	        int n1 = 0;
	        try {

	            Connection con = DBUtil.getDBConnection();
	            String sql = "insert into patient values (?,?,?)";
	            PreparedStatement ps = con.prepareStatement(sql);

	            ps.setString(1, bean.getAddress());

	            ps.setString(2, bean.getName());
	            ps.setInt(3, bean.getId());

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
	            String sql = "delete from patient where id = ? ";
	            PreparedStatement ps = con.prepareStatement(sql);

	            ps.setInt(1, id);
	            n2 = ps.executeUpdate();

	        } catch (Exception e) {

	            System.out.println(e);
	        }
	        return n2;
	    }

	    public int updateStudent(hospital bean) {
	        int n3 = 0;

	        try {
	            Connection con = DBUtil.getDBConnection();
	            String sql = "UPDATE patient SET name = ? WHERE id = ?";
	            PreparedStatement ps = con.prepareStatement(sql);

	            ps.setString(1, bean.getAddress());

	            ps.setString(2, bean.getName());
	            ps.setInt(3, bean.getId());
	            
	            n3 = ps.executeUpdate();

	        } catch (Exception e) {
	            System.out.println(e);
	        }
	        return n3;
	    }
	    public hospital findStudent(int Id) {
	        hospital bean = null;

	        try {
	            Connection con = DBUtil.getDBConnection();
	            String sql = "Select * from  where id = ? ";
	            PreparedStatement ps = con.prepareStatement(sql);
	            ps.setInt(1, Id);
	            ResultSet rs = ps.executeQuery();

	            if (rs.next()) {
	                bean = new hospital();
	                bean.setId(rs.getInt("id"));
	                bean.setName(rs.getString("name"));
	                bean.setName(rs.getString("address"));

	            
	            }
	            rs.close();
	        }

	        catch (Exception e) {

	            System.out.println(e);
	        }

	        return bean;
	    }

	    public List<hospital> findAllStudent1() {
	        hospital bean = null;
	        List<hospital> list = new LinkedList<hospital>();
	        try {
	            Connection con = DBUtil.getDBConnection();
	            String sql = "Select * from patient";
	            PreparedStatement ps = con.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();

	            while (rs.next()) {
	                bean = new hospital();
	                bean.setId(rs.getInt("id"));
	                bean.setName(rs.getString("name"));
	                bean.setName(rs.getString("address"));
	                list.add(bean);
	            }

	            rs.close();
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	        return list;
	    }		
		public int inserthospital(hospital insertHospital) {
			// TODO Auto-generated method stub
			return 0;
		}

		public List<hospital> findAllHospital() {
			// TODO Auto-generated method stub
			return null;
		}

		public int deletehospital(int deleteHospital) {
			// TODO Auto-generated method stub
			return 0;
		}

		public int updatehospital(hospital updateHospital) {
			// TODO Auto-generated method stub
			return 0;
		}

		

		public List<hospital> findAllpatient() {
			// TODO Auto-generated method stub
			return null;
		}

		public hospital findpatient(int id) {
			// TODO Auto-generated method stub
			return null;
		}



	}
