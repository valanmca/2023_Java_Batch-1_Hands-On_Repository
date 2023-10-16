
//3. Write a Java program to create a class called "Restaurant" with attributes for menu items, prices, and ratings, and methods to add and remove items, and to calculate average rating.
import java.util.ArrayList;

class Restaurant {
	ArrayList<String> menuItems;
	ArrayList<Integer> prices;
	ArrayList<Integer> ratings;
	ArrayList<Integer> countItems;

	Restaurant() {
		this.menuItems = new ArrayList<String>();
		this.prices = new ArrayList<Integer>();
		this.ratings = new ArrayList<Integer>();
		this.countItems = new ArrayList<Integer>();
	}

	public void addItem(String Item, int prices) {
		this.menuItems.add(Item);
		this.prices.add(prices);
		this.ratings.add(0);
		this.countItems.add(0);
	}

	public void removeItem(String Item) {
		int index = this.menuItems.indexOf(Item);
		if (index >= 0) {
			this.menuItems.remove(index);
			this.prices.remove(index);
			this.ratings.remove(index);
			this.countItems.remove(index);
		}
	}

	public void addRating(String Item, int rating) {
		int index = this.menuItems.indexOf(Item);
		if (index >= 0) {
			int currentRating = this.ratings.get(index);
			int totalCount = this.countItems.get(index);
			this.ratings.set(index, currentRating + rating);
			this.countItems.set(index, totalCount + 1);
		}
	}

	public int getAverageRating(String Item) {
		int index = this.menuItems.indexOf(Item);
		if (index >= 0) {
			int totalRating = this.ratings.get(index);
			int itemCount = this.countItems.get(index);
			return itemCount > 0 ? (int) totalRating / itemCount : 0;
		} else {
			return 0;
		}
	}

	public void displayMenu() {
		for (int i = 0; i < menuItems.size(); i++) {
			System.out.println(menuItems.get(i) + ": $" + prices.get(i));
		}
	}

	public int calculateAverageRating() {
		int totalRating = 0;
		int numRatings = 0;
		for (int i = 0; i < ratings.size(); i++) {
			totalRating += ratings.get(i);
			numRatings++;
		}
		return numRatings > 0 ? totalRating / numRatings : 0;
	}
}

public class Assignment_Example3 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		Restaurant restaurant = new Restaurant();
		restaurant.addItem(" Pizza ", 100);
		restaurant.addItem(" Biryani ", 200);
		restaurant.addItem(" SandWich ", 300);
		System.out.println("Menu:Item & Price");
		restaurant.displayMenu();

		restaurant.addRating("Pizza", 4);
		restaurant.addRating("Biryani", 5);
		restaurant.addRating("Pizza", 3);
		restaurant.addRating("Pizza", 4);
		restaurant.addRating("SandWich", 2);
		int averageRating = restaurant.getAverageRating("SandWich");
		System.out.println("\nAverage rating for SandWich: " + averageRating);
		averageRating = restaurant.getAverageRating("Pizza");
		System.out.println("Average rating for Pizza: " + averageRating);
		averageRating = restaurant.getAverageRating("Biryani");
		System.out.println("Average rating for Biryani: " + averageRating);
		System.out.println("Average rating: " + restaurant.calculateAverageRating());
		System.out.println("\nRemove 'Pizza' from the above menu.");
		restaurant.removeItem("Pizza");
		System.out.println("\nUpdated menu:");
		restaurant.displayMenu();
	}

}