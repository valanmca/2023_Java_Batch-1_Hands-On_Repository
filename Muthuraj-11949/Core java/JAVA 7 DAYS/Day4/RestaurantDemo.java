package Day4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Restaurant {
 private Map<String, Double> menu; // Menu items and their prices
 private List<Double> ratings; // List to store ratings
public Restaurant() {
 menu = new HashMap<>();
 ratings = new ArrayList<>();
 }
 
 // Method to add an item to the menu
 public void addItem(String itemName, double price) {
 menu.put(itemName, price);
 }

 // Method to remove an item from the menu
 public void removeItem(String itemName) {
 menu.remove(itemName);
 }

 // Method to add a rating
 public void addRating(double rating) {
 ratings.add(rating);
 }
 
 // Method to calculate the average rating
 public double calculateAverageRating() {
 if (ratings.isEmpty()) {
 return 0.0;
 }

 double sum = 0;
 for (double rating : ratings) {
 sum += rating;
 }

 return sum / ratings.size();
 }
}
public class RestaurantDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a Restaurant object
		 Restaurant restaurant = new Restaurant();

		 // Add menu items
		 restaurant.addItem("Burger", 7.99);
		 restaurant.addItem("Pizza", 9.99);
		 restaurant.addItem("Salad", 5.99);

		 // Add ratings
		 restaurant.addRating(4.5);
		 restaurant.addRating(4.2);
		 restaurant.addRating(4.8);

		 // Calculate and display the average rating
		 double averageRating = restaurant.calculateAverageRating();
		 System.out.println("Average Rating: " + averageRating);
      }
}