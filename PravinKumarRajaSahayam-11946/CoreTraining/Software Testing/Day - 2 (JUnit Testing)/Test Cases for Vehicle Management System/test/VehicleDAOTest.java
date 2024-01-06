package com.test;
import static org.junit.Assert.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.annotation.Configuration;
import com.vms.bean.Vehicle;
import com.vms.dao.VehicleDAO;
import com.vms.util.DBUtil;
public class VehicleDAOTest {
	VehicleDAO cd = new VehicleDAO();
	DBUtil cd1 = new DBUtil();
	 Connection con = cd.con;
	public void VehicleDAO(){
        if(con == null){
            String dbUrl = "jdbc:mysql://localhost:3306/Vehicle1";
            String dbClass = "com.mysql.jdbc.Driver";
            try {
                Class.forName(dbClass);
                con = DriverManager.getConnection (dbUrl, "root", "root");
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
	@Test
	public void testInsertVehicle() {
		 VehicleDAO cd = new VehicleDAO();
		 DBUtil cd1 = new DBUtil();
		    Vehicle sVehicle = new Vehicle(109080, "Six", "Hyundai", 1235,"Pravin");
		    Connection con = cd.con;
		    try{
		        con.setAutoCommit(false);
		        cd.insertVehicle(sVehicle);
		        assertNotNull(sVehicle);
		        assertTrue(8 < sVehicle.getId()); // test correct id
		        assertEquals(7, cd.getFindAllVehicle().size()); // test all row in the table
		 
		        //test the new inserted row
		        Vehicle vehicle = cd.getVehicleById(sVehicle.getId());
		        assertEquals(sVehicle.getVehicleType(), vehicle.getVehicleType());
		        assertEquals(sVehicle.getVehicleName(), vehicle.getVehicleName());
		        assertEquals(sVehicle.getVehicleNumber(), vehicle.getVehicleNumber());
		        assertEquals(sVehicle.getOwnerName(), vehicle.getOwnerName());
		    }catch(Exception e){
		        e.printStackTrace();
		    }finally{
		        try{
		            con.rollback();
		            con.setAutoCommit(true);
		        }catch(Exception e){
		            e.printStackTrace();
		        }
		    }
		    return;
		    
	}
	@Test  
	public void testUpdateVehicle(){
		VehicleDAO cd = new VehicleDAO();
		 DBUtil cd1 = new DBUtil();
	    Vehicle sVehicle = new Vehicle();
	    Connection con = cd.con;        
	    try{
	        con.setAutoCommit(false);
	        cd.insertVehicle(sVehicle);
	 
	        int newId = 111;
	        String newvehicleType = "Four";
	        String newvehicleName = "Hyundai";
	        int newvehicleNumber = 1235;
	        String newownerName = "Parvin";
	        sVehicle.setId(newId);
	        sVehicle.setVehicleType(newvehicleType);
	        sVehicle.setVehicleName(newvehicleName);
	        sVehicle.setVehicleNumber(newvehicleNumber);
	        sVehicle.setOwnerName(newownerName);
	        cd.updateVehicle(sVehicle);
	 
	        //test the new updated row
	        Vehicle vehicle = cd.getVehicleById(sVehicle.getId());
	        assertEquals(newId, vehicle.getId());
	        assertEquals(newvehicleType, vehicle.getVehicleType());
	        assertEquals(newvehicleName, vehicle.getVehicleName());
	        assertEquals(newvehicleNumber, vehicle.getVehicleNumber());
	        assertEquals(newownerName, vehicle.getOwnerName());
	    }catch(Exception e){
	        e.printStackTrace();
	    }finally{
	        try{
	            con.rollback();
	            con.setAutoCommit(true);
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	    }
	    return;
	}
	@Test  
	public void testDeleteVehicle(){
		VehicleDAO cd = new VehicleDAO();
		 DBUtil cd1 = new DBUtil();
	    Vehicle sVehicle = new Vehicle(101, "Six", "Hyundai", 1235,"Pravin");
	    Connection con = cd.con;        
	    try{
	        con.setAutoCommit(false);
	        cd.insertVehicle(sVehicle);
	        cd.deleteVehicle(sVehicle);           
	        assertEquals(6, cd.getFindAllVehicle().size()); // test all row in the table
	 
	        //test the new deleted row
	        Vehicle vehicle = cd.getVehicleById(sVehicle.getId());
	        assertNull(vehicle);
	    }catch(Exception e){
	        e.printStackTrace();
	    }finally{
	        try{
	            con.rollback();
	            con.setAutoCommit(true);
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	    }
	    return;
	}
	@Test
	public void testFindVehicle(){
		VehicleDAO cd = new VehicleDAO();
		 DBUtil cd1 = new DBUtil();
		 Session c = cd1.getSession();
	    //exception scenario
	    Vehicle vehicle = cd.getVehicleById(1);
	    assertNull(vehicle);
	 
	    //standard scenario
	    vehicle = cd.getVehicleById(2);
	    assertNotNull(vehicle);
	    assertEquals(101, vehicle.getId());
	    assertEquals("Four", vehicle.getVehicleType());
	    assertEquals("Hyundai", vehicle.getVehicleName());
	    assertEquals(1235, vehicle.getVehicleNumber());
	    assertEquals("Pravin", vehicle.getOwnerName());
	    return;
	}
	
	     
	@Test
	public void testFindAllVehicle(){
		VehicleDAO cd = new VehicleDAO();
		 DBUtil cd1 = new DBUtil();
	    List<Vehicle> listVehicle = cd.getFindAllVehicle();
	    assertNotNull(listVehicle);
	    assertEquals(5, listVehicle.size());
	    return;
	}
}
