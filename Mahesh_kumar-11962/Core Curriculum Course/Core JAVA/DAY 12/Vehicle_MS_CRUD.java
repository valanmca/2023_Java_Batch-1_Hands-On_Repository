package com.mahesh.core_java_day_12;

import java.util.LinkedList;
import java.util.Scanner;

class Vehicle {
	int VehicleId;
	String VehicleBrandName, VehicleHSRPNo, VehicleModel;
	float VehiclePrice;

	Vehicle(int Id, String Brand, String NoPlate, String Model, float Price) {
		this.VehicleId = Id;
		this.VehicleBrandName = Brand;
		this.VehicleHSRPNo = NoPlate;
		this.VehicleModel = Model;
		this.VehiclePrice = Price;
	}

	void display() {
		System.out.println("Vehicle id          : " + VehicleId);
		System.out.println("Vehicle Brand       : " + VehicleBrandName);
		System.out.println("Vehicle HSRP Number : " + VehicleHSRPNo);
		System.out.println("Vehicle Model Name  : " + VehicleModel);
	}
}

public class Vehicle_MS_CRUD {

	public static void main(String[] args) {

		int VehicleId = 0, index;
		String VehicleBrandName = "", VehicleHSRPNo = "", VehicleModel = "";
		float VehiclePrice = 0.0f;
		String input;
		boolean flag;
		LinkedList<Vehicle> Vehicle_list = new LinkedList<Vehicle>();

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(
					"1.Add Vehicle Details    2.Search Vehicle Details    3.Update Vehicle Details \n\n4.Delete Vehicle Details 5.View All Vehicle Details 6.Exit");

			System.out.println("Enter Your Choice : ");
			int option = sc.nextInt();

			switch (option) {

			case 1:
				// Add Vehicle Details
				System.out.println("Enter Vehicle Id : ");
				VehicleId = sc.nextInt();
				System.out.println("Enter Vehicle Brand : ");
				VehicleBrandName = sc.next();
				System.out.println("Enter Vehicle HSRPNo : ");
				VehicleHSRPNo = sc.next();
				System.out.println("Enter Vehicle Model : ");
				VehicleModel = sc.next();
				System.out.println("Enter Vehicle Price : ");
				VehiclePrice = sc.nextFloat();

				Vehicle transport = new Vehicle(VehicleId, VehicleBrandName, VehicleHSRPNo, VehicleModel, VehiclePrice);
				//Vehicle_list.add(transport);

				if (Vehicle_list.add(transport) == true) {
					System.out.println("Vehicle details added successfully");
				} else {
					System.out.println("Something Went Wrong..");
				}
				break;
			case 2:
				// Search Vehicle Details
				System.out.println("Enter Vehicle Id want to Search : ");
				int SearchId = sc.nextInt();
				flag = false;
				for (Vehicle ob : Vehicle_list) {
					if (ob.VehicleId == SearchId) {
						flag = true;
						ob.display();
						break;
					}
				}
				break;

			case 3:
				// Update Vehicle Details
				flag = false;
				System.out.println("Enter Vehicle Id You Want to Update : ");
				VehicleId = sc.nextInt();
				System.out.println("Update the  Vehicle Brand : ");
				VehicleBrandName = sc.next();
				System.out.println("Update the Vehicle HSRPNo : ");
				VehicleHSRPNo = sc.next();
				System.out.println("Update the Vehicle Model : ");
				VehicleModel = sc.next();
				System.out.println("Update the Vehicle Price : ");
				VehiclePrice = sc.nextFloat();
				index = 0;
				Vehicle vandi = new Vehicle(VehicleId, VehicleBrandName, VehicleHSRPNo, VehicleModel, VehiclePrice);
				for (Vehicle ob : Vehicle_list) {
					if (ob.VehicleId == VehicleId) {
						flag = true;
						Vehicle_list.set(index, vandi);
						System.out.println("Details Updated Successfully");
						break;
					}
					index++;
				}
				break;

			case 4:
				// Delete Vehicle Details

				index = 0;
				System.out.println("Enter Vehicle Id want to Delete : ");
				int Id = sc.nextInt();
				flag = false;
				for (Vehicle ob : Vehicle_list) {
					if (ob.VehicleId == Id) {
						flag = true;
						Vehicle_list.remove(index);

						break;
					}
					index++;
				}
				break;

			case 5:
				// View Vehicle Details
				for (Vehicle obj : Vehicle_list) {
					obj.display();
					
				}

				break;
			case 6:
				// exit;
				System.exit(0);

			default:
				// enter correct options
				System.out.println("Enter Valid Option");

			}
			System.out.println("U want Repeat again?[Yes or No] : ");
			input = sc.next();
		} while (input.equalsIgnoreCase("yes"));

	}

}
