//Create an application for "Vehicle Management System" using any of your favorite collection. And perform all the "CRUD" operations.
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;
class Vehicle 
{
	int VehicleNumber;
	String VehicleBrand;
	String VehicleType;
	Vehicle(int VehicleNumber,String VehicleBrand,String VehicleType) 
	{
		this.VehicleNumber = VehicleNumber;
		this.VehicleBrand = VehicleBrand;
		this.VehicleType = VehicleType;
	}
	void display() 
	{
		System.out.println("Vehicle Number is" + " " + VehicleNumber );
		System.out.println("Vehicle Brand is" + " " + VehicleBrand);
		System.out.println("Vehicle Type is" + " " + VehicleType);
		System.out.println("---------------------------------");
	}
}

	


public class Collections_Example6 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
	int VehicleNumber = 0;
	String VehicleBrand = "";
	String VehicleType = "";
	boolean flag = false;
	int index = 0;
	LinkedList<Vehicle> lists = new LinkedList<Vehicle>();
	Scanner sc = new Scanner(System.in);
	String Str = "";
	do 
	{
		System.out.println("1.Add Vehicle \n2.Find Vehicle \n3.Update Vehicle \n4.Delete Vehicle \n5.View All the Vehicle \n6.Exist");
		System.out.println("Enter Your Choice");
		int Choice = sc.nextInt();
		switch(Choice) 
		{
		case 1: 
			System.out.println("Enter the Vehicle Number,Brand,and,Type for add");
			VehicleNumber = sc.nextInt();
			VehicleBrand = sc.next();
			VehicleType = sc.next();
			Vehicle vechile = new Vehicle(VehicleNumber,VehicleBrand,VehicleType);
			lists.add(vechile);
			System.out.println("Vehicle details are added");
			break;
		case 2: 
			System.out.println("Enter the Vehicle Number for find");
			VehicleNumber = sc.nextInt();
			flag = false;
			for(Vehicle e: lists) 
			{
				if(e.VehicleNumber == VehicleNumber) 
				{
					flag = true;
					e.display();
					break;
				}
			}
			if(flag = false) 
				System.out.println("Vehicle are Not Found");
			break;
		case 3: 
			System.out.println("Enter the Vehicle Number,Brand,and,Type for Update");
			VehicleNumber = sc.nextInt();
			VehicleBrand = sc.next();
			VehicleType = sc.next();
			Vehicle temps = new Vehicle(VehicleNumber,VehicleBrand,VehicleType);
			index = 0;
			flag = false;
			for(Vehicle e: lists) 
			{
				if(e.VehicleNumber == VehicleNumber) 
				{
					flag = true;
					lists.set(index,temps);
					System.out.println("Vehicle details are Updated");
					break;
				}
			}
			if(flag == false) 
				System.out.println("Vehicle are Not Found");
			break;
		case 4: 
			System.out.println("Enter the Vehicle Number for delete");
			VehicleNumber = sc.nextInt();
			flag = false;
			index = 0;
			for(Vehicle e: lists) 
			{
				if(e.VehicleNumber == VehicleNumber) 
				{
					flag = true;
					lists.remove(index);
					System.out.println("Vehicle details are delete");
					break;
				}
			}
			if(flag == false) 
				System.out.println("Vehicle are Not Found");
			break;
		case 5: 
			boolean ans = lists.isEmpty();
			flag = false;
			for(Vehicle e: lists) 
			{
				if(ans == false)
				{
					e.display();
					break;
				}
			}
			if(ans == true)
				System.out.println("There is a empty database for the Vehicle");
			break;
		case 6: 
			System.out.println("You are WelCome");
			System.exit(0);
			break;
		}
		System.out.println("Do you want to continue [YES | NO]");
	Str = sc.next();
	}while(Str.equalsIgnoreCase("yes"));
		{
		if(Str.equalsIgnoreCase("no")) 
		{
			System.out.println("Exist");
		}
		else 
		{
		
		}
		};
	}
}