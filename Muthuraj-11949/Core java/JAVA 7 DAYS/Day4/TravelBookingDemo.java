package Day4;


import java.util.ArrayList;
import java.util.List;

class TravelBooking {
 private List<String> flightSearchResults;
 private List<String> hotelSearchResults;
 private List<String> bookedFlights;
 private List<String> bookedHotels;

 public TravelBooking() {
 flightSearchResults = new ArrayList<>();
 hotelSearchResults = new ArrayList<>();
 bookedFlights = new ArrayList<>();
 bookedHotels = new ArrayList<>();
 }

 // Method to search for available flights
 public void searchFlights(String searchCriteria) {
 // Simulate flight search by adding results to the list
 flightSearchResults.add("Flight: " + searchCriteria);
 }

 // Method to search for available hotels
 public void searchHotels(String searchCriteria) {
 // Simulate hotel search by adding results to the list
 hotelSearchResults.add("Hotel: " + searchCriteria);
 }

 // Method to book a flight
 public void bookFlight(int index) {
 if (index >= 0 && index < flightSearchResults.size()) {
 String selectedFlight = flightSearchResults.get(index);
 bookedFlights.add(selectedFlight);
 System.out.println("Flight booked: " + selectedFlight);
 } else {
 System.out.println("Invalid flight selection.");
 }
 }

 // Method to book a hotel
 public void bookHotel(int index) {
 if (index >= 0 && index < hotelSearchResults.size()) {
 String selectedHotel = hotelSearchResults.get(index);
 bookedHotels.add(selectedHotel);
 System.out.println("Hotel booked: " + selectedHotel);
 } else {
 System.out.println("Invalid hotel selection.");
 }
 }

 // Method to cancel a flight reservation
 public void cancelFlight(int index) {
 if (index >= 0 && index < bookedFlights.size()) {
 String canceledFlight = bookedFlights.get(index);
 bookedFlights.remove(index);
 System.out.println("Flight reservation canceled: " + canceledFlight);
 } else {
 System.out.println("Invalid flight cancellation request.");
 }
 }

 // Method to cancel a hotel reservation
 public void cancelHotel(int index) {
 if (index >= 0 && index < bookedHotels.size()) {
 String canceledHotel = bookedHotels.get(index);
 bookedHotels.remove(index);
 System.out.println("Hotel reservation canceled: " + canceledHotel);
 } else {
 System.out.println("Invalid hotel cancellation request.");
 }
 }
}

public class TravelBookingDemo {
 public static void main(String[] args) {
 TravelBooking bookingSystem = new TravelBooking();

 // Search for flights and hotels
 bookingSystem.searchFlights("New York to Los Angeles");
 bookingSystem.searchHotels("Los Angeles, CA");

 // Book a flight and hotel
 bookingSystem.bookFlight(0);
 bookingSystem.bookHotel(0);

 // Cancel a flight and hotel reservation
 bookingSystem.cancelFlight(0);
 bookingSystem.cancelHotel(0);
 }
}



