//4. Write a Java program to create a class called "Inventory" with a collection of products and methods to add and remove products, and to check for low inventory.

import java.util.ArrayList;
import java.time.LocalTime;

class Products {
	private String name;
	private int quantity;

	public Products(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;

	}

	public String getName() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setquantity(int quantity) {
		this.quantity = quantity;
	}

}

class Inventory {
	private ArrayList<Products> products;

	public Inventory() {
		products = new ArrayList<Products>();
	}

	public void addProduct(Products product) {
		products.add(product);
	}

	public void removeProduct(Products product) {
		products.remove(product);
	}

	public void checkLowInventory() {
		for (Products product : products) {
			if (product.getQuantity() <= 100) {
				System.out.println(
						product.getName() + " is running low on inventory. Current quantity: " + product.getQuantity());
			}
		}
	}
}

public class Oops_Example10 {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		Products product1 = new Products("LED TV", 50);
		Products product2 = new Products("Mobile", 40);
		Products product3 = new Products("Tablet", 90);
		System.out.println("Add three products in inventory:");
		inventory.addProduct(product1);
		inventory.addProduct(product2);
		inventory.addProduct(product3);
		System.out.println("\nCheck low inventory:");
		inventory.checkLowInventory();
		System.out.println("\nRemove Tablet from the inventory!");
		inventory.removeProduct(product3);
		System.out.println("\nAgain check low inventory:");
		inventory.checkLowInventory();
	}
}
