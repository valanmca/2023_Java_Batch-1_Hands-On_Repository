package com.sara.CoreJava.Day_04;

import java.util.ArrayList;
import java.util.Scanner;

class Booking {

	static ArrayList<String> flight = new ArrayList<String>();
	static ArrayList<String> hotel = new ArrayList<String>();
	ArrayList<String> flightBooking = new ArrayList<String>();
	ArrayList<String> hotelBooking = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	static int flightSeats = 4, hotelSeats = 4;
	String flightName, hotelName;

	void addFlight() {

		System.out.println("Add Flight details");
		System.out.println("Enter the flight name : ");
		flightName = sc.next();
		flight.add(flightName);

	}

	void addHotel() {

		System.out.println("Enter the hotel name : ");
		hotelName = sc.next();
		hotel.add(hotelName);

	}

	int flightBooking() {

		System.out.println("Enter the Flight name : ");
		String flightName = sc.next();
		if (flight.contains(flightName)) {
			System.out.println("flight was Available");

			System.out.println(flightSeats
					+ " Seats are Available , How many seats you want to book? \n Please enter your count : ");
			int seat = sc.nextInt();

			flightSeats = flightSeats - seat;
			if (flightSeats < 0) {
				System.out.println("Seats are Not Available");
			} else {
				System.out.println(seat + " tickets was booked\nRemaining " + flightSeats + " Seats are Available");
			}

		} else {
			System.out.println("flight & seats are not avialable");

		}
		return flightSeats;

	}

	int hotelBooking() {
		System.out.println("Enter the Hotel name : ");
		String h_name = sc.next();
		if (hotel.contains(h_name)) {
			System.out.println("Hotel was Available");

			System.out.println(hotelSeats
					+ " Seats are Available , How many seats you want to book? \n Please enter your count : ");
			int h_seat = sc.nextInt();

			hotelSeats = hotelSeats - h_seat;
			if (hotelSeats < 0) {
				System.out.println("Seats are Not Available");
			} else {
				System.out.println(h_seat + " Seats were booked\nRemaining " + hotelSeats + " Seats are Available");

			}

		} else {
			System.out.println("hotel & seats are not avialable");

		}
		return hotelSeats;

	}

	void dis(int flightChair, int hotelChair) {
		System.out.println("AVAILABLE FLIGHT/FLIGHTS LIST : " + flight);
		System.out.println("AVAILABLE FLIGHT SEATS COUNT : " + flightChair);

		System.out.println("AVAILABLE HOTEL/HOTELS LIST : " + hotel);
		System.out.println("AVAILABLE HOTEL SEATS COUNT : " + hotelChair);

	}

}

public class Assignment_03 {

	public static void main(String[] args) {
		Booking reserve = new Booking();
		char choice, option, element, lot, get;
		int privateFlightSeats = 0, privateHotelSeats = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println(
					"Select Ur option :\n 1.FLIGHT BOOKING \n 2.HOTEL BOOKING \n 3.DISPLAY AVAILABLE FLIGHS & HOTELS LIST");
			int input = sc.nextInt();

			if (input == 1) {
				do {
					reserve.addFlight();
					System.out.println("U want to repeat (press s)");
					choice = sc.next().charAt(0);
				} while (choice == 's');
				System.out.println(" U want to Add/Update the Available Seats : (press y to update)");
				lot = sc.next().charAt(0);
				if (lot == 'y') {
					privateFlightSeats = reserve.flightBooking();
				}

			} else if (input == 2) {
				do {
					reserve.addHotel();
					System.out.println("U want to repeat (press s)");
					option = sc.next().charAt(0);

				} while (option == 's');
				System.out.println(" U want to Add/Update the Available Seats : (press y to update)");
				get = sc.next().charAt(0);
				if (get == 'y') {
					privateHotelSeats = reserve.hotelBooking();
				}
			} else if (input == 3) {
				reserve.dis(privateFlightSeats, privateHotelSeats);
			} else {
				System.out.println("Wrong Input");
			}

			System.out.println("DO AGAIN (press A)");
			element = sc.next().charAt(0);
		} while (element == 'A'&& element == 'a');
	}

}
