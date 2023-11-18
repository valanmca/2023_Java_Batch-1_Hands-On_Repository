package com.vms.main;

import java.util.List;
import java.util.Scanner;

import com.vms.bean.Vehicle;
import com.vms.dao.VehicleDAO;

public class VMSMainClass {

	static Scanner sc = new Scanner(System.in);
	public static int displayMenu() {
		System.out.println("1)Insert 2)Delete 3)Update 4)Find 5)Find All 6)Exit");
		System.out.println("Enter your choice");
		return sc.nextInt();
	}
	public static Vehicle insertVehicle() {
		System.out.println("Enter vehicle Id, vehicle number, vehicle name, price");
		return new Vehicle(sc.nextInt(),sc.nextInt(),sc.next(),sc.nextInt());
	}
	public static int deleteVehicle() {
		System.out.println("Enter the id to delete..");
		return sc.nextInt();
	}
	public static Vehicle updateVehicle() {
		System.out.println("Enter vehicle Id, vehicle number, vehicle name, price");
		return new Vehicle(sc.nextInt(),sc.nextInt(),sc.next(),sc.nextInt());
	}
	public static int findVehicle() {
		System.out.println("Enter the id to find..");
		return sc.nextInt();
	}
	
	
	public static void main(String[] args) {
		String msg = "";
		VehicleDAO dao = new VehicleDAO();
		do {
		switch (displayMenu()) {
		case 1:
			if(dao.insertVehicle(insertVehicle()) == 1) {
				System.out.println("Record Inserted");
			}else {
				System.out.println("Record not inserted");
			}
			break;
		case 2:
				if(dao.deleteVehicle(deleteVehicle()) == 1) {
					System.out.println("Record Deleted");
				}else {
					System.out.println("Record not Deleted");
				}
			break;
		case 3:
			if(dao.updateVehicle(updateVehicle()) == 1) {
				System.out.println("Record updated");
			}else {
				System.out.println("Record not Updated");
			}
			
			break;
		case 4:
			Vehicle bean = dao.findVehicle(findVehicle());
			if(bean != null) {
				bean.display();
			}else {
				System.out.println("No datas found");
			}
			break;
		case 5:
			boolean flag = false;
			List<Vehicle> list = dao.findAllVehicle();
			for(Vehicle v:list) {
				if(!list.isEmpty()) {
					flag = true;
					v.display();
				}
			}
			if(flag == false) {
				System.out.println("No Records in the database");
			}
			
			break;
		case 6:
			System.exit(0);
			break;

		default:
			System.out.println("Please choose valid options");
			break;
		}
			
		System.out.println("Do you want to continue [Yes | No]");
		msg = sc.next();
		}while(msg.equalsIgnoreCase("Yes"));
		
	}

}
