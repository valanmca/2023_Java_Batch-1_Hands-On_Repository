package com.jeban.Practice;

import java.time.LocalTime;

class Airplane{
	int Flight_number;
	String Destination;
	LocalTime Departure;
	int delay=0;
Airplane(int Flight_number,String Destination,LocalTime Departure){
	this.Flight_number=Flight_number;
	this.Destination=Destination;
	this.Departure=Departure;
	
}

void delay( int minutes) {
	delay=minutes;
	Departure=Departure.plusMinutes(minutes);
	
}
void  checkstatus() {
	if (delay == 0) {
		System.out.println("Flight is on time");
	}
	else {
		System.out.println("Flight is delayed by"+ delay+"minutes");
	}
}
void diplay () {
	System.out.println(Flight_number);
	System.out.println(Destination);
	System.out.println(Departure);
}



}

public class Practice3 {

	public static void main(String[] args) {
		Airplane obj=new Airplane(1111,"Singapore",LocalTime.of(10, 30));
		obj.diplay();
		obj.checkstatus();
		obj.delay(40);
		obj.checkstatus();
		

	}

}
