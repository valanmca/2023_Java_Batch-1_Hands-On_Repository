package com.gayathri.day12MAP;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Iterator;
class Vehicle{
	String vehicleName;
	int vehicleId;
	public Vehicle(int vehicleId,String vehicleName) {
		this.vehicleName = vehicleName;
		this.vehicleId = vehicleId;
	}
	void display() {
		System.out.println("Vehicle Name : "+vehicleName);
		System.out.println("Vehicle ID : "+vehicleId);
	}

}
public class LP1VehicleHashMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vehicleId = 0;
		String vehicleName = " ";
		char ch;
		int option;
		
		HashMap <Integer,Vehicle> map = new HashMap<Integer,Vehicle>();
		System.out.println("\tVehicle Management System using HashMap");
		do {
			
			System.out.println("1.Add details\n2.Find details\n3.Update details\n4.View details\n5.Delete details\n\nSelect your option : ");
			option = sc.nextInt();
			switch(option) {
			case 1:
				System.out.print("Enter vehicle name : ");
				vehicleName = sc.next();
				System.out.print("Enter vehicle id  : ");
				vehicleId = sc.nextInt();
				Vehicle obj = new Vehicle(vehicleId, vehicleName);
				map.put(vehicleId,obj);
				break;
			case 2:
				System.out.print("Enter vehicle id  : ");
				vehicleId = sc.nextInt();
				Vehicle findVec = map.get(vehicleId);
				if(findVec != null) {
					System.out.println("Vehicle Found");
					findVec.display();
					}
				else
					System.out.println("Vehicle not found");
				break;
			case 3:
				System.out.print("Enter vehicle id  : ");
				vehicleId = sc.nextInt();
				Vehicle updateVec = new Vehicle(vehicleId,vehicleName);
				if(map.containsKey(vehicleId)){
					map.put(vehicleId,updateVec);
					System.out.println("Vehicle updated successfully.");
					break;
				}
					
				else
					System.out.println("Vehicle not found");
				break;
			case 4:
				for(Vehicle v : map.values()) {
					v.display();
				}
				
				break;
			case 5:
				
				break;
			}
			System.out.println("\nDo you want to continue ? ");
			ch = sc.next().charAt(0);
			}while(ch=='s' ||ch=='S');
		}
	}

			/*
			
		map.put(10,"Gayathri");
		map.put(20, "Devi");
		map.put(30,"Sakthi");
		System.out.println(map);
		map.put(20,"Yathrik");//not adding duplicate.... it replacing the old one.
		System.out.println(map);
		map.put(null, "Devi");//null key accepted
		map.put(11, null);//null value accepted
		System.out.println(map);
		System.out.println(map.get(30));//sakthi
		map.remove(20);//key
		System.out.println(map);

		
		//way 1 traversing
		System.out.println("Way 1");
		Set <Integer> set = map.keySet();
		System.out.println(set);
		Iterator <Integer> it = set.iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println(key +" => "+map.get(key) );
		}
		
		//way 2 traversing
		System.out.println("Way 2");
		Set <Entry<Integer,String>> set1 = map.entrySet();
		System.out.println(set1);
		
		Iterator <Entry<Integer,String>> it1 = set1.iterator();
		while(it1.hasNext()) {
			Entry<Integer,String> e = it1.next();
			System.out.println(e.getKey()+" => "+e.getValue());
			
		}
		*/
	