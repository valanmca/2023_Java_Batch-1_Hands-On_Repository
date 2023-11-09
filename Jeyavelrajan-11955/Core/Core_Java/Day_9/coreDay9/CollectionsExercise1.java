package com.jeyavel.coreDay9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

class Vehicle {
	String BrandName;
	int VehicleId;
	String VehicleName;
	String ModelNo;
	float Price;

	Vehicle(String BrandName, int VehicleId, String VehicleName, String ModelNo, float Price) {

		this.BrandName = BrandName;
		this.VehicleId = VehicleId;
		this.VehicleName = VehicleName;
		this.ModelNo = ModelNo;
		this.Price = Price;
	}

	void display() {
		System.out.println("The Given Details Of the" + BrandName);
		System.out.println("Vehicle Id :" + VehicleId);
		System.out.println("VehicleName :" + VehicleName);
		System.out.println("ModelNo of the Vehicle :" + ModelNo);
		System.out.println("Price of the Vehicle :" + Price);
	}

}

public class CollectionsExercise1 {

	public static void main(String[] args) throws IOException {
		String BrandName="";
		int VehicleId=0;
		String VehicleName="";
		String ModelNo="";
		float Price=0.0f;
		String msg ="";
		LinkedList<Vehicle> v1 = new LinkedList<Vehicle>();
		Scanner sr =new Scanner (System.in);
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println(
					"1.Add Vehicle,2.Find Vehicle 3.Update Vehicle 4.Delete Vehicle 5.View All Vehicle ,6.Exit");
			System.out.println("Enter your Choice");
			int Vchoice = Integer.parseInt(sc.readLine());
			
			switch(Vchoice) {
			case 1:
				System.out.println("Enter the Vehicle Details");
				System.out.println("1)Brand Name");
				BrandName= sc.readLine();
				System.out.println("2)VehicleId");
				VehicleId = Integer.parseInt(sc.readLine());
				System.out.println("3)VehicleName");
				VehicleName = sc.readLine();
				System.out.println("4)ModelNo");
				ModelNo = sc.readLine();
				System.out.println("5)Price of the vehicel");
				Price = Float.parseFloat(sc.readLine());
				Vehicle v2 = new Vehicle(BrandName,VehicleId,VehicleName,ModelNo,Price);
				v1.add(v2);
				System.out.println("Vehicle Details Are Added");
				break;
			case 2:
				System.out.println("Enter the Vehicle Id To find the details of the vehicle ");
			    VehicleId=Integer.parseInt(sc.readLine());
			    boolean flag = true;
			    for(Vehicle e:v1) {
			    	if(e.VehicleId==VehicleId) {
			    		flag = true;
			    		e.display();
			    	}
			    }
				
				break;
			case 3:
				System.out.println("Enter any of the details about the vehicles to Update ");
				System.out.println("1)Brand Name");
				BrandName= sc.readLine();
				System.out.println("2)VehicleId");
				VehicleId = Integer.parseInt(sc.readLine());
				System.out.println("3)VehicleName");
				VehicleName = sc.readLine();
				System.out.println("4)ModelNo");
				ModelNo = sc.readLine();
				System.out.println("5)Price of the vehicel");
				Price = Float.parseFloat(sc.readLine());
				Vehicle v3 = new Vehicle(BrandName,VehicleId,VehicleName,ModelNo,Price);
				Vehicle temp = null;
				boolean flag1 = false;
				for(Vehicle e:v1) {
					if(e.VehicleId==VehicleId) {
						flag1 = true;
						v1.set(VehicleId, temp);
						System.out.println("Vehicles Details are Updated");
					}
				}
					
				break;
			case 4:
				System.out.println("Enter the VehicleId Id To Delete ");
				int index = 0;
				boolean flag2 = false;
				VehicleId = Integer.parseInt(sc.readLine());
				for(Vehicle e:v1) {
					if(e.VehicleId==VehicleId) {
						flag2 = true;
						v1.remove(index);
						System.out.println("The Vehicle id is Deleted");
						break;
					}
					index++;
				}if(flag2=false) {
					System.out.println("Vehicle Details not found");
				}
				break;
			case 5:
				for(Vehicle e:v1) {
					e.display();
				}
				
				break;
			case 6:
				System.exit(0);
				break;
			}
			System.out.println("Do you Want to continue [Yes | No] ");
			msg = sc.readLine();
		}while(msg.equalsIgnoreCase("Yes"));
	}

}