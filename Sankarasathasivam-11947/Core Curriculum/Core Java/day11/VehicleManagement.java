package com.shiva.core.day11;

import java.util.LinkedList;
import java.util.Scanner;

class Vehicle {
	int id;
	int vehicleNo;
	String vehicleName;
	String vehicleBrand;
	float price;

	Vehicle(int id, int vehicleNo, String vehicleName, String vehicleBrand, float price) {
		this.id = id;
		this.vehicleNo = vehicleNo;
		this.vehicleName = vehicleName;
		this.vehicleBrand = vehicleBrand;
		this.price = price;
	}

	void display() {
		System.out.println("----------------------------");
		System.out.println("Vehicle Id: " + id);
		System.out.println("Vehicle Number: " + vehicleNo);
		System.out.println("Vehicle Name: " + vehicleName);
		System.out.println("Vehicle Brand: " + vehicleBrand);
		System.out.println("Price: " + price);
		System.out.println("----------------------------");
	}
}

public class VehicleManagement {

	public static void main(String[] args) {
		int id = 0;
		int vehicleNo = 0;
		String vehicleName = "";
		String vehicleBrand = "";
		float price = 0.0f;
		String msg = "";
		boolean flag = false;
		int index = 0;

		LinkedList<Vehicle> list = new LinkedList<Vehicle>();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("---------------------------");
			System.out.println(
					"1)Add Vehicle details \n2)Find Vehicle \n3)Update Vehicle Details \n4)Delete Vehicle \n5) Find all vehicles");
			System.out.println("----------------------------");
			System.out.println("Enter your Choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the Id: ");
				id = sc.nextInt();
				System.out.println("Enter the Vehicle Number: ");
				vehicleNo = sc.nextInt();
				System.out.println("Enter the Vehicle Name: ");
				vehicleName = sc.next();
				System.out.println("Enter the Vehicle Brand: ");
				vehicleBrand = sc.next();
				System.out.println("Enter the Price: ");
				price = sc.nextFloat();
				Vehicle vec = new Vehicle(id, vehicleNo, vehicleName, vehicleBrand, price);
				list.add(vec);
				System.out.println("Added Successfully");
				break;

			case 2:
				System.out.println("Enter the Id");
				id = sc.nextInt();

				flag = false;

				for (Vehicle v : list) {
					if (v.id == id) {
						flag = true;
						v.display();
						break;
					}
				}

				if (flag == false) {
					System.out.println("Vehicle not found");
				}
				break;

			case 3:
				flag = false;
				index = 0;
				System.out.println("Enter the Id");
				id = sc.nextInt();
				System.out.println("Enter the Vehicle Number: ");
				vehicleNo = sc.nextInt();
				System.out.println("Enter the Vehicle Name: ");
				vehicleName = sc.next();
				System.out.println("Enter the Vehicle Brand: ");
				vehicleBrand = sc.next();
				System.out.println("Enter the Price: ");
				price = sc.nextFloat();

				Vehicle temp = new Vehicle(id, vehicleNo, vehicleName, vehicleBrand, price);

				for (Vehicle v : list) {
					if (v.id == id) {
						flag = true;
						list.set(index, temp);
						System.out.println("Update successfully!!!");
						break;
					}
					index++;
				}
				if (flag == false) {
					System.out.println("Vehicle not found");
				}

				break;

			case 4:
				System.out.println("Enter the Id");
				id = sc.nextInt();
				index = 0;
				for (Vehicle v : list) {
					if (v.id == id) {
						flag = true;
						list.remove(index);
						System.out.println("Deleted successfully!!!");
						break;
					}
					index++;
				}
				if (flag == false) {
					System.out.println("Vehicle not found");
				}

				break;

			case 5:
				flag = false;
				for (Vehicle v : list) {
					if (!list.isEmpty()) {
						flag = true;
						v.display();
					}

				}
				if (flag == false) {
					System.out.println("No records");
				}
				break;

			case 6:
				System.exit(0);
				break;

			default:
				System.out.println("Please choose a valid option[1-6]");
			}

			System.out.println("Do you want to continue [Yes | No]");
			msg = sc.next();

		} while (msg.equalsIgnoreCase("yes"));
		sc.close();
	}

}
