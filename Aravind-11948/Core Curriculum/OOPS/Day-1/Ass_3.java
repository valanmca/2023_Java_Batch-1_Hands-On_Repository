package com.oops;
import java.time.LocalTime;
//Write a Java program to create a class called "Airplane" with a flight number, destination, 
//and departure time attributes, and methods to check flight status and delay.
class Airplane {
	
	int number;
	String destination;
	LocalTime departure_time;
	int delay;
	
	Airplane (int number,String destination,LocalTime departure_time,int delay)
	{
		this.number=number;
		this.destination= destination;
		this.departure_time =departure_time;
		this.delay=delay;
		
		
	}
	void checkStatus()
	{
		System.out.println("Flight number: "+number);
		System.out.println("Destination: "+destination);
		LocalTime n=departure_time.plusMinutes(delay);
		System.out.println("Departure Time:"+n );
		if (delay==0)
		{
			System.out.println("Flight is on time");
		}
		else {
			System.out.println("The flight number :"+number+" is delayed by "+delay+" minutes");
		}
		
	}
	
	void delay()
	{
		System.out.println("Delayed Time"+ delay+".minutes");
	}
	
	
	
	
}

public class Ass_3 {

	public static void main(String[] args) {
		LocalTime n=LocalTime.of(10,43,2);
		Airplane obj=new Airplane (1,"chennai",n,10);
		obj.checkStatus();
		
		

	}

}
