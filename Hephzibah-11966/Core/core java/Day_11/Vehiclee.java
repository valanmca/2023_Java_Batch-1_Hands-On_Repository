package Day_11;

import java.util.LinkedList;
import java.util.Scanner;

class Vehicle{
	int VehId;
	String VehType;
	String VehName;
	
	Vehicle(int VehId, String VehType, String VehName){
		this.VehId=VehId;
		this.VehType=VehType;
		this.VehName=VehName;
	}
	void display() {
		System.out.println("Vehicle Id:"+VehId);
		System.out.println("Vehicle Type:"+VehType);
		System.out.println("Vehicle Name:"+VehName);
	}
}

public class Vehiclee {

	public static void main(String[] args) {
		int VehId=0;
		String VehType="";
		String VehName="";
		boolean flag=false;
		int index=0;
		String msg="";
		
		LinkedList<Vehicle> list=new LinkedList<Vehicle>();
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("1.Add Vehicle Details  \n2.Find a Vehicle using Id \n3.Update Vehicle \n4.Remove Vehicle \n5.View all Vehicles \n6.Exit");
		int choice=sc.nextInt();
		
		
			
		
		switch(choice) {
		case 1:
			System.out.println("Enter the Vehicle Id, Vehicle Type, Vehicle Name");
			VehId=sc.nextInt();
			VehType=sc.nextLine();
			VehName=sc.nextLine();
			Vehicle veh=new Vehicle(VehId,VehType,VehName);
			list.add(veh);
			System.out.println("Vehicle details are added");
			break;
			
		case 2:
			System.out.println("Enter the Vehicle id to find");
			VehId=sc.nextInt();
			flag=false;
			for(Vehicle v:list) {
				if(v.VehId==VehId) {
					flag=true;
					v.display();
					break;
				}
			}
			if(flag==false) {
				System.out.println("Vehicle not found");
			}
			break;
		case 3:
			System.out.println("Enter Vehicle id, Type and Name to update");
			VehId=sc.nextInt();
			VehType=sc.next();
			VehName=sc.next();
			Vehicle veh1=new Vehicle(VehId,VehType,VehName);
			
			flag=false;
			for(Vehicle v:list) {
				if(v.VehId==VehId) {
					flag=true;
					list.set(index, veh1);
					System.out.println("Vehicle details are updated");
					break;
				}
			if(flag==false) {
				System.out.println("Vehicle not found");
			}
		}
			break;
			
		case 4:
			System.out.println("Enter the Vehicle id to Remove");
			VehId=sc.nextInt();
			flag=false;
			
			for(Vehicle v:list) {
				if(v.VehId==VehId) {
					flag=true;
					list.remove(index);
					System.out.println("Vehicle details are Removed");
					break;
				}
				index++;
			}
			if(flag==false) {
				System.out.println("Vehicle not found");
			}
			break;
		case 5:
			for(Vehicle v:list)
				v.display();
			break;
		case 6:
			System.exit(0);
			break;			
		}
		System.out.println("Do you want to continue Y/N");
		msg=sc.next();
		}while(msg.equalsIgnoreCase("Y"));

	}

}
