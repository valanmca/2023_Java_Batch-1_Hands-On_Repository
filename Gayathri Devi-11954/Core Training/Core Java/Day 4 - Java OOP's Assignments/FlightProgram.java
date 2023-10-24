/*
 *  Write a Java program to create a class with methods to search for flights and hotels,

and to book and cancel reservations.

 */
package com.gayathri.day4;

import java.util.Scanner;

class Flight{
	
	public void searchFlights(String origin, String destination, String date) {
		 System.out.println("Searching for flights from " + origin + " to " + destination + " on " + date);
		 }

		 public void searchHotels(String location, String checkInDate, String checkOutDate) {
		 System.out.println("Searching for hotels in " + location + " from " + checkInDate + " to " + checkOutDate);
		 }

		 public void bookFlight(String flightNumber, String passengerName) {
		 System.out.println("Booking flight " + flightNumber + " for passenger " + passengerName);
		 }

		 public void bookHotel(String hotelName, String guestName) {
		 System.out.println("Booking hotel " + hotelName + " for guest " + guestName);
		 }

		 public void cancelFlightBooking(String flightNumber) {
		 System.out.println("Canceling flight booking for flight " + flightNumber);
		 }

		 public void cancelHotelBooking(String hotelName) {
		 System.out.println("Canceling hotel booking for hotel " + hotelName);
		 }
}
public class FlightProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Flight obj = new Flight();
		
		
		

	}

}
