package com.mahesh.core_java_day_04;

import java.util.*;

public class Booking {

	static ArrayList<String> flight = new ArrayList<String>();
	static ArrayList<String> hotel = new ArrayList<String>();
	ArrayList<String> F_Booking = new ArrayList<String>();
	ArrayList<String> H_Booking = new ArrayList<String>();
	static Scanner sc = new Scanner(System.in);
	static char choice, option,element,lot,get;
	static int flight_seats = 4, hotel_seats = 4,prt_flight_seats,prt_hotel_seats;
	String flight_name,hotel_name;

	void add_flight() {

		System.out.println("Add Flight details");
		System.out.println("Enter the flight name : ");
		flight_name = sc.next();
		flight.add(flight_name);

	}

	void add_hotel() {

		System.out.println("Enter the hotel name : ");
		hotel_name = sc.next();
		hotel.add(hotel_name);

	}

	int flight_booking() {

		System.out.println("Enter the Flight name : ");
		String f_name = sc.next();
		if (flight.contains(f_name)) {
			System.out.println("flight was Available");

			System.out.println(flight_seats
					+ " Seats are Available , How many seats you want to book? \n Please enter your count : ");
			int seat = sc.nextInt();

			flight_seats = flight_seats - seat;
			if (flight_seats < 0) {
				System.out.println("Seats are Not Available");
			} else {
				System.out.println(seat + " tickets was booked\nRemaining " + flight_seats + " Seats are Available");
			}

		} else {
			System.out.println("flight & seats are not avialable");

		}
		return flight_seats;

	}

	int hotel_booking() {
		System.out.println("Enter the Hotel name : ");
		String h_name = sc.next();
		if (hotel.contains(h_name)) {
			System.out.println("Hotel was Available");

			System.out.println(hotel_seats
					+ " Seats are Available , How many seats you want to book? \n Please enter your count : ");
			int h_seat = sc.nextInt();

			hotel_seats = hotel_seats - h_seat;
			if (hotel_seats < 0) {
				System.out.println("Seats are Not Available");
			} else {
				System.out.println(h_seat + " Seats were booked\nRemaining " + hotel_seats + " Seats are Available");
				
			}

		} else {
			System.out.println("hotel & seats are not avialable");

		}
		return hotel_seats;

	}
	void dis(int f_chair,int h_chair)
	{
		System.out.println("AVAILABLE FLIGHT/FLIGHTS LIST : " + flight);
		System.out.println("AVAILABLE FLIGHT SEATS COUNT : " + f_chair);
		
		System.out.println("AVAILABLE HOTEL/HOTELS LIST : " + hotel);
		System.out.println("AVAILABLE HOTEL SEATS COUNT : " + h_chair);
		
	}

	public static void main(String[] args) {
		Booking reserve = new Booking();
	
		
		do {
			System.out.println(
					"Select Ur option : (press 1 -> FLIGHT BOOKING) / (press 2 -> HOTEL BOOKING) /(press 3 -> DISPLAY AVAILABLE FLIGHS & HOTELS LIST) => ");
			int input = sc.nextInt();

			if (input == 1) {
				do {
					reserve.add_flight();
					System.out.println("U want to repeat (press s)");
					choice = sc.next().charAt(0);
				} while (choice == 's');
				System.out.println(" U want to Add/Update the Available Seats : (press y to update)");
				lot = sc.next().charAt(0);
				if (lot == 'y') {
					prt_flight_seats =reserve.flight_booking();
				}

			} else if (input == 2) {
				do {
					reserve.add_hotel();
					System.out.println("U want to repeat (press s)");
					option = sc.next().charAt(0);

				} while (option == 's');
				System.out.println(" U want to Add/Update the Available Seats : (press y to update)");
				get = sc.next().charAt(0);
				if (get == 'y') {
					prt_hotel_seats=reserve.hotel_booking();
				}
			} else if (input == 3) {
				reserve.dis(prt_flight_seats,prt_hotel_seats);
			} else {
				System.out.println("Wrong Input");
			}
			
			System.out.println("DO AGAIN (press A)");
			element = sc.next().charAt(0);
		} while (element == 'A');
	}
}
