package com.vms.main;

import java.util.List;
import java.util.Scanner;

import com.vms.bean.Vehicle;
import com.vms.dao.VehicleDAO;

public class VMSMainClass {

	static Scanner sc = new Scanner(System.in);

	public static int displayMenu() {
		System.out.println("1. Insert 2. Delete 3. Update 4. Find 5. Find All 6. Exit");
		System.out.println("Enter your choice : ");
		// int choice = sc.nextInt();
		return sc.nextInt();
	}

	public static Vehicle insertVehicle() {
		System.out.println("Enter Vehicle id, type, brandname , ownername :");
		return new Vehicle (sc.nextInt(), sc.next(), sc.next(), sc.next());

	}

	public static int deleteVehicle() {
		System.out.println("Enter Vehicle id to delete :");
		return sc.nextInt();

	}

	public static Vehicle updateVehicle() {
		System.out.println("Enter Vehicle id, type, brandname, ownername :");
		return new Vehicle(sc.nextInt(), sc.next(), sc.next(), sc.next());

	}

	public static int findVehicle() {
		System.out.println("Enter Vehicle id to Find:");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		VehicleDAO dao = new VehicleDAO();
		String msg = "";
		do {
			// int choice = displayMenu();
			switch (displayMenu()) {
			case 1:
				if (dao.insertVehicle(insertVehicle()) == 1)
					System.out.println("Record Inserted");
				else
					System.out.println("Record Not Inserted");
				break;

			case 2:
				int id = deleteVehicle();
				int n = dao.deleteVehicle(id);
				if (n == 1) {
					System.out.println("Record Deleted");
				} else {
					System.out.println("Record Not Deleted");
				}
				break;

			case 3:
				Vehicle vec = updateVehicle();
				int n1 = dao.updateVehicle(vec);
				if (n1 == 1) {
					System.out.println("Record Updated");
				} else {
					System.out.println("Record Not Updated");
				}
				break;

			case 4:
				int id1 = findVehicle();
				Vehicle vec2 = dao.findVehicle(id1);
				if (vec2 == null)
					System.out.println("Record Not Found");
				else
					vec2.display();

				break;
			case 5:
				List<Vehicle> list = dao.findAllVehicle();
				for(Vehicle e : list)
					e.display();
				break;
			}
			System.out.println("Do you want to continue [Yes | No] :");
			msg = sc.next();
		} while (msg.equals("Yes"));

	}

	

}
