package com.core.day_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

class Vehicle {
	int vehicleId;
	String vehicleType ;
	String brandName;
	
	Vehicle (int vehicleId,String vehicleType,String brandName)
	{
		
		this.vehicleId=vehicleId;
		this.vehicleType=vehicleType;
		this.brandName=brandName;
	}
	
	
	void display()
	{
		System.out.println("Vehicle Id = "+vehicleId);
		System.out.println("Vehicle Type = "+vehicleType);
		System.out.println("Vehicle Brand  = "+brandName);
		System.out.println("-------------------------");
	}
}

public class VehicleManagement {

	public static void main(String[] args) throws IOException {
		
		int vehicleId=0;
		String vehicleType =" ";
		String brandName =" ";
		String msg="";
		boolean flag=false;
		int index=0;
		
		Scanner sc=new Scanner(System.in);
		BufferedReader input=new BufferedReader(new InputStreamReader (System.in));
		
		ArrayList <Vehicle> list=new ArrayList<Vehicle>();
		
		System.out.println("Add vehicle details to perform CRUD operation");
		
		System.out.println("Enter vehicle Id = ");
		vehicleId=sc.nextInt();
		System.out.println("Enter vehicle Type = ");
		vehicleType= input.readLine();
		System.out.println("Enter vehicle brand name = ");
		brandName=input.readLine();
		Vehicle veh=new Vehicle(vehicleId,vehicleType,brandName);
		list.add(veh);
		
		System.out.println("vehicle details added ");
		
		System.out.println("Want to see more option  [yes]|| [no]");
		 String option=input.readLine();
		 
		 if (option.equalsIgnoreCase("yes")) {
			 
		
		
		
		do {
			
		
		System.out.println("1.Add Vehicle   2.Find Vehicle   3.Update  Vehicle 4.Delete Vehicle  5.view All vehicle  6.exit");
		
		int choice =sc.nextInt();
		 
			  
		  
		switch(choice )
		{
		case 1:
			
			System.out.println("Enter vehicle Id = ");
			vehicleId=sc.nextInt();
			System.out.println("Enter vehicle Type = ");
			vehicleType= input.readLine();
			System.out.println("Enter vehicle brand name = ");
			brandName=input.readLine();
			Vehicle obj=new Vehicle(vehicleId,vehicleType,brandName);
			list.add(obj);
			
			System.out.println("vehicle details added ");

			break;
			
			
		case 2:
			
			System.out.println("Enter vehicle Id to find the vehicle ");
			vehicleId=sc.nextInt();
			flag=false;
			
			for (Vehicle e:list)
			{
				if (e.vehicleId==vehicleId)
				{
					flag=true;
					System.out.println("vehicle find ");
					e.display();
					
					
					break;
				}
				
			}
			
			
			
			
			if (flag==false)
			{
				System.out.println("vehicle not found ");
			}
			break;
			
		case 3:
			System.out.println("Enter the vehicle Id");
			vehicleId=sc.nextInt();
			System.out.println("Enter vehicle Type = ");
			vehicleType=input.readLine();
			System.out.println("Enter vehicle brand name = ");
			brandName=input.readLine();
			
			Vehicle temp=new Vehicle (vehicleId,vehicleType,brandName);
			
			index=0;
			flag=false;
			 for (Vehicle e:list)
			 {
				 if (e.vehicleId==vehicleId)
				 {
					 flag=true;
					 list.set(index,temp);
					 System.out.println("Vehicle details added ");
					 break;
				 }
				 index++;
					 
			 }
			 
			 if (flag==false)
			 {
				 System.out.println("This vehicle not valid to Update ");
			 }
			
			
			
			break;
			
		case 4:
			System.out.println("Enter vehicle Id to remove  the vehicle ");
			vehicleId=sc.nextInt();
			flag=false;
			index=0;
			
			for (Vehicle e:list)
			{
				if (e.vehicleId==vehicleId)
				{
					flag=true;
					list.remove(index);
					System.out.println("Vehicle details deleted");
					break;
				}
				index++;
			}
			
			
			
			
			if (flag==false)
			{
				System.out.println("vehicle not found ");
			}
			break;
			
			
			
		case 5:
			
			for (Vehicle e:list)
			{
				e.display();
			}
			break;
			
		case 6:
			 System.out.println("Thank you");
			System.exit(0);
			break;
			
		}
		
		System.out.println("Do you want to continue[yes]|[No] ");
		msg=sc.next();
		 
		}while (msg.equalsIgnoreCase("yes"));
		
		 }
		 
		 else
		 {
			 System.out.println("Thank you");
		 }
		
		 
		
		

	}

}
