//CRUD Operations for Vehicle Management System
package com.sara.CoreJava.Day_11;

import java.util.LinkedList;
import java.util.Scanner;

//Creating Vehicle class
class Vehicle {
	int vehicleId;
	String vehicleName;
	String vehicleBrand;
	float vehiclePrice;

	// Vehicle Constructor
	Vehicle(int vehicleId, String vehicleName, String vehicleBrand, float vehiclePrice) {
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
		this.vehicleBrand = vehicleBrand;
		this.vehiclePrice = vehiclePrice;
	}

	// Method to display Vehicle Details
	void display() {
		System.out.println("Vehicle ID : " + vehicleId);
		System.out.println("Vehice Name : " + vehicleName);
		System.out.println("Vehicle Brand : " + vehicleBrand);
		System.out.println("Vehice Price : " + vehiclePrice);
	}
}

public class Collections_Assignment01 {

	public static void main(String[] args) {

		int vehicleId = 0;
		String vehicleName = "";
		String vehicleBrand = "";
		float vehiclePrice = 0.0f;
		String msg = "";
		int index = 0;
		boolean flag = false;
		LinkedList<Vehicle> list = new LinkedList<Vehicle>();

		do {
			System.out.println("--------------------------");
			System.out.println(
					" 1.Add Vehicle \n 2.Find Vehicle \n 3.Update Vehicle \n 4.Delete Vehicle \n 5.View Vehicle \n 6.Exit");
			System.out.println("--------------------------");
			System.out.println("Enter your choice : ");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch (choice) {

			// Case to Add Vehicle Details
			case 1:
				System.out.println("Enter Vehicle Id,Name,Brand and Price : ");
				vehicleId = sc.nextInt();
				vehicleName = sc.next();
				vehicleBrand = sc.next();
				vehiclePrice = sc.nextFloat();

				Vehicle vehicle = new Vehicle(vehicleId, vehicleName, vehicleBrand, vehiclePrice);
				list.add(vehicle);
				System.out.println("Vehicle Details Added");
				break;

			// Case to Find Vehicle Details
			case 2:
				System.out.println("Enter your vehicle Id : ");
				vehicleId = sc.nextInt();
				for (Vehicle v : list) {
					if (v.vehicleId == vehicleId) {
						System.out.println("Vehicle is founded");
					}
				}
				break;

			// Case to Update Vehicle Details
			case 3:

				System.out.println("Enter Vehicle Id,Name,Brand and Price : ");
				vehicleId = sc.nextInt();
				vehicleName = sc.next();
				vehicleBrand = sc.next();
				vehiclePrice = sc.nextFloat();

				Vehicle temp = new Vehicle(vehicleId, vehicleName, vehicleBrand, vehiclePrice);
				index = 0;
				for (Vehicle v : list) {
					if (v.vehicleId == vehicleId) {
						list.set(index, temp);
					}
					index++;
				}
				System.out.println("Vehicle Details Updated.");

				break;

			// Case to Delete Vehicle Details
			case 4:
				System.out.println("Enter Vehicle Id : ");
				vehicleId = sc.nextInt();
				flag = false;
				index = 0;
				for (Vehicle v : list) {
					if (v.vehicleId == vehicleId) {
						flag = true;
						list.remove(index);
					}
					System.out.println("Vehicle Details deleted");
				}
				if (flag == false) {
					System.out.println("Vehicle not found");
				}
				break;

			// Case to Display Vehicle Details
			case 5:
				for (Vehicle v : list) {
					v.display();
				}
				break;

			// Case to Exit
			case 6:
				System.exit(0);
				break;
			}
			System.out.println("Do you want to continue [Yes || No]");
			msg = sc.next();
		} while (msg.equalsIgnoreCase("Yes"));
	}
}
