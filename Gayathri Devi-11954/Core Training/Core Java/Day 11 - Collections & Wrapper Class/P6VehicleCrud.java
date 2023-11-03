package com.gayathri.day11CollectionandWrapperclass;

/*
 * Create an application for "Vehicle Management System" using any of your favorite collection. 
 * And perform all the "CRUD" operations.
 */
import java.util.Scanner;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class VehicleManagementSystem {
	String vehicleName, fuelType;
	int vehicleId, yearOfModel, vehiclePrice;

	public VehicleManagementSystem(String vehicleName, String fuelType, int vehicleId, int yearOfModel,
			int vehiclePrice) {
		this.vehicleName = vehicleName;
		this.fuelType = fuelType;
		this.vehicleId = vehicleId;
		this.yearOfModel = yearOfModel;
		this.vehiclePrice = vehiclePrice;
	}

	void display() {
		System.out.println("Vehicle ID	: " + vehicleId);
		System.out.println("\nVehicle Name	: " + vehicleName);
		System.out.println("Fuel Type	: " + fuelType);
		System.out.println("Year of model	: " + yearOfModel);
		System.out.println("Vehicle Price	: " + vehiclePrice + "\n");
	}

}

public class P6VehicleCrud {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String vehicleName = " ";
		String fuelType = " ";
		int vehicleId = 0;
		int yearOfModel = 0;
		int vehiclePrice = 0;
		boolean flag = false;
		int index = 0;
		LinkedList<VehicleManagementSystem> list = new LinkedList<VehicleManagementSystem>();

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		char ch;

		do {
			System.out.println("\n1. Add vehicle details" + "\n2. Find vehicle details" + "\n3. Update vehicle details"
					+ "\n4. Delete vehicle details" + "\n5. View all vehicle details" + "\n6. Exit the program"
					+ "\n---------------------------------------------");
			System.out.print("\nSelect your option : ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("\nEnter vehicle name : ");
				vehicleName = br.readLine();
				System.out.print("Enter vehicle id : ");
				vehicleId = sc.nextInt();
				System.out.print("Enter vehicle fuel type : ");
				fuelType = br.readLine();
				System.out.print("Enter vehicle year of model : ");
				yearOfModel = sc.nextInt();
				System.out.print("Enter vehicle price : ");
				vehiclePrice = sc.nextInt();

				VehicleManagementSystem vms = new VehicleManagementSystem(vehicleName, fuelType, vehicleId, yearOfModel,
						vehiclePrice);
				list.add(vms);

				System.out.println("\nVehicle details are added");

				break;
			case 2:
				System.out.print("\nEnter vehicle id : ");
				vehicleId = sc.nextInt();
				for (VehicleManagementSystem temp : list) {
					if (temp.vehicleId == vehicleId) {
						System.out.println("Vehicle Found");
						flag = true;
						temp.display();
						break;
					}
				}
				if (flag == false)
					System.out.println("Vehicle not Found");

				break;
			case 3:
				System.out.print("\nEnter vehicle id : ");
				vehicleId = sc.nextInt();
				System.out.print("\nEnter vehicle name : ");
				vehicleName = br.readLine();
				System.out.print("Enter vehicle fuel type : ");
				fuelType = br.readLine();
				System.out.print("Enter vehicle year of model : ");
				yearOfModel = sc.nextInt();
				System.out.print("Enter vehicle price : ");
				vehiclePrice = sc.nextInt();
				VehicleManagementSystem obj2 = new VehicleManagementSystem(vehicleName, fuelType, vehicleId, yearOfModel, vehiclePrice);
				for (VehicleManagementSystem temp : list) {
					if (temp.vehicleId == vehicleId) {
						flag = true;
						list.set(index, obj2);
						System.out.println("Vehicle details are updated");
						break;
					}
				}
				if (flag == false)
					System.out.println("Vehicle details are not updated");

				break;
			case 4:
				System.out.print("\nEnter vehicle id : ");
				vehicleId = sc.nextInt();
				for (VehicleManagementSystem temp : list) {
					if (temp.vehicleId == vehicleId) {
						System.out.println("Vehicle details are deleted");
						flag = true;
						list.remove(index);
						break;
					}
				}
				if (flag == false)
					System.out.println("Vehicle details are not deleted");
				break;
			case 5:
				for (VehicleManagementSystem obj : list) {
					obj.display();
				}
				break;
			case 6:
				System.out.println("Program End");
				System.exit(0);
				break;

			}
			System.out.print("\nDo you want to continue? (s or n) : ");
			ch = sc.next().charAt(0);
		} while (ch == 's' || ch == 'S');
		br.close();
	}

}
