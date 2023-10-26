package com.naveen.day2_1;

class TravelAgency {
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

public class Ex04_Flight {
    public static void main(String[] args) {
        TravelAgency travelAgency = new TravelAgency();

        travelAgency.searchFlights("New York", "Los Angeles", "2023-11-15");
        travelAgency.searchHotels("Los Angeles", "2023-11-15", "2023-11-20");

        travelAgency.bookFlight("AA123", "John Doe");
        travelAgency.bookHotel("Example Hotel", "Jane Smith");

        travelAgency.cancelFlightBooking("AA123");
        travelAgency.cancelHotelBooking("Example Hotel");
    }
}
