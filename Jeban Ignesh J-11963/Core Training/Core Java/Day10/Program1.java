package com.jeban.Day10;

import java.util.LinkedList;
import java.util.Scanner;

class vehicle {
	int Vid;
	String Vtype;
	String Vbrand;

	vehicle(int Vid, String Vtype, String Vbrand) {
		this.Vid = Vid;
		this.Vtype = Vtype;
		this.Vbrand = Vbrand;
	}

	void display() {
		System.out.println("Vehicle ID:" + Vid);
		System.out.println("Vehicle Type:" + Vtype);
		System.out.println("Vehicle Brand:" + Vbrand);
		System.out.println("------------------------------");
	}
}

public class Program1 {

	public static void main(String[] args) {
		int Vid = 0;
		String Vtype = "";
		String Vbrand = "";
		boolean flag = false;
		int index = 0;
		String msg = " ";
		LinkedList<vehicle> list = new LinkedList<vehicle>();
		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("1.Add Vehicle,2.Find Vehicle,3.Update Vehicle,4.Delete Veicle,5.View Vehicle,6.Exit");
			System.out.println("Enter Your Choice:");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Vehicle_id,Type,Brand:");
				Vid = sc.nextInt();
				Vtype = sc.next();
				Vbrand = sc.next();
				vehicle veh = new vehicle(Vid, Vtype, Vbrand);
				list.add(veh);
				System.out.println("Vehicle Details are Added");
				break;

			case 2:
				System.out.println("Enter Vehicle ID");
				Vid = sc.nextInt();
				flag = false;
				for (vehicle v : list) {
					if (v.Vid == Vid) {
						flag = true;
						v.display();
					}
				}
				if (flag == false) {
					System.out.println("Vehicle Not Found");
				}
				break;

			case 3:
				System.out.println("Enter Vehicle_id,Type,Brand:");
				Vid = sc.nextInt();
				Vtype = sc.next();
				Vbrand = sc.next();
				flag = false;
				index = 0;
				vehicle temp = new vehicle(Vid, Vtype, Vbrand);

				for (vehicle v : list) {
					if (v.Vid == Vid) {
						list.set(index, temp);
						System.out.println("vehicle Details are Updated");
						break;
					}
					index++;
				}
				if (flag == false) {
					System.out.println("Vehicle Not Found");
				}

				break;
			case 4:
				System.out.println("Enter Vehicle ID");
				Vid = sc.nextInt();
				flag = false;
				index = 0;
				for (vehicle v : list) {
					if (v.Vid == Vid) {
						flag = true;
						list.remove(index);
						System.out.println("Vehicle Details are Removed");
					}
					index++;
				}
				if (flag == false) {
					System.out.println("Vehicle Not Found");
				}
				break;

			case 5:
				for (vehicle v : list) {
					v.display();
				}
				break;

			case 6:
				System.out.println("System Exit");
				System.exit(0);

				break;
			}
			System.out.println("Do you want to continue[Yes|No]");
			msg = sc.next();
		} while (msg.equalsIgnoreCase("Yes"));

	}

}
