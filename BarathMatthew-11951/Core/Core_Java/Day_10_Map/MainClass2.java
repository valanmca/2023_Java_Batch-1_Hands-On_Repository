package Day_10_Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;


class Vehicle {
	int vId;
	String vName;
	String brandName;
	String s[] = {vName,brandName};

	Vehicle(int vId, String vName, String brandName) {
		this.vId = vId;
		this.vName = vName;
		this.brandName = brandName;
	}

	void display() {
		System.out.println("Vehicle Id : " + vId);
		System.out.println("Vehicle Name : " + vName);
		System.out.println("Brandname of the Vehicle : " + brandName);
		System.out.println("----------------------------");
	}
}

public class MainClass2 {

	public static void main(String[] args) {

		int vId = 0;
		String vName = "";
		String brandName = "";
		int process = 1;
		String msg="";
		Vehicle vehicle=null;
		Scanner sc = new Scanner(System.in);
		
		LinkedHashMap<Integer, Vehicle> map = new LinkedHashMap<Integer, Vehicle>();

		LinkedList<String> list = new LinkedList<String>();
		while (process == 1) {

			System.out.println(
					"1.Add Vehicle 2.Find Vehicle 3.Update Vehicle 4.Delete Vehicle 5.View All Vehicles 6.Exit");
			System.out.println("Enter your choice : ");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("Enter the Vehicle ID,Name,BrandName : ");
				vId = sc.nextInt();
				vName = sc.next();
				brandName = sc.next();
				vehicle = new Vehicle(vId, vName, brandName);
				list.add(vName);
				list.add(brandName);
				map.put(vId,vehicle);

				System.out.println("Vehicle is added...");
				System.out.println(list);
				vehicle.display();
				
			} else if (choice == 2) {
				System.out.println("Enter the Vehicle ID to find : ");
				vId = sc.nextInt();
				boolean flag = false;
				Set<Integer> set = map.keySet();

				System.out.println(set);

				Iterator<Integer> it = set.iterator();
				while (it.hasNext()) {
					Integer key = it.next();
					if (key == vId) {
						flag = true;
						vehicle.display();
					}
				}
			}
			 if (process != 0) {
	                System.out.println("Do you want to continue (Yes or No)");
	                msg = sc.next();

	                if (msg.equalsIgnoreCase("Yes")) {
	                    process = 1;
	                } else if (msg.equalsIgnoreCase("No")) {
	                    process = 0;
	                }
	            }
		}
	}
}
