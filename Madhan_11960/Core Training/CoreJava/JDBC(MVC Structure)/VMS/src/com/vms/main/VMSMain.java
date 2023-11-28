package com.vms.main;

import java.util.List;
import java.util.Scanner;

import com.vms.dao.VehicleDAO;
import com.vms.model.Vehicle;

public class VMSMain {

	
		static Scanner sc=new Scanner(System.in);
		
		public static int displayMenu()
		{
			
			System.out.println("1.Insert 2.Delete 3.Update 4.Find 5.Find all 6.Exit");
			System.out.println("Enter your choice:");
			int choice=sc.nextInt();
			return choice;
		}
		
		public static Vehicle insertVehicle()
		{
			System.out.println("Enter Vehicle id, Vehicle no, Vehicle type");
			return new Vehicle(sc.nextInt(),sc.nextInt(),sc.next());
		}
		
		public static int deleteVehicle()
		{
			System.out.println("Enter Vehicle id");
			return sc.nextInt();
		}
		
		public static Vehicle updateVehicle()
		{
			System.out.println("Enter Vehicle id, Vehicle no, Vehicle type");
			return new Vehicle(sc.nextInt(),sc.nextInt(),sc.next());
		}
		
		public static int findVehicle()
		{
			System.out.println("Enter Vehicle id");
			return sc.nextInt();
		}
		
		public static void main(String[] args) {
			VehicleDAO dao=new VehicleDAO();
			String msg="";
			do {
				switch(displayMenu())
				{
				case 1:
//					Employee emp=insertEmployee();
//					int n=dao.insertEmployee(emp);
					if(dao.insertVehicle(insertVehicle())==1)
						System.out.println("Record Inserted");
					else
						System.out.println("Record Not Inserted");
					break;
					
				case 2:
//					Employee emp=insertEmployee();
//					int n=dao.insertEmployee(emp);
					if(dao.deleteVehicle(deleteVehicle())==1)
						System.out.println("Record deleted");
					else
						System.out.println("Record Not deleted");
					break;
					
				case 3:
//					Employee emp=insertEmployee();
//					int n=dao.insertEmployee(emp);
					if(dao.updateVehicle(updateVehicle())==1)
						System.out.println("Record Updated");
					else
						System.out.println("Record Not Updated");
					break;
					
				case 4:
					int id1=findVehicle();
					Vehicle bean=dao.findVehicle(id1);
					if(bean!=null) {
						bean.display();
					}else {
						System.out.println("Record Not found");
					}
					break;
				
				case 5:
					List<Vehicle> list=dao.findAllVehicle();
					for(Vehicle e :list)
					{
						e.display();
					}
					break;
				}
				System.out.println("Do you want to continue [yes/no]:");
				msg=sc.next();
			}while(msg.equals("yes"));
			
		}

	}




