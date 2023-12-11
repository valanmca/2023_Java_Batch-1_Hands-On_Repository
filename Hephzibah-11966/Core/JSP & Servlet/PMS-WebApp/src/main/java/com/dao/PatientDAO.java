package com.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.bean.Patient;
import com.util.PatientDBUtil;

public class PatientDAO {
	
	public int insertPatient(Patient bean) {
		int n=0;
		try {
			Connection con=PatientDBUtil.getDBConnection();
			String sql= "insert into tbl_patient values(?,?,?,?,?,?)";
			
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,bean.getId());
			ps.setString(2, bean.getName());
			ps.setInt(3, bean.getAge());
			ps.setString(4, bean.getEmail());
			ps.setString(5, bean.getBloodGroup());
			ps.setString(6, bean.getLocation());
			
			n=ps.executeUpdate();	
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return n;
		
	}
	
	public int updatePatient(Patient bean) {
		int n=0;
		try {
			Connection con=PatientDBUtil.getDBConnection();
			String sql= "update tbl_patient set Name=?, Age=?, Email=?, BloodGroup=?, Location? where Id=?";
			
			PreparedStatement ps=con.prepareStatement(sql);
			
			
			ps.setString(1, bean.getName());
			ps.setInt(2, bean.getAge());
			ps.setString(3, bean.getEmail());
			ps.setString(4, bean.getBloodGroup());
			ps.setString(5, bean.getLocation());
			ps.setInt(6,bean.getId());
			
			n=ps.executeUpdate();	
		}
		catch(Exception e) {
			System.out.println("Exception in update");
		}
		return n;
		
	}
	
	public int deletePatient(int id) {
		int n=0;
		
		try {
			Connection con=PatientDBUtil.getDBConnection();
			String sql= "delete from tbl_patient where Id=?";
			
			PreparedStatement ps=con.prepareStatement(sql);
				
			ps.setInt(1,id);
			
			n=ps.executeUpdate();
		}
		
		catch (Exception e){
			System.out.println("Exception in deletion");
		}
		
		return n;
	}
	
	public Patient findPatient(int id) {
		Patient bean=null;
		
		try {
			Connection con=PatientDBUtil.getDBConnection();
			String sql= "select * from tbl_patient where Id=?";
			
			PreparedStatement ps=con.prepareStatement(sql);
				
			ps.setInt(1,id);
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next()) {
				bean=new Patient();
				bean.setId(rs.getInt("Id"));
				bean.setName(rs.getString("Name"));
				bean.setAge(rs.getInt("Age"));
				bean.setEmail(rs.getString("Email"));
				bean.setBloodGroup(rs.getString("BloodGroup"));
				bean.setLocation(rs.getString("Location"));
			}
		}
		catch (Exception e){
			System.out.println("Exception in find");	
			
		}
		return bean;
	}
	
	public List<Patient> findAllPatient(){
	List<Patient> list=new LinkedList<Patient>();
	
	try {
		Connection con=PatientDBUtil.getDBConnection();
		String sql= "select * from tbl_patient";
		
		Statement st=con.createStatement();
			
		
		ResultSet rs= st.executeQuery(sql);
		
		while(rs.next()) {
			Patient bean=new Patient();
			bean.setId(rs.getInt("Id"));
			bean.setName(rs.getString("Name"));
			bean.setAge(rs.getInt("Age"));
			bean.setEmail(rs.getString("Email"));
			bean.setBloodGroup(rs.getString("BloodGroup"));
			bean.setLocation(rs.getString("Location"));
			list.add(bean);
		}
		
	}
	catch (Exception e){
		System.out.println("Exception in find");	
		
	}
	return list;
	
	}
}
