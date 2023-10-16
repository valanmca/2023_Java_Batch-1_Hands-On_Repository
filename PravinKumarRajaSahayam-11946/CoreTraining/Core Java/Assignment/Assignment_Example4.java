//4. Write a Java program to create a class with methods to search for flights and hotels, and to book and cancel reservations.
import java.util.ArrayList;
import java.util.Random;

class BookingApp {
	private ArrayList<Flight> flights;
	private ArrayList<Hotel> hotels;

	BookingApp() {
		this.flights = new ArrayList<Flight>();
		this.hotels = new ArrayList<Hotel>();

	}

	public void searchflights(String origin, String destination, String date, int numberOfPassengers) {
		System.out.println("Searching for flights from " + " " + origin + " " + "to" + " " + destination + " " + "on" + " " +
				date + " " + "for" + " " + numberOfPassengers + " " + "passengers");
	}

	public void searchhotels(String location, String checkIn, String checkOut, int numberOfGuests) {
		System.out.println("Searching for hotels in " + " " + location + " " + "from" + " " + checkIn + " " + "to"
				+ " " + checkOut + " " + "for" + " " + numberOfGuests + " " + "guests");
	}

public void bookflights(int flightnumber, String passengerName, String origin, String destination, String date,
			int numberOfPassengers, int prices) {
		Flight flight = new Flight(flightnumber, passengerName, origin, destination, date, numberOfPassengers, prices);
		int confirmationNumber = generateconfirmationNumber();
		flight.setConfirmationNumber(confirmationNumber);
		this.flights.add(flight);
		System.out.println("Flight booked ! confirmation number : " + " " + confirmationNumber);
	}

	public void bookhotels(int hotelId, String guestName, String location, String checkIn, String checkOut,
			int numberOfGuests, int prices) {
		Hotel hotel = new Hotel(hotelId, guestName, location, checkIn, checkOut, numberOfGuests, prices);
		int confirmationNumber = generateconfirmationNumber();
		hotel.setConfirmationNumber(confirmationNumber);
		this.hotels.add(hotel);
		System.out.println("Hotel booked ! confirmation number : " + " " + confirmationNumber);
	}

	public void cancelReservation(int confirmationNumber) {
		for (Flight flight : this.flights) {
			if (flight.getconfirmationNumber() == confirmationNumber) {
				this.flights.remove(flight);
				System.out.println("Flight Reservation with confirmation Number : " + " " + confirmationNumber + " "
						+ "cancelled");
				return;
			}
		}
		for (Hotel hotel : this.hotels) {
			if (hotel.getconfirmationNumber() == confirmationNumber) {
				this.hotels.remove(hotel);
				System.out.println(
						"Hotel Reservation with confirmation Number : " + " " + confirmationNumber + " " + "cancelled");
				return;
			}
		}
		System.out.println("No Reservation found with confirmation Number : " + " " + confirmationNumber);
	}

	private int generateconfirmationNumber() {
		Random rand = new Random();
		return rand.nextInt(900000) + 100000;
	}
}

class Flight {
	private int flightNumber;
	private String passengerName;
	private String origin;
	private String destination;
	private String date;
	private String numberOfPassengers;
	private int prices;
	private int confirmationNumber;

	public Flight(int flightNumber, String passengerName, String origin, String destination, String date,
			String numberOfPassengers, int prices) {
		this.flightNumber = flightNumber;
		this.passengerName = passengerName;
		this.origin = origin;
		this.destination = destination;
		this.date = date;
		this.numberOfPassengers = numberOfPassengers;
		this.prices = prices;
	}

	public Flight(int flightnumber2, String passengerName2, String origin2, String destination2, String date2,
			int numberOfPassengers2, int prices2) {
		// TODO Auto-generated constructor stub
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public String getOrigin() {
		return origin;
	}

	public String getDestination() {
		return destination;
	}

	public String getDate() {
		return date;
	}

	public String getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public int getprices() {
		return prices;
	}

	public int getconfirmationNumber() {
		return confirmationNumber;
	}

	public void setConfirmationNumber(int confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}
}

class Hotel {
	private int hotelId;
	private String name;
	private String location;
	private String checkIn;
	private String checkOut;
	private int numberOfGuests;
	private int prices;
	private int confirmationNumber;

	public Hotel(int hotelId, String name, String location, String checkIn, String checkOut, int numberOfGuests,
			int prices) {
		this.hotelId = hotelId;
		this.name = name;
		this.location = location;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.numberOfGuests = numberOfGuests;
		this.prices = prices;
	}

	public int gethotelId() {
		return hotelId;
	}

	public String getName() {
		return name;
	}

	public String getlocation() {
		return location;
	}

	public String getCheckIn() {
		return checkIn;
	}

	public String getCheckOut() {
		return checkOut;
	}

	public int getNumberOfGuests() {
		return numberOfGuests;
	}

	public int getPrices() {
		return prices;
	}

	public int getconfirmationNumber() {
		return confirmationNumber;
	}

	public void setConfirmationNumber(int confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}

}

public class Assignment_Example4 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		BookingApp bookingapp = new BookingApp();
		bookingapp.searchflights("New York", "London", "2022-09-01", 1);
		bookingapp.searchhotels("London", "2022-08-01", "2022-09-05", 2);
		bookingapp.bookflights(12345670, "Martin Nadine", "New York", "London", "2022-08-01", 1, 4);
		bookingapp.bookflights(67843513, "Jennifer Ulrike", "New York", "London", "2022-08-01", 1, 3);
		bookingapp.bookhotels(98765432, "Martin Nadine", "London", "2022-09-01", "2022-09-05", 1, 9);
// Cancel a flight or hotel reservation based on reservation number
		bookingapp.cancelReservation(12345670);
	}

}
