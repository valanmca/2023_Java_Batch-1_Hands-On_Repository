package com.vms.main;

import java.util.Scanner;


import com.vms.bean.Vehicle;
import com.vms.dao.VehicleDAO;

public class VMSMainClass {

	static Scanner sc = new Scanner(System.in);

	public static int displaydetails() {
		System.out.println(
				"1.Insert Details\n2.Update Details\n3.Delete Details\n4.Find Vehicle\n5.View All Vechicles\n\nEnter Your choice");
		return sc.nextInt();
	}

	public static Vehicle insertDetails() {
		System.out.println("Enter Vehicle id,Name and Type");
		return new Vehicle(sc.nextInt(), sc.next(), sc.next());
	}
	public static Vehicle updateVehicle() {
		System.out.println("Enter the Id and details ");
	    return new Vehicle(sc.nextInt(),sc.next(),sc.next());
	}

	public static void main(String[] args) {
		VehicleDAO dao = new VehicleDAO();
		String msg = "";
		do {

			int choice = displaydetails();
			switch (choice) {
			case 1:
				if (dao.insertDetails(insertDetails()) == 1)
					System.out.println("Record Inserted");
				else
					System.out.println("Record Not Inserted");
				break;
				
			case 2:
				if(dao.updateVehicle(updateVehicle())==1) 
					System.out.println("Recoed updated");
				else
					System.out.println("Recoed not updated");

			}
			System.out.println("Do you want to contiue [y | n]:");
			msg = sc.next();
		} while (msg.equals("y"));
	}
}
