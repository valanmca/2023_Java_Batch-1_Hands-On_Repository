package com.jeban.Assignment2;

import java.util.ArrayList;

class Reservation{
	ArrayList <String> Flights=new ArrayList <String>();
	ArrayList <String> Hotels=new ArrayList <String>();
	Reservation(ArrayList <String> Flights,ArrayList <String> Hotels){
		this.Flights=Flights;
		this.Hotels=Hotels;
		
	}
	void display() {
		System.out.println(Flights);
		System.out.println(Hotels);
	}
	
	
}

public class Travel {

	public static void main(String[] args) {
		

	}

}
