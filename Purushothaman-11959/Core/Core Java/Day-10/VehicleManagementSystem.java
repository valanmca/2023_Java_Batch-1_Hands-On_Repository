package com.purushoth.day_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.InputStreamReader;

class Vehicle{
	int vehicleId;
	String name;
	String color;
	String brand;
	
	Vehicle(int vehicleId,String name,String color,String brand){
		this.vehicleId=vehicleId;
		this.name=name;
		this.color=color;
		this.brand=brand;
	}
	
	void display(){
		System.out.println("Vehicle Id: "+vehicleId);
		System.out.println("Vehicle name: "+name);
		System.out.println("Vehicle color: "+color);
		System.out.println("Vehicle brand: "+brand);
	}
}
public class VehicleManagementSystem {

	public static void main(String[] args) throws IOException {
		int vehicleId=0;
		String name="";
		String color="";
		String brand="";
		int count=0;
		int index=0;
		String msg="";
		
		LinkedList<Vehicle> list=new LinkedList<Vehicle>();
		Scanner sc=new Scanner(System.in);
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		do {
		System.out.println("1.Add new vehicle \n2.Find vehicle \n3.Update vehicle details "
				+ "\n4.Delete vehicle \n5.View vehicle details \6.Exit");
		System.out.println("Enter the choice");
		int choice=sc.nextInt();
		
		
		switch(choice){
		
		case 1:
			System.out.println("Enter the vehicle Id: ");
			vehicleId=sc.nextInt();
			System.out.println("Enter the vehicle Name: ");
			name=input.readLine();
			System.out.println("Enter the color: ");
			color=input.readLine();
			System.out.println("Enter the brand: ");
			brand=input.readLine();
			Vehicle vec=new Vehicle(vehicleId,name,color,brand);
			list.add(vec);
			System.out.println("Vehicle details are added");
			break;
			
		case 2:
			System.out.println("Enter the Vehicle Id: ");
		    vehicleId=sc.nextInt();
		    count=0;
		    for(Vehicle a:list) {
		    	if(a.vehicleId == vehicleId) {
		    		a.display();
		    		count++;
		    		break;
		    	}
		    }
		    if(count==0) {
		    	System.out.println("Vehicle details not found");
		    }
		    break;

		case 3:
			System.out.println("Enter the vehicle Id: ");
			vehicleId=sc.nextInt();
			System.out.println("Enter the vehicle Name: ");
			name=input.readLine();
			System.out.println("Enter the color: ");
			color=input.readLine();
			System.out.println("Enter the brand: ");
			brand=input.readLine();
			index=0;
			count=0;
			Vehicle temp=new Vehicle(vehicleId,name,color,brand);
			
			for(Vehicle a:list) {
				if(a.vehicleId==vehicleId) {
				list.set(index, temp);
				count++;
				index++;
				System.out.println("Vehicle details are updated");
				break;
				}
			} if(count==0) {
				System.out.println("Vehicle not found");
			}
			break;
			
		case 4:
			System.out.println("Enter the vehicle Id:");
			vehicleId=sc.nextInt();
			count=0;
			index=0;
			for(Vehicle a:list) {
				if(a.vehicleId==vehicleId) {
					list.remove(index);
					count++;
					index++;
					System.out.println("Vehicle details are deleted");
					break;
				}
			} if(count==0) {
				System.out.println("Vehicle not found");
			}
			break;
			
		case 5:
			if(list.isEmpty()) {
				System.out.println("Vehicle list is Empty");
			}else {
				for(Vehicle a:list) {
					a.display();;
				}
			}
			break;
			
		case 6:
			System.exit(0);
			
		default:
			System.out.println("Please give only for 1-6");
			break;
			
		}
		System.out.println("Do you want to continue [yes] or [no]");
		msg=sc.next();
		}while(msg.equalsIgnoreCase("yes"));

	}

}
