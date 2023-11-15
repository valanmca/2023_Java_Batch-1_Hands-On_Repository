package com.vms.main;

import java.util.List;
import java.util.Scanner;

import com.vms.bean.Vehicle;
import com.vms.dao.VehicleDAO;

public class VMSMainClass {

	static Scanner sc = new Scanner(System.in);

	public static int displayMenu() {
		System.out.println("1.Insert 2.Delete 3.Update 4.View 5.ViewAll 6.Exit");
		System.out.println("Enter Your Choice Here : ");
		return sc.nextInt();
	}

	public static Vehicle insertVehicle() {
		System.out.println("Enter Vehicle_No, Vehicle_BrandName, Vehicle_Mileage");
		return new Vehicle(sc.nextInt(), sc.next(), sc.nextFloat());
	}

	public static int deleteVehicle() {
		System.out.println("Enter the Vehicle_No ");
		return sc.nextInt();
	}

	public static Vehicle UpdateVehicle() {
		System.out.println("Enter the Vehicle_No, Vehicle_BrandName, Vehicle_Mileage");
		return new Vehicle(sc.nextInt(), sc.next(), sc.nextFloat());
	}

	public static int viewVehicle() {
		System.out.println("Enter the Vehicle_No");
		return sc.nextInt();
	}

	public static void main(String[] args) {

		VehicleDAO dao = new VehicleDAO();
		String msg = "";

		do {

			switch (displayMenu()) {

			case 1:

				if (dao.insertVehicle(insertVehicle()) == 1) {
					System.out.println("Record Inserted");
				} else
					System.out.println("Record Not Inserted");
				break;

			case 2:

				if (dao.deleteVehicle(deleteVehicle()) == 1) {
					System.out.println("Record Deleted");
				} else
					System.out.println("Record Not Deleted");
				break;

			case 3:

				if (dao.UpdateVehicle(UpdateVehicle()) == 1) {
					System.out.println("Record Updated");
				} else
					System.out.println("Record Not Updated");
				break;

			case 4:

				int v_no = viewVehicle();
				Vehicle bean = dao.viewVehicle(v_no);
				if (bean != null) {
					bean.display();
					System.out.println("Record Found");
				} else
					System.out.println("Record Not Found");
				break;

			case 5:

				List<Vehicle> list = dao.viewAllVehicle();
				for (Vehicle v : list)
					v.display();
				break;

			case 6:
				System.exit(0);
			}
			System.out.println("Do You Want to Continue ? [Yes|No]");
			msg = sc.next();

		} while (msg.equalsIgnoreCase("yes"));

	}

}
