package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Teacher;
public class TeacherDAO {
private Connection conn;
	public TeacherDAO(Connection conn) {
		super();
		this.conn=conn;
	}
	public boolean addTeacher(Teacher teacher) {
		boolean f=false;
		try {
			 String sql="insert into teacher5(id,teacher_name,experience,qualification,contact,email) values(?,?,?,?,?,?)";
			 PreparedStatement ps=conn.prepareStatement(sql);
			 ps.setInt(1, teacher.getId());
			 ps.setString(2, teacher.getName());
			 ps.setInt(3,teacher.getExperience());
			 ps.setString(4, teacher.getQualification());
			 ps.setInt(5, teacher.getContact());
			 ps.setString(6, teacher.getEmail());
			 int i=ps.executeUpdate();
			 if(i==1) {
				 f=true;
			 }

			 
		}catch (Exception e) {
			e.printStackTrace();
		}
		return f;
		}
	public List<Teacher> getAllTeacher(){
		List<Teacher> list=new ArrayList<Teacher>();
		Teacher s=null;
		try {
			String sql="select * from teacher5";
			 PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
          
             while(rs.next()){
           	  s=new Teacher();
           	  s.setId(rs.getInt(1));
           	  s.setName(rs.getString(2));
           	  s.setExperience(rs.getInt(3));
           	  s.setQualification(rs.getString(4));
           	  s.setContact(rs.getInt(5));
           	  s.setEmail(rs.getString(6));
           	  list.add(s); 
             }
		}catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}	
	public Teacher getTeacherById(int id) {
		Teacher s=null;
		
				try {
			String sql="select * from teacher5 where id=?";
			 PreparedStatement ps = conn.prepareStatement(sql);
			 ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            
             while(rs.next()){
           	  s=new Teacher();
           	  s.setId(rs.getInt(1));
           	  s.setName(rs.getString(2));
           	  s.setExperience(rs.getInt(3));
           	  s.setQualification(rs.getString(4));
           	  s.setContact(rs.getInt(5));
           	  s.setEmail(rs.getString(6));
             }
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
 public Teacher deleteCustomer(int Id) {
		Teacher s=null;

	     try {
            String sql = "delete from Cus4 where cusID = ? ";
			 PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, Id);
        } catch (Exception e) {

            System.out.println(e);
        }
        return null;
    }
	
}

