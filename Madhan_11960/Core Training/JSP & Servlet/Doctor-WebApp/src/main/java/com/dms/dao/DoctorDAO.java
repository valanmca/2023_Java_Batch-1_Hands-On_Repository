package com.dms.dao;

	
	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.Statement;
	import java.util.LinkedList;
	import java.util.List;

	import com.dms.bean.Doctor;
	import com.dms.util.DoctorDBUtil;

	public class DoctorDAO {
		
		public int insertDoctor(Doctor bean) {
			int n=0;
			try {
				Connection con=DoctorDBUtil.getDBConnection();
				String sql= "insert into tbl_doctordet values(?,?,?,?,?,?,?)";
				
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1,bean.getDoctorId());
				ps.setString(2, bean.getDoctorName());
				ps.setInt(3, bean.getDoctorAge());
				ps.setString(4, bean.getDoctorEmail());
				ps.setString(5, bean.getDoctorSpecialization());
				ps.setString(6, bean.getDoctorContact());
				ps.setString(7, bean.getDoctorLocation());
				
				n=ps.executeUpdate();	
			}
			catch(Exception e) {
				System.out.println(e);
			}
			return n;
			
		}
		
		public int updateDoctor(Doctor bean) {
			int n=0;
			try {
				Connection con=DoctorDBUtil.getDBConnection();
				String sql= "update tbl_doctordet set  Doctor_Name=?, Doctor_Age=?, Doctor_Email=?, Doctor_Specialist=?, Doctor_Contact=?, Doctor_location=? where Doctor_Id=?";
				
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(7,bean.getDoctorId());
				ps.setString(1, bean.getDoctorName());
				ps.setInt(2, bean.getDoctorAge());
				ps.setString(3, bean.getDoctorEmail());
				ps.setString(4, bean.getDoctorSpecialization());
				ps.setString(5, bean.getDoctorContact());
				ps.setString(6, bean.getDoctorLocation());
				
				n=ps.executeUpdate();	
			}
			catch(Exception e) {
				System.out.println(e);
			}
			return n;
			
		}
		
		public int deleteDoctor(int Doctor_Id) {
			int n=0;
			
			try {
				Connection con=DoctorDBUtil.getDBConnection();
				String sql= "delete from tbl_doctordet where Doctor_Id=?";
				
				PreparedStatement ps=con.prepareStatement(sql);
					
				ps.setInt(1,Doctor_Id);
				
				n=ps.executeUpdate();
			}
			
			catch (Exception e){
				System.out.println("Exception in deletion");
			}
			
			return n;
		}
		
		public Doctor findDoctor(int Doctor_Id) {
			Doctor bean=null;
			
			try {
				Connection con=DoctorDBUtil.getDBConnection();
				String sql= "select * from tbl_doctordet where Doctor_Id=?";
				
				PreparedStatement ps=con.prepareStatement(sql);
					
				ps.setInt(1,Doctor_Id);
				
				ResultSet rs= ps.executeQuery();
				
				if(rs.next()) {
					bean=new Doctor();
					bean.setDoctorId(rs.getInt("Doctor_Id"));
					bean.setDoctorName(rs.getString("Doctor_Name"));
					bean.setDoctorAge(rs.getInt("Doctor_Age"));
					bean.setDoctorEmail(rs.getString("Doctor_Email"));
					bean.setDoctorSpecialization(rs.getString("Doctor_Specialist"));
					bean.setDoctorContact(rs.getString("Doctor_Contact"));
					bean.setDoctorLocation(rs.getString("Doctor_location"));
				}
			}
			catch (Exception e){
				System.out.println("Exception in find");	
				
			}
			return bean;
		}
		
		public List<Doctor> findAllDoctor(){
		List<Doctor> list=new LinkedList<Doctor>();
		
		try {
			Connection con=DoctorDBUtil.getDBConnection();
			String sql= "select * from tbl_doctordet";
			
			Statement st=con.createStatement();
				
			
			ResultSet rs= st.executeQuery(sql);
			
			while(rs.next()) {
				Doctor bean=new Doctor();
				bean.setDoctorId(rs.getInt("Doctor_Id"));
				bean.setDoctorName(rs.getString("Doctor_Name"));
				bean.setDoctorAge(rs.getInt("Doctor_Age"));
				bean.setDoctorEmail(rs.getString("Doctor_Email"));
				bean.setDoctorSpecialization(rs.getString("Doctor_Specialist"));
				bean.setDoctorContact(rs.getString("Doctor_Contact"));
				bean.setDoctorLocation(rs.getString("Doctor_location"));
				list.add(bean);
			}
			
		}
		catch (Exception e){
			System.out.println("Exception in find");	
			
		}
		return list;
		
		}
}


