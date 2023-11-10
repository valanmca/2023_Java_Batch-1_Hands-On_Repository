package com.madhan.coreday11;

class Vehicle
{
	int vehNo;
	String vehName;
	String vehType;
	
	Vehicle(int vehNo,String vehName,String vehType)
	{
		this.vehNo=vehNo;
		this.vehName=vehName;
		this.vehType=vehType;
	}
	
	void display()
	{
		System.out.println("Vehicle Number:" +vehNo);
		System.out.println("Vehicle Name:" +vehName);
		System.out.println("Vehicle Type:" +vehType);

	}
}

public class VehicleExusingHashmap {

	public static void main(String[] args) {
		
		
	}

}
