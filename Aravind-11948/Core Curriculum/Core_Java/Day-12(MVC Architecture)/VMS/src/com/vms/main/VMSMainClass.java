package com.vms.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import com.vms.bean.Vehicle;
import com.vms.dao.VehicleDAO;

public class VMSMainClass {

	static Scanner sc = new Scanner(System.in);

	public static int displayMenu() {

		System.out.println("Select option = 1.Insert  2.Delete  3.Update  4.Find  5.Find All 6.Exit");
		
		// int choice=sc.nextInt();code reduction

		return sc.nextInt();

	}

	// -------insert employee------

	public static Vehicle insertVehicle() {
		System.out.println("Enter vehicle id,vehicle type,vehicle brand");

		// Vehicle veh=new Vehicle(sc.nextInt(),sc.next(),sc.next());
		// return veh;

		return new Vehicle(sc.nextInt(), sc.next(), sc.next());
	}

	/// --- find Vehicle

	public static int findVehicle() {
		System.out.println("Enter vehicle id =");
		return sc.nextInt();
	}

	/// --- Delete Vehicle

	public static int deleteVehicle() {
		System.out.println("Enter vehicle id to delete =");
		return sc.nextInt();
	}

	// ----update vehicle

	public static Vehicle updateVehicle() {
		System.out.println("Enter vehicle id,vehicle type,vehicle brand");

		// Vehicle veh=new Vehicle(sc.nextInt(),sc.next(),sc.next());
		// return veh;

		return new Vehicle(sc.nextInt(), sc.next(), sc.next());
	}

	public static void main(String[] args) {

		VehicleDAO dao = new VehicleDAO();
		String msg = " ";
		do {
			switch (displayMenu()) {

			case 1:

				if (dao.insertVehicle(insertVehicle()) == 1) {
					System.out.println("Record inserted Sucessfully");
				} else {
					System.err.println("Insertion Failed  ");
				}

				break;

			case 2:

				// get id

//				int id =deleteVehicle();
//				dao.deleteVehicle(id );

				if (dao.deleteVehicle(deleteVehicle()) == 1) {
					System.out.println("Record deleted");
				} else {
					System.err.println("Deletion Failed  -->Give correct id ");
				}

				break;

			case 3:

//				Vehicle veh=updateVehicle();
//				dao.updateVehicle(veh);
				if (dao.updateVehicle(updateVehicle()) == 1) {
					System.out.println("Updated Successfully");
				} else {
					System.err.println("Updation failed ");
				}

				break;

			case 4:

//				int id=findVehicle();

				Vehicle bean = dao.findVehicle(findVehicle());

				if (bean != null) {
					bean.display();
				} else {
					System.err.println("Record not found");
				}

				break;

			case 5:
				ArrayList<Vehicle> list = dao.findAllVehicle();

				if (list.isEmpty()) {
					System.err.println("Table is empty");
				} else {
					System.out.println();
					if (list.size() == 1) {
						System.err.println(list.size() + " Record  present in the table");
						System.out.println();
					} else {

						System.out.println(list.size() + " Records  present in the table");
						System.out.println();
					}
					for (Vehicle e : list) {
						e.display();
					}
				}

				break;
			case 6:
				System.exit(0);

				break;
			}

			System.out.println("Do you want to continue [yes] | [no]");
			msg = sc.next();
		} while (msg.equalsIgnoreCase("yes"));

	}

}
