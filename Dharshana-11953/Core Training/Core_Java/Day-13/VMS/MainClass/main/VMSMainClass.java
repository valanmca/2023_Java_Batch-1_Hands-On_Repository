package com.vms.main;

import java.util.List;
import java.util.Scanner;


import com.vms.bean.Vehicle;
import com.vms.dao.VehicleDAO;

public class VMSMainClass {

	static Scanner sc = new Scanner(System.in);
	
	public static int displayMenu() {
		System.out.println("1. Insert 2. Delete 3. Update 4. Find 5. Find All 6.Exit");
		System.out.println("Enter Your Choice:");
		int choice = sc.nextInt(); //
		return choice;
	}
	
	public static Vehicle insertVehicle() {
		System.out.println("Enter Vehicle Id , Type , BrandName , OwnerName:");
		return new Vehicle(sc.nextInt(),sc.next(),sc.next(),sc.next());
	}
	
	public static int deleteVehicle() {
		System.out.println("Enter Vehicle Id to Delete:");
		return sc.nextInt();
	}
	
	public static Vehicle updateVehicle() {
		System.out.println("Enter Vehile Id, Type,BrandName,OwnerName:");
		return new Vehicle(sc.nextInt(),sc.next(),sc.next(),sc.next());
	}
	
	public static int findVehicle() {
		System.out.println("Enter Student id to Find:");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		VehicleDAO vdao= new VehicleDAO();
		String msg="";
		do {
			switch(displayMenu()) {
			case 1:
				//Inserting
				Vehicle vehic = insertVehicle();
				int n=vdao.insertVehicle(vehic);
				if(n==1) 
					System.out.println("Record Inserted");
				else 
					System.out.println("Not Inserted");
				break;
			case 2:
				//Deleting
				int vehi_id=deleteVehicle();
				int n1=vdao.deleteVehicle(vehi_id);
				if(n1==1)
					System.out.println("Record Deleted");
				else
					System.out.println("Not Deleted");
				break;
			case 3:
				//Updating
				Vehicle vehic1= updateVehicle();
				int n2= vdao.updateVehicle(vehic1);
				if(n2==1)
					System.out.println("Record Updated");
				else
					System.out.println("Not Updated");
				break;
			case 4:
				int vehic2 = findVehicle();
				Vehicle vehic3 = vdao.findVehicle(vehic2);
				if(vehic3 == null)
					System.out.println("Record Not Found");
				else
					vehic3.display();
				
				break;
			case 5:
				//DisplayAll
				List<Vehicle> list =vdao.findAllVehicle();
				for(Vehicle e : list)
					e.display();
				break;
			}
			System.out.println("Do You Want to Continue [Yes | No]:");
			msg = sc.next();
		}while(msg.equals("Y"));

	}

}
