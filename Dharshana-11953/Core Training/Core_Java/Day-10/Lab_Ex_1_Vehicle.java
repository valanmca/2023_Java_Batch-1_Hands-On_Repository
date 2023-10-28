package com.dharshu.day10;

import java.util.LinkedList;
import java.util.Scanner;

class Vehicle {
	int vid;
	String vtype;
	String vbrand;
	String ownerName;
	Vehicle(int vid, String vtype, String vbrand, String ownerName) {
		this.vid = vid;
		this.vtype = vtype;
		this.vbrand = vbrand;
		this.ownerName = ownerName;
	}
	void display() {
		System.out.println("Vehicle Id : " + vid);
		System.out.println("Vehicle Type : " + vtype);
		System.out.println("Vehicle Brand : " + vbrand);
		System.out.println("Owner Name : " + ownerName);
		System.out.println("----------------------------");
	}
}


public class Lab_Ex_1_Vehicle {

	public static void main(String[] args) {
		
		int vid = 0;
		String vtype = "";
		String vbrand = "";
		String ownerName = "";
		boolean flag = false;
		int index = 0;
		LinkedList<Vehicle> list = new LinkedList<Vehicle>();
		Scanner sc = new Scanner(System.in);
		
		String msg = "";
		do {
		System.out.println(
				"1.Add Vehicle 2.Find Vehicle 3.Update Vehicle 4.Delete Vehicle 5.Display all Vehicles 6.Exit");
		System.out.println("Enter Your Choice : ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter Vehicle Id : ");
			vid = sc.nextInt();
			System.out.println("Enter Vehicle Type :");
			vtype = sc.next();
			System.out.println("Enter Vehicle Brand :");
			vbrand = sc.next();
			System.out.println("Enter Owner Name :");
			ownerName = sc.next();
			Vehicle vec = new Vehicle(vid, vtype, vbrand, ownerName);
			list.add(vec);
			System.out.println("Vehicles details are added successfully.");
			break;
		case 2:
			System.out.println("Enter Vehicle Id :");
			vid = sc.nextInt();
			flag = false;
			for (Vehicle v : list) {
				if (v.vid == vid) {
					flag = true;
					v.display();
					break;
				}
			}
			if(flag == false) {
				System.out.println("Vehicle not found!");
			}
			break;
		case 3:
			System.out.println("Enter Vehicle Id : ");
			vid = sc.nextInt();
			System.out.println("Enter Vehicle Type :");
			vtype = sc.next();
			System.out.println("Enter Vehicle Brand :");
			vbrand = sc.next();
			System.out.println("Enter Owner Name :");
			ownerName = sc.next();
			
			Vehicle temp = new Vehicle(vid, vtype, vbrand, ownerName);
			flag = false;
			index = 0;
			for (Vehicle v : list) {
				if (v.vid == vid) {
					flag = true;
					list.set(index, temp);
					System.out.println("Vehicle id : " + vid + " updated successfully");
					break;
				}
				index++;
			}
			if(flag == false) {
				System.out.println("Record not found!");
			}
			
			break;
		case 4:
			System.out.println("Enter Vehicle Id to be deleted :");
			vid = sc.nextInt();
			flag = false;
			index = 0;
			for (Vehicle v : list) {
				if (v.vid == vid) {
					flag = true;
					//Remove
					list.remove(index);
					System.out.println("Vehicle id : " + vid + " deleted successfully");
					break;
				}
				index++;
			}
			if(flag == false) {
				System.out.println("Vehicle not found!");
			}
			
			break;
		case 5:
			for(Vehicle v : list) {
				v.display();
			}
			break;
		case 6:
			System.exit(0);
			break;
		}
		
		System.out.println("Do you want to continue [yes | no]");
		msg = sc.next();
		}while(msg.equalsIgnoreCase("yes"));

	}

}
