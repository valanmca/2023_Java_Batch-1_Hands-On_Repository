package com.madhan.coreday10;

import java.util.LinkedList;
import java.util.Scanner;

class Vehicle1
{
	int vehId;
	String vehName;
	String vehType;
	
	Vehicle1(int vehId,String vehName,String vehType)
	{
		this.vehId=vehId;
		this.vehName=vehName;
		this.vehType=vehType;
	}
	void display()
	{
		System.out.println("Vehicle Id:"+vehId);
		System.out.println("Vehicle Name:"+vehName);
		System.out.println("Vehicle Type:"+vehType);


	}
}

public class Vehicle {

	public static void main(String[] args) {
//		Vehicle1 veh=new Vehicle1(1,"KWID","Four Wheels");
//		veh.display();
		int vehId=0;
		String vehName="";
		String vehType="";
		boolean flag=false;
		int index=0;
		String msg="";
		
		LinkedList<Vehicle1> list=new LinkedList<Vehicle1>();
		Scanner sc=new Scanner(System.in);
		do
		{
		System.out.println("1.Add Vehicle \n2.Find a vehicle using ID \n3.Update Vehicle \n4.Remove a vehicle \n5.View all vehicle \n6.Exit ");
		
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Enter Vehicle Id");
			vehId = sc.nextInt();
			System.out.println("Enter Vehicle Name");
			vehName=sc.next();
			System.out.println("Enter Vehicle Type");
			vehType=sc.next();
			Vehicle1 veh=new Vehicle1(vehId,vehName,vehType);
			list.add(veh);
			System.out.println("Vehicle was added");
			break;
			
		case 2:
			System.out.println("Enter vehId to find a vehicle");
			vehId = sc.nextInt();
			flag=false;
			for(Vehicle1 v : list)
			{
				if(v.vehId==vehId)
				{
					flag=true;
					v.display();
					break;
				}
			}
			if(flag==false)
			{
				System.out.println("Vehicle not found");
			}
			break;
			
		case 3:
			System.out.println("Enter Vehicle Id, Vehicle Name and Vehicle Type :");
			vehId=sc.nextInt();
			vehName=sc.next();
			vehType=sc.nextLine();
			Vehicle1 temp=new Vehicle1(vehId,vehName,vehType);
			
			flag=false;
			for(Vehicle1 e:list)
			{
				if(e.vehId==vehId)
				{
					flag=true;
					list.set(index, temp);
					System.out.println("Vehicle details are updated");
					break;
				}
			}
			if(flag==false)
			{
				System.out.println("Vehicle Not found");
			}
			break;
			
		case 4:
			System.out.println("Enter Vehicleid to remove :");
			vehId=sc.nextInt();
			flag=false;
		
			for(Vehicle1 e : list)
			{
				if(e.vehId==vehId)
				{
					flag=true;
					list.remove(index);
					System.out.println("Vehicle details removed");
					break;
				}
			}
			if(flag==false)
			{
				System.out.println("Vehicle Not found");
			}
			
			break;
			
		case 5:
			for(Vehicle1 v:list)
				v.display();
			break;
			
		case 6:
			System.exit(0);
			break;
		} 
		System.out.println("Do you want to continue(Yes/No)");
		msg=sc.next();
		}while(msg.equalsIgnoreCase("Yes"));
	}
}


