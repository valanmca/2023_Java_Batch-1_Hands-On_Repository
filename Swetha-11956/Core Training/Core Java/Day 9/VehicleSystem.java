package JavaCollect9;
import java.util.Scanner;
import java.util.LinkedList;

class Vehicle{
	int vId;
	String vehicleName;
	String vehicleBrand;
	float vehiclePrice;
	
	Vehicle(int vId,String vehicleName,String vehicleBrand,float vehiclePrice){
		this.vId=vId;
		this.vehicleName=vehicleName;
		this.vehicleBrand=vehicleBrand;
		this.vehiclePrice=vehiclePrice;
	}
	void display() {
		System.out.println("Vehicle ID : "+ vId);
		System.out.println("Vehicle name : "+vehicleName);
		System.out.println("Vehicle brand : "+vehicleBrand);
		System.out.println("Vehicle price : "+vehiclePrice);
		System.out.println("--------------------------------");
	}
}
public class VehicleSystem {

	public static void main(String[] args) {
		
		int vId=0;
		String vehicleName="";
		String vehicleBrand="";
		float vehiclePrice=0.0f;
		boolean flag=false;
		String msg="";
		
		Scanner sc=new Scanner(System.in);
		
		LinkedList<Vehicle> list=new LinkedList<Vehicle>();
		
		
		do {
		System.out.println("1.Add vehicle 2. Find vehicle 3. Update vehicle 4. Delete vehicle 5. Show list of vehicles 6.Exit");
		System.out.println("Enter your choice");
		
		int choice=sc.nextInt();
		
		
		
		switch(choice) {
		case 1:
		System.out.println("Enter vehicle ID, vehicle name, vehicle brand, vehicle price");
	
		vId=sc.nextInt();
		vehicleName=sc.next();
		vehicleBrand=sc.next();
		vehiclePrice=sc.nextFloat();
		
		Vehicle veh=new Vehicle(vId,vehicleName,vehicleBrand,vehiclePrice);
		list.add(veh);
		System.out.println("vehicle details are added");
		break;
		
		case 2:
			System.out.println("Enter the Vehicle you want to find");
			vId=sc.nextInt();
			for(Vehicle v: list) {
				if(v.vId==vId) {
					flag=true;
					
					v.display();
					break;
				}
			}
			break;
		case 3:
			
			Vehicle temp = new Vehicle(vId,vehicleName,vehicleBrand,vehiclePrice);
			System.out.println("Enter the vId");
			vId=sc.nextInt();
			System.out.println("Enter vehicle name :");
			vehicleName=sc.next();
			System.out.println("Enter vehicle brand :");
			vehicleBrand=sc.next();
			System.out.println("Enter vehicle price :");
			vehiclePrice=sc.nextFloat();
			
			
			int index=0;
			for(Vehicle v : list) {
				if(v.vId==vId) {
					list.set(index, temp);
					System.out.println("Vehicle details updated");
					break;
				}
				index++;
			}
			
			break;
		case 4:
			
			System.out.println("Enter the vehicle Id you want to delete ");
			vId=sc.nextInt();
			int index1=0;
			for(Vehicle v: list ) {
				if(v.vId==vId) {
					flag=true;
					list.remove(index1);
					System.out.println("vehicle detail removed");
					break;
				}
			index1++;
			}
			break;
			
		case 5:
			System.out.println("The list of vehicles are : ");
			for(Vehicle v: list) {
				v.display();
			}
			break;
			
		case 6:
			System.exit(0);
			break;
			
		
	}
		System.out.println("Do you want to continue [Yes | No ]");
		msg=sc.next();
		}
		
		while(msg.equalsIgnoreCase("Yes"));
}
}


