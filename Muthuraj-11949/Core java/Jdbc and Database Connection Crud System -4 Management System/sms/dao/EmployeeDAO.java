package com.sms.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.sms.bean.employee1;
import com.sms.util.DBUtil;
public class EmployeeDAO {	
	
	employee1 obj=new employee1();
	
               //insert
		public int  insertEmployee(String n,Float i) {
			int n1=0;
			try {
				Connection con=DBUtil.getDBConnection();
				String sql="insert into employe1e values (?,?,?)";
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1,empid());
				ps.setString(2,n);
				ps.setFloat( 3,i);
				n1=ps.executeUpdate();

				
			}catch (Exception e) {
				System.out.println(e);
			}	
			return n1;
		}
		
		public int deleteEmployee(int id) {
			
			int n2=0;
			try {
				Connection con=DBUtil.getDBConnection();
				String sql="delete from employee1 where empID=?";
				PreparedStatement ps=con.prepareStatement(sql);
				
				ps.setInt(1,id);
				n2=ps.executeUpdate();
			}catch(Exception e) {
				System.out.println(e);
			}
			return n2;
		}
		public int updateEmployee (employee1 bean ) {
			int n3=0;
			try {
				Connection con=DBUtil.getDBConnection();
				String sql= ("update employee1 Set Salary=10000 where empID=?" );
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1,bean.getEmpID());
				}catch (Exception e) {
					 System.out.println(e);			 
			}
			return n3;
		}	
		
		public employee1 FindEmployee (int empid) {
			employee1 bean=null;
			try {
				Connection con=DBUtil.getDBConnection();
				String sql="Select * from employee where empID=?;";

				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1,empid());
			    ResultSet rs=ps.executeQuery();
				if(rs.next()) {
					bean.setEmpID(rs.getInt("EmpID"));
					bean.setEmpname(rs.getString("Empname"));
					bean.setEmpSalary(rs.getFloat("EmpSalary"));	
					
				}
					}
						
			catch(Exception e) 
			{
			    System.out.println(e);   
			}
			return bean;	
		}
		private int empid() {
			// TODO Auto-generated method stub
			return 0;
		}

		public List<employee1> findAllEmployee(){
			
			List<employee1> list=new ArrayList<employee1>();
			
			try {
				Connection con=DBUtil.getDBConnection();
				String sql="Select * from employee";

				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1,empid());
			    ResultSet rs=ps.executeQuery();
				if(rs.next()) {
					employee1 bean=new employee1();
					bean.setEmpID(rs.getInt("EmpId"));
					bean.setEmpname(rs.getString("empname"));
					bean.setEmpSalary( rs.getFloat("empSalary"));	
					
				}
					}
						
			catch(Exception e) 
			{
			    System.out.println(e);   
			}
			return list;	
			
		}		
	}


