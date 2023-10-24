package com.gayathri.day1;

import java.time.LocalTime;

class Airplane {
	private int flightnumber;
	private String destination;
	private LocalTime departuretime;
	private int delaytime;

	Airplane(int flightnumber, String destinations, LocalTime departuretime) {
		this.flightnumber = flightnumber;
		//this.destination = destination;
		this.departuretime = departuretime;
		this.delaytime = 0;
	}

	public int getflightnumber() {
		return flightnumber;
	}

	public void setflightnumber(int flightnumber) {
		this.flightnumber = flightnumber;
	}

	public String getdestination() {
		return destination;
	}

	public void setdestination(String destination) {
		this.destination = destination;
	}

	public LocalTime departuretime() {
		return departuretime;
	}

	public void setdeparturetime(LocalTime departuretime) {
		this.departuretime = departuretime;
	}

	public int delaytime() {
		return delaytime;
	}

	public void delaytimes(int minutes) {
		this.delaytime = minutes;
		this.departuretime = this.departuretime.plusMinutes(minutes);
	}

	public void checkStatus() {
		if (delaytime == 0) {
			System.out.println("Flight : " + " " + flightnumber + " " + "is on time");
		} else {
			System.out.println(
					" Flight : " + " " + flightnumber + " " + "is delay by" + " " + delaytime + " " + "minutes");
		}
	}
}


public class LabEx3Airplane {

	public static void main(String[] args) {
		Airplane flight1 = new Airplane(101, "London", LocalTime.of(10, 9));
		Airplane flight2 = new Airplane(102, "New York", LocalTime.of(8, 0));
		Airplane flight3 = new Airplane(103, "Paris", LocalTime.of(14, 0));

		System.out.println("Flight Status is : ");
		flight1.checkStatus();
		flight2.checkStatus();
		flight3.checkStatus();

		flight1.delaytimes(40);
		flight2.delaytimes(110);
		flight3.delaytimes(80);
		System.out.println("\n Current Flight Status : ");
		flight1.checkStatus();
		flight2.checkStatus();
		flight3.checkStatus();

	}

}
